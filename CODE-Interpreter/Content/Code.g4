grammar Code;

program: NEWLINE? BEGIN_CODE statement NEWLINE END_CODE EOF;

statement: (declaration | functionCall)* (declaration+ (executable | functionCall | conditionalExpression)*)?;

//statement: conditionalFunction;

declaration:  NEWLINE TAB initialization;

initialization: DATA_TYPE (COMMA? assignment)+;

assignment: IDENTIFIER | IDENTIFIER (equalsOp expression)+; 

executable: NEWLINE TAB IDENTIFIER (equalsOp expression);

functionCall: NEWLINE TAB (display | scan);
 
display: NEWLINE? DISPLAY ':' expression NEWLINE?;

scan: SCAN IDENTIFIER (',' IDENTIFIER)*;

expression
    : constant                              #constantExpression
    | IDENTIFIER                            #identifierExpression
    | IDENTIFIER equalsOp expression        #equalsExpression
    | functionCall						    #functionCallExpression
    | '(' expression ')'                    #parethesizedExpression
    | expression multOp expression          #multiplicativeExpression
    | expression addOp expression           #additiveExpression
    | expression concat expression		    #concatExpression
    | expression compareOp expression       #comparativeExpression
    | expression logicOp expression         #logicalExpression
    | newline                               #newlineExpression
    | ESCAPE                                #escapeExpression
    ;   

boolExpression
    : IDENTIFIER
    | '(' expression ')'  
    | expression compareOp expression
    | expression logicOp expression
    ;

conditionalExpression: NEWLINE TAB ifBlock;

ifBlock: IF (boolExpression) conditionalBlock (elseIfBlock)?;

elseIfBlock: NEWLINE TAB ELSE (conditionalBlock | ifBlock);

conditionalBlock: 
                NEWLINE TAB BEGIN_IF 
                    (NEWLINE TAB TAB (display | scan | IDENTIFIER (equalsOp expression)))* 
                NEWLINE TAB END_IF;


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
IF: 'IF';
ELSE: 'ELSE';
BEGIN_IF: BEGIN ' ' IF;
END_IF: END ' ' IF;
LOOP: 'WHILE';

// tokens
NEWLINE: ('\r\n');
TAB: '\t';
COMMENT: NEWLINE? TAB? '#' ~[\r\n]* -> skip;
WS: ' ' -> skip;
ESCAPE: '[' .+? ']';

BEGIN: 'BEGIN';
END: 'END';
CODE: 'CODE';

BEGIN_CODE: BEGIN ' ' CODE;
END_CODE: END ' ' CODE;
DATA_TYPE: 'INT' | 'CHAR' | 'BOOL' | 'FLOAT';

// value equivalents
BOOLVAL: '"' ('TRUE' | 'FALSE') '"';
INTEGERVAL: '-'?[0-9]+;
FLOATVAL: '-'?[0-9]+'.'[0-9]+;
CHARVAL: '\''[a-zA-Z] '\''; 
STRINGVAL: '"' (.*?) '"'; 

// functions
SCAN: 'SCAN:';
DISPLAY: 'DISPLAY';

// reserve words
RESERVE_WORD: DATA_TYPE | BEGIN | END | CODE | BOOLVAL | IF | ELSE
    LOOP | DISPLAY | SCAN;

EQUALS: '=';
COMMA: ',';

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
