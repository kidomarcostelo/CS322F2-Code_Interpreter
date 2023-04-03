grammar Code;

program:    BEGIN_CODE
            NEWLINE
                statement
            NEWLINE 
            END_CODE 
            EOF
            ;

statement:  initialization;

initialization
    : DATA_TYPE IDENTIFIER; 

assignment: IDENTIFIER '=' expression; 

expression
    : constant  
    | IDENTIFIER
    ;


NEWLINE: ('\r\n')+;
//WHITESPACE: (' '|'\t')+ -> skip ;
TAB: '\t';
IDENTIFIER: [a-zA-Z_];

BEGIN_CODE: 'BEGIN CODE';
END_CODE: 'END CODE';
DATA_TYPE: 'INT' | 'CHAR' | 'BOOL' | 'FLOAT';
constant: INTEGER | FLOAT | CHAR | BOOL;

BOOL: 'TRUE' | 'FALSE';
INTEGER: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
CHAR: [a-zA-Z];

// IDENTIFIER: '[a-zA-Z_][a-zA-Z0-9_]*';


