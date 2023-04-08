grammar Code;

program:
        BEGIN_CODE statement NEWLINE END_CODE EOF;

statement: (declaration | functionCall)* (declaration+ (executable | functionCall)*)?;

declaration:  NEWLINE TAB (initialization COMMENT?) | COMMENT;

initialization: DATA_TYPE (COMMA? assignment)+;

assignment: IDENTIFIER | IDENTIFIER (equalsOp expression)+; 

executable: NEWLINE TAB(expression COMMENT?) | COMMENT;

functionCall: NEWLINE TAB (DISPLAY expression | SCAN IDENTIFIER (',' IDENTIFIER)*);

expression
    : constant                          #constantExpression
    | IDENTIFIER                        #identifierExpression
    | IDENTIFIER equalsOp expression    #equalsExpression
    | functionCall						#functionCallExpression
    | '(' expression ')'                #parethesizedExpression
    | expression multOp expression      #multiplicativeExpression
    | expression addOp expression       #additiveExpression
    | expression concat expression		#concatExpression
    | expression compareOp expression   #comparativeExpression
    | newline                           #newlineExpression
    | expression escape expression      #escapeExpression
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
escape: '[' ']';

constant: BOOLVAL | INTEGERVAL | FLOATVAL | CHARVAL | STRINGVAL;

// control flow structures
fragment IF: 'IF';
fragment ELSE: 'ELSE';

CONDITIONAL: IF | (ELSE ' ' IF) | ELSE;
LOOP: 'WHILE';

// tokens
NEWLINE: ('\r\n');
TAB: '\t';

fragment BEGIN: 'BEGIN';
fragment END: 'END';
fragment CODE: 'CODE';

BEGIN_CODE: BEGIN ' ' CODE;
END_CODE: END ' ' CODE;
DATA_TYPE: 'INT' | 'CHAR' | 'BOOL' | 'FLOAT';

// value equivalents
BOOLVAL: 'TRUE' | 'FALSE';
INTEGERVAL: [0-9]+;
FLOATVAL: [0-9]+'.'[0-9]+;
CHARVAL: '\''[a-zA-Z] '\''; 
STRINGVAL: '"' (.*?) '"'; 

// reserve words
RESERVE_WORD: DATA_TYPE | BEGIN | END | CODE | BOOLVAL | CONDITIONAL
    LOOP | 'DISPLAY' | 'SCAN' | 'BEGIN IF';
    
IDENTIFIER: [a-zA-Z_][a-zA-Z_]*;
DISPLAY: 'DISPLAY:';
SCAN: 'SCAN:';

EQUALS: '=';
COMMA: ',';

COMMENT: NEWLINE? '#' ~[\r?\n]* ? -> channel(HIDDEN);