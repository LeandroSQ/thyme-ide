// ANTLR setup
var antlr4 = require ("lib/antlr4/index");
var ThymeLexer = require ("lib/ThymeLexer").ThymeLexer;
var ThymeParser = require ("lib/ThymeParser").ThymeParser;
var ThymeListener = require ("lib/ThymeListener").ThymeListener;

const AnnotationType = {
	ERROR: "error",
	WARNING: "warning",
	INFORMATION: "info"
};

function ThymeEngine () {
	
	this.annotationList = [];
	this.engineContext = {};
	this.debugMode = false;

	this.analyze = (text) => {
		try {
			// Resets the variables
			this.annotationList = [];
			this.engineContext = {
				variables: []
			};
			// Generate tokens from input
			var chars = new antlr4.InputStream (text);
			var lexer = new ThymeLexer (chars);
			var tokens = new antlr4.CommonTokenStream (lexer);			
			// Defines the parser
			var parser = new ThymeParser (tokens);
			parser.buildParseTrees = true;

			// Defines the custom error handling
			this.createErrorListener (lexer, parser);
			// Parses the source code
			var ast = parser.script ();
			console.log (ast);
			// Check if it is a valid script
			this.analyzeTokens (tokens);
			this.validateSourceCode (ast);
			
			// Prints the debug tree
			if (this.debugMode) {
				/*var treeString = ThymeEngine.getNodeText (parser.ruleNames, ast);
				console.log ("--Abstract Syntax Tree (Converted)--");
				console.log (treeString);
				console.log ("--Abstract Syntax Tree (ANTLR)--");
				console.log (ast.toStringTree ());*/
			}

			this.analyzeAbstractSyntaxTree (ast);
		} catch (exception) {
			console.error (exception);
		}
	};
	
	this.validateSourceCode = (tree) => {
		if (!tree || tree.exception) {
			console.error ("The script is invalid!");
			console.trace (tree.exception);
		}
	};

	this.analyzeTokens = (tokenList) => {
		if (this.debugMode) {
			console.log ("--Tokens--");
			console.log (tokenList);
		}

		for (var i in tokenList.tokens) {
			var token = tokenList.tokens[i];

			switch (token.channel) {
				/* Regular token, just ignore it */ 
				case 0: break;
				/* Line comment */
				case 1: 
					this.createAnnotationFromToken (token, "Use multi-line comments, Algodoo removes the lines when compiling, so you will get some headache.", AnnotationType.ERROR);
					break;
			}
		}
	};

	this.analyzeAbstractSyntaxTree = (tree) => {
		if (this.debugMode) {
			console.log ("--Abstract Syntax Tree--");
			console.log (tree);
		}

		// Define the object
		//var listener = function () {
		function listener () {
			ThymeListener.call (this);
			return this;
		}
		// Inherits
		listener.prototype = Object.create (ThymeListener.prototype);
		listener.prototype.constructor = listener;


		// Right here we do the rule analysis
		//listener.prototype.exitEveryRule = (context) => { console.log ("Exit key"); };
		//listener.prototype.enterEveryRule = (context) => { console.log ("Enter key"); };

		listener.prototype.enterAssignStatement = (context) => { 
			// Check if we got a simple identifier
			if (context.children[0].constructor.name.startsWith ("MemberAccessor")) {
				var identifier = context.children[0].getText ();

				// If isn't defined on context
				if (this.engineContext.variables.indexOf (identifier) === -1) {
					var validVariable = false;

					// Check for multiple accessors
					if (identifier.indexOf ('.') !== identifier.lastIndexOf ('.')) {
						// Allow Scene.my. variables
						if (identifier.startsWith ("Scene.my")) validVariable = true;
						// Later on, more validations
					}

					if (validVariable) this.engineContext.variables.push (identifier);
				}
			}
		};
		listener.prototype.enterIfStatement = (context) => {
			// Check if the expression has Parenthesys
			var term = this.checkRule (context.expression (), "term");
			if (!term || !(term instanceof ThymeParser.ParenthesysExpressionTermContext)) {
				this.createAnnotationFromToken (context.start, "You should use parenthesys on the if statement expression.", AnnotationType.WARNING);
			}			
		};		

		// Semi-colon treatment
		listener.prototype.exitStatement = (context) => { 
			// Check if every statement has a ';' on the end 
			var previousToken = context.parser._input.tokens[context.semiColon ().start.tokenIndex - 1];
			if (previousToken.channel !== 2) {
				this.createAnnotationFromToken (previousToken, "Missing ';' on the end of the line", AnnotationType.WARNING);
			}
		};
		listener.prototype.exitScript = (context) => {
			var statementList = context.assignStatement ();
			for (var i in statementList) {
				var statement = statementList[i];
				var nextToken = context.parser._input.tokens[statement.stop.tokenIndex + 1];
				// It is not a semicolon
				if (nextToken.channel !== 2) {
					this.createAnnotationFromToken (statement.stop, "Missing ';' on the end of the assign statement", AnnotationType.ERROR);
				}
			}
		};
		 
		// Runs the listener trough the parsed tree
		antlr4.tree.ParseTreeWalker.DEFAULT.walk (new listener (), tree);
	};

	this.createErrorListener = (lexer, parser) => {		
		// Define the object
		var listener = function () {
			antlr4.error.ErrorListener.call(this);
			return this;
		};
		// Inherits
		listener.prototype = Object.create(antlr4.error.ErrorListener.prototype);
		listener.prototype.constructor = listener;
		
		listener.prototype.syntaxError = (recognizer, offendingSymbol, line, column, message, e) => {
			if (this.debugMode) {
				console.error ("Some error ocurred!");
				console.error (message);
			}

			// If is 'missing' some token, we need to get the previous token's line and colunm.
			if (message.startsWith ("missing")) {
				var previousToken = recognizer._input.tokens[offendingSymbol.tokenIndex - 1];
				line = previousToken.line;
				column = previousToken.column;
				
				// Gets a more helpful message
				var missingSymbol = /missing (.*?)\s.+/.exec (message)[1];
				message = "missing " + missingSymbol + " on this line.";
			} else if (message.startsWith ("no viable alternative")) {// If we aren't able to parse any alternative
				// Checks if we got a End Of File
				if (offendingSymbol.type == ThymeParser.EOF) {
					message = "unexpected end of script";
				} else {
					// List all expected possible tokens
					message = "invalid sequence of tokens near " + recognizer.getTokenErrorDisplay (offendingSymbol) + "\nwas expecting "+ this.getExpectedTokens (recognizer);
				}	
			} else if (message.startsWith ("mismatched input")) {
				// List all expected possible tokens
				message = "unexpected token " + recognizer.getTokenErrorDisplay (offendingSymbol) + "\nwas expecting " + this.getExpectedTokens (recognizer); 
			}

			this.annotationList.push ({
				row: line - 1,
				column: column, 
				text: message,
				type: AnnotationType.ERROR
			});
		};

		lexer.removeErrorListeners ();
		lexer.addErrorListener (new listener ());
		parser.removeErrorListeners ();
		parser.addErrorListener (new listener ());
	};

	// This method creates an Annotation from a token, used later on in AceEditor
	this.createAnnotationFromToken = (token, message, annotationType) => {
		this.annotationList.push ({
			row: token.line - 1,
			column:	token.column,
			text: message,
			type: annotationType
		});
	};

	// This methods returns a pretty named version of all expected tokens from the Recognizer
	this.getExpectedTokens = (recognizer) => {
		// Declare variables
		var intervals = recognizer.getExpectedTokens ().intervals;
		var names = [];

		// Iterate trough every interval
		for (var i = 0; i < intervals.length; i++) {
			var interval = intervals[i];
			for (var j = interval.start; j < interval.stop; j++) {
				var prettyName = "";

				if (recognizer.literalNames.indexOf (j)) {
					// Just got the 'literal' names, aka tokens
					prettyName = recognizer.literalNames[j];
				} else {
					// On the symbolic names, we need to make them pretty
					switch (recognizer.symbolicNames[j]) {
						case "NUMBER_LITERAL": 	prettyName = "Number literal"; break;
						case "STRING_LITERAL": 	prettyName = "String literal"; break;
						case "IDENTIFIER":	 	prettyName = "Identifier"; break;
						case "ASSIGN": 			prettyName = "'=' or ':='"; break;
						case "ARROW": 			prettyName = "=>"; break;
						case "BOOL_FALSE": 
						case "BOOL_TRUE": 		prettyName = "Boolean literal"; break;
					}
				}

				// If isn't already on the list, add it
				if (prettyName && prettyName.length > 0 && names.indexOf (prettyName) === -1) {
					names.push (prettyName);
				}
			}
		}

		// Formats in 'none', 'list' and 'single' collection
		if (names.length <= 0) {
			return "none";
		} else if (names.length === 1) {
			return names[0];
		} else {
			return "[" + names.join (", ") + "]";
		}
	};

	this.checkRule = (parent, ruleName) => {
		try {
			if (parent && ruleName && parent[ruleName]) {
				return parent[ruleName] ();
			} 
		} catch (e) {}

		return null;
	};
}

ThymeEngine.getNodeText = (ruleNames, node, level="") => { 
	var nodeType = "";
	if (node.ruleIndex) {
		nodeType = `<b>{OWN}</b> ${ruleNames[node.ruleIndex]} = `;
	} else if (node.parentCtx) {
		nodeType = `<b>[PARENT]</b> ${ruleNames[node.parentCtx.ruleIndex]} = `;
	}

	var nodeText = "";
	if (node.symbol) {
		nodeText = node.symbol.text;
	} else if (node.text) {
		nodeText = node.text;
	} 
	
	if (node.children) {
		var buffer = "";
		for (var child in node.children) {
			buffer += ThymeEngine.getNodeText (ruleNames, node.children[child], level + "  ") + "\n";
		}	
		nodeText += "\n" + buffer;
	}

	return level + nodeType + nodeText;
};