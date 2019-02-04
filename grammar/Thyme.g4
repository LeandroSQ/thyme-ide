// Grammar name
grammar Thyme;
// Script
script 
	: (assignStatement ';')+ EOF;
// Statements
statement 
	: assignStatement ';'
	| ifStatement ';'
	| functionCall ';';
statementList 
	: statement* ;

// The ternary operator rule
ifStatement : '(' expression ')' '?' '{' statementList '}' ':' '{' statementList '}';
// The variable assignment and declaration statement
assignStatement : memberAccessor ASSIGN expression;
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
	| expression '.' expression							#MemberAccessorExpression
	| term												#AtomExpression;
// Simple term of an expression
term 
	: '(' expression ')'								#ParenthesysExpression
	| memberAccessor									#MemberAcessorTerm
	| NUMBER_LITERAL									#NumberLiteral
	| STRING_LITERAL									#StringLiteral
	| BOOL_TRUE											#BooleanLiteralTrue
	| BOOL_FALSE										#BooleanLiteralFalse
	| BOOL_FALSE										#NullLiteral
	| functionLiteral									#FunctionLiteralTerm
	| '[' expressionList ']'							#ListLiteral		
	| functionCall										#FunctionCallTerm;
// Member accessor
memberAccessor
	: IDENTIFIER 
	| IDENTIFIER ('.' IDENTIFIER)+;

// Functions
functionCall : IDENTIFIER '(' expressionList ')';
functionLiteral: '(' expressionList ')' ARROW '{' statementList '}';

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