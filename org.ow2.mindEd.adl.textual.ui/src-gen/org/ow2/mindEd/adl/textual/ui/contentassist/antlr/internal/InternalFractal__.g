lexer grammar InternalFractal;
@header {
package org.ow2.mindEd.adl.textual.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'this' ;
T14 : 'nodata' ;
T15 : 'null' ;
T16 : 'Override' ;
T17 : 'Singleton' ;
T18 : 'LDFlags' ;
T19 : 'CFlags' ;
T20 : 'STRUCT' ;
T21 : 'UNION' ;
T22 : 'ENUM' ;
T23 : '+' ;
T24 : '-' ;
T25 : 'optional' ;
T26 : 'mandatory' ;
T27 : 'provides' ;
T28 : 'requires' ;
T29 : 'import' ;
T30 : ';' ;
T31 : 'primitive' ;
T32 : '{' ;
T33 : '}' ;
T34 : 'type' ;
T35 : 'composite' ;
T36 : '<' ;
T37 : '>' ;
T38 : ',' ;
T39 : '(' ;
T40 : ')' ;
T41 : 'extends' ;
T42 : 'contains' ;
T43 : 'as' ;
T44 : '=' ;
T45 : 'attribute' ;
T46 : ']' ;
T47 : 'binds' ;
T48 : '.' ;
T49 : 'to' ;
T50 : '[' ;
T51 : 'data' ;
T52 : 'source' ;
T53 : 'conformsto' ;
T54 : '@' ;
T55 : '0x' ;
T56 : '.*' ;
T57 : 'abstract' ;
T58 : '[]' ;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 7788
RULE_CODEC : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 7790
RULE_PATH : (RULE_ID ':'?|'.'*) (('\\'|'\\\\'|'/') RULE_ID)* ('\\'|'\\\\'|'/');

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 7792
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 7794
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 7796
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 7798
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 7800
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 7802
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.ow2.mindEd.adl.textual.ui/src-gen/org/ow2/mindEd/adl/textual/ui/contentassist/antlr/internal/InternalFractal.g" 7804
RULE_ANY_OTHER : .;


