package org.ow2.mindEd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdlLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_HEXADECIMAL_TYPE=6;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DOUBLE_RIGHT_CURLY_BRACKETS=11;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_DOUBLE_LEFT_CURLY_BRACKETS=10;
    public static final int RULE_WS=14;
    public static final int RULE_SL=9;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_CODE_C=8;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalAdlLexer() {;} 
    public InternalAdlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAdlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:11:7: ( 'import' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:11:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:12:7: ( ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:13:7: ( '.*' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:13:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:14:7: ( 'composite' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:14:9: 'composite'
            {
            match("composite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:15:7: ( '<' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:15:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:16:7: ( ',' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:17:7: ( '>' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:18:7: ( 'extends' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:18:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:19:7: ( '{' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:19:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:20:7: ( '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:20:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:21:7: ( 'abstract' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:21:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:22:7: ( 'primitive' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:22:9: 'primitive'
            {
            match("primitive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:23:7: ( 'type' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:23:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:24:7: ( '(' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:24:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:25:7: ( ')' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:25:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:26:7: ( 'provides' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:26:9: 'provides'
            {
            match("provides"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:27:7: ( 'as' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:27:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:28:7: ( '[' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:28:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:29:7: ( ']' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:29:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:30:7: ( 'requires' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:30:9: 'requires'
            {
            match("requires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:31:7: ( 'optional' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:31:9: 'optional'
            {
            match("optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:32:7: ( 'output' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:32:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:33:7: ( 'input' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:33:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:34:7: ( ':' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:34:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:35:7: ( 'struct' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:35:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:36:7: ( 'enum' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:36:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:37:7: ( 'union' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:37:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:38:7: ( 'contains' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:38:9: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:39:7: ( 'binds' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:39:9: 'binds'
            {
            match("binds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:40:7: ( 'this' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:40:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:41:7: ( '.' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:41:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:42:7: ( 'to' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:42:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:43:7: ( 'conformsto' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:43:9: 'conformsto'
            {
            match("conformsto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:44:7: ( 'int' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:44:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:45:7: ( 'string' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:45:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:46:7: ( 'int8_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:46:9: 'int8_t'
            {
            match("int8_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:47:7: ( 'uint8_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:47:9: 'uint8_t'
            {
            match("uint8_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:48:7: ( 'int16_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:48:9: 'int16_t'
            {
            match("int16_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:49:7: ( 'uint16_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:49:9: 'uint16_t'
            {
            match("uint16_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:50:7: ( 'int32_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:50:9: 'int32_t'
            {
            match("int32_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:51:7: ( 'uint32_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:51:9: 'uint32_t'
            {
            match("uint32_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:52:7: ( 'int64_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:52:9: 'int64_t'
            {
            match("int64_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:53:7: ( 'uint64_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:53:9: 'uint64_t'
            {
            match("uint64_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:54:7: ( 'intptr_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:54:9: 'intptr_t'
            {
            match("intptr_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:55:7: ( 'uintptr_t' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:55:9: 'uintptr_t'
            {
            match("uintptr_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:56:7: ( '+' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:56:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:57:7: ( '-' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:57:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:58:7: ( 'null' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:58:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:59:7: ( '=' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:59:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:60:7: ( '?' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:60:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:61:7: ( 'attribute' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:61:9: 'attribute'
            {
            match("attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:62:7: ( 'source' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:62:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:63:7: ( 'data' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:63:9: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:64:7: ( '..' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:64:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:65:7: ( '@' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:65:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:66:7: ( 'Override' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:66:9: 'Override'
            {
            match("Override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:67:7: ( 'Singleton' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:67:9: 'Singleton'
            {
            match("Singleton"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:68:7: ( 'LDFlags' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:68:9: 'LDFlags'
            {
            match("LDFlags"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:69:7: ( 'CFlags' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:69:9: 'CFlags'
            {
            match("CFlags"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "RULE_HEXADECIMAL_TYPE"
    public final void mRULE_HEXADECIMAL_TYPE() throws RecognitionException {
        try {
            int _type = RULE_HEXADECIMAL_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4153:23: ( '0x' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4153:25: '0x' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            match("0x"); 

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4153:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXADECIMAL_TYPE"

    // $ANTLR start "RULE_CODE_C"
    public final void mRULE_CODE_C() throws RecognitionException {
        try {
            int _type = RULE_CODE_C;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4155:13: ( RULE_DOUBLE_LEFT_CURLY_BRACKETS ( options {greedy=false; } : . )* RULE_DOUBLE_RIGHT_CURLY_BRACKETS )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4155:15: RULE_DOUBLE_LEFT_CURLY_BRACKETS ( options {greedy=false; } : . )* RULE_DOUBLE_RIGHT_CURLY_BRACKETS
            {
            mRULE_DOUBLE_LEFT_CURLY_BRACKETS(); 
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4155:47: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='}') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='}') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='|')||(LA2_1>='~' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='|')||(LA2_0>='~' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4155:75: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mRULE_DOUBLE_RIGHT_CURLY_BRACKETS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CODE_C"

    // $ANTLR start "RULE_DOUBLE_LEFT_CURLY_BRACKETS"
    public final void mRULE_DOUBLE_LEFT_CURLY_BRACKETS() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_LEFT_CURLY_BRACKETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4157:33: ( '{{' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4157:35: '{{'
            {
            match("{{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_LEFT_CURLY_BRACKETS"

    // $ANTLR start "RULE_DOUBLE_RIGHT_CURLY_BRACKETS"
    public final void mRULE_DOUBLE_RIGHT_CURLY_BRACKETS() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_RIGHT_CURLY_BRACKETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4159:34: ( '}}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4159:36: '}}'
            {
            match("}}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_RIGHT_CURLY_BRACKETS"

    // $ANTLR start "RULE_SL"
    public final void mRULE_SL() throws RecognitionException {
        try {
            int _type = RULE_SL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4161:9: ( '/' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4161:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4163:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4163:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4163:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4163:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4163:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4165:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4165:12: ( '0' .. '9' )+
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4165:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4165:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4167:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4167:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4167:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4167:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4167:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4167:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4167:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4167:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4167:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4167:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4167:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4169:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4169:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4169:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4169:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4171:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4171:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4171:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4171:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4171:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4171:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4171:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4171:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4173:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4173:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4173:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4175:16: ( . )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4175:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | RULE_HEXADECIMAL_TYPE | RULE_CODE_C | RULE_DOUBLE_LEFT_CURLY_BRACKETS | RULE_DOUBLE_RIGHT_CURLY_BRACKETS | RULE_SL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=71;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:364: RULE_HEXADECIMAL_TYPE
                {
                mRULE_HEXADECIMAL_TYPE(); 

                }
                break;
            case 61 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:386: RULE_CODE_C
                {
                mRULE_CODE_C(); 

                }
                break;
            case 62 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:398: RULE_DOUBLE_LEFT_CURLY_BRACKETS
                {
                mRULE_DOUBLE_LEFT_CURLY_BRACKETS(); 

                }
                break;
            case 63 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:430: RULE_DOUBLE_RIGHT_CURLY_BRACKETS
                {
                mRULE_DOUBLE_RIGHT_CURLY_BRACKETS(); 

                }
                break;
            case 64 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:463: RULE_SL
                {
                mRULE_SL(); 

                }
                break;
            case 65 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:471: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 66 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:479: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 67 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:488: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 68 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:500: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 69 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:516: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 70 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:532: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 71 :
                // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1:540: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\56\1\uffff\1\62\1\56\3\uffff\1\56\1\72\1\74\3\56\4\uffff"+
        "\2\56\1\uffff\3\56\2\uffff\1\56\2\uffff\1\56\1\uffff\4\56\1\135"+
        "\1\140\1\53\2\uffff\2\53\2\uffff\2\56\5\uffff\1\56\3\uffff\2\56"+
        "\1\152\3\uffff\1\56\1\155\4\56\1\163\4\uffff\3\56\1\uffff\5\56\2"+
        "\uffff\1\56\2\uffff\1\56\1\uffff\4\56\7\uffff\2\56\1\u0089\4\56"+
        "\2\uffff\1\56\1\uffff\5\56\1\uffff\25\56\1\uffff\4\56\1\u00af\4"+
        "\56\1\u00b4\1\u00b5\11\56\1\u00c3\1\u00c4\5\56\1\u00ca\11\56\1\uffff"+
        "\4\56\2\uffff\6\56\1\u00de\5\56\1\u00e4\2\uffff\4\56\1\u00e9\1\uffff"+
        "\1\u00ea\16\56\1\u00f9\1\u00fa\1\u00fb\1\u00fc\1\uffff\5\56\1\uffff"+
        "\3\56\1\u0105\2\uffff\1\u0106\1\u0107\1\u0108\4\56\1\u010d\6\56"+
        "\4\uffff\1\u0114\6\56\1\u011b\4\uffff\1\u011c\1\56\1\u011e\1\56"+
        "\1\uffff\1\u0120\2\56\1\u0123\1\u0124\1\u0125\1\uffff\1\u0126\1"+
        "\u0127\1\u0128\1\56\1\u012a\1\56\2\uffff\1\u012c\1\uffff\1\56\1"+
        "\uffff\1\u012e\1\u012f\6\uffff\1\u0130\1\uffff\1\u0131\1\uffff\1"+
        "\u0132\5\uffff";
    static final String DFA14_eofS =
        "\u0133\uffff";
    static final String DFA14_minS =
        "\1\0\1\155\1\uffff\1\52\1\157\3\uffff\1\156\1\173\1\175\1\142\1"+
        "\162\1\150\4\uffff\1\145\1\160\1\uffff\1\157\2\151\2\uffff\1\165"+
        "\2\uffff\1\141\1\uffff\1\166\1\151\1\104\1\106\1\170\1\52\1\101"+
        "\2\uffff\2\0\2\uffff\2\160\5\uffff\1\155\3\uffff\1\164\1\165\1\0"+
        "\3\uffff\1\163\1\60\1\164\1\151\1\160\1\151\1\60\4\uffff\1\161\2"+
        "\164\1\uffff\1\162\1\165\1\151\2\156\2\uffff\1\154\2\uffff\1\164"+
        "\1\uffff\1\145\1\156\1\106\1\154\7\uffff\1\157\1\165\1\60\1\160"+
        "\1\146\1\145\1\155\2\uffff\1\164\1\uffff\1\162\1\155\1\166\1\145"+
        "\1\163\1\uffff\1\165\1\151\1\160\1\151\1\162\1\157\1\164\1\144\1"+
        "\154\1\141\1\162\1\147\1\154\1\141\1\162\1\164\1\137\1\66\1\62\1"+
        "\64\1\164\1\uffff\1\157\1\141\1\157\1\156\1\60\1\162\3\151\2\60"+
        "\1\151\1\157\1\165\1\143\1\156\1\143\1\156\1\61\1\163\2\60\1\162"+
        "\1\154\1\141\1\147\1\164\1\60\1\164\3\137\1\162\1\163\1\151\1\162"+
        "\1\144\1\uffff\1\141\1\142\1\164\1\144\2\uffff\1\162\1\156\2\164"+
        "\1\147\1\145\1\60\1\137\1\66\1\62\1\64\1\164\1\60\2\uffff\1\151"+
        "\1\145\1\147\1\163\1\60\1\uffff\1\60\3\164\1\137\1\151\1\156\1\155"+
        "\1\163\1\143\1\165\1\151\2\145\1\141\4\60\1\uffff\1\164\3\137\1"+
        "\162\1\uffff\1\144\1\164\1\163\1\60\2\uffff\3\60\2\164\2\163\1\60"+
        "\2\164\1\166\2\163\1\154\4\uffff\1\60\3\164\1\137\1\145\1\157\1"+
        "\60\4\uffff\1\60\1\145\1\60\1\164\1\uffff\1\60\2\145\3\60\1\uffff"+
        "\3\60\1\164\1\60\1\156\2\uffff\1\60\1\uffff\1\157\1\uffff\2\60\6"+
        "\uffff\1\60\1\uffff\1\60\1\uffff\1\60\5\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\156\1\uffff\1\56\1\157\3\uffff\1\170\1\173\1\175\1\164"+
        "\1\162\1\171\4\uffff\1\145\1\165\1\uffff\1\164\1\156\1\151\2\uffff"+
        "\1\165\2\uffff\1\141\1\uffff\1\166\1\151\1\104\1\106\1\170\1\57"+
        "\1\172\2\uffff\2\uffff\2\uffff\1\160\1\164\5\uffff\1\156\3\uffff"+
        "\1\164\1\165\1\uffff\3\uffff\1\163\1\172\1\164\1\157\1\160\1\151"+
        "\1\172\4\uffff\1\161\2\164\1\uffff\1\162\1\165\1\151\2\156\2\uffff"+
        "\1\154\2\uffff\1\164\1\uffff\1\145\1\156\1\106\1\154\7\uffff\1\157"+
        "\1\165\1\172\1\160\1\164\1\145\1\155\2\uffff\1\164\1\uffff\1\162"+
        "\1\155\1\166\1\145\1\163\1\uffff\1\165\1\151\1\160\1\165\1\162\1"+
        "\157\1\164\1\144\1\154\1\141\1\162\1\147\1\154\1\141\1\162\1\164"+
        "\1\137\1\66\1\62\1\64\1\164\1\uffff\1\157\1\141\1\157\1\156\1\172"+
        "\1\162\3\151\2\172\1\151\1\157\1\165\1\143\1\156\1\143\1\156\1\160"+
        "\1\163\2\172\1\162\1\154\1\141\1\147\1\164\1\172\1\164\3\137\1\162"+
        "\1\163\1\151\1\162\1\144\1\uffff\1\141\1\142\1\164\1\144\2\uffff"+
        "\1\162\1\156\2\164\1\147\1\145\1\172\1\137\1\66\1\62\1\64\1\164"+
        "\1\172\2\uffff\1\151\1\145\1\147\1\163\1\172\1\uffff\1\172\3\164"+
        "\1\137\1\151\1\156\1\155\1\163\1\143\1\165\1\151\2\145\1\141\4\172"+
        "\1\uffff\1\164\3\137\1\162\1\uffff\1\144\1\164\1\163\1\172\2\uffff"+
        "\3\172\2\164\2\163\1\172\2\164\1\166\2\163\1\154\4\uffff\1\172\3"+
        "\164\1\137\1\145\1\157\1\172\4\uffff\1\172\1\145\1\172\1\164\1\uffff"+
        "\1\172\2\145\3\172\1\uffff\3\172\1\164\1\172\1\156\2\uffff\1\172"+
        "\1\uffff\1\157\1\uffff\2\172\6\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\172\5\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\1\6\1\7\6\uffff\1\16\1\17\1\22\1\23\2"+
        "\uffff\1\30\3\uffff\1\56\1\57\1\uffff\1\61\1\62\1\uffff\1\67\7\uffff"+
        "\1\101\1\102\2\uffff\1\106\1\107\2\uffff\1\101\1\2\1\3\1\66\1\37"+
        "\1\uffff\1\5\1\6\1\7\3\uffff\1\11\1\77\1\12\7\uffff\1\16\1\17\1"+
        "\22\1\23\3\uffff\1\30\5\uffff\1\56\1\57\1\uffff\1\61\1\62\1\uffff"+
        "\1\67\4\uffff\1\74\1\102\1\104\1\105\1\100\1\103\1\106\7\uffff\1"+
        "\76\1\75\1\uffff\1\21\5\uffff\1\40\25\uffff\1\42\45\uffff\1\32\4"+
        "\uffff\1\15\1\36\15\uffff\1\60\1\65\5\uffff\1\27\23\uffff\1\33\5"+
        "\uffff\1\35\4\uffff\1\1\1\44\16\uffff\1\26\1\31\1\43\1\64\10\uffff"+
        "\1\73\1\46\1\50\1\52\4\uffff\1\10\6\uffff\1\45\6\uffff\1\72\1\54"+
        "\1\uffff\1\34\1\uffff\1\13\2\uffff\1\20\1\24\1\25\1\47\1\51\1\53"+
        "\1\uffff\1\70\1\uffff\1\4\1\uffff\1\63\1\14\1\55\1\71\1\41";
    static final String DFA14_specialS =
        "\1\2\47\uffff\1\1\1\3\17\uffff\1\0\u00f9\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\50\4\53\1\51\1\16\1"+
            "\17\1\53\1\30\1\6\1\31\1\3\1\44\1\43\11\47\1\24\1\2\1\5\1\33"+
            "\1\7\1\34\1\36\2\46\1\42\10\46\1\41\2\46\1\37\3\46\1\40\7\46"+
            "\1\20\1\53\1\21\1\45\1\46\1\53\1\13\1\27\1\4\1\35\1\10\3\46"+
            "\1\1\4\46\1\32\1\23\1\14\1\46\1\22\1\25\1\15\1\26\5\46\1\11"+
            "\1\53\1\12\uff82\53",
            "\1\54\1\55",
            "",
            "\1\60\3\uffff\1\61",
            "\1\63",
            "",
            "",
            "",
            "\1\70\11\uffff\1\67",
            "\1\71",
            "\1\73",
            "\1\75\20\uffff\1\76\1\77",
            "\1\100",
            "\1\102\6\uffff\1\103\11\uffff\1\101",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111\4\uffff\1\112",
            "",
            "\1\115\4\uffff\1\114",
            "\1\117\4\uffff\1\116",
            "\1\120",
            "",
            "",
            "\1\123",
            "",
            "",
            "\1\126",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\136\4\uffff\1\137",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\0\141",
            "\0\141",
            "",
            "",
            "\1\143",
            "\1\144\3\uffff\1\145",
            "",
            "",
            "",
            "",
            "",
            "\1\146\1\147",
            "",
            "",
            "",
            "\1\150",
            "\1\151",
            "\0\153",
            "",
            "",
            "",
            "\1\154",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\156",
            "\1\157\5\uffff\1\160",
            "\1\161",
            "\1\162",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "",
            "\1\174",
            "",
            "",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\56\1\u0085\1\56\1\u0086\2\56\1\u0087\1\56\1\u0084\1\56"+
            "\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u0088\12\56",
            "\1\u008a",
            "\1\u008c\15\uffff\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "",
            "",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0099\13\uffff\1\u0098",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00be\1\uffff\1\u00bf\2\uffff\1\u00c0\1\uffff\1\u00bd\67"+
            "\uffff\1\u00c1",
            "\1\u00c2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u011d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u011f",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0121",
            "\1\u0122",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0129",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u012b",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u012d",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | RULE_HEXADECIMAL_TYPE | RULE_CODE_C | RULE_DOUBLE_LEFT_CURLY_BRACKETS | RULE_DOUBLE_RIGHT_CURLY_BRACKETS | RULE_SL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_57 = input.LA(1);

                        s = -1;
                        if ( ((LA14_57>='\u0000' && LA14_57<='\uFFFF')) ) {s = 107;}

                        else s = 106;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_40 = input.LA(1);

                        s = -1;
                        if ( ((LA14_40>='\u0000' && LA14_40<='\uFFFF')) ) {s = 97;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='i') ) {s = 1;}

                        else if ( (LA14_0==';') ) {s = 2;}

                        else if ( (LA14_0=='.') ) {s = 3;}

                        else if ( (LA14_0=='c') ) {s = 4;}

                        else if ( (LA14_0=='<') ) {s = 5;}

                        else if ( (LA14_0==',') ) {s = 6;}

                        else if ( (LA14_0=='>') ) {s = 7;}

                        else if ( (LA14_0=='e') ) {s = 8;}

                        else if ( (LA14_0=='{') ) {s = 9;}

                        else if ( (LA14_0=='}') ) {s = 10;}

                        else if ( (LA14_0=='a') ) {s = 11;}

                        else if ( (LA14_0=='p') ) {s = 12;}

                        else if ( (LA14_0=='t') ) {s = 13;}

                        else if ( (LA14_0=='(') ) {s = 14;}

                        else if ( (LA14_0==')') ) {s = 15;}

                        else if ( (LA14_0=='[') ) {s = 16;}

                        else if ( (LA14_0==']') ) {s = 17;}

                        else if ( (LA14_0=='r') ) {s = 18;}

                        else if ( (LA14_0=='o') ) {s = 19;}

                        else if ( (LA14_0==':') ) {s = 20;}

                        else if ( (LA14_0=='s') ) {s = 21;}

                        else if ( (LA14_0=='u') ) {s = 22;}

                        else if ( (LA14_0=='b') ) {s = 23;}

                        else if ( (LA14_0=='+') ) {s = 24;}

                        else if ( (LA14_0=='-') ) {s = 25;}

                        else if ( (LA14_0=='n') ) {s = 26;}

                        else if ( (LA14_0=='=') ) {s = 27;}

                        else if ( (LA14_0=='?') ) {s = 28;}

                        else if ( (LA14_0=='d') ) {s = 29;}

                        else if ( (LA14_0=='@') ) {s = 30;}

                        else if ( (LA14_0=='O') ) {s = 31;}

                        else if ( (LA14_0=='S') ) {s = 32;}

                        else if ( (LA14_0=='L') ) {s = 33;}

                        else if ( (LA14_0=='C') ) {s = 34;}

                        else if ( (LA14_0=='0') ) {s = 35;}

                        else if ( (LA14_0=='/') ) {s = 36;}

                        else if ( (LA14_0=='^') ) {s = 37;}

                        else if ( ((LA14_0>='A' && LA14_0<='B')||(LA14_0>='D' && LA14_0<='K')||(LA14_0>='M' && LA14_0<='N')||(LA14_0>='P' && LA14_0<='R')||(LA14_0>='T' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='f' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='m')||LA14_0=='q'||(LA14_0>='v' && LA14_0<='z')) ) {s = 38;}

                        else if ( ((LA14_0>='1' && LA14_0<='9')) ) {s = 39;}

                        else if ( (LA14_0=='\"') ) {s = 40;}

                        else if ( (LA14_0=='\'') ) {s = 41;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 42;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||LA14_0=='*'||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_41 = input.LA(1);

                        s = -1;
                        if ( ((LA14_41>='\u0000' && LA14_41<='\uFFFF')) ) {s = 97;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}