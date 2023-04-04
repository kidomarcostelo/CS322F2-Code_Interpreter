grammar Code;

program:
        BEGIN_CODE statement* NEWLINE END_CODE EOF;

statement:  NEWLINE (initialization COMMENT?) | COMMENT;

initialization 
    : DATA_TYPE (COMMA? assignment)+;
    //: DATA_TYPE ((COMMA? assignment)+ | (COMMA? declarations)+)+;


declarations: IDENTIFIER;

assignment: IDENTIFIER | IDENTIFIER EQUALS expression; 

expression
    : constant                          #constantExpression
    | IDENTIFIER                        #identifierExpression
    | '(' expression ')'                #parethesizedExpression
    | expression multOp expression      #multiplicativeExpression
    | expression addOp expression       #additiveExpression
    | expression compareOp expression   #comparativeExpression
    ;

NEWLINE: ('\r\n')+;
//WHITESPACE: (' '|'\t')+ -> skip ;
TAB: '\t';


BEGIN_CODE: 'BEGIN CODE';
END_CODE: 'END CODE';
DATA_TYPE: 'INT' | 'CHAR' | 'BOOL' | 'FLOAT';
constant: INTEGER | FLOAT | CHAR | BOOL;

multOp: '*' | '/' ;
addOp: '+' | '-' ;
compareOp: '==' ;


IDENTIFIER: [a-zA-Z_][a-zA-Z_]*;
BOOL: 'TRUE' | 'FALSE';
INTEGER: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
CHAR: [a-zA-Z];

EQUALS: '=';
COMMA: ',';

COMMENT: '#' ~[\r\n]* NEWLINE? -> skip;