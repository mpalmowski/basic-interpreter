grammar Basic;

/***** PARSER RULES *****/
program
    : statement* endStatement EOF
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
                remStatement
           )
           NEWLINE ;

letStatement
    : LET ID EQUAL expression
    ;

dataStatement: DATA number (COMMA number)* ;
readStatement: READ ID (COMMA ID)* ;

printStatement
    : PRINT printArgument (printSeparator printArgument)*
    ;

gotoStatement: GOTO lineNumber ;
ifStatement: IF expression logicalOperator expression THEN lineNumber ;
forOpening: FOR ID EQUAL expression TO expression (STEP expression)?;
forClosing: NEXT ID ;
forStatement: forOpening NEWLINE statement* lineNumber? forClosing ;

defStatement
    : DEF ID LPAREN ID RPAREN EQUAL expression
    ;

remStatement: REM .*? ;
stopStatement: STOP ;
endStatement: lineNumber? END NEWLINE*;

printSeparator
    : COMMA
    | SEMICOLON
    ;

printArgument
    : expression
    | STRING
    ;

expression
    : LPAREN expression RPAREN
    | expression POWER expression
    | expression multiplyDivideOp expression
    | expression addSubtractOp expression
    | expressionAtom
    ;

expressionAtom
    : number
    | ID
    | functionCall
    ;

functionCall
    : ID LPAREN expression RPAREN
    ;

multiplyDivideOp
    : MULTIPLY
    | DIVIDE
    ;

addSubtractOp
    : PLUS
    | MINUS
    ;

logicalOperator
    : LESS
    | LESS_OR_EQUAL
    | EQUAL
    | GREATER
    | GREATER_OR_EQUAL
    | NOT_EQUAL
    ;

lineNumber
    : NUMBER
    ;

number
    : (PLUS | MINUS)? (NUMBER | FLOAT)
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

