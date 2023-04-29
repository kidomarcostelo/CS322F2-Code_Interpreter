grammar Code;

program: NEWLINE? BEGIN_CODE statement NEWLINE END_CODE EOF;

statement: (NEWLINE TAB (declaration | functionCall))* ((NEWLINE TAB declaration)+ (NEWLINE TAB (executable | functionCall))*)?;

//statement: NEWLINE TAB functionCall;

declaration: initialization;

initialization: DATA_TYPE (COMMA? assignment)+;

assignment: IDENTIFIER | IDENTIFIER (equalsOp expression)+; 

executable: IDENTIFIER (equalsOp expression);

functionCall: (display | scan | ifBlock | whileBlock | forBlock);
 
display: DISPLAY expression NEWLINE?;

scan: SCAN IDENTIFIER (',' IDENTIFIER)*;

expression
    : constant                              #constantExpression
    | identifier                            #identifierExpression
    | IDENTIFIER equalsOp expression        #equalsExpression
    | 'NOT' expression                      #notExpression
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
    : identifier                        #identifierExpression
    | '(' expression ')'                #parethesizedExpression
    | expression compareOp expression   #comparativeExpression
    | expression logicOp expression     #logicalExpression
    ;

//conditionalExpression:  ifBlock;

ifBlock: IF '('boolExpression')' conditionalBlock (elseIfBlock)?;

elseIfBlock: NEWLINE TAB+ ELSE (conditionalBlock | ifBlock);

conditionalBlock: 
                NEWLINE TAB+ BEGIN_IF 
                    (NEWLINE TAB+ (executable | functionCall))* 
                NEWLINE TAB+ END_IF;

whileBlock: WHILE (boolExpression)
            NEWLINE TAB+ BEGIN_WHILE
                (NEWLINE TAB+ (executable | functionCall))* 
            NEWLINE TAB+ END_WHILE;

forBlock: FOR ('(' assignment ',' boolExpression ',' executable ')')
            NEWLINE TAB+ BEGIN_FOR
                (NEWLINE TAB+ (executable | functionCall))* 
            NEWLINE TAB+ END_FOR;

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
logicOp: 'AND' | 'OR';
concat: '&';
newline: '$';

constant: BOOLVAL | INTEGERVAL | FLOATVAL | CHARVAL | STRINGVAL;

identifier: IDENTIFIER;

// control flow structures
IF: 'IF';
ELSE: 'ELSE';
BEGIN_IF: BEGIN ' ' IF;
END_IF: END ' ' IF;
WHILE: 'WHILE';
BEGIN_WHILE: BEGIN ' ' WHILE;
END_WHILE: END ' ' WHILE;
FOR: 'FOR';
BEGIN_FOR: BEGIN ' ' FOR;
END_FOR: END ' ' FOR;


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
DISPLAY: 'DISPLAY:';

// reserve words
RESERVE_WORD: DATA_TYPE | BEGIN | END | CODE | BOOLVAL | IF | ELSE
    WHILE | 'DISPLAY' | 'SCAN';

EQUALS: '=';
COMMA: ',';

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;


