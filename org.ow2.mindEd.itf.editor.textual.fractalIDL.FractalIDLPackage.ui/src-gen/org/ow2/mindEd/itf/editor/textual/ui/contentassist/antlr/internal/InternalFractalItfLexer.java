package org.ow2.mindEd.itf.editor.textual.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFractalItfLexer extends Lexer {
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=4;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_ID=5;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_INCLUDELIB=10;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=8;
    public static final int RULE_MULOPERATION=12;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FDSYMBOL=9;
    public static final int RULE_UNARYOPERATION=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_ADDITIVEOPERATION=7;
    public static final int RULE_SHIFTOPERATION=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=16;

    // delegates
    // delegators

    public InternalFractalItfLexer() {;} 
    public InternalFractalItfLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFractalItfLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:11:7: ( 'struct' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:11:9: 'struct'
            {
            match("struct"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:12:7: ( 'union' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:12:9: 'union'
            {
            match("union"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:13:7: ( 'null' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:13:9: 'null'
            {
            match("null"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:14:7: ( 'e' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:14:9: 'e'
            {
            match('e'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:15:7: ( 'E' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:15:9: 'E'
            {
            match('E'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:16:7: ( 'const' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:16:9: 'const'
            {
            match("const"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:17:7: ( 'volatile' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:17:9: 'volatile'
            {
            match("volatile"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:18:7: ( 'void' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:18:9: 'void'
            {
            match("void"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:19:7: ( 'char' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:19:9: 'char'
            {
            match("char"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:20:7: ( 'short' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:20:9: 'short'
            {
            match("short"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:21:7: ( 'int' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:21:9: 'int'
            {
            match("int"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:22:7: ( 'long' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:22:9: 'long'
            {
            match("long"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:23:7: ( 'float' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:23:9: 'float'
            {
            match("float"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:24:7: ( 'double' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:24:9: 'double'
            {
            match("double"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:25:7: ( 'signed' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:25:9: 'signed'
            {
            match("signed"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:26:7: ( 'unsigned' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:26:9: 'unsigned'
            {
            match("unsigned"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:27:7: ( 'string' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:27:9: 'string'
            {
            match("string"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:28:7: ( 'int8_t' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:28:9: 'int8_t'
            {
            match("int8_t"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:29:7: ( 'uint8_t' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:29:9: 'uint8_t'
            {
            match("uint8_t"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:30:7: ( 'int16_t' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:30:9: 'int16_t'
            {
            match("int16_t"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:31:7: ( 'uint16_t' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:31:9: 'uint16_t'
            {
            match("uint16_t"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:32:7: ( 'int32_t' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:32:9: 'int32_t'
            {
            match("int32_t"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:33:7: ( 'uint32_t' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:33:9: 'uint32_t'
            {
            match("uint32_t"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:34:7: ( 'int64_t' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:34:9: 'int64_t'
            {
            match("int64_t"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:35:7: ( 'uint64_t' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:35:9: 'uint64_t'
            {
            match("uint64_t"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:36:7: ( 'intptr_t' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:36:9: 'intptr_t'
            {
            match("intptr_t"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:37:7: ( 'uintptr_t' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:37:9: 'uintptr_t'
            {
            match("uintptr_t"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:38:7: ( 'in' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:38:9: 'in'
            {
            match("in"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:39:7: ( 'out' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:39:9: 'out'
            {
            match("out"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:40:7: ( ';' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:40:9: ';'
            {
            match(';'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:41:7: ( 'typedef' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:41:9: 'typedef'
            {
            match("typedef"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:42:7: ( '{' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:42:9: '{'
            {
            match('{'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:43:7: ( '}' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:43:9: '}'
            {
            match('}'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:44:7: ( ':' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:44:9: ':'
            {
            match(':'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:45:7: ( 'enum' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:45:9: 'enum'
            {
            match("enum"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:46:7: ( ',' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:46:9: ','
            {
            match(','); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:47:7: ( '=' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:47:9: '='
            {
            match('='); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:48:7: ( '*' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:48:9: '*'
            {
            match('*'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:49:7: ( '(' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:49:9: '('
            {
            match('('); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:50:7: ( ')' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:50:9: ')'
            {
            match(')'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:51:7: ( '[' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:51:9: '['
            {
            match('['); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:52:7: ( ']' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:52:9: ']'
            {
            match(']'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:53:7: ( '.' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:53:9: '.'
            {
            match('.'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:54:7: ( '#define' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:54:9: '#define'
            {
            match("#define"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:55:7: ( 'interface' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:55:9: 'interface'
            {
            match("interface"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:56:7: ( 'unmanaged' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:56:9: 'unmanaged'
            {
            match("unmanaged"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:57:7: ( '...' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:57:9: '...'
            {
            match("..."); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:58:7: ( '#include' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:58:9: '#include'
            {
            match("#include"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:59:7: ( '@' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:59:9: '@'
            {
            match('@'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:60:7: ( '||' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:60:9: '||'
            {
            match("||"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:61:7: ( '&&' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:61:9: '&&'
            {
            match("&&"); 


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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:62:7: ( '|' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:62:9: '|'
            {
            match('|'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:63:7: ( '^' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:63:9: '^'
            {
            match('^'); 

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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:64:7: ( '&' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:64:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "RULE_INCLUDELIB"
    public final void mRULE_INCLUDELIB() throws RecognitionException {
        try {
            int _type = RULE_INCLUDELIB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9836:17: ( '<' RULE_ID '.' RULE_ID '>' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9836:19: '<' RULE_ID '.' RULE_ID '>'
            {
            match('<'); 
            mRULE_ID(); 
            match('.'); 
            mRULE_ID(); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUDELIB"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9838:14: ( ( 'true' | 'false' ) )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9838:16: ( 'true' | 'false' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9838:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9838:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9838:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_SHIFTOPERATION"
    public final void mRULE_SHIFTOPERATION() throws RecognitionException {
        try {
            int _type = RULE_SHIFTOPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9840:21: ( ( '<<' | '>>' ) )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9840:23: ( '<<' | '>>' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9840:23: ( '<<' | '>>' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='<') ) {
                alt2=1;
            }
            else if ( (LA2_0=='>') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9840:24: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9840:29: '>>'
                    {
                    match(">>"); 


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
    // $ANTLR end "RULE_SHIFTOPERATION"

    // $ANTLR start "RULE_ADDITIVEOPERATION"
    public final void mRULE_ADDITIVEOPERATION() throws RecognitionException {
        try {
            int _type = RULE_ADDITIVEOPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9842:24: ( ( '+' | '-' ) )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9842:26: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADDITIVEOPERATION"

    // $ANTLR start "RULE_MULOPERATION"
    public final void mRULE_MULOPERATION() throws RecognitionException {
        try {
            int _type = RULE_MULOPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9844:19: ( ( '*' | '/' | '%' ) )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9844:21: ( '*' | '/' | '%' )
            {
            if ( input.LA(1)=='%'||input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULOPERATION"

    // $ANTLR start "RULE_UNARYOPERATION"
    public final void mRULE_UNARYOPERATION() throws RecognitionException {
        try {
            int _type = RULE_UNARYOPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9846:21: ( ( '&' | '*' | '+' | '-' | '~' | '!' ) )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9846:23: ( '&' | '*' | '+' | '-' | '~' | '!' )
            {
            if ( input.LA(1)=='!'||input.LA(1)=='&'||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNARYOPERATION"

    // $ANTLR start "RULE_FDSYMBOL"
    public final void mRULE_FDSYMBOL() throws RecognitionException {
        try {
            int _type = RULE_FDSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9848:15: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9848:17: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FDSYMBOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9850:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9850:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9850:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9850:11: '^'
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

            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9850:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:
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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9852:10: ( ( '0' .. '9' )+ )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9852:12: ( '0' .. '9' )+
            {
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9852:12: ( '0' .. '9' )+
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
            	    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9852:13: '0' .. '9'
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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9854:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9854:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9854:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9854:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9854:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9854:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9854:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9854:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9854:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9854:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9854:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9856:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9856:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9856:24: ( options {greedy=false; } : . )*
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
            	    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9856:52: .
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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9858:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9858:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9858:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9858:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9858:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9858:41: ( '\\r' )? '\\n'
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9858:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9858:41: '\\r'
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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9860:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9860:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9860:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:
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
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9862:16: ( . )
            // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:9862:18: .
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
        // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_SHIFTOPERATION | RULE_ADDITIVEOPERATION | RULE_MULOPERATION | RULE_UNARYOPERATION | RULE_FDSYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=68;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:322: T__70
                {
                mT__70(); 

                }
                break;
            case 54 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:328: T__71
                {
                mT__71(); 

                }
                break;
            case 55 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:334: RULE_INCLUDELIB
                {
                mRULE_INCLUDELIB(); 

                }
                break;
            case 56 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:350: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 57 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:363: RULE_SHIFTOPERATION
                {
                mRULE_SHIFTOPERATION(); 

                }
                break;
            case 58 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:383: RULE_ADDITIVEOPERATION
                {
                mRULE_ADDITIVEOPERATION(); 

                }
                break;
            case 59 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:406: RULE_MULOPERATION
                {
                mRULE_MULOPERATION(); 

                }
                break;
            case 60 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:424: RULE_UNARYOPERATION
                {
                mRULE_UNARYOPERATION(); 

                }
                break;
            case 61 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:444: RULE_FDSYMBOL
                {
                mRULE_FDSYMBOL(); 

                }
                break;
            case 62 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:458: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 63 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:466: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 64 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:475: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 65 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:487: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 66 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:503: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 67 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:519: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 68 :
                // ../org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage.ui/src-gen/org/ow2/mindEd/itf/editor/textual/ui/contentassist/antlr/internal/InternalFractalItf.g:1:527: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\3\57\1\64\1\65\4\57\2\75\1\57\1\uffff\1\57\12\uffff\1"+
        "\116\1\53\1\uffff\1\123\1\125\1\126\2\53\1\uffff\1\134\1\uffff\1"+
        "\75\2\uffff\2\53\3\uffff\3\57\1\uffff\4\57\2\uffff\3\57\1\157\3"+
        "\57\1\uffff\2\57\1\uffff\2\57\36\uffff\15\57\1\u008b\1\uffff\4\57"+
        "\1\u0090\12\57\1\u009f\1\u00a0\1\57\1\u00a2\1\57\1\u00a4\6\57\1"+
        "\uffff\1\u00ab\3\57\1\uffff\1\57\1\u00b0\2\57\1\u00b3\1\57\1\u00b5"+
        "\7\57\2\uffff\1\u00bd\1\uffff\1\57\1\uffff\6\57\1\uffff\1\u00c5"+
        "\1\u00b0\2\57\1\uffff\1\u00c8\1\u00c9\1\uffff\1\u00ca\1\uffff\7"+
        "\57\1\uffff\1\57\1\u00d3\5\57\1\uffff\1\u00d9\1\57\3\uffff\2\57"+
        "\1\u00dd\5\57\1\uffff\1\u00e3\1\u00e4\1\u00e5\2\57\1\uffff\1\u00e8"+
        "\1\u00e9\1\57\1\uffff\1\u00eb\1\u00ec\1\u00ed\1\57\1\u00ef\3\uffff"+
        "\1\u00f0\1\57\2\uffff\1\u00f2\3\uffff\1\u00f3\2\uffff\1\u00f4\3"+
        "\uffff";
    static final String DFA14_eofS =
        "\u00f5\uffff";
    static final String DFA14_minS =
        "\1\0\1\150\1\151\1\165\2\60\1\150\1\157\1\156\1\157\2\60\1\165"+
        "\1\uffff\1\162\12\uffff\1\56\1\144\1\uffff\1\174\1\46\1\101\1\74"+
        "\1\76\1\uffff\1\52\1\uffff\1\60\2\uffff\2\0\3\uffff\1\162\1\157"+
        "\1\147\1\uffff\1\151\1\156\1\154\1\165\2\uffff\1\156\1\141\1\151"+
        "\1\60\1\156\1\157\1\154\1\uffff\1\165\1\164\1\uffff\1\160\1\165"+
        "\36\uffff\1\151\1\162\1\156\1\157\1\151\1\141\1\164\1\154\1\155"+
        "\1\163\1\162\1\141\1\144\1\60\1\uffff\1\147\1\141\1\163\1\142\1"+
        "\60\2\145\1\143\1\156\1\164\1\145\1\156\1\147\1\156\1\61\2\60\1"+
        "\164\1\60\1\164\1\60\1\137\1\66\1\62\1\64\1\164\1\162\1\uffff\1"+
        "\60\1\164\1\145\1\154\1\uffff\1\144\1\60\1\164\1\147\1\60\1\144"+
        "\1\60\1\156\1\141\1\137\1\66\1\62\1\64\1\164\2\uffff\1\60\1\uffff"+
        "\1\151\1\uffff\1\164\3\137\1\162\1\146\1\uffff\2\60\2\145\1\uffff"+
        "\2\60\1\uffff\1\60\1\uffff\1\145\1\147\1\164\3\137\1\162\1\uffff"+
        "\1\154\1\60\3\164\1\137\1\141\1\uffff\1\60\1\146\3\uffff\1\144\1"+
        "\145\1\60\3\164\1\137\1\145\1\uffff\3\60\1\164\1\143\1\uffff\2\60"+
        "\1\144\1\uffff\3\60\1\164\1\60\3\uffff\1\60\1\145\2\uffff\1\60\3"+
        "\uffff\1\60\2\uffff\1\60\3\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\164\1\156\1\165\2\172\2\157\1\156\1\157\2\172\1\165"+
        "\1\uffff\1\171\12\uffff\1\56\1\151\1\uffff\1\174\1\46\2\172\1\76"+
        "\1\uffff\1\57\1\uffff\1\172\2\uffff\2\uffff\3\uffff\1\162\1\157"+
        "\1\147\1\uffff\1\163\1\156\1\154\1\165\2\uffff\1\156\1\141\1\154"+
        "\1\172\1\156\1\157\1\154\1\uffff\1\165\1\164\1\uffff\1\160\1\165"+
        "\36\uffff\1\165\1\162\1\156\1\157\1\151\1\141\1\164\1\154\1\155"+
        "\1\163\1\162\1\141\1\144\1\172\1\uffff\1\147\1\141\1\163\1\142\1"+
        "\172\2\145\1\143\1\156\1\164\1\145\1\156\1\147\1\156\1\160\2\172"+
        "\1\164\1\172\1\164\1\172\1\137\1\66\1\62\1\64\1\164\1\162\1\uffff"+
        "\1\172\1\164\1\145\1\154\1\uffff\1\144\1\172\1\164\1\147\1\172\1"+
        "\144\1\172\1\156\1\141\1\137\1\66\1\62\1\64\1\164\2\uffff\1\172"+
        "\1\uffff\1\151\1\uffff\1\164\3\137\1\162\1\146\1\uffff\2\172\2\145"+
        "\1\uffff\2\172\1\uffff\1\172\1\uffff\1\145\1\147\1\164\3\137\1\162"+
        "\1\uffff\1\154\1\172\3\164\1\137\1\141\1\uffff\1\172\1\146\3\uffff"+
        "\1\144\1\145\1\172\3\164\1\137\1\145\1\uffff\3\172\1\164\1\143\1"+
        "\uffff\2\172\1\144\1\uffff\3\172\1\164\1\172\3\uffff\1\172\1\145"+
        "\2\uffff\1\172\3\uffff\1\172\2\uffff\1\172\3\uffff";
    static final String DFA14_acceptS =
        "\15\uffff\1\36\1\uffff\1\40\1\41\1\42\1\44\1\45\1\46\1\47\1\50"+
        "\1\51\1\52\2\uffff\1\61\5\uffff\1\72\1\uffff\1\74\1\uffff\1\76\1"+
        "\77\2\uffff\1\73\1\103\1\104\3\uffff\1\76\4\uffff\1\4\1\5\7\uffff"+
        "\1\75\2\uffff\1\36\2\uffff\1\40\1\41\1\42\1\44\1\45\1\46\1\47\1"+
        "\50\1\51\1\52\1\57\1\53\1\54\1\60\1\61\1\62\1\64\1\63\1\66\1\65"+
        "\1\71\1\67\1\72\1\101\1\102\1\73\1\74\1\77\1\100\1\103\16\uffff"+
        "\1\34\33\uffff\1\13\4\uffff\1\35\16\uffff\1\3\1\43\1\uffff\1\11"+
        "\1\uffff\1\10\6\uffff\1\14\4\uffff\1\70\2\uffff\1\12\1\uffff\1\2"+
        "\7\uffff\1\6\7\uffff\1\15\2\uffff\1\1\1\21\1\17\10\uffff\1\22\5"+
        "\uffff\1\16\3\uffff\1\23\5\uffff\1\24\1\26\1\30\2\uffff\1\37\1\20"+
        "\1\uffff\1\25\1\27\1\31\1\uffff\1\7\1\32\1\uffff\1\56\1\33\1\55";
    static final String DFA14_specialS =
        "\1\0\46\uffff\1\2\1\1\u00cc\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\43\1\47\1\32\1\53\1\51\1"+
            "\35\1\50\1\25\1\26\1\24\1\41\1\22\1\41\1\31\1\42\12\46\1\21"+
            "\1\15\1\37\1\23\1\40\1\53\1\33\3\45\1\44\1\5\1\44\24\45\1\27"+
            "\1\53\1\30\1\36\1\45\1\53\2\45\1\6\1\13\1\4\1\12\2\45\1\10\2"+
            "\45\1\11\1\45\1\3\1\14\3\45\1\1\1\16\1\2\1\7\4\45\1\17\1\34"+
            "\1\20\1\43\uff81\53",
            "\1\55\1\56\12\uffff\1\54",
            "\1\61\4\uffff\1\60",
            "\1\62",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\63\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\67\6\uffff\1\66",
            "\1\70",
            "\1\71",
            "\1\72",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\74\12\57\1\73"+
            "\16\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\76\13\57",
            "\1\77",
            "",
            "\1\102\6\uffff\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "\1\117\4\uffff\1\120",
            "",
            "\1\122",
            "\1\124",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\127\4\uffff\32\130\3\uffff\2\130\1\uffff\32\130",
            "\1\127",
            "",
            "\1\132\4\uffff\1\133",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\0\137",
            "\0\137",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144\3\uffff\1\146\5\uffff\1\145",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\155\2\uffff\1\154",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\156\6\57",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\170\13\uffff\1\167",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\57\1\u0086\1\57\1\u0087\2\57\1\u0088\1\57\1\u0085\1\57"+
            "\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u008a\12\57\1\u0089"+
            "\12\57",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009b\1\uffff\1\u009c\2\uffff\1\u009d\1\uffff\1\u009a\67"+
            "\uffff\1\u009e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b1",
            "\1\u00b2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00da",
            "",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ea",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ee",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f1",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
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

    static class DFA14 extends DFA {

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
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_INCLUDELIB | RULE_BOOLEAN | RULE_SHIFTOPERATION | RULE_ADDITIVEOPERATION | RULE_MULOPERATION | RULE_UNARYOPERATION | RULE_FDSYMBOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='s') ) {s = 1;}

                        else if ( (LA14_0=='u') ) {s = 2;}

                        else if ( (LA14_0=='n') ) {s = 3;}

                        else if ( (LA14_0=='e') ) {s = 4;}

                        else if ( (LA14_0=='E') ) {s = 5;}

                        else if ( (LA14_0=='c') ) {s = 6;}

                        else if ( (LA14_0=='v') ) {s = 7;}

                        else if ( (LA14_0=='i') ) {s = 8;}

                        else if ( (LA14_0=='l') ) {s = 9;}

                        else if ( (LA14_0=='f') ) {s = 10;}

                        else if ( (LA14_0=='d') ) {s = 11;}

                        else if ( (LA14_0=='o') ) {s = 12;}

                        else if ( (LA14_0==';') ) {s = 13;}

                        else if ( (LA14_0=='t') ) {s = 14;}

                        else if ( (LA14_0=='{') ) {s = 15;}

                        else if ( (LA14_0=='}') ) {s = 16;}

                        else if ( (LA14_0==':') ) {s = 17;}

                        else if ( (LA14_0==',') ) {s = 18;}

                        else if ( (LA14_0=='=') ) {s = 19;}

                        else if ( (LA14_0=='*') ) {s = 20;}

                        else if ( (LA14_0=='(') ) {s = 21;}

                        else if ( (LA14_0==')') ) {s = 22;}

                        else if ( (LA14_0=='[') ) {s = 23;}

                        else if ( (LA14_0==']') ) {s = 24;}

                        else if ( (LA14_0=='.') ) {s = 25;}

                        else if ( (LA14_0=='#') ) {s = 26;}

                        else if ( (LA14_0=='@') ) {s = 27;}

                        else if ( (LA14_0=='|') ) {s = 28;}

                        else if ( (LA14_0=='&') ) {s = 29;}

                        else if ( (LA14_0=='^') ) {s = 30;}

                        else if ( (LA14_0=='<') ) {s = 31;}

                        else if ( (LA14_0=='>') ) {s = 32;}

                        else if ( (LA14_0=='+'||LA14_0=='-') ) {s = 33;}

                        else if ( (LA14_0=='/') ) {s = 34;}

                        else if ( (LA14_0=='!'||LA14_0=='~') ) {s = 35;}

                        else if ( (LA14_0=='D'||LA14_0=='F') ) {s = 36;}

                        else if ( ((LA14_0>='A' && LA14_0<='C')||(LA14_0>='G' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='b')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||LA14_0=='m'||(LA14_0>='p' && LA14_0<='r')||(LA14_0>='w' && LA14_0<='z')) ) {s = 37;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 38;}

                        else if ( (LA14_0=='\"') ) {s = 39;}

                        else if ( (LA14_0=='\'') ) {s = 40;}

                        else if ( (LA14_0=='%') ) {s = 41;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 42;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='$'||LA14_0=='?'||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='\u007F' && LA14_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_40 = input.LA(1);

                        s = -1;
                        if ( ((LA14_40>='\u0000' && LA14_40<='\uFFFF')) ) {s = 95;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_39 = input.LA(1);

                        s = -1;
                        if ( ((LA14_39>='\u0000' && LA14_39<='\uFFFF')) ) {s = 95;}

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