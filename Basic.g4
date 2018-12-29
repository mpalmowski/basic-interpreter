grammar Basic;

/***** PARSER RULES *****/
program
    : statement? (NEWLINE statement)* EOF
    ;

statement: lineNumber?
           (
                letStatement |
                dataStatement |
                readStatement |
                printStatement |
                gotoStatement |
                ifStatement |
                forStatement |
                stopStatement |
                defStatement |
                remStatement |
                endStatement
           );

letStatement
    : LET ID EQUAL expression
    ;

dataStatement: DATA number (COMMA number)* ;
readStatement: READ ID (COMMA ID)* ;

printStatement
    : PRINT printArgument (printSeparator printArgument)*
    ;

gotoStatement
    : GOTO lineNumber
    ;

ifStatement
    : IF logicalExpression THEN lineNumber
    ;

forOpening: FOR ID EQUAL expression TO expression (STEP expression)?;
forClosing: NEXT ID ;
forStatement: forOpening NEWLINE statement* lineNumber? forClosing ;

defStatement
    : DEF ID LPAREN ID RPAREN EQUAL expression
    ;

remStatement
    : REM .*?
    ;

stopStatement: STOP ;

endStatement
    : lineNumber? END NEWLINE*
    ;

printSeparator
    : COMMA
    | SEMICOLON
    ;

printArgument
    : expression
    | STRING
    ;

logicalExpression
    : expression operator=(LESS | LESS_OR_EQUAL | EQUAL | GREATER | GREATER_OR_EQUAL | NOT_EQUAL) expression
    ;

expression
    : LPAREN expression RPAREN #parenExpression
    | expression POWER expression #powerExpression
    | expression operator=(MULTIPLY | DIVIDE) expression #mulDivExpression
    | expression operator=(PLUS | MINUS) expression #addSubExpression
    | expressionAtom #atomExpression
    ;

expressionAtom
    : number
    | variable
    | functionCall
    ;

functionCall
    : ID LPAREN expression RPAREN
    ;

lineNumber
    : NUMBER
    ;

number
    : (PLUS | MINUS)? (NUMBER | FLOAT)
    ;

variable
    : ID
    ;

/***** LEXER RULES *****/

// Keywords
LET: 'LET' | 'let' ;
DATA: 'DATA' | 'data' ;
READ: 'READ' | 'read' ;
PRINT: 'PRINT' | 'print' ;
GOTO: 'GO' ' '* 'TO' | 'go' ' '* 'to' ;
IF: 'IF' | 'if' ;
THEN: 'THEN' | 'then' ;
FOR: 'FOR' | 'for' ;
TO: 'TO' | 'to' ;
STEP: 'STEP' | 'step' ;
NEXT: 'NEXT' | 'next' ;
DEF: 'DEF' | 'def' ;
REM: 'REM' | 'rem' ;
STOP: 'STOP' | 'stop' ;
END: 'END' | 'end' ;

// Identifiers
ID: (LETTER | '_') (LETTER | DIGIT | '_')* ;

// Literals
NUMBER: DIGIT+ ;
FLOAT: DIGIT* '.'? DIGIT+ (('e' | 'E') MINUS? DIGIT+)* ;
STRING: '"' ('\\"'|.)*? '"' ;

fragment LETTER: [a-zA-Z] ;
fragment DIGIT: [0-9] ;

// Operators
PLUS: '+' ;
MINUS: '-' ;
MULTIPLY: '*' ;
DIVIDE: '/' ;
POWER: '^' ;

LESS: '<' ;
LESS_OR_EQUAL: '<=' ;
EQUAL: '=' ;
GREATER: '>' ;
GREATER_OR_EQUAL: '>=' ;
NOT_EQUAL: '<>' ;

COMMA: ',' ;
SEMICOLON: ';' ;
DOT: '.' ;
LPAREN: '(' ;
RPAREN: ')' ;

// Whitespace
WHITESPACE : (' ' | '\t') -> skip ;
NEWLINE : '\r'? '\n' | '\r' ;

