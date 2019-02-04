// ANTLR setup
var antlr4 = require ("antlr4/index");
var ThymeLexer = require ("grammar/generated/ThymeLexer").ThymeLexer;
var ThymeParser = require ("grammar/generated/ThymeParser").ThymeParser;
var ThymeListener = require ("grammar/generated/ThymeListener").ThymeListener;

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
		this.createErrorListener (parser);
		// Parses the source code
		var ast = parser.script ();
		// Check if it is a valid script
		this.analyzeTokens (tokens);
		this.validateSourceCode (ast);
		
		// Prints the debug tree
		if (this.debugMode) {
			var treeString = ThymeEngine.getNodeText (parser.ruleNames, ast);
			console.log ("--Abstract Syntax Tree (Converted)--");
			console.log (treeString);
			console.log ("--Abstract Syntax Tree (ANTLR)--");
			console.log (ast.toStringTree ());
		}

		this.analyzeAbstractSyntaxTree (ast);
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
			// Extract info
			var identifier = context.memberAccessor ().getText ();

			// If isn't defined on context
			if (this.engineContext.variables.indexOf (identifier) === -1) {
				var validVariable = false;

				// Check for multiple accessors
				if (identifier.indexOf ('.') !== identifier.lastIndexOf ('.')) {
					// Allow Scene.my. variables
					if (identifier.startsWith ("Scene.my")) validVariable = true;
					// Later on, more validations
				} else validVariable = true;

				if (validVariable) this.engineContext.variables.push (identifier);
			}
		};
		
		// Runs the listener trough the parsed tree
		antlr4.tree.ParseTreeWalker.DEFAULT.walk (new listener (), tree);
	};

	this.createErrorListener = (parser) => {		
		// Define the object
		var listener = function () {
			antlr4.error.ErrorListener.call(this);
			return this;
		};
		// Inherits
		listener.prototype = Object.create(antlr4.error.ErrorListener.prototype);
		listener.prototype.constructor = listener;
		
		listener.prototype.syntaxError = (recognizer, offendingSymbol, line, column, message) => {
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
				var missingSymbol = /missing (.*?)\s.+/.exec ("missing ';' at 'kD'")[1];
				message = "Missing " + missingSymbol + " on this line.";
			}

			this.annotationList.push ({
				row: line - 1,
				column: column, 
				text: message,
				type: AnnotationType.ERROR
			});
		};

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