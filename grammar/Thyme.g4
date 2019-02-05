// Grammar name
grammar Thyme;
// Script
script : (assignStatement ';')+ EOF;
// Statements
statement 
	: assignStatement ';'
	| ifStatement ';'
	| functionCallStatement ';'
	| expression ';';
	
statementList 
	: statement*;

// The ternary operator rule
ifStatement : '(' expression ')' '?' '{' statementList '}' ':' '{' statementList '}';
// The variable assignment and declaration statement
assignStatement : expression ASSIGN expression;
// Simple expression list, separated with comma
expressionList
	 : expression (',' expression)*
	 | ;
// Expression rule definition
expression 
	:  '-' expression									#NegateExpression
	| '!' expression									#NotExpression
	| expression op=('*'|'/'|'%'|'^') expression		#MulDivModPowExpression
	| expression op=('+'|'-') expression				#AddSubExpression
	| expression op=('>'|'>='|'<'|'<=') expression		#RelationalExpression
	| expression op=('=='|'!=') expression				#EqualityExpression
	| expression '&&' expression						#AndExpression
	| expression '||' expression						#OrExpression
	| expression '?' expression ':' expression			#TernaryExpression
	| term												#AtomExpression;
// Simple term of an expression
term 
	: parenthesysExpression								#ParenthesysExpressionTerm
	| term '.' term										#MemberAccessorTerm
	| IDENTIFIER										#MemberAcessorTerm
	| NUMBER_LITERAL									#NumberLiteral
	| STRING_LITERAL									#StringLiteral
	| BOOL_TRUE											#BooleanLiteralTrue
	| BOOL_FALSE										#BooleanLiteralFalse
	| NULL_LITERAL										#NullLiteral
	| INFINITY_LITERAL									#InfinityLiteral
	| functionLiteral									#FunctionLiteralTerm
	| listLiteral										#ListLiteralTerm	
	| term '(' expressionList ')'						#FunctionCallTerm;

listLiteral : '[' expressionList ']';
parenthesysExpression : '(' expression ')';

singleExpression
	: memberAccessor
	| parenthesysExpression
	| listLiteral;

// Member accessor
memberAccessor
	: IDENTIFIER 
	| IDENTIFIER ('.' memberAccessor)+;

// Functions
functionCallStatement : term '(' expressionList ')';
functionLiteral: ('(' expressionList ')' ARROW)? '{' statementList '}';
// Infinity
INFINITY_LITERAL : '+inf' | '-inf';
// Null
NULL_LITERAL : 'null';
// Boolean
BOOL_TRUE : 'true';
BOOL_FALSE : 'false';
// Number literal
NUMBER_LITERAL : [0-9]+ ('.' [0-9]+)?;
// String literal
STRING_LITERAL : '"' (~["\r\n] | '""')* '"';
// Identifier
IDENTIFIER : '_'? [a-zA-Z]+ [a-zA-Z_0-9]*;
// Arrow
ARROW : '=>';
// Assign or declare operator
ASSIGN : '=' | ':=';

// Comments definition
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> channel(1);
// Skips the identation and whitespace
WS : [ \t\u000C\r\n]+ -> skip;