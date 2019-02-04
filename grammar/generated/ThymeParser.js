// Generated from Thyme.g4 by ANTLR 4.7.2
// jshint ignore: start
var antlr4 = require('antlr4/index');
var ThymeListener = require('./ThymeListener').ThymeListener;
var ThymeVisitor = require('./ThymeVisitor').ThymeVisitor;

var grammarFileName = "Thyme.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003&\u009f\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0003",
    "\u0002\u0003\u0002\u0003\u0002\u0006\u0002\u001c\n\u0002\r\u0002\u000e",
    "\u0002\u001d\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0005\u0003+\n\u0003\u0003\u0004\u0007\u0004.\n\u0004\f\u0004\u000e",
    "\u00041\u000b\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005",
    "\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005",
    "\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007F\n\u0007\f\u0007\u000e",
    "\u0007I\u000b\u0007\u0003\u0007\u0005\u0007L\n\u0007\u0003\b\u0003\b",
    "\u0003\b\u0003\b\u0003\b\u0003\b\u0005\bT\n\b\u0003\b\u0003\b\u0003",
    "\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003",
    "\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003",
    "\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0007\bq\n\b\f\b",
    "\u000e\bt\u000b\b\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003",
    "\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003",
    "\t\u0005\t\u0086\n\t\u0003\n\u0003\n\u0003\n\u0003\n\u0006\n\u008c\n",
    "\n\r\n\u000e\n\u008d\u0005\n\u0090\n\n\u0003\u000b\u0003\u000b\u0003",
    "\u000b\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0003\f\u0003\f\u0003",
    "\f\u0003\f\u0003\f\u0003\f\u0003\f\u0002\u0003\u000e\r\u0002\u0004\u0006",
    "\b\n\f\u000e\u0010\u0012\u0014\u0016\u0002\u0006\u0003\u0002\r\u0010",
    "\u0004\u0002\u000b\u000b\u0011\u0011\u0003\u0002\u0012\u0015\u0003\u0002",
    "\u0016\u0017\u0002\u00ae\u0002\u001b\u0003\u0002\u0002\u0002\u0004*",
    "\u0003\u0002\u0002\u0002\u0006/\u0003\u0002\u0002\u0002\b2\u0003\u0002",
    "\u0002\u0002\n>\u0003\u0002\u0002\u0002\fK\u0003\u0002\u0002\u0002\u000e",
    "S\u0003\u0002\u0002\u0002\u0010\u0085\u0003\u0002\u0002\u0002\u0012",
    "\u008f\u0003\u0002\u0002\u0002\u0014\u0091\u0003\u0002\u0002\u0002\u0016",
    "\u0096\u0003\u0002\u0002\u0002\u0018\u0019\u0005\n\u0006\u0002\u0019",
    "\u001a\u0007\u0003\u0002\u0002\u001a\u001c\u0003\u0002\u0002\u0002\u001b",
    "\u0018\u0003\u0002\u0002\u0002\u001c\u001d\u0003\u0002\u0002\u0002\u001d",
    "\u001b\u0003\u0002\u0002\u0002\u001d\u001e\u0003\u0002\u0002\u0002\u001e",
    "\u001f\u0003\u0002\u0002\u0002\u001f \u0007\u0002\u0002\u0003 \u0003",
    "\u0003\u0002\u0002\u0002!\"\u0005\n\u0006\u0002\"#\u0007\u0003\u0002",
    "\u0002#+\u0003\u0002\u0002\u0002$%\u0005\b\u0005\u0002%&\u0007\u0003",
    "\u0002\u0002&+\u0003\u0002\u0002\u0002\'(\u0005\u0014\u000b\u0002()",
    "\u0007\u0003\u0002\u0002)+\u0003\u0002\u0002\u0002*!\u0003\u0002\u0002",
    "\u0002*$\u0003\u0002\u0002\u0002*\'\u0003\u0002\u0002\u0002+\u0005\u0003",
    "\u0002\u0002\u0002,.\u0005\u0004\u0003\u0002-,\u0003\u0002\u0002\u0002",
    ".1\u0003\u0002\u0002\u0002/-\u0003\u0002\u0002\u0002/0\u0003\u0002\u0002",
    "\u00020\u0007\u0003\u0002\u0002\u00021/\u0003\u0002\u0002\u000223\u0007",
    "\u0004\u0002\u000234\u0005\u000e\b\u000245\u0007\u0005\u0002\u00025",
    "6\u0007\u0006\u0002\u000267\u0007\u0007\u0002\u000278\u0005\u0006\u0004",
    "\u000289\u0007\b\u0002\u00029:\u0007\t\u0002\u0002:;\u0007\u0007\u0002",
    "\u0002;<\u0005\u0006\u0004\u0002<=\u0007\b\u0002\u0002=\t\u0003\u0002",
    "\u0002\u0002>?\u0005\u0012\n\u0002?@\u0007#\u0002\u0002@A\u0005\u000e",
    "\b\u0002A\u000b\u0003\u0002\u0002\u0002BG\u0005\u000e\b\u0002CD\u0007",
    "\n\u0002\u0002DF\u0005\u000e\b\u0002EC\u0003\u0002\u0002\u0002FI\u0003",
    "\u0002\u0002\u0002GE\u0003\u0002\u0002\u0002GH\u0003\u0002\u0002\u0002",
    "HL\u0003\u0002\u0002\u0002IG\u0003\u0002\u0002\u0002JL\u0003\u0002\u0002",
    "\u0002KB\u0003\u0002\u0002\u0002KJ\u0003\u0002\u0002\u0002L\r\u0003",
    "\u0002\u0002\u0002MN\b\b\u0001\u0002NO\u0007\u000b\u0002\u0002OT\u0005",
    "\u000e\b\rPQ\u0007\f\u0002\u0002QT\u0005\u000e\b\fRT\u0005\u0010\t\u0002",
    "SM\u0003\u0002\u0002\u0002SP\u0003\u0002\u0002\u0002SR\u0003\u0002\u0002",
    "\u0002Tr\u0003\u0002\u0002\u0002UV\f\u000b\u0002\u0002VW\t\u0002\u0002",
    "\u0002Wq\u0005\u000e\b\fXY\f\n\u0002\u0002YZ\t\u0003\u0002\u0002Zq\u0005",
    "\u000e\b\u000b[\\\f\t\u0002\u0002\\]\t\u0004\u0002\u0002]q\u0005\u000e",
    "\b\n^_\f\b\u0002\u0002_`\t\u0005\u0002\u0002`q\u0005\u000e\b\tab\f\u0007",
    "\u0002\u0002bc\u0007\u0018\u0002\u0002cq\u0005\u000e\b\bde\f\u0006\u0002",
    "\u0002ef\u0007\u0019\u0002\u0002fq\u0005\u000e\b\u0007gh\f\u0005\u0002",
    "\u0002hi\u0007\u0006\u0002\u0002ij\u0005\u000e\b\u0002jk\u0007\t\u0002",
    "\u0002kl\u0005\u000e\b\u0006lq\u0003\u0002\u0002\u0002mn\f\u0004\u0002",
    "\u0002no\u0007\u001a\u0002\u0002oq\u0005\u000e\b\u0005pU\u0003\u0002",
    "\u0002\u0002pX\u0003\u0002\u0002\u0002p[\u0003\u0002\u0002\u0002p^\u0003",
    "\u0002\u0002\u0002pa\u0003\u0002\u0002\u0002pd\u0003\u0002\u0002\u0002",
    "pg\u0003\u0002\u0002\u0002pm\u0003\u0002\u0002\u0002qt\u0003\u0002\u0002",
    "\u0002rp\u0003\u0002\u0002\u0002rs\u0003\u0002\u0002\u0002s\u000f\u0003",
    "\u0002\u0002\u0002tr\u0003\u0002\u0002\u0002uv\u0007\u0004\u0002\u0002",
    "vw\u0005\u000e\b\u0002wx\u0007\u0005\u0002\u0002x\u0086\u0003\u0002",
    "\u0002\u0002y\u0086\u0005\u0012\n\u0002z\u0086\u0007\u001f\u0002\u0002",
    "{\u0086\u0007 \u0002\u0002|\u0086\u0007\u001d\u0002\u0002}\u0086\u0007",
    "\u001e\u0002\u0002~\u0086\u0007\u001e\u0002\u0002\u007f\u0086\u0005",
    "\u0016\f\u0002\u0080\u0081\u0007\u001b\u0002\u0002\u0081\u0082\u0005",
    "\f\u0007\u0002\u0082\u0083\u0007\u001c\u0002\u0002\u0083\u0086\u0003",
    "\u0002\u0002\u0002\u0084\u0086\u0005\u0014\u000b\u0002\u0085u\u0003",
    "\u0002\u0002\u0002\u0085y\u0003\u0002\u0002\u0002\u0085z\u0003\u0002",
    "\u0002\u0002\u0085{\u0003\u0002\u0002\u0002\u0085|\u0003\u0002\u0002",
    "\u0002\u0085}\u0003\u0002\u0002\u0002\u0085~\u0003\u0002\u0002\u0002",
    "\u0085\u007f\u0003\u0002\u0002\u0002\u0085\u0080\u0003\u0002\u0002\u0002",
    "\u0085\u0084\u0003\u0002\u0002\u0002\u0086\u0011\u0003\u0002\u0002\u0002",
    "\u0087\u0090\u0007!\u0002\u0002\u0088\u008b\u0007!\u0002\u0002\u0089",
    "\u008a\u0007\u001a\u0002\u0002\u008a\u008c\u0007!\u0002\u0002\u008b",
    "\u0089\u0003\u0002\u0002\u0002\u008c\u008d\u0003\u0002\u0002\u0002\u008d",
    "\u008b\u0003\u0002\u0002\u0002\u008d\u008e\u0003\u0002\u0002\u0002\u008e",
    "\u0090\u0003\u0002\u0002\u0002\u008f\u0087\u0003\u0002\u0002\u0002\u008f",
    "\u0088\u0003\u0002\u0002\u0002\u0090\u0013\u0003\u0002\u0002\u0002\u0091",
    "\u0092\u0007!\u0002\u0002\u0092\u0093\u0007\u0004\u0002\u0002\u0093",
    "\u0094\u0005\f\u0007\u0002\u0094\u0095\u0007\u0005\u0002\u0002\u0095",
    "\u0015\u0003\u0002\u0002\u0002\u0096\u0097\u0007\u0004\u0002\u0002\u0097",
    "\u0098\u0005\f\u0007\u0002\u0098\u0099\u0007\u0005\u0002\u0002\u0099",
    "\u009a\u0007\"\u0002\u0002\u009a\u009b\u0007\u0007\u0002\u0002\u009b",
    "\u009c\u0005\u0006\u0004\u0002\u009c\u009d\u0007\b\u0002\u0002\u009d",
    "\u0017\u0003\u0002\u0002\u0002\r\u001d*/GKSpr\u0085\u008d\u008f"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "';'", "'('", "')'", "'?'", "'{'", "'}'", "':'", 
                     "','", "'-'", "'!'", "'*'", "'/'", "'%'", "'^'", "'+'", 
                     "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", 
                     "'||'", "'.'", "'['", "']'", "'true'", "'false'", null, 
                     null, null, "'=>'" ];

var symbolicNames = [ null, null, null, null, null, null, null, null, null, 
                      null, null, null, null, null, null, null, null, null, 
                      null, null, null, null, null, null, null, null, null, 
                      "BOOL_TRUE", "BOOL_FALSE", "NUMBER_LITERAL", "STRING_LITERAL", 
                      "IDENTIFIER", "ARROW", "ASSIGN", "BLOCK_COMMENT", 
                      "LINE_COMMENT", "WS" ];

var ruleNames =  [ "script", "statement", "statementList", "ifStatement", 
                   "assignStatement", "expressionList", "expression", "term", 
                   "memberAccessor", "functionCall", "functionLiteral" ];

function ThymeParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

ThymeParser.prototype = Object.create(antlr4.Parser.prototype);
ThymeParser.prototype.constructor = ThymeParser;

Object.defineProperty(ThymeParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

ThymeParser.EOF = antlr4.Token.EOF;
ThymeParser.T__0 = 1;
ThymeParser.T__1 = 2;
ThymeParser.T__2 = 3;
ThymeParser.T__3 = 4;
ThymeParser.T__4 = 5;
ThymeParser.T__5 = 6;
ThymeParser.T__6 = 7;
ThymeParser.T__7 = 8;
ThymeParser.T__8 = 9;
ThymeParser.T__9 = 10;
ThymeParser.T__10 = 11;
ThymeParser.T__11 = 12;
ThymeParser.T__12 = 13;
ThymeParser.T__13 = 14;
ThymeParser.T__14 = 15;
ThymeParser.T__15 = 16;
ThymeParser.T__16 = 17;
ThymeParser.T__17 = 18;
ThymeParser.T__18 = 19;
ThymeParser.T__19 = 20;
ThymeParser.T__20 = 21;
ThymeParser.T__21 = 22;
ThymeParser.T__22 = 23;
ThymeParser.T__23 = 24;
ThymeParser.T__24 = 25;
ThymeParser.T__25 = 26;
ThymeParser.BOOL_TRUE = 27;
ThymeParser.BOOL_FALSE = 28;
ThymeParser.NUMBER_LITERAL = 29;
ThymeParser.STRING_LITERAL = 30;
ThymeParser.IDENTIFIER = 31;
ThymeParser.ARROW = 32;
ThymeParser.ASSIGN = 33;
ThymeParser.BLOCK_COMMENT = 34;
ThymeParser.LINE_COMMENT = 35;
ThymeParser.WS = 36;

ThymeParser.RULE_script = 0;
ThymeParser.RULE_statement = 1;
ThymeParser.RULE_statementList = 2;
ThymeParser.RULE_ifStatement = 3;
ThymeParser.RULE_assignStatement = 4;
ThymeParser.RULE_expressionList = 5;
ThymeParser.RULE_expression = 6;
ThymeParser.RULE_term = 7;
ThymeParser.RULE_memberAccessor = 8;
ThymeParser.RULE_functionCall = 9;
ThymeParser.RULE_functionLiteral = 10;


function ScriptContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ThymeParser.RULE_script;
    return this;
}

ScriptContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ScriptContext.prototype.constructor = ScriptContext;

ScriptContext.prototype.EOF = function() {
    return this.getToken(ThymeParser.EOF, 0);
};

ScriptContext.prototype.assignStatement = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(AssignStatementContext);
    } else {
        return this.getTypedRuleContext(AssignStatementContext,i);
    }
};

ScriptContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterScript(this);
	}
};

ScriptContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitScript(this);
	}
};

ScriptContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitScript(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ThymeParser.ScriptContext = ScriptContext;

ThymeParser.prototype.script = function() {

    var localctx = new ScriptContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, ThymeParser.RULE_script);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 25; 
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
            this.state = 22;
            this.assignStatement();
            this.state = 23;
            this.match(ThymeParser.T__0);
            this.state = 27; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        } while(_la===ThymeParser.IDENTIFIER);
        this.state = 29;
        this.match(ThymeParser.EOF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function StatementContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ThymeParser.RULE_statement;
    return this;
}

StatementContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatementContext.prototype.constructor = StatementContext;

StatementContext.prototype.assignStatement = function() {
    return this.getTypedRuleContext(AssignStatementContext,0);
};

StatementContext.prototype.ifStatement = function() {
    return this.getTypedRuleContext(IfStatementContext,0);
};

StatementContext.prototype.functionCall = function() {
    return this.getTypedRuleContext(FunctionCallContext,0);
};

StatementContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterStatement(this);
	}
};

StatementContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitStatement(this);
	}
};

StatementContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitStatement(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ThymeParser.StatementContext = StatementContext;

ThymeParser.prototype.statement = function() {

    var localctx = new StatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, ThymeParser.RULE_statement);
    try {
        this.state = 40;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 31;
            this.assignStatement();
            this.state = 32;
            this.match(ThymeParser.T__0);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 34;
            this.ifStatement();
            this.state = 35;
            this.match(ThymeParser.T__0);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 37;
            this.functionCall();
            this.state = 38;
            this.match(ThymeParser.T__0);
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function StatementListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ThymeParser.RULE_statementList;
    return this;
}

StatementListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatementListContext.prototype.constructor = StatementListContext;

StatementListContext.prototype.statement = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StatementContext);
    } else {
        return this.getTypedRuleContext(StatementContext,i);
    }
};

StatementListContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterStatementList(this);
	}
};

StatementListContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitStatementList(this);
	}
};

StatementListContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitStatementList(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ThymeParser.StatementListContext = StatementListContext;

ThymeParser.prototype.statementList = function() {

    var localctx = new StatementListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, ThymeParser.RULE_statementList);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 45;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===ThymeParser.T__1 || _la===ThymeParser.IDENTIFIER) {
            this.state = 42;
            this.statement();
            this.state = 47;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function IfStatementContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ThymeParser.RULE_ifStatement;
    return this;
}

IfStatementContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
IfStatementContext.prototype.constructor = IfStatementContext;

IfStatementContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};

IfStatementContext.prototype.statementList = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StatementListContext);
    } else {
        return this.getTypedRuleContext(StatementListContext,i);
    }
};

IfStatementContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterIfStatement(this);
	}
};

IfStatementContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitIfStatement(this);
	}
};

IfStatementContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitIfStatement(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ThymeParser.IfStatementContext = IfStatementContext;

ThymeParser.prototype.ifStatement = function() {

    var localctx = new IfStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, ThymeParser.RULE_ifStatement);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 48;
        this.match(ThymeParser.T__1);
        this.state = 49;
        this.expression(0);
        this.state = 50;
        this.match(ThymeParser.T__2);
        this.state = 51;
        this.match(ThymeParser.T__3);
        this.state = 52;
        this.match(ThymeParser.T__4);
        this.state = 53;
        this.statementList();
        this.state = 54;
        this.match(ThymeParser.T__5);
        this.state = 55;
        this.match(ThymeParser.T__6);
        this.state = 56;
        this.match(ThymeParser.T__4);
        this.state = 57;
        this.statementList();
        this.state = 58;
        this.match(ThymeParser.T__5);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function AssignStatementContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ThymeParser.RULE_assignStatement;
    return this;
}

AssignStatementContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
AssignStatementContext.prototype.constructor = AssignStatementContext;

AssignStatementContext.prototype.memberAccessor = function() {
    return this.getTypedRuleContext(MemberAccessorContext,0);
};

AssignStatementContext.prototype.ASSIGN = function() {
    return this.getToken(ThymeParser.ASSIGN, 0);
};

AssignStatementContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};

AssignStatementContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterAssignStatement(this);
	}
};

AssignStatementContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitAssignStatement(this);
	}
};

AssignStatementContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitAssignStatement(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ThymeParser.AssignStatementContext = AssignStatementContext;

ThymeParser.prototype.assignStatement = function() {

    var localctx = new AssignStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, ThymeParser.RULE_assignStatement);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 60;
        this.memberAccessor();
        this.state = 61;
        this.match(ThymeParser.ASSIGN);
        this.state = 62;
        this.expression(0);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ExpressionListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ThymeParser.RULE_expressionList;
    return this;
}

ExpressionListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExpressionListContext.prototype.constructor = ExpressionListContext;

ExpressionListContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};

ExpressionListContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterExpressionList(this);
	}
};

ExpressionListContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitExpressionList(this);
	}
};

ExpressionListContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitExpressionList(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ThymeParser.ExpressionListContext = ExpressionListContext;

ThymeParser.prototype.expressionList = function() {

    var localctx = new ExpressionListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, ThymeParser.RULE_expressionList);
    var _la = 0; // Token type
    try {
        this.state = 73;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ThymeParser.T__1:
        case ThymeParser.T__8:
        case ThymeParser.T__9:
        case ThymeParser.T__24:
        case ThymeParser.BOOL_TRUE:
        case ThymeParser.BOOL_FALSE:
        case ThymeParser.NUMBER_LITERAL:
        case ThymeParser.STRING_LITERAL:
        case ThymeParser.IDENTIFIER:
            this.enterOuterAlt(localctx, 1);
            this.state = 64;
            this.expression(0);
            this.state = 69;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===ThymeParser.T__7) {
                this.state = 65;
                this.match(ThymeParser.T__7);
                this.state = 66;
                this.expression(0);
                this.state = 71;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            break;
        case ThymeParser.T__2:
        case ThymeParser.T__25:
            this.enterOuterAlt(localctx, 2);

            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ExpressionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ThymeParser.RULE_expression;
    return this;
}

ExpressionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExpressionContext.prototype.constructor = ExpressionContext;


 
ExpressionContext.prototype.copyFrom = function(ctx) {
    antlr4.ParserRuleContext.prototype.copyFrom.call(this, ctx);
};

function NegateExpressionContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

NegateExpressionContext.prototype = Object.create(ExpressionContext.prototype);
NegateExpressionContext.prototype.constructor = NegateExpressionContext;

ThymeParser.NegateExpressionContext = NegateExpressionContext;

NegateExpressionContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};
NegateExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterNegateExpression(this);
	}
};

NegateExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitNegateExpression(this);
	}
};

NegateExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitNegateExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function AddSubExpressionContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    this.op = null; // Token;
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

AddSubExpressionContext.prototype = Object.create(ExpressionContext.prototype);
AddSubExpressionContext.prototype.constructor = AddSubExpressionContext;

ThymeParser.AddSubExpressionContext = AddSubExpressionContext;

AddSubExpressionContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};
AddSubExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterAddSubExpression(this);
	}
};

AddSubExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitAddSubExpression(this);
	}
};

AddSubExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitAddSubExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function RelationalExpressionContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    this.op = null; // Token;
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

RelationalExpressionContext.prototype = Object.create(ExpressionContext.prototype);
RelationalExpressionContext.prototype.constructor = RelationalExpressionContext;

ThymeParser.RelationalExpressionContext = RelationalExpressionContext;

RelationalExpressionContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};
RelationalExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterRelationalExpression(this);
	}
};

RelationalExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitRelationalExpression(this);
	}
};

RelationalExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitRelationalExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function TernaryExpressionContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

TernaryExpressionContext.prototype = Object.create(ExpressionContext.prototype);
TernaryExpressionContext.prototype.constructor = TernaryExpressionContext;

ThymeParser.TernaryExpressionContext = TernaryExpressionContext;

TernaryExpressionContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};
TernaryExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterTernaryExpression(this);
	}
};

TernaryExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitTernaryExpression(this);
	}
};

TernaryExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitTernaryExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function AndExpressionContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

AndExpressionContext.prototype = Object.create(ExpressionContext.prototype);
AndExpressionContext.prototype.constructor = AndExpressionContext;

ThymeParser.AndExpressionContext = AndExpressionContext;

AndExpressionContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};
AndExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterAndExpression(this);
	}
};

AndExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitAndExpression(this);
	}
};

AndExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitAndExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function MemberAccessorExpressionContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

MemberAccessorExpressionContext.prototype = Object.create(ExpressionContext.prototype);
MemberAccessorExpressionContext.prototype.constructor = MemberAccessorExpressionContext;

ThymeParser.MemberAccessorExpressionContext = MemberAccessorExpressionContext;

MemberAccessorExpressionContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};
MemberAccessorExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterMemberAccessorExpression(this);
	}
};

MemberAccessorExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitMemberAccessorExpression(this);
	}
};

MemberAccessorExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitMemberAccessorExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function NotExpressionContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

NotExpressionContext.prototype = Object.create(ExpressionContext.prototype);
NotExpressionContext.prototype.constructor = NotExpressionContext;

ThymeParser.NotExpressionContext = NotExpressionContext;

NotExpressionContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};
NotExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterNotExpression(this);
	}
};

NotExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitNotExpression(this);
	}
};

NotExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitNotExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function AtomExpressionContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

AtomExpressionContext.prototype = Object.create(ExpressionContext.prototype);
AtomExpressionContext.prototype.constructor = AtomExpressionContext;

ThymeParser.AtomExpressionContext = AtomExpressionContext;

AtomExpressionContext.prototype.term = function() {
    return this.getTypedRuleContext(TermContext,0);
};
AtomExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterAtomExpression(this);
	}
};

AtomExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitAtomExpression(this);
	}
};

AtomExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitAtomExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function EqualityExpressionContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    this.op = null; // Token;
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

EqualityExpressionContext.prototype = Object.create(ExpressionContext.prototype);
EqualityExpressionContext.prototype.constructor = EqualityExpressionContext;

ThymeParser.EqualityExpressionContext = EqualityExpressionContext;

EqualityExpressionContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};
EqualityExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterEqualityExpression(this);
	}
};

EqualityExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitEqualityExpression(this);
	}
};

EqualityExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitEqualityExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function OrExpressionContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

OrExpressionContext.prototype = Object.create(ExpressionContext.prototype);
OrExpressionContext.prototype.constructor = OrExpressionContext;

ThymeParser.OrExpressionContext = OrExpressionContext;

OrExpressionContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};
OrExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterOrExpression(this);
	}
};

OrExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitOrExpression(this);
	}
};

OrExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitOrExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function MulDivModPowExpressionContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    this.op = null; // Token;
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

MulDivModPowExpressionContext.prototype = Object.create(ExpressionContext.prototype);
MulDivModPowExpressionContext.prototype.constructor = MulDivModPowExpressionContext;

ThymeParser.MulDivModPowExpressionContext = MulDivModPowExpressionContext;

MulDivModPowExpressionContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};
MulDivModPowExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterMulDivModPowExpression(this);
	}
};

MulDivModPowExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitMulDivModPowExpression(this);
	}
};

MulDivModPowExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitMulDivModPowExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};



ThymeParser.prototype.expression = function(_p) {
	if(_p===undefined) {
	    _p = 0;
	}
    var _parentctx = this._ctx;
    var _parentState = this.state;
    var localctx = new ExpressionContext(this, this._ctx, _parentState);
    var _prevctx = localctx;
    var _startState = 12;
    this.enterRecursionRule(localctx, 12, ThymeParser.RULE_expression, _p);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 81;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ThymeParser.T__8:
            localctx = new NegateExpressionContext(this, localctx);
            this._ctx = localctx;
            _prevctx = localctx;

            this.state = 76;
            this.match(ThymeParser.T__8);
            this.state = 77;
            this.expression(11);
            break;
        case ThymeParser.T__9:
            localctx = new NotExpressionContext(this, localctx);
            this._ctx = localctx;
            _prevctx = localctx;
            this.state = 78;
            this.match(ThymeParser.T__9);
            this.state = 79;
            this.expression(10);
            break;
        case ThymeParser.T__1:
        case ThymeParser.T__24:
        case ThymeParser.BOOL_TRUE:
        case ThymeParser.BOOL_FALSE:
        case ThymeParser.NUMBER_LITERAL:
        case ThymeParser.STRING_LITERAL:
        case ThymeParser.IDENTIFIER:
            localctx = new AtomExpressionContext(this, localctx);
            this._ctx = localctx;
            _prevctx = localctx;
            this.state = 80;
            this.term();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
        this._ctx.stop = this._input.LT(-1);
        this.state = 112;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,7,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                this.state = 110;
                this._errHandler.sync(this);
                var la_ = this._interp.adaptivePredict(this._input,6,this._ctx);
                switch(la_) {
                case 1:
                    localctx = new MulDivModPowExpressionContext(this, new ExpressionContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, ThymeParser.RULE_expression);
                    this.state = 83;
                    if (!( this.precpred(this._ctx, 9))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 9)");
                    }
                    this.state = 84;
                    localctx.op = this._input.LT(1);
                    _la = this._input.LA(1);
                    if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ThymeParser.T__10) | (1 << ThymeParser.T__11) | (1 << ThymeParser.T__12) | (1 << ThymeParser.T__13))) !== 0))) {
                        localctx.op = this._errHandler.recoverInline(this);
                    }
                    else {
                    	this._errHandler.reportMatch(this);
                        this.consume();
                    }
                    this.state = 85;
                    this.expression(10);
                    break;

                case 2:
                    localctx = new AddSubExpressionContext(this, new ExpressionContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, ThymeParser.RULE_expression);
                    this.state = 86;
                    if (!( this.precpred(this._ctx, 8))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 8)");
                    }
                    this.state = 87;
                    localctx.op = this._input.LT(1);
                    _la = this._input.LA(1);
                    if(!(_la===ThymeParser.T__8 || _la===ThymeParser.T__14)) {
                        localctx.op = this._errHandler.recoverInline(this);
                    }
                    else {
                    	this._errHandler.reportMatch(this);
                        this.consume();
                    }
                    this.state = 88;
                    this.expression(9);
                    break;

                case 3:
                    localctx = new RelationalExpressionContext(this, new ExpressionContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, ThymeParser.RULE_expression);
                    this.state = 89;
                    if (!( this.precpred(this._ctx, 7))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 7)");
                    }
                    this.state = 90;
                    localctx.op = this._input.LT(1);
                    _la = this._input.LA(1);
                    if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ThymeParser.T__15) | (1 << ThymeParser.T__16) | (1 << ThymeParser.T__17) | (1 << ThymeParser.T__18))) !== 0))) {
                        localctx.op = this._errHandler.recoverInline(this);
                    }
                    else {
                    	this._errHandler.reportMatch(this);
                        this.consume();
                    }
                    this.state = 91;
                    this.expression(8);
                    break;

                case 4:
                    localctx = new EqualityExpressionContext(this, new ExpressionContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, ThymeParser.RULE_expression);
                    this.state = 92;
                    if (!( this.precpred(this._ctx, 6))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 6)");
                    }
                    this.state = 93;
                    localctx.op = this._input.LT(1);
                    _la = this._input.LA(1);
                    if(!(_la===ThymeParser.T__19 || _la===ThymeParser.T__20)) {
                        localctx.op = this._errHandler.recoverInline(this);
                    }
                    else {
                    	this._errHandler.reportMatch(this);
                        this.consume();
                    }
                    this.state = 94;
                    this.expression(7);
                    break;

                case 5:
                    localctx = new AndExpressionContext(this, new ExpressionContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, ThymeParser.RULE_expression);
                    this.state = 95;
                    if (!( this.precpred(this._ctx, 5))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 5)");
                    }
                    this.state = 96;
                    this.match(ThymeParser.T__21);
                    this.state = 97;
                    this.expression(6);
                    break;

                case 6:
                    localctx = new OrExpressionContext(this, new ExpressionContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, ThymeParser.RULE_expression);
                    this.state = 98;
                    if (!( this.precpred(this._ctx, 4))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
                    }
                    this.state = 99;
                    this.match(ThymeParser.T__22);
                    this.state = 100;
                    this.expression(5);
                    break;

                case 7:
                    localctx = new TernaryExpressionContext(this, new ExpressionContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, ThymeParser.RULE_expression);
                    this.state = 101;
                    if (!( this.precpred(this._ctx, 3))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
                    }
                    this.state = 102;
                    this.match(ThymeParser.T__3);
                    this.state = 103;
                    this.expression(0);
                    this.state = 104;
                    this.match(ThymeParser.T__6);
                    this.state = 105;
                    this.expression(4);
                    break;

                case 8:
                    localctx = new MemberAccessorExpressionContext(this, new ExpressionContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, ThymeParser.RULE_expression);
                    this.state = 107;
                    if (!( this.precpred(this._ctx, 2))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
                    }
                    this.state = 108;
                    this.match(ThymeParser.T__23);
                    this.state = 109;
                    this.expression(3);
                    break;

                } 
            }
            this.state = 114;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,7,this._ctx);
        }

    } catch( error) {
        if(error instanceof antlr4.error.RecognitionException) {
	        localctx.exception = error;
	        this._errHandler.reportError(this, error);
	        this._errHandler.recover(this, error);
	    } else {
	    	throw error;
	    }
    } finally {
        this.unrollRecursionContexts(_parentctx)
    }
    return localctx;
};


function TermContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ThymeParser.RULE_term;
    return this;
}

TermContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TermContext.prototype.constructor = TermContext;


 
TermContext.prototype.copyFrom = function(ctx) {
    antlr4.ParserRuleContext.prototype.copyFrom.call(this, ctx);
};


function MemberAcessorTermContext(parser, ctx) {
	TermContext.call(this, parser);
    TermContext.prototype.copyFrom.call(this, ctx);
    return this;
}

MemberAcessorTermContext.prototype = Object.create(TermContext.prototype);
MemberAcessorTermContext.prototype.constructor = MemberAcessorTermContext;

ThymeParser.MemberAcessorTermContext = MemberAcessorTermContext;

MemberAcessorTermContext.prototype.memberAccessor = function() {
    return this.getTypedRuleContext(MemberAccessorContext,0);
};
MemberAcessorTermContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterMemberAcessorTerm(this);
	}
};

MemberAcessorTermContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitMemberAcessorTerm(this);
	}
};

MemberAcessorTermContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitMemberAcessorTerm(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function BooleanLiteralFalseContext(parser, ctx) {
	TermContext.call(this, parser);
    TermContext.prototype.copyFrom.call(this, ctx);
    return this;
}

BooleanLiteralFalseContext.prototype = Object.create(TermContext.prototype);
BooleanLiteralFalseContext.prototype.constructor = BooleanLiteralFalseContext;

ThymeParser.BooleanLiteralFalseContext = BooleanLiteralFalseContext;

BooleanLiteralFalseContext.prototype.BOOL_FALSE = function() {
    return this.getToken(ThymeParser.BOOL_FALSE, 0);
};
BooleanLiteralFalseContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterBooleanLiteralFalse(this);
	}
};

BooleanLiteralFalseContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitBooleanLiteralFalse(this);
	}
};

BooleanLiteralFalseContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitBooleanLiteralFalse(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function ListLiteralContext(parser, ctx) {
	TermContext.call(this, parser);
    TermContext.prototype.copyFrom.call(this, ctx);
    return this;
}

ListLiteralContext.prototype = Object.create(TermContext.prototype);
ListLiteralContext.prototype.constructor = ListLiteralContext;

ThymeParser.ListLiteralContext = ListLiteralContext;

ListLiteralContext.prototype.expressionList = function() {
    return this.getTypedRuleContext(ExpressionListContext,0);
};
ListLiteralContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterListLiteral(this);
	}
};

ListLiteralContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitListLiteral(this);
	}
};

ListLiteralContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitListLiteral(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function StringLiteralContext(parser, ctx) {
	TermContext.call(this, parser);
    TermContext.prototype.copyFrom.call(this, ctx);
    return this;
}

StringLiteralContext.prototype = Object.create(TermContext.prototype);
StringLiteralContext.prototype.constructor = StringLiteralContext;

ThymeParser.StringLiteralContext = StringLiteralContext;

StringLiteralContext.prototype.STRING_LITERAL = function() {
    return this.getToken(ThymeParser.STRING_LITERAL, 0);
};
StringLiteralContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterStringLiteral(this);
	}
};

StringLiteralContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitStringLiteral(this);
	}
};

StringLiteralContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitStringLiteral(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function FunctionLiteralTermContext(parser, ctx) {
	TermContext.call(this, parser);
    TermContext.prototype.copyFrom.call(this, ctx);
    return this;
}

FunctionLiteralTermContext.prototype = Object.create(TermContext.prototype);
FunctionLiteralTermContext.prototype.constructor = FunctionLiteralTermContext;

ThymeParser.FunctionLiteralTermContext = FunctionLiteralTermContext;

FunctionLiteralTermContext.prototype.functionLiteral = function() {
    return this.getTypedRuleContext(FunctionLiteralContext,0);
};
FunctionLiteralTermContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterFunctionLiteralTerm(this);
	}
};

FunctionLiteralTermContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitFunctionLiteralTerm(this);
	}
};

FunctionLiteralTermContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitFunctionLiteralTerm(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function BooleanLiteralTrueContext(parser, ctx) {
	TermContext.call(this, parser);
    TermContext.prototype.copyFrom.call(this, ctx);
    return this;
}

BooleanLiteralTrueContext.prototype = Object.create(TermContext.prototype);
BooleanLiteralTrueContext.prototype.constructor = BooleanLiteralTrueContext;

ThymeParser.BooleanLiteralTrueContext = BooleanLiteralTrueContext;

BooleanLiteralTrueContext.prototype.BOOL_TRUE = function() {
    return this.getToken(ThymeParser.BOOL_TRUE, 0);
};
BooleanLiteralTrueContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterBooleanLiteralTrue(this);
	}
};

BooleanLiteralTrueContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitBooleanLiteralTrue(this);
	}
};

BooleanLiteralTrueContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitBooleanLiteralTrue(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function FunctionCallTermContext(parser, ctx) {
	TermContext.call(this, parser);
    TermContext.prototype.copyFrom.call(this, ctx);
    return this;
}

FunctionCallTermContext.prototype = Object.create(TermContext.prototype);
FunctionCallTermContext.prototype.constructor = FunctionCallTermContext;

ThymeParser.FunctionCallTermContext = FunctionCallTermContext;

FunctionCallTermContext.prototype.functionCall = function() {
    return this.getTypedRuleContext(FunctionCallContext,0);
};
FunctionCallTermContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterFunctionCallTerm(this);
	}
};

FunctionCallTermContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitFunctionCallTerm(this);
	}
};

FunctionCallTermContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitFunctionCallTerm(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function ParenthesysExpressionContext(parser, ctx) {
	TermContext.call(this, parser);
    TermContext.prototype.copyFrom.call(this, ctx);
    return this;
}

ParenthesysExpressionContext.prototype = Object.create(TermContext.prototype);
ParenthesysExpressionContext.prototype.constructor = ParenthesysExpressionContext;

ThymeParser.ParenthesysExpressionContext = ParenthesysExpressionContext;

ParenthesysExpressionContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};
ParenthesysExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterParenthesysExpression(this);
	}
};

ParenthesysExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitParenthesysExpression(this);
	}
};

ParenthesysExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitParenthesysExpression(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function NullLiteralContext(parser, ctx) {
	TermContext.call(this, parser);
    TermContext.prototype.copyFrom.call(this, ctx);
    return this;
}

NullLiteralContext.prototype = Object.create(TermContext.prototype);
NullLiteralContext.prototype.constructor = NullLiteralContext;

ThymeParser.NullLiteralContext = NullLiteralContext;

NullLiteralContext.prototype.BOOL_FALSE = function() {
    return this.getToken(ThymeParser.BOOL_FALSE, 0);
};
NullLiteralContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterNullLiteral(this);
	}
};

NullLiteralContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitNullLiteral(this);
	}
};

NullLiteralContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitNullLiteral(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function NumberLiteralContext(parser, ctx) {
	TermContext.call(this, parser);
    TermContext.prototype.copyFrom.call(this, ctx);
    return this;
}

NumberLiteralContext.prototype = Object.create(TermContext.prototype);
NumberLiteralContext.prototype.constructor = NumberLiteralContext;

ThymeParser.NumberLiteralContext = NumberLiteralContext;

NumberLiteralContext.prototype.NUMBER_LITERAL = function() {
    return this.getToken(ThymeParser.NUMBER_LITERAL, 0);
};
NumberLiteralContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterNumberLiteral(this);
	}
};

NumberLiteralContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitNumberLiteral(this);
	}
};

NumberLiteralContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitNumberLiteral(this);
    } else {
        return visitor.visitChildren(this);
    }
};



ThymeParser.TermContext = TermContext;

ThymeParser.prototype.term = function() {

    var localctx = new TermContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, ThymeParser.RULE_term);
    try {
        this.state = 131;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,8,this._ctx);
        switch(la_) {
        case 1:
            localctx = new ParenthesysExpressionContext(this, localctx);
            this.enterOuterAlt(localctx, 1);
            this.state = 115;
            this.match(ThymeParser.T__1);
            this.state = 116;
            this.expression(0);
            this.state = 117;
            this.match(ThymeParser.T__2);
            break;

        case 2:
            localctx = new MemberAcessorTermContext(this, localctx);
            this.enterOuterAlt(localctx, 2);
            this.state = 119;
            this.memberAccessor();
            break;

        case 3:
            localctx = new NumberLiteralContext(this, localctx);
            this.enterOuterAlt(localctx, 3);
            this.state = 120;
            this.match(ThymeParser.NUMBER_LITERAL);
            break;

        case 4:
            localctx = new StringLiteralContext(this, localctx);
            this.enterOuterAlt(localctx, 4);
            this.state = 121;
            this.match(ThymeParser.STRING_LITERAL);
            break;

        case 5:
            localctx = new BooleanLiteralTrueContext(this, localctx);
            this.enterOuterAlt(localctx, 5);
            this.state = 122;
            this.match(ThymeParser.BOOL_TRUE);
            break;

        case 6:
            localctx = new BooleanLiteralFalseContext(this, localctx);
            this.enterOuterAlt(localctx, 6);
            this.state = 123;
            this.match(ThymeParser.BOOL_FALSE);
            break;

        case 7:
            localctx = new NullLiteralContext(this, localctx);
            this.enterOuterAlt(localctx, 7);
            this.state = 124;
            this.match(ThymeParser.BOOL_FALSE);
            break;

        case 8:
            localctx = new FunctionLiteralTermContext(this, localctx);
            this.enterOuterAlt(localctx, 8);
            this.state = 125;
            this.functionLiteral();
            break;

        case 9:
            localctx = new ListLiteralContext(this, localctx);
            this.enterOuterAlt(localctx, 9);
            this.state = 126;
            this.match(ThymeParser.T__24);
            this.state = 127;
            this.expressionList();
            this.state = 128;
            this.match(ThymeParser.T__25);
            break;

        case 10:
            localctx = new FunctionCallTermContext(this, localctx);
            this.enterOuterAlt(localctx, 10);
            this.state = 130;
            this.functionCall();
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function MemberAccessorContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ThymeParser.RULE_memberAccessor;
    return this;
}

MemberAccessorContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
MemberAccessorContext.prototype.constructor = MemberAccessorContext;

MemberAccessorContext.prototype.IDENTIFIER = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(ThymeParser.IDENTIFIER);
    } else {
        return this.getToken(ThymeParser.IDENTIFIER, i);
    }
};


MemberAccessorContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterMemberAccessor(this);
	}
};

MemberAccessorContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitMemberAccessor(this);
	}
};

MemberAccessorContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitMemberAccessor(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ThymeParser.MemberAccessorContext = MemberAccessorContext;

ThymeParser.prototype.memberAccessor = function() {

    var localctx = new MemberAccessorContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, ThymeParser.RULE_memberAccessor);
    try {
        this.state = 141;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,10,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 133;
            this.match(ThymeParser.IDENTIFIER);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 134;
            this.match(ThymeParser.IDENTIFIER);
            this.state = 137; 
            this._errHandler.sync(this);
            var _alt = 1;
            do {
            	switch (_alt) {
            	case 1:
            		this.state = 135;
            		this.match(ThymeParser.T__23);
            		this.state = 136;
            		this.match(ThymeParser.IDENTIFIER);
            		break;
            	default:
            		throw new antlr4.error.NoViableAltException(this);
            	}
            	this.state = 139; 
            	this._errHandler.sync(this);
            	_alt = this._interp.adaptivePredict(this._input,9, this._ctx);
            } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function FunctionCallContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ThymeParser.RULE_functionCall;
    return this;
}

FunctionCallContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FunctionCallContext.prototype.constructor = FunctionCallContext;

FunctionCallContext.prototype.IDENTIFIER = function() {
    return this.getToken(ThymeParser.IDENTIFIER, 0);
};

FunctionCallContext.prototype.expressionList = function() {
    return this.getTypedRuleContext(ExpressionListContext,0);
};

FunctionCallContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterFunctionCall(this);
	}
};

FunctionCallContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitFunctionCall(this);
	}
};

FunctionCallContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitFunctionCall(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ThymeParser.FunctionCallContext = FunctionCallContext;

ThymeParser.prototype.functionCall = function() {

    var localctx = new FunctionCallContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, ThymeParser.RULE_functionCall);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 143;
        this.match(ThymeParser.IDENTIFIER);
        this.state = 144;
        this.match(ThymeParser.T__1);
        this.state = 145;
        this.expressionList();
        this.state = 146;
        this.match(ThymeParser.T__2);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function FunctionLiteralContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ThymeParser.RULE_functionLiteral;
    return this;
}

FunctionLiteralContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FunctionLiteralContext.prototype.constructor = FunctionLiteralContext;

FunctionLiteralContext.prototype.expressionList = function() {
    return this.getTypedRuleContext(ExpressionListContext,0);
};

FunctionLiteralContext.prototype.ARROW = function() {
    return this.getToken(ThymeParser.ARROW, 0);
};

FunctionLiteralContext.prototype.statementList = function() {
    return this.getTypedRuleContext(StatementListContext,0);
};

FunctionLiteralContext.prototype.enterRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.enterFunctionLiteral(this);
	}
};

FunctionLiteralContext.prototype.exitRule = function(listener) {
    if(listener instanceof ThymeListener ) {
        listener.exitFunctionLiteral(this);
	}
};

FunctionLiteralContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ThymeVisitor ) {
        return visitor.visitFunctionLiteral(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ThymeParser.FunctionLiteralContext = FunctionLiteralContext;

ThymeParser.prototype.functionLiteral = function() {

    var localctx = new FunctionLiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, ThymeParser.RULE_functionLiteral);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 148;
        this.match(ThymeParser.T__1);
        this.state = 149;
        this.expressionList();
        this.state = 150;
        this.match(ThymeParser.T__2);
        this.state = 151;
        this.match(ThymeParser.ARROW);
        this.state = 152;
        this.match(ThymeParser.T__4);
        this.state = 153;
        this.statementList();
        this.state = 154;
        this.match(ThymeParser.T__5);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


ThymeParser.prototype.sempred = function(localctx, ruleIndex, predIndex) {
	switch(ruleIndex) {
	case 6:
			return this.expression_sempred(localctx, predIndex);
    default:
        throw "No predicate with index:" + ruleIndex;
   }
};

ThymeParser.prototype.expression_sempred = function(localctx, predIndex) {
	switch(predIndex) {
		case 0:
			return this.precpred(this._ctx, 9);
		case 1:
			return this.precpred(this._ctx, 8);
		case 2:
			return this.precpred(this._ctx, 7);
		case 3:
			return this.precpred(this._ctx, 6);
		case 4:
			return this.precpred(this._ctx, 5);
		case 5:
			return this.precpred(this._ctx, 4);
		case 6:
			return this.precpred(this._ctx, 3);
		case 7:
			return this.precpred(this._ctx, 2);
		default:
			throw "No predicate with index:" + predIndex;
	}
};


exports.ThymeParser = ThymeParser;
