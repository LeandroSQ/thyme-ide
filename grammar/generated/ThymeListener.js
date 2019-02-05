// Generated from Thyme.g4 by ANTLR 4.7.2
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by ThymeParser.
function ThymeListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

ThymeListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
ThymeListener.prototype.constructor = ThymeListener;

// Enter a parse tree produced by ThymeParser#script.
ThymeListener.prototype.enterScript = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#script.
ThymeListener.prototype.exitScript = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#statement.
ThymeListener.prototype.enterStatement = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#statement.
ThymeListener.prototype.exitStatement = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#statementList.
ThymeListener.prototype.enterStatementList = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#statementList.
ThymeListener.prototype.exitStatementList = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#ifStatement.
ThymeListener.prototype.enterIfStatement = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#ifStatement.
ThymeListener.prototype.exitIfStatement = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#assignStatement.
ThymeListener.prototype.enterAssignStatement = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#assignStatement.
ThymeListener.prototype.exitAssignStatement = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#expressionList.
ThymeListener.prototype.enterExpressionList = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#expressionList.
ThymeListener.prototype.exitExpressionList = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#NegateExpression.
ThymeListener.prototype.enterNegateExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#NegateExpression.
ThymeListener.prototype.exitNegateExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#AddSubExpression.
ThymeListener.prototype.enterAddSubExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#AddSubExpression.
ThymeListener.prototype.exitAddSubExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#RelationalExpression.
ThymeListener.prototype.enterRelationalExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#RelationalExpression.
ThymeListener.prototype.exitRelationalExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#TernaryExpression.
ThymeListener.prototype.enterTernaryExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#TernaryExpression.
ThymeListener.prototype.exitTernaryExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#AndExpression.
ThymeListener.prototype.enterAndExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#AndExpression.
ThymeListener.prototype.exitAndExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#NotExpression.
ThymeListener.prototype.enterNotExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#NotExpression.
ThymeListener.prototype.exitNotExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#AtomExpression.
ThymeListener.prototype.enterAtomExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#AtomExpression.
ThymeListener.prototype.exitAtomExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#EqualityExpression.
ThymeListener.prototype.enterEqualityExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#EqualityExpression.
ThymeListener.prototype.exitEqualityExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#OrExpression.
ThymeListener.prototype.enterOrExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#OrExpression.
ThymeListener.prototype.exitOrExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#MulDivModPowExpression.
ThymeListener.prototype.enterMulDivModPowExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#MulDivModPowExpression.
ThymeListener.prototype.exitMulDivModPowExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#MemberAcessorTerm.
ThymeListener.prototype.enterMemberAcessorTerm = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#MemberAcessorTerm.
ThymeListener.prototype.exitMemberAcessorTerm = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#BooleanLiteralFalse.
ThymeListener.prototype.enterBooleanLiteralFalse = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#BooleanLiteralFalse.
ThymeListener.prototype.exitBooleanLiteralFalse = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#StringLiteral.
ThymeListener.prototype.enterStringLiteral = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#StringLiteral.
ThymeListener.prototype.exitStringLiteral = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#ListLiteralTerm.
ThymeListener.prototype.enterListLiteralTerm = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#ListLiteralTerm.
ThymeListener.prototype.exitListLiteralTerm = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#ParenthesysExpressionTerm.
ThymeListener.prototype.enterParenthesysExpressionTerm = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#ParenthesysExpressionTerm.
ThymeListener.prototype.exitParenthesysExpressionTerm = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#FunctionLiteralTerm.
ThymeListener.prototype.enterFunctionLiteralTerm = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#FunctionLiteralTerm.
ThymeListener.prototype.exitFunctionLiteralTerm = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#BooleanLiteralTrue.
ThymeListener.prototype.enterBooleanLiteralTrue = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#BooleanLiteralTrue.
ThymeListener.prototype.exitBooleanLiteralTrue = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#MemberAccessorTerm.
ThymeListener.prototype.enterMemberAccessorTerm = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#MemberAccessorTerm.
ThymeListener.prototype.exitMemberAccessorTerm = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#FunctionCallTerm.
ThymeListener.prototype.enterFunctionCallTerm = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#FunctionCallTerm.
ThymeListener.prototype.exitFunctionCallTerm = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#NullLiteral.
ThymeListener.prototype.enterNullLiteral = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#NullLiteral.
ThymeListener.prototype.exitNullLiteral = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#NumberLiteral.
ThymeListener.prototype.enterNumberLiteral = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#NumberLiteral.
ThymeListener.prototype.exitNumberLiteral = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#listLiteral.
ThymeListener.prototype.enterListLiteral = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#listLiteral.
ThymeListener.prototype.exitListLiteral = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#parenthesysExpression.
ThymeListener.prototype.enterParenthesysExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#parenthesysExpression.
ThymeListener.prototype.exitParenthesysExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#singleExpression.
ThymeListener.prototype.enterSingleExpression = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#singleExpression.
ThymeListener.prototype.exitSingleExpression = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#memberAccessor.
ThymeListener.prototype.enterMemberAccessor = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#memberAccessor.
ThymeListener.prototype.exitMemberAccessor = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#functionCallStatement.
ThymeListener.prototype.enterFunctionCallStatement = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#functionCallStatement.
ThymeListener.prototype.exitFunctionCallStatement = function(ctx) {
};


// Enter a parse tree produced by ThymeParser#functionLiteral.
ThymeListener.prototype.enterFunctionLiteral = function(ctx) {
};

// Exit a parse tree produced by ThymeParser#functionLiteral.
ThymeListener.prototype.exitFunctionLiteral = function(ctx) {
};



exports.ThymeListener = ThymeListener;