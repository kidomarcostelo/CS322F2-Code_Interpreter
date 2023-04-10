grammar Code;

program: NEWLINE? BEGIN_CODE statement NEWLINE END_CODE EOF;

statement: (declaration | functionCall)* (declaration+ (executable* | functionCall*)?);

declaration:  NEWLINE TAB initialization;

initialization: DATA_TYPE (COMMA? assignment)+;

assignment: IDENTIFIER | IDENTIFIER (equalsOp expression)+; 

executable: NEWLINE TAB (expression);

functionCall: NEWLINE TAB (display | SCAN IDENTIFIER (',' IDENTIFIER)*);
 
display: NEWLINE? 'DISPLAY' ':' expression NEWLINE?;

ESCAPE: '[' .*? ']';

expression
    : constant                          #constantExpression
    | IDENTIFIER                        #identifierExpression
    | IDENTIFIER equalsOp expression    #equalsExpression
    | functionCall						          #functionCallExpression
    | '(' expression ')'                #parethesizedExpression
    | expression multOp expression      #multiplicativeExpression
    | expression addOp expression       #additiveExpression
    | expression concat expression		  #concatExpression
    | expression compareOp expression   #comparativeExpression
    | newline                           #newlineExpression
    | ESCAPE                            #escapeExpression
    ;   

// operations
multOp: '*' | '/' | '%'; 
addOp: '+' | '-' ;
compareOp
    : '=='  // equal
    | '>'   // greater than
    | '<'   // lesser than
    | '>='  // greater than or equal to
    | '<='  // lesser than or equal to
    | '<>'  // not equal
    ;
    
equalsOp: EQUALS; 
logicOp: 'AND' | 'OR' | 'NOT';
concat: '&';
newline: '$';

constant: BOOLVAL | INTEGERVAL | FLOATVAL | CHARVAL | STRINGVAL;

// control flow structures
fragment IF: 'IF';
fragment ELSE: 'ELSE';

CONDITIONAL: IF | (ELSE ' ' IF) | ELSE;
LOOP: 'WHILE';

// tokens
NEWLINE: ('\r\n');
TAB: '\t';
COMMENT: NEWLINE? TAB? '#' ~[\r\n]* -> skip;
WS: ' ' -> skip;

fragment BEGIN: 'BEGIN';
fragment END: 'END';
fragment CODE: 'CODE';

BEGIN_CODE: BEGIN ' ' CODE;
END_CODE: END ' ' CODE;
DATA_TYPE: 'INT' | 'CHAR' | 'BOOL' | 'FLOAT';

// value equivalents
BOOLVAL: 'TRUE' | 'FALSE';
INTEGERVAL: '-'?[0-9]+;
FLOATVAL: '-'?[0-9]+'.'[0-9]+;
CHARVAL: '\''[a-zA-Z] '\''; 
STRINGVAL: '"' (.*?) '"'; 

// reserve words
RESERVE_WORD: DATA_TYPE | BEGIN | END | CODE | BOOLVAL | CONDITIONAL
    LOOP | 'DISPLAY' | 'SCAN' | 'BEGIN IF';

SCAN: 'SCAN:';

EQUALS: '=';
COMMA: ',';

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
