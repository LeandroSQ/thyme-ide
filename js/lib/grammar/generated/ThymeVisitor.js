// Generated from Thyme.g4 by ANTLR 4.7.2
// jshint ignore: start
var antlr4 = require('lib/antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by ThymeParser.

function ThymeVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

ThymeVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
ThymeVisitor.prototype.constructor = ThymeVisitor;

// Visit a parse tree produced by ThymeParser#script.
ThymeVisitor.prototype.visitScript = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#statement.
ThymeVisitor.prototype.visitStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#statementList.
ThymeVisitor.prototype.visitStatementList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#ifStatement.
ThymeVisitor.prototype.visitIfStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#assignStatement.
ThymeVisitor.prototype.visitAssignStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#expressionList.
ThymeVisitor.prototype.visitExpressionList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#NegateExpression.
ThymeVisitor.prototype.visitNegateExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#AddSubExpression.
ThymeVisitor.prototype.visitAddSubExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#RelationalExpression.
ThymeVisitor.prototype.visitRelationalExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#TernaryExpression.
ThymeVisitor.prototype.visitTernaryExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#AndExpression.
ThymeVisitor.prototype.visitAndExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#NotExpression.
ThymeVisitor.prototype.visitNotExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#AtomExpression.
ThymeVisitor.prototype.visitAtomExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#EqualityExpression.
ThymeVisitor.prototype.visitEqualityExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#OrExpression.
ThymeVisitor.prototype.visitOrExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#MulDivModPowExpression.
ThymeVisitor.prototype.visitMulDivModPowExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#MemberAcessorTerm.
ThymeVisitor.prototype.visitMemberAcessorTerm = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#BooleanLiteralFalse.
ThymeVisitor.prototype.visitBooleanLiteralFalse = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#StringLiteral.
ThymeVisitor.prototype.visitStringLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#ListLiteralTerm.
ThymeVisitor.prototype.visitListLiteralTerm = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#ParenthesysExpressionTerm.
ThymeVisitor.prototype.visitParenthesysExpressionTerm = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#FunctionLiteralTerm.
ThymeVisitor.prototype.visitFunctionLiteralTerm = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#BooleanLiteralTrue.
ThymeVisitor.prototype.visitBooleanLiteralTrue = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#MemberAccessorTerm.
ThymeVisitor.prototype.visitMemberAccessorTerm = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#InfinityLiteral.
ThymeVisitor.prototype.visitInfinityLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#FunctionCallTerm.
ThymeVisitor.prototype.visitFunctionCallTerm = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#NullLiteral.
ThymeVisitor.prototype.visitNullLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#NumberLiteral.
ThymeVisitor.prototype.visitNumberLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#listLiteral.
ThymeVisitor.prototype.visitListLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#parenthesysExpression.
ThymeVisitor.prototype.visitParenthesysExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#singleExpression.
ThymeVisitor.prototype.visitSingleExpression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#memberAccessor.
ThymeVisitor.prototype.visitMemberAccessor = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#functionCallStatement.
ThymeVisitor.prototype.visitFunctionCallStatement = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#functionLiteral.
ThymeVisitor.prototype.visitFunctionLiteral = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ThymeParser#semiColon.
ThymeVisitor.prototype.visitSemiColon = function(ctx) {
  return this.visitChildren(ctx);
};



exports.ThymeVisitor = ThymeVisitor;