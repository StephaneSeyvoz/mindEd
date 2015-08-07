package org.ow2.mindEd.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ow2.mindEd.services.AdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL_TYPE", "RULE_STRING", "RULE_CODE_C", "RULE_SL", "RULE_DOUBLE_LEFT_CURLY_BRACKETS", "RULE_DOUBLE_RIGHT_CURLY_BRACKETS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'.*'", "'composite'", "'<'", "','", "'>'", "'extends'", "'{'", "'}'", "'abstract'", "'primitive'", "'type'", "'('", "')'", "'provides'", "'as'", "'['", "']'", "'requires'", "'optional'", "'output'", "'input'", "':'", "'struct'", "'enum'", "'union'", "'contains'", "'binds'", "'this'", "'.'", "'to'", "'conformsto'", "'int'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'+'", "'-'", "'null'", "'='", "'?'", "'attribute'", "'source'", "'data'", "'..'", "'@'", "'Override'", "'Singleton'", "'LDFlags'", "'CFlags'"
    };
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


        public InternalAdlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAdlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAdlParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private AdlGrammarAccess grammarAccess;
     	
        public InternalAdlParser(TokenStream input, AdlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AdlFile";	
       	}
       	
       	@Override
       	protected AdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAdlFile"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:73:1: entryRuleAdlFile returns [EObject current=null] : iv_ruleAdlFile= ruleAdlFile EOF ;
    public final EObject entryRuleAdlFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdlFile = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:74:2: (iv_ruleAdlFile= ruleAdlFile EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:75:2: iv_ruleAdlFile= ruleAdlFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdlFileRule()); 
            }
            pushFollow(FOLLOW_ruleAdlFile_in_entryRuleAdlFile81);
            iv_ruleAdlFile=ruleAdlFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdlFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdlFile91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdlFile"


    // $ANTLR start "ruleAdlFile"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:82:1: ruleAdlFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) ) ;
    public final EObject ruleAdlFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_annotationsList_1_0 = null;

        EObject lv_architectureDefinition_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:85:28: ( ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:86:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:86:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:86:2: ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:86:2: ( (lv_imports_0_0= ruleImportDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==70) ) {
                    int LA1_1 = input.LA(2);

                    if ( (synpred1_InternalAdl()) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:87:1: (lv_imports_0_0= ruleImportDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:87:1: (lv_imports_0_0= ruleImportDefinition )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:88:3: lv_imports_0_0= ruleImportDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdlFileAccess().getImportsImportDefinitionParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportDefinition_in_ruleAdlFile137);
            	    lv_imports_0_0=ruleImportDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdlFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"ImportDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:104:3: ( (lv_annotationsList_1_0= ruleAnnotationsList ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==70) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:105:1: (lv_annotationsList_1_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:105:1: (lv_annotationsList_1_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:106:3: lv_annotationsList_1_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdlFileAccess().getAnnotationsListAnnotationsListParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAdlFile159);
                    lv_annotationsList_1_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAdlFileRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_1_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:122:3: ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:123:1: (lv_architectureDefinition_2_0= ruleArchitectureDefinition )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:123:1: (lv_architectureDefinition_2_0= ruleArchitectureDefinition )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:124:3: lv_architectureDefinition_2_0= ruleArchitectureDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdlFileAccess().getArchitectureDefinitionArchitectureDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_ruleAdlFile181);
            lv_architectureDefinition_2_0=ruleArchitectureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdlFileRule());
              	        }
                     		set(
                     			current, 
                     			"architectureDefinition",
                      		lv_architectureDefinition_2_0, 
                      		"ArchitectureDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdlFile"


    // $ANTLR start "entryRuleArchitectureDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:148:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:149:2: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:150:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArchitectureDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition217);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArchitectureDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureDefinition227); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchitectureDefinition"


    // $ANTLR start "ruleArchitectureDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:157:1: ruleArchitectureDefinition returns [EObject current=null] : (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeDefinition_0 = null;

        EObject this_PrimitiveDefinition_1 = null;

        EObject this_TypeDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:160:28: ( (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:161:1: (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:161:1: (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 26:
            case 27:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:162:2: this_CompositeDefinition_0= ruleCompositeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositeDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeDefinition_in_ruleArchitectureDefinition277);
                    this_CompositeDefinition_0=ruleCompositeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:175:2: this_PrimitiveDefinition_1= rulePrimitiveDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getPrimitiveDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveDefinition_in_ruleArchitectureDefinition307);
                    this_PrimitiveDefinition_1=rulePrimitiveDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:188:2: this_TypeDefinition_2= ruleTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getTypeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleArchitectureDefinition337);
                    this_TypeDefinition_2=ruleTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchitectureDefinition"


    // $ANTLR start "entryRuleImportDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:207:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:208:2: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:209:2: iv_ruleImportDefinition= ruleImportDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition372);
            iv_ruleImportDefinition=ruleImportDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDefinition382); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDefinition"


    // $ANTLR start "ruleImportDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:216:1: ruleImportDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:219:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:220:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:220:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:220:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:220:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==70) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:221:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:221:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:222:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleImportDefinition428);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleImportDefinition441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImportDefinitionAccess().getImportKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:242:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:243:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:243:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:244:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportDefinitionAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDefinition462);
            lv_importedNamespace_2_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_2_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleImportDefinition474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getImportDefinitionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDefinition"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:272:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:273:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:274:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard511);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard522); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:281:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:284:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:285:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:285:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:286:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard569);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:296:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:297:2: kw= '.*'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedNameWithWildcard588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleCompositeDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:310:1: entryRuleCompositeDefinition returns [EObject current=null] : iv_ruleCompositeDefinition= ruleCompositeDefinition EOF ;
    public final EObject entryRuleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:311:2: (iv_ruleCompositeDefinition= ruleCompositeDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:312:2: iv_ruleCompositeDefinition= ruleCompositeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition630);
            iv_ruleCompositeDefinition=ruleCompositeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDefinition640); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeDefinition"


    // $ANTLR start "ruleCompositeDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:319:1: ruleCompositeDefinition returns [EObject current=null] : ( () otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) )? (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition | lv_elements_14_5= ruleOutputFlowInterfaceDefinition | lv_elements_14_6= ruleInputFlowInterfaceDefinition ) ) )* otherlv_15= '}' ) ;
    public final EObject ruleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_templateSpecifiers_4_0 = null;

        EObject lv_templateSpecifiers_6_0 = null;

        EObject lv_compositeFormalArgumentsList_8_0 = null;

        EObject lv_superTypes_10_0 = null;

        EObject lv_superTypes_12_0 = null;

        EObject lv_elements_14_1 = null;

        EObject lv_elements_14_2 = null;

        EObject lv_elements_14_3 = null;

        EObject lv_elements_14_4 = null;

        EObject lv_elements_14_5 = null;

        EObject lv_elements_14_6 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:322:28: ( ( () otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) )? (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition | lv_elements_14_5= ruleOutputFlowInterfaceDefinition | lv_elements_14_6= ruleInputFlowInterfaceDefinition ) ) )* otherlv_15= '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:323:1: ( () otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) )? (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition | lv_elements_14_5= ruleOutputFlowInterfaceDefinition | lv_elements_14_6= ruleInputFlowInterfaceDefinition ) ) )* otherlv_15= '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:323:1: ( () otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) )? (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition | lv_elements_14_5= ruleOutputFlowInterfaceDefinition | lv_elements_14_6= ruleInputFlowInterfaceDefinition ) ) )* otherlv_15= '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:323:2: () otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) )? (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition | lv_elements_14_5= ruleOutputFlowInterfaceDefinition | lv_elements_14_6= ruleInputFlowInterfaceDefinition ) ) )* otherlv_15= '}'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:323:2: ()
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:324:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompositeDefinitionAccess().getCompositeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleCompositeDefinition689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompositeDefinitionAccess().getCompositeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:336:1: ( (lv_name_2_0= ruleQualifiedName ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:337:1: (lv_name_2_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:337:1: (lv_name_2_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:338:3: lv_name_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition710);
                    lv_name_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:354:3: (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:354:5: otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCompositeDefinition724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCompositeDefinitionAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:358:1: ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:358:2: ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )*
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:358:2: ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:359:1: (lv_templateSpecifiers_4_0= ruleTemplateSpecifier )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:359:1: (lv_templateSpecifiers_4_0= ruleTemplateSpecifier )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:360:3: lv_templateSpecifiers_4_0= ruleTemplateSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition746);
                    lv_templateSpecifiers_4_0=ruleTemplateSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"templateSpecifiers",
                              		lv_templateSpecifiers_4_0, 
                              		"TemplateSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:376:2: (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:376:4: otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleCompositeDefinition759); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getCompositeDefinitionAccess().getCommaKeyword_3_1_1_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:380:1: ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:381:1: (lv_templateSpecifiers_6_0= ruleTemplateSpecifier )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:381:1: (lv_templateSpecifiers_6_0= ruleTemplateSpecifier )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:382:3: lv_templateSpecifiers_6_0= ruleTemplateSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_3_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition780);
                    	    lv_templateSpecifiers_6_0=ruleTemplateSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templateSpecifiers",
                    	              		lv_templateSpecifiers_6_0, 
                    	              		"TemplateSpecifier");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleCompositeDefinition795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCompositeDefinitionAccess().getGreaterThanSignKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:402:3: ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:403:1: (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:403:1: (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:404:3: lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_ruleCompositeDefinition818);
                    lv_compositeFormalArgumentsList_8_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_8_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:420:3: (otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:420:5: otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )*
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleCompositeDefinition832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getCompositeDefinitionAccess().getExtendsKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:424:1: ( (lv_superTypes_10_0= ruleCompositeSuperType ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:425:1: (lv_superTypes_10_0= ruleCompositeSuperType )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:425:1: (lv_superTypes_10_0= ruleCompositeSuperType )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:426:3: lv_superTypes_10_0= ruleCompositeSuperType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getSuperTypesCompositeSuperTypeParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeSuperType_in_ruleCompositeDefinition853);
                    lv_superTypes_10_0=ruleCompositeSuperType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"superTypes",
                              		lv_superTypes_10_0, 
                              		"CompositeSuperType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:442:2: (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:442:4: otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleCompositeDefinition866); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getCompositeDefinitionAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:446:1: ( (lv_superTypes_12_0= ruleCompositeSuperType ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:447:1: (lv_superTypes_12_0= ruleCompositeSuperType )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:447:1: (lv_superTypes_12_0= ruleCompositeSuperType )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:448:3: lv_superTypes_12_0= ruleCompositeSuperType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getSuperTypesCompositeSuperTypeParserRuleCall_5_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompositeSuperType_in_ruleCompositeDefinition887);
                    	    lv_superTypes_12_0=ruleCompositeSuperType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"superTypes",
                    	              		lv_superTypes_12_0, 
                    	              		"CompositeSuperType");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleCompositeDefinition903); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getCompositeDefinitionAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:468:1: ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition | lv_elements_14_5= ruleOutputFlowInterfaceDefinition | lv_elements_14_6= ruleInputFlowInterfaceDefinition ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31||LA13_0==35||(LA13_0>=37 && LA13_0<=38)||(LA13_0>=43 && LA13_0<=44)||LA13_0==70) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:469:1: ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition | lv_elements_14_5= ruleOutputFlowInterfaceDefinition | lv_elements_14_6= ruleInputFlowInterfaceDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:469:1: ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition | lv_elements_14_5= ruleOutputFlowInterfaceDefinition | lv_elements_14_6= ruleInputFlowInterfaceDefinition ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:470:1: (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition | lv_elements_14_5= ruleOutputFlowInterfaceDefinition | lv_elements_14_6= ruleInputFlowInterfaceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:470:1: (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition | lv_elements_14_5= ruleOutputFlowInterfaceDefinition | lv_elements_14_6= ruleInputFlowInterfaceDefinition )
            	    int alt12=6;
            	    switch ( input.LA(1) ) {
            	    case 70:
            	        {
            	        int LA12_1 = input.LA(2);

            	        if ( (synpred13_InternalAdl()) ) {
            	            alt12=1;
            	        }
            	        else if ( (synpred14_InternalAdl()) ) {
            	            alt12=2;
            	        }
            	        else if ( (synpred15_InternalAdl()) ) {
            	            alt12=3;
            	        }
            	        else if ( (synpred16_InternalAdl()) ) {
            	            alt12=4;
            	        }
            	        else if ( (synpred17_InternalAdl()) ) {
            	            alt12=5;
            	        }
            	        else if ( (true) ) {
            	            alt12=6;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 12, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt12=5;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt12=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:471:3: lv_elements_14_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_7_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleCompositeDefinition926);
            	            lv_elements_14_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_14_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:486:8: lv_elements_14_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_7_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleCompositeDefinition945);
            	            lv_elements_14_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_14_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:501:8: lv_elements_14_3= ruleSubComponentDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsSubComponentDefinitionParserRuleCall_7_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition964);
            	            lv_elements_14_3=ruleSubComponentDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_14_3, 
            	                      		"SubComponentDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:516:8: lv_elements_14_4= ruleBindingDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsBindingDefinitionParserRuleCall_7_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition983);
            	            lv_elements_14_4=ruleBindingDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_14_4, 
            	                      		"BindingDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:531:8: lv_elements_14_5= ruleOutputFlowInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsOutputFlowInterfaceDefinitionParserRuleCall_7_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOutputFlowInterfaceDefinition_in_ruleCompositeDefinition1002);
            	            lv_elements_14_5=ruleOutputFlowInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_14_5, 
            	                      		"OutputFlowInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:546:8: lv_elements_14_6= ruleInputFlowInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsInputFlowInterfaceDefinitionParserRuleCall_7_0_5()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleInputFlowInterfaceDefinition_in_ruleCompositeDefinition1021);
            	            lv_elements_14_6=ruleInputFlowInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_14_6, 
            	                      		"InputFlowInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleCompositeDefinition1037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getCompositeDefinitionAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeDefinition"


    // $ANTLR start "entryRulePrimitiveDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:576:1: entryRulePrimitiveDefinition returns [EObject current=null] : iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF ;
    public final EObject entryRulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:577:2: (iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:578:2: iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition1073);
            iv_rulePrimitiveDefinition=rulePrimitiveDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinition1083); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveDefinition"


    // $ANTLR start "rulePrimitiveDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:585:1: rulePrimitiveDefinition returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition | lv_elements_10_6= ruleOutputFlowInterfaceDefinition | lv_elements_10_7= ruleInputFlowInterfaceDefinition ) ) )* otherlv_11= '}' ) ;
    public final EObject rulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_compositeFormalArgumentsList_4_0 = null;

        EObject lv_superTypes_6_0 = null;

        EObject lv_superTypes_8_0 = null;

        EObject lv_elements_10_1 = null;

        EObject lv_elements_10_2 = null;

        EObject lv_elements_10_3 = null;

        EObject lv_elements_10_4 = null;

        EObject lv_elements_10_5 = null;

        EObject lv_elements_10_6 = null;

        EObject lv_elements_10_7 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:588:28: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition | lv_elements_10_6= ruleOutputFlowInterfaceDefinition | lv_elements_10_7= ruleInputFlowInterfaceDefinition ) ) )* otherlv_11= '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:589:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition | lv_elements_10_6= ruleOutputFlowInterfaceDefinition | lv_elements_10_7= ruleInputFlowInterfaceDefinition ) ) )* otherlv_11= '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:589:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition | lv_elements_10_6= ruleOutputFlowInterfaceDefinition | lv_elements_10_7= ruleInputFlowInterfaceDefinition ) ) )* otherlv_11= '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:589:2: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition | lv_elements_10_6= ruleOutputFlowInterfaceDefinition | lv_elements_10_7= ruleInputFlowInterfaceDefinition ) ) )* otherlv_11= '}'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:589:2: ()
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:590:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveDefinitionAccess().getPrimitiveDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:598:2: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:599:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:599:1: (lv_abstract_1_0= 'abstract' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:600:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,26,FOLLOW_26_in_rulePrimitiveDefinition1138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_abstract_1_0, grammarAccess.getPrimitiveDefinitionAccess().getAbstractAbstractKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "abstract", true, "abstract");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePrimitiveDefinition1164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimitiveDefinitionAccess().getPrimitiveKeyword_2());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:617:1: ( (lv_name_3_0= ruleQualifiedName ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:618:1: (lv_name_3_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:618:1: (lv_name_3_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:619:3: lv_name_3_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getNameQualifiedNameParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1185);
                    lv_name_3_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:635:3: ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:636:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:636:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:637:3: lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1207);
                    lv_compositeFormalArgumentsList_4_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_4_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:653:3: (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:653:5: otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )*
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_rulePrimitiveDefinition1221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPrimitiveDefinitionAccess().getExtendsKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:657:1: ( (lv_superTypes_6_0= rulePrimitiveSuperType ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:658:1: (lv_superTypes_6_0= rulePrimitiveSuperType )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:658:1: (lv_superTypes_6_0= rulePrimitiveSuperType )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:659:3: lv_superTypes_6_0= rulePrimitiveSuperType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypesPrimitiveSuperTypeParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1242);
                    lv_superTypes_6_0=rulePrimitiveSuperType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"superTypes",
                              		lv_superTypes_6_0, 
                              		"PrimitiveSuperType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:675:2: (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:675:4: otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveDefinition1255); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getPrimitiveDefinitionAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:679:1: ( (lv_superTypes_8_0= rulePrimitiveSuperType ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:680:1: (lv_superTypes_8_0= rulePrimitiveSuperType )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:680:1: (lv_superTypes_8_0= rulePrimitiveSuperType )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:681:3: lv_superTypes_8_0= rulePrimitiveSuperType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypesPrimitiveSuperTypeParserRuleCall_5_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1276);
                    	    lv_superTypes_8_0=rulePrimitiveSuperType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"superTypes",
                    	              		lv_superTypes_8_0, 
                    	              		"PrimitiveSuperType");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_rulePrimitiveDefinition1292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPrimitiveDefinitionAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:701:1: ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition | lv_elements_10_6= ruleOutputFlowInterfaceDefinition | lv_elements_10_7= ruleInputFlowInterfaceDefinition ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31||LA20_0==35||(LA20_0>=37 && LA20_0<=38)||(LA20_0>=66 && LA20_0<=68)||LA20_0==70) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:702:1: ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition | lv_elements_10_6= ruleOutputFlowInterfaceDefinition | lv_elements_10_7= ruleInputFlowInterfaceDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:702:1: ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition | lv_elements_10_6= ruleOutputFlowInterfaceDefinition | lv_elements_10_7= ruleInputFlowInterfaceDefinition ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:703:1: (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition | lv_elements_10_6= ruleOutputFlowInterfaceDefinition | lv_elements_10_7= ruleInputFlowInterfaceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:703:1: (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition | lv_elements_10_6= ruleOutputFlowInterfaceDefinition | lv_elements_10_7= ruleInputFlowInterfaceDefinition )
            	    int alt19=7;
            	    switch ( input.LA(1) ) {
            	    case 70:
            	        {
            	        int LA19_1 = input.LA(2);

            	        if ( (synpred24_InternalAdl()) ) {
            	            alt19=1;
            	        }
            	        else if ( (synpred25_InternalAdl()) ) {
            	            alt19=2;
            	        }
            	        else if ( (synpred26_InternalAdl()) ) {
            	            alt19=3;
            	        }
            	        else if ( (synpred27_InternalAdl()) ) {
            	            alt19=4;
            	        }
            	        else if ( (synpred28_InternalAdl()) ) {
            	            alt19=5;
            	        }
            	        else if ( (synpred29_InternalAdl()) ) {
            	            alt19=6;
            	        }
            	        else if ( (true) ) {
            	            alt19=7;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 19, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt19=5;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt19=6;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt19=7;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:704:3: lv_elements_10_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_7_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1315);
            	            lv_elements_10_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:719:8: lv_elements_10_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_7_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1334);
            	            lv_elements_10_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:734:8: lv_elements_10_3= ruleImplementationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_7_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1353);
            	            lv_elements_10_3=ruleImplementationDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_3, 
            	                      		"ImplementationDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:749:8: lv_elements_10_4= ruleAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_7_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1372);
            	            lv_elements_10_4=ruleAttributeDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_4, 
            	                      		"AttributeDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:764:8: lv_elements_10_5= ruleDataDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsDataDefinitionParserRuleCall_7_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1391);
            	            lv_elements_10_5=ruleDataDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_5, 
            	                      		"DataDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:779:8: lv_elements_10_6= ruleOutputFlowInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsOutputFlowInterfaceDefinitionParserRuleCall_7_0_5()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOutputFlowInterfaceDefinition_in_rulePrimitiveDefinition1410);
            	            lv_elements_10_6=ruleOutputFlowInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_6, 
            	                      		"OutputFlowInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:794:8: lv_elements_10_7= ruleInputFlowInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsInputFlowInterfaceDefinitionParserRuleCall_7_0_6()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleInputFlowInterfaceDefinition_in_rulePrimitiveDefinition1429);
            	            lv_elements_10_7=ruleInputFlowInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_7, 
            	                      		"InputFlowInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_11=(Token)match(input,25,FOLLOW_25_in_rulePrimitiveDefinition1445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getPrimitiveDefinitionAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveDefinition"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:824:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:825:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:826:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1481);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition1491); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:833:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleOutputFlowInterfaceDefinition | lv_elements_7_4= ruleInputFlowInterfaceDefinition ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_7_1 = null;

        EObject lv_elements_7_2 = null;

        EObject lv_elements_7_3 = null;

        EObject lv_elements_7_4 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:836:28: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleOutputFlowInterfaceDefinition | lv_elements_7_4= ruleInputFlowInterfaceDefinition ) ) )* otherlv_8= '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:837:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleOutputFlowInterfaceDefinition | lv_elements_7_4= ruleInputFlowInterfaceDefinition ) ) )* otherlv_8= '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:837:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleOutputFlowInterfaceDefinition | lv_elements_7_4= ruleInputFlowInterfaceDefinition ) ) )* otherlv_8= '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:837:3: otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleOutputFlowInterfaceDefinition | lv_elements_7_4= ruleInputFlowInterfaceDefinition ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleTypeDefinition1528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:841:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:842:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:842:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:843:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1549);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:859:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:859:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleTypeDefinition1562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTypeDefinitionAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:863:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:864:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:864:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:865:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSuperTypesTypeDefinitionCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1589);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:881:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==21) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:881:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTypeDefinition1602); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTypeDefinitionAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:885:1: ( ( ruleQualifiedName ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:886:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:886:1: ( ruleQualifiedName )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:887:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeDefinitionRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSuperTypesTypeDefinitionCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1629);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleTypeDefinition1645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTypeDefinitionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:907:1: ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleOutputFlowInterfaceDefinition | lv_elements_7_4= ruleInputFlowInterfaceDefinition ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31||LA24_0==35||(LA24_0>=37 && LA24_0<=38)||LA24_0==70) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:908:1: ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleOutputFlowInterfaceDefinition | lv_elements_7_4= ruleInputFlowInterfaceDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:908:1: ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleOutputFlowInterfaceDefinition | lv_elements_7_4= ruleInputFlowInterfaceDefinition ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:909:1: (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleOutputFlowInterfaceDefinition | lv_elements_7_4= ruleInputFlowInterfaceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:909:1: (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition | lv_elements_7_3= ruleOutputFlowInterfaceDefinition | lv_elements_7_4= ruleInputFlowInterfaceDefinition )
            	    int alt23=4;
            	    switch ( input.LA(1) ) {
            	    case 70:
            	        {
            	        int LA23_1 = input.LA(2);

            	        if ( (synpred33_InternalAdl()) ) {
            	            alt23=1;
            	        }
            	        else if ( (synpred34_InternalAdl()) ) {
            	            alt23=2;
            	        }
            	        else if ( (synpred35_InternalAdl()) ) {
            	            alt23=3;
            	        }
            	        else if ( (true) ) {
            	            alt23=4;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 23, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:910:3: lv_elements_7_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1668);
            	            lv_elements_7_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:925:8: lv_elements_7_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1687);
            	            lv_elements_7_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:940:8: lv_elements_7_3= ruleOutputFlowInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsOutputFlowInterfaceDefinitionParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOutputFlowInterfaceDefinition_in_ruleTypeDefinition1706);
            	            lv_elements_7_3=ruleOutputFlowInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_3, 
            	                      		"OutputFlowInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:955:8: lv_elements_7_4= ruleInputFlowInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsInputFlowInterfaceDefinitionParserRuleCall_4_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleInputFlowInterfaceDefinition_in_ruleTypeDefinition1725);
            	            lv_elements_7_4=ruleInputFlowInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_4, 
            	                      		"InputFlowInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleTypeDefinition1741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getTypeDefinitionAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleCompositeSuperType"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:985:1: entryRuleCompositeSuperType returns [EObject current=null] : iv_ruleCompositeSuperType= ruleCompositeSuperType EOF ;
    public final EObject entryRuleCompositeSuperType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeSuperType = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:986:2: (iv_ruleCompositeSuperType= ruleCompositeSuperType EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:987:2: iv_ruleCompositeSuperType= ruleCompositeSuperType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeSuperTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeSuperType_in_entryRuleCompositeSuperType1777);
            iv_ruleCompositeSuperType=ruleCompositeSuperType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeSuperType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeSuperType1787); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeSuperType"


    // $ANTLR start "ruleCompositeSuperType"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:994:1: ruleCompositeSuperType returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? ) ;
    public final EObject ruleCompositeSuperType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_templatesList_2_0 = null;

        EObject lv_templatesList_4_0 = null;

        EObject lv_argumentsList_7_0 = null;

        EObject lv_argumentsList_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:997:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:998:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:998:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:998:2: ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:998:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:999:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:999:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1000:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositeSuperTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getTargetArchDefCompositeSuperTypeDefinitionCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeSuperType1839);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1016:2: (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1016:4: otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCompositeSuperType1852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCompositeSuperTypeAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1020:1: ( (lv_templatesList_2_0= ruleTemplateReference ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1021:1: (lv_templatesList_2_0= ruleTemplateReference )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1021:1: (lv_templatesList_2_0= ruleTemplateReference )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1022:3: lv_templatesList_2_0= ruleTemplateReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getTemplatesListTemplateReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1873);
                    lv_templatesList_2_0=ruleTemplateReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeSuperTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"templatesList",
                              		lv_templatesList_2_0, 
                              		"TemplateReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1038:2: (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==21) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1038:4: otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleCompositeSuperType1886); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCompositeSuperTypeAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1042:1: ( (lv_templatesList_4_0= ruleTemplateReference ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1043:1: (lv_templatesList_4_0= ruleTemplateReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1043:1: (lv_templatesList_4_0= ruleTemplateReference )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1044:3: lv_templatesList_4_0= ruleTemplateReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getTemplatesListTemplateReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1907);
                    	    lv_templatesList_4_0=ruleTemplateReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeSuperTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templatesList",
                    	              		lv_templatesList_4_0, 
                    	              		"TemplateReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleCompositeSuperType1921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCompositeSuperTypeAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1064:3: (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1064:5: otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleCompositeSuperType1936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompositeSuperTypeAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1068:1: ( (lv_argumentsList_7_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1069:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1069:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1070:3: lv_argumentsList_7_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1957);
                    lv_argumentsList_7_0=ruleArgumentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeSuperTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"argumentsList",
                              		lv_argumentsList_7_0, 
                              		"ArgumentDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1086:2: (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==21) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1086:4: otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleCompositeSuperType1970); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getCompositeSuperTypeAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1090:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1091:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1091:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1092:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1991);
                    	    lv_argumentsList_9_0=ruleArgumentDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeSuperTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"argumentsList",
                    	              		lv_argumentsList_9_0, 
                    	              		"ArgumentDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleCompositeSuperType2005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCompositeSuperTypeAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeSuperType"


    // $ANTLR start "entryRulePrimitiveSuperType"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1120:1: entryRulePrimitiveSuperType returns [EObject current=null] : iv_rulePrimitiveSuperType= rulePrimitiveSuperType EOF ;
    public final EObject entryRulePrimitiveSuperType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveSuperType = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1121:2: (iv_rulePrimitiveSuperType= rulePrimitiveSuperType EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1122:2: iv_rulePrimitiveSuperType= rulePrimitiveSuperType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveSuperTypeRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveSuperType_in_entryRulePrimitiveSuperType2043);
            iv_rulePrimitiveSuperType=rulePrimitiveSuperType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveSuperType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveSuperType2053); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveSuperType"


    // $ANTLR start "rulePrimitiveSuperType"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1129:1: rulePrimitiveSuperType returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? ) ;
    public final EObject rulePrimitiveSuperType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argumentsList_2_0 = null;

        EObject lv_argumentsList_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1132:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1133:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1133:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1133:2: ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1133:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1134:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1134:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1135:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPrimitiveSuperTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveSuperTypeAccess().getTargetArchDefPrimitiveSuperTypeDefinitionCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveSuperType2105);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1151:2: (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1151:4: otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_rulePrimitiveSuperType2118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimitiveSuperTypeAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1155:1: ( (lv_argumentsList_2_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1156:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1156:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1157:3: lv_argumentsList_2_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2139);
                    lv_argumentsList_2_0=ruleArgumentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveSuperTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"argumentsList",
                              		lv_argumentsList_2_0, 
                              		"ArgumentDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1173:2: (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==21) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1173:4: otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveSuperType2152); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getPrimitiveSuperTypeAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1177:1: ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1178:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1178:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1179:3: lv_argumentsList_4_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimitiveSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2173);
                    	    lv_argumentsList_4_0=ruleArgumentDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrimitiveSuperTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"argumentsList",
                    	              		lv_argumentsList_4_0, 
                    	              		"ArgumentDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_rulePrimitiveSuperType2187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPrimitiveSuperTypeAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveSuperType"


    // $ANTLR start "entryRuleHostedInterfaceDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1211:1: entryRuleHostedInterfaceDefinition returns [EObject current=null] : iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF ;
    public final EObject entryRuleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1212:2: (iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1213:2: iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition2229);
            iv_ruleHostedInterfaceDefinition=ruleHostedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition2239); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHostedInterfaceDefinition"


    // $ANTLR start "ruleHostedInterfaceDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1220:1: ruleHostedInterfaceDefinition returns [EObject current=null] : (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition | this_OutputFlowInterfaceDefinition_2= ruleOutputFlowInterfaceDefinition | this_InputFlowInterfaceDefinition_3= ruleInputFlowInterfaceDefinition ) ;
    public final EObject ruleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ProvidedInterfaceDefinition_0 = null;

        EObject this_RequiredInterfaceDefinition_1 = null;

        EObject this_OutputFlowInterfaceDefinition_2 = null;

        EObject this_InputFlowInterfaceDefinition_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1223:28: ( (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition | this_OutputFlowInterfaceDefinition_2= ruleOutputFlowInterfaceDefinition | this_InputFlowInterfaceDefinition_3= ruleInputFlowInterfaceDefinition ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1224:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition | this_OutputFlowInterfaceDefinition_2= ruleOutputFlowInterfaceDefinition | this_InputFlowInterfaceDefinition_3= ruleInputFlowInterfaceDefinition )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1224:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition | this_OutputFlowInterfaceDefinition_2= ruleOutputFlowInterfaceDefinition | this_InputFlowInterfaceDefinition_3= ruleInputFlowInterfaceDefinition )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                int LA31_1 = input.LA(2);

                if ( (synpred43_InternalAdl()) ) {
                    alt31=1;
                }
                else if ( (synpred44_InternalAdl()) ) {
                    alt31=2;
                }
                else if ( (synpred45_InternalAdl()) ) {
                    alt31=3;
                }
                else if ( (true) ) {
                    alt31=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                alt31=1;
                }
                break;
            case 35:
                {
                alt31=2;
                }
                break;
            case 37:
                {
                alt31=3;
                }
                break;
            case 38:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1225:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getProvidedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition2289);
                    this_ProvidedInterfaceDefinition_0=ruleProvidedInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ProvidedInterfaceDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1238:2: this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getRequiredInterfaceDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition2319);
                    this_RequiredInterfaceDefinition_1=ruleRequiredInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RequiredInterfaceDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1251:2: this_OutputFlowInterfaceDefinition_2= ruleOutputFlowInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getOutputFlowInterfaceDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutputFlowInterfaceDefinition_in_ruleHostedInterfaceDefinition2349);
                    this_OutputFlowInterfaceDefinition_2=ruleOutputFlowInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OutputFlowInterfaceDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1264:2: this_InputFlowInterfaceDefinition_3= ruleInputFlowInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getInputFlowInterfaceDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInputFlowInterfaceDefinition_in_ruleHostedInterfaceDefinition2379);
                    this_InputFlowInterfaceDefinition_3=ruleInputFlowInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InputFlowInterfaceDefinition_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHostedInterfaceDefinition"


    // $ANTLR start "entryRuleProvidedInterfaceDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1283:1: entryRuleProvidedInterfaceDefinition returns [EObject current=null] : iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF ;
    public final EObject entryRuleProvidedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1284:2: (iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1285:2: iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition2414);
            iv_ruleProvidedInterfaceDefinition=ruleProvidedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition2424); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvidedInterfaceDefinition"


    // $ANTLR start "ruleProvidedInterfaceDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1292:1: ruleProvidedInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) ;
    public final EObject ruleProvidedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_role_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_collection_5_0=null;
        Token lv_collectionsize_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_annotationsList_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1295:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1296:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1296:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1296:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1296:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==70) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1297:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1297:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1298:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition2470);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProvidedInterfaceDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1314:3: ( (lv_role_1_0= 'provides' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1315:1: (lv_role_1_0= 'provides' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1315:1: (lv_role_1_0= 'provides' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1316:3: lv_role_1_0= 'provides'
            {
            lv_role_1_0=(Token)match(input,31,FOLLOW_31_in_ruleProvidedInterfaceDefinition2489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_role_1_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getRoleProvidesKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(current, "role", lv_role_1_0, "provides");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1329:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1330:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1330:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1331:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionAccess().getSignatureInterfaceDefinitionCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition2529);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleProvidedInterfaceDefinition2541); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProvidedInterfaceDefinitionAccess().getAsKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1351:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1352:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1352:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1353:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition2558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1369:2: ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1369:3: ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1369:3: ( (lv_collection_5_0= '[' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1370:1: (lv_collection_5_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1370:1: (lv_collection_5_0= '[' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1371:3: lv_collection_5_0= '['
                    {
                    lv_collection_5_0=(Token)match(input,33,FOLLOW_33_in_ruleProvidedInterfaceDefinition2582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_5_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1384:2: ( (lv_collectionsize_6_0= RULE_INT ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_INT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1385:1: (lv_collectionsize_6_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1385:1: (lv_collectionsize_6_0= RULE_INT )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1386:3: lv_collectionsize_6_0= RULE_INT
                            {
                            lv_collectionsize_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition2612); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_collectionsize_6_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_5_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"collectionsize",
                                      		lv_collectionsize_6_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleProvidedInterfaceDefinition2630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getProvidedInterfaceDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleProvidedInterfaceDefinition2644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getProvidedInterfaceDefinitionAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvidedInterfaceDefinition"


    // $ANTLR start "entryRuleRequiredInterfaceDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1418:1: entryRuleRequiredInterfaceDefinition returns [EObject current=null] : iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF ;
    public final EObject entryRuleRequiredInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1419:2: (iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1420:2: iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition2680);
            iv_ruleRequiredInterfaceDefinition=ruleRequiredInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition2690); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredInterfaceDefinition"


    // $ANTLR start "ruleRequiredInterfaceDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1427:1: ruleRequiredInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) ;
    public final EObject ruleRequiredInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_role_1_0=null;
        Token lv_optional_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_collection_6_0=null;
        Token lv_collectionsize_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_annotationsList_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1430:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1431:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1431:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1431:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1431:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1432:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1432:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1433:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition2736);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRequiredInterfaceDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1449:3: ( (lv_role_1_0= 'requires' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1450:1: (lv_role_1_0= 'requires' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1450:1: (lv_role_1_0= 'requires' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1451:3: lv_role_1_0= 'requires'
            {
            lv_role_1_0=(Token)match(input,35,FOLLOW_35_in_ruleRequiredInterfaceDefinition2755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_role_1_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getRoleRequiresKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(current, "role", lv_role_1_0, "requires");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1464:2: ( (lv_optional_2_0= 'optional' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1465:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1465:1: (lv_optional_2_0= 'optional' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1466:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)match(input,36,FOLLOW_36_in_ruleRequiredInterfaceDefinition2786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_2_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getOptionalOptionalKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "optional");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1479:3: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1480:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1480:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1481:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionAccess().getSignatureInterfaceDefinitionCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2827);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleRequiredInterfaceDefinition2839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRequiredInterfaceDefinitionAccess().getAsKeyword_4());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1501:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1502:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1502:1: (lv_name_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1503:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1519:2: ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1519:3: ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1519:3: ( (lv_collection_6_0= '[' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1520:1: (lv_collection_6_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1520:1: (lv_collection_6_0= '[' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1521:3: lv_collection_6_0= '['
                    {
                    lv_collection_6_0=(Token)match(input,33,FOLLOW_33_in_ruleRequiredInterfaceDefinition2880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_6_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_6_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1534:2: ( (lv_collectionsize_7_0= RULE_INT ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_INT) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1535:1: (lv_collectionsize_7_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1535:1: (lv_collectionsize_7_0= RULE_INT )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1536:3: lv_collectionsize_7_0= RULE_INT
                            {
                            lv_collectionsize_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2910); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_collectionsize_7_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_6_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"collectionsize",
                                      		lv_collectionsize_7_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleRequiredInterfaceDefinition2928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getRequiredInterfaceDefinitionAccess().getRightSquareBracketKeyword_6_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleRequiredInterfaceDefinition2942); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getRequiredInterfaceDefinitionAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredInterfaceDefinition"


    // $ANTLR start "entryRuleOutputFlowInterfaceDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1568:1: entryRuleOutputFlowInterfaceDefinition returns [EObject current=null] : iv_ruleOutputFlowInterfaceDefinition= ruleOutputFlowInterfaceDefinition EOF ;
    public final EObject entryRuleOutputFlowInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputFlowInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1569:2: (iv_ruleOutputFlowInterfaceDefinition= ruleOutputFlowInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1570:2: iv_ruleOutputFlowInterfaceDefinition= ruleOutputFlowInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputFlowInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOutputFlowInterfaceDefinition_in_entryRuleOutputFlowInterfaceDefinition2978);
            iv_ruleOutputFlowInterfaceDefinition=ruleOutputFlowInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputFlowInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputFlowInterfaceDefinition2988); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputFlowInterfaceDefinition"


    // $ANTLR start "ruleOutputFlowInterfaceDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1577:1: ruleOutputFlowInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'output' ) ) ( (lv_signature_2_0= ruleFlowType ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) ;
    public final EObject ruleOutputFlowInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_role_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_collection_5_0=null;
        Token lv_collectionsize_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_signature_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1580:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'output' ) ) ( (lv_signature_2_0= ruleFlowType ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1581:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'output' ) ) ( (lv_signature_2_0= ruleFlowType ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1581:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'output' ) ) ( (lv_signature_2_0= ruleFlowType ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1581:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'output' ) ) ( (lv_signature_2_0= ruleFlowType ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1581:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==70) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1582:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1582:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1583:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOutputFlowInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleOutputFlowInterfaceDefinition3034);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOutputFlowInterfaceDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1599:3: ( (lv_role_1_0= 'output' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1600:1: (lv_role_1_0= 'output' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1600:1: (lv_role_1_0= 'output' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1601:3: lv_role_1_0= 'output'
            {
            lv_role_1_0=(Token)match(input,37,FOLLOW_37_in_ruleOutputFlowInterfaceDefinition3053); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_role_1_0, grammarAccess.getOutputFlowInterfaceDefinitionAccess().getRoleOutputKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputFlowInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(current, "role", lv_role_1_0, "output");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1614:2: ( (lv_signature_2_0= ruleFlowType ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1615:1: (lv_signature_2_0= ruleFlowType )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1615:1: (lv_signature_2_0= ruleFlowType )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1616:3: lv_signature_2_0= ruleFlowType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOutputFlowInterfaceDefinitionAccess().getSignatureFlowTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFlowType_in_ruleOutputFlowInterfaceDefinition3087);
            lv_signature_2_0=ruleFlowType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOutputFlowInterfaceDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"signature",
                      		lv_signature_2_0, 
                      		"FlowType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleOutputFlowInterfaceDefinition3099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOutputFlowInterfaceDefinitionAccess().getAsKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1636:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1637:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1637:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1638:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputFlowInterfaceDefinition3116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getOutputFlowInterfaceDefinitionAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputFlowInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1654:2: ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1654:3: ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1654:3: ( (lv_collection_5_0= '[' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1655:1: (lv_collection_5_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1655:1: (lv_collection_5_0= '[' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1656:3: lv_collection_5_0= '['
                    {
                    lv_collection_5_0=(Token)match(input,33,FOLLOW_33_in_ruleOutputFlowInterfaceDefinition3140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_5_0, grammarAccess.getOutputFlowInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOutputFlowInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1669:2: ( (lv_collectionsize_6_0= RULE_INT ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_INT) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1670:1: (lv_collectionsize_6_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1670:1: (lv_collectionsize_6_0= RULE_INT )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1671:3: lv_collectionsize_6_0= RULE_INT
                            {
                            lv_collectionsize_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOutputFlowInterfaceDefinition3170); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_collectionsize_6_0, grammarAccess.getOutputFlowInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_5_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getOutputFlowInterfaceDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"collectionsize",
                                      		lv_collectionsize_6_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleOutputFlowInterfaceDefinition3188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOutputFlowInterfaceDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleOutputFlowInterfaceDefinition3202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOutputFlowInterfaceDefinitionAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputFlowInterfaceDefinition"


    // $ANTLR start "entryRuleInputFlowInterfaceDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1703:1: entryRuleInputFlowInterfaceDefinition returns [EObject current=null] : iv_ruleInputFlowInterfaceDefinition= ruleInputFlowInterfaceDefinition EOF ;
    public final EObject entryRuleInputFlowInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputFlowInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1704:2: (iv_ruleInputFlowInterfaceDefinition= ruleInputFlowInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1705:2: iv_ruleInputFlowInterfaceDefinition= ruleInputFlowInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputFlowInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleInputFlowInterfaceDefinition_in_entryRuleInputFlowInterfaceDefinition3238);
            iv_ruleInputFlowInterfaceDefinition=ruleInputFlowInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputFlowInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputFlowInterfaceDefinition3248); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputFlowInterfaceDefinition"


    // $ANTLR start "ruleInputFlowInterfaceDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1712:1: ruleInputFlowInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'input' ) ) ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleFlowType ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) ;
    public final EObject ruleInputFlowInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_role_1_0=null;
        Token lv_optional_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_collection_6_0=null;
        Token lv_collectionsize_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_signature_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1715:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'input' ) ) ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleFlowType ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1716:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'input' ) ) ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleFlowType ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1716:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'input' ) ) ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleFlowType ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1716:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'input' ) ) ( (lv_optional_2_0= 'optional' ) )? ( (lv_signature_3_0= ruleFlowType ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1716:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==70) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1717:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1717:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1718:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInputFlowInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleInputFlowInterfaceDefinition3294);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInputFlowInterfaceDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1734:3: ( (lv_role_1_0= 'input' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1735:1: (lv_role_1_0= 'input' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1735:1: (lv_role_1_0= 'input' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1736:3: lv_role_1_0= 'input'
            {
            lv_role_1_0=(Token)match(input,38,FOLLOW_38_in_ruleInputFlowInterfaceDefinition3313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_role_1_0, grammarAccess.getInputFlowInterfaceDefinitionAccess().getRoleInputKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputFlowInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(current, "role", lv_role_1_0, "input");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1749:2: ( (lv_optional_2_0= 'optional' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1750:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1750:1: (lv_optional_2_0= 'optional' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1751:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)match(input,36,FOLLOW_36_in_ruleInputFlowInterfaceDefinition3344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_2_0, grammarAccess.getInputFlowInterfaceDefinitionAccess().getOptionalOptionalKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInputFlowInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "optional");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1764:3: ( (lv_signature_3_0= ruleFlowType ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1765:1: (lv_signature_3_0= ruleFlowType )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1765:1: (lv_signature_3_0= ruleFlowType )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1766:3: lv_signature_3_0= ruleFlowType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInputFlowInterfaceDefinitionAccess().getSignatureFlowTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFlowType_in_ruleInputFlowInterfaceDefinition3379);
            lv_signature_3_0=ruleFlowType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInputFlowInterfaceDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"signature",
                      		lv_signature_3_0, 
                      		"FlowType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleInputFlowInterfaceDefinition3391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInputFlowInterfaceDefinitionAccess().getAsKeyword_4());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1786:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1787:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1787:1: (lv_name_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1788:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputFlowInterfaceDefinition3408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getInputFlowInterfaceDefinitionAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputFlowInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1804:2: ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==33) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1804:3: ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1804:3: ( (lv_collection_6_0= '[' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1805:1: (lv_collection_6_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1805:1: (lv_collection_6_0= '[' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1806:3: lv_collection_6_0= '['
                    {
                    lv_collection_6_0=(Token)match(input,33,FOLLOW_33_in_ruleInputFlowInterfaceDefinition3432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_6_0, grammarAccess.getInputFlowInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_6_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInputFlowInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1819:2: ( (lv_collectionsize_7_0= RULE_INT ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_INT) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1820:1: (lv_collectionsize_7_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1820:1: (lv_collectionsize_7_0= RULE_INT )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1821:3: lv_collectionsize_7_0= RULE_INT
                            {
                            lv_collectionsize_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInputFlowInterfaceDefinition3462); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_collectionsize_7_0, grammarAccess.getInputFlowInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_6_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputFlowInterfaceDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"collectionsize",
                                      		lv_collectionsize_7_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleInputFlowInterfaceDefinition3480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getInputFlowInterfaceDefinitionAccess().getRightSquareBracketKeyword_6_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleInputFlowInterfaceDefinition3494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getInputFlowInterfaceDefinitionAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputFlowInterfaceDefinition"


    // $ANTLR start "entryRuleFlowType"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1853:1: entryRuleFlowType returns [String current=null] : iv_ruleFlowType= ruleFlowType EOF ;
    public final String entryRuleFlowType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlowType = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1854:2: (iv_ruleFlowType= ruleFlowType EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1855:2: iv_ruleFlowType= ruleFlowType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFlowType_in_entryRuleFlowType3531);
            iv_ruleFlowType=ruleFlowType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlowType3542); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlowType"


    // $ANTLR start "ruleFlowType"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1862:1: ruleFlowType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AttributeType_0= ruleAttributeType | this_IDTType_1= ruleIDTType ) ;
    public final AntlrDatatypeRuleToken ruleFlowType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AttributeType_0 = null;

        AntlrDatatypeRuleToken this_IDTType_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1865:28: ( (this_AttributeType_0= ruleAttributeType | this_IDTType_1= ruleIDTType ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1866:1: (this_AttributeType_0= ruleAttributeType | this_IDTType_1= ruleIDTType )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1866:1: (this_AttributeType_0= ruleAttributeType | this_IDTType_1= ruleIDTType )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=49 && LA46_0<=60)) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID||LA46_0==RULE_SL||LA46_0==46||LA46_0==69) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1867:5: this_AttributeType_0= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFlowTypeAccess().getAttributeTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleFlowType3589);
                    this_AttributeType_0=ruleAttributeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AttributeType_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1879:5: this_IDTType_1= ruleIDTType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFlowTypeAccess().getIDTTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIDTType_in_ruleFlowType3622);
                    this_IDTType_1=ruleIDTType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDTType_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlowType"


    // $ANTLR start "entryRuleIDTType"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1897:1: entryRuleIDTType returns [String current=null] : iv_ruleIDTType= ruleIDTType EOF ;
    public final String entryRuleIDTType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDTType = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1898:2: (iv_ruleIDTType= ruleIDTType EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1899:2: iv_ruleIDTType= ruleIDTType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDTTypeRule()); 
            }
            pushFollow(FOLLOW_ruleIDTType_in_entryRuleIDTType3668);
            iv_ruleIDTType=ruleIDTType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDTType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDTType3679); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDTType"


    // $ANTLR start "ruleIDTType"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1906:1: ruleIDTType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FilePath_0= ruleFilePath kw= ':' (kw= 'struct' | kw= 'enum' | kw= 'union' ) this_ID_5= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleIDTType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_5=null;
        AntlrDatatypeRuleToken this_FilePath_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1909:28: ( (this_FilePath_0= ruleFilePath kw= ':' (kw= 'struct' | kw= 'enum' | kw= 'union' ) this_ID_5= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1910:1: (this_FilePath_0= ruleFilePath kw= ':' (kw= 'struct' | kw= 'enum' | kw= 'union' ) this_ID_5= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1910:1: (this_FilePath_0= ruleFilePath kw= ':' (kw= 'struct' | kw= 'enum' | kw= 'union' ) this_ID_5= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1911:5: this_FilePath_0= ruleFilePath kw= ':' (kw= 'struct' | kw= 'enum' | kw= 'union' ) this_ID_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIDTTypeAccess().getFilePathParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleFilePath_in_ruleIDTType3726);
            this_FilePath_0=ruleFilePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FilePath_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,39,FOLLOW_39_in_ruleIDTType3744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIDTTypeAccess().getColonKeyword_1()); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1927:1: (kw= 'struct' | kw= 'enum' | kw= 'union' )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt47=1;
                }
                break;
            case 41:
                {
                alt47=2;
                }
                break;
            case 42:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1928:2: kw= 'struct'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleIDTType3758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDTTypeAccess().getStructKeyword_2_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1935:2: kw= 'enum'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleIDTType3777); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDTTypeAccess().getEnumKeyword_2_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1942:2: kw= 'union'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleIDTType3796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDTTypeAccess().getUnionKeyword_2_2()); 
                          
                    }

                    }
                    break;

            }

            this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDTType3812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_5);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_5, grammarAccess.getIDTTypeAccess().getIDTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDTType"


    // $ANTLR start "entryRuleSubComponentDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1964:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1965:2: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1966:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition3859);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition3869); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubComponentDefinition"


    // $ANTLR start "ruleSubComponentDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1973:1: ruleSubComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' ) ;
    public final EObject ruleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_17=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_templatesList_4_0 = null;

        EObject lv_templatesList_6_0 = null;

        EObject lv_argumentsList_9_0 = null;

        EObject lv_argumentsList_11_0 = null;

        EObject lv_bodyAnnotationsList_15_0 = null;

        EObject lv_body_16_1 = null;

        EObject lv_body_16_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1976:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1977:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1977:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1977:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1977:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==70) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1978:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1978:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1979:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition3915);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleSubComponentDefinition3928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1999:1: ( ( ruleQualifiedName ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2000:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2000:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2001:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTypeTypeReferenceCrossReference_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition3955);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2017:3: (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==20) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2017:5: otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSubComponentDefinition3969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSubComponentDefinitionAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2021:1: ( (lv_templatesList_4_0= ruleTemplateReference ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2022:1: (lv_templatesList_4_0= ruleTemplateReference )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2022:1: (lv_templatesList_4_0= ruleTemplateReference )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2023:3: lv_templatesList_4_0= ruleTemplateReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition3990);
                    lv_templatesList_4_0=ruleTemplateReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"templatesList",
                              		lv_templatesList_4_0, 
                              		"TemplateReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2039:2: (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==21) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2039:4: otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentDefinition4003); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2043:1: ( (lv_templatesList_6_0= ruleTemplateReference ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2044:1: (lv_templatesList_6_0= ruleTemplateReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2044:1: (lv_templatesList_6_0= ruleTemplateReference )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2045:3: lv_templatesList_6_0= ruleTemplateReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition4024);
                    	    lv_templatesList_6_0=ruleTemplateReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templatesList",
                    	              		lv_templatesList_6_0, 
                    	              		"TemplateReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleSubComponentDefinition4038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSubComponentDefinitionAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2065:3: (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2065:5: otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleSubComponentDefinition4053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSubComponentDefinitionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2069:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2070:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2070:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2071:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition4074);
                    lv_argumentsList_9_0=ruleArgumentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"argumentsList",
                              		lv_argumentsList_9_0, 
                              		"ArgumentDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2087:2: (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==21) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2087:4: otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentDefinition4087); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2091:1: ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2092:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2092:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2093:3: lv_argumentsList_11_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition4108);
                    	    lv_argumentsList_11_0=ruleArgumentDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"argumentsList",
                    	              		lv_argumentsList_11_0, 
                    	              		"ArgumentDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleSubComponentDefinition4122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSubComponentDefinitionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,32,FOLLOW_32_in_ruleSubComponentDefinition4136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getSubComponentDefinitionAccess().getAsKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2117:1: ( (lv_name_14_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2118:1: (lv_name_14_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2118:1: (lv_name_14_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2119:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubComponentDefinition4153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_14_0, grammarAccess.getSubComponentDefinitionAccess().getNameIDTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubComponentDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_14_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2135:2: ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==70) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2136:1: (lv_bodyAnnotationsList_15_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2136:1: (lv_bodyAnnotationsList_15_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2137:3: lv_bodyAnnotationsList_15_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodyAnnotationsListAnnotationsListParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition4179);
                    lv_bodyAnnotationsList_15_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"bodyAnnotationsList",
                              		lv_bodyAnnotationsList_15_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2153:3: ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==19||(LA56_0>=26 && LA56_0<=27)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2154:1: ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2154:1: ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2155:1: (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2155:1: (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==19) ) {
                        alt55=1;
                    }
                    else if ( ((LA55_0>=26 && LA55_0<=27)) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2156:3: lv_body_16_1= ruleCompositeDefinition
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodyCompositeDefinitionParserRuleCall_8_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCompositeDefinition_in_ruleSubComponentDefinition4203);
                            lv_body_16_1=ruleCompositeDefinition();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"body",
                                      		lv_body_16_1, 
                                      		"CompositeDefinition");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2171:8: lv_body_16_2= rulePrimitiveDefinition
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodyPrimitiveDefinitionParserRuleCall_8_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePrimitiveDefinition_in_ruleSubComponentDefinition4222);
                            lv_body_16_2=rulePrimitiveDefinition();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"body",
                                      		lv_body_16_2, 
                                      		"PrimitiveDefinition");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleSubComponentDefinition4238); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getSubComponentDefinitionAccess().getSemicolonKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubComponentDefinition"


    // $ANTLR start "entryRuleCompositeElement"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2203:1: entryRuleCompositeElement returns [EObject current=null] : iv_ruleCompositeElement= ruleCompositeElement EOF ;
    public final EObject entryRuleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeElement = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2204:2: (iv_ruleCompositeElement= ruleCompositeElement EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2205:2: iv_ruleCompositeElement= ruleCompositeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeElementRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement4276);
            iv_ruleCompositeElement=ruleCompositeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeElement4286); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeElement"


    // $ANTLR start "ruleCompositeElement"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2212:1: ruleCompositeElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ;
    public final EObject ruleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_SubComponentDefinition_1 = null;

        EObject this_BindingDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2215:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2216:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2216:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                int LA57_1 = input.LA(2);

                if ( (synpred72_InternalAdl()) ) {
                    alt57=1;
                }
                else if ( (synpred73_InternalAdl()) ) {
                    alt57=2;
                }
                else if ( (true) ) {
                    alt57=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 35:
            case 37:
            case 38:
                {
                alt57=1;
                }
                break;
            case 43:
                {
                alt57=2;
                }
                break;
            case 44:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2217:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement4336);
                    this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HostedInterfaceDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2230:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getSubComponentDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement4366);
                    this_SubComponentDefinition_1=ruleSubComponentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubComponentDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2243:2: this_BindingDefinition_2= ruleBindingDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getBindingDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeElement4396);
                    this_BindingDefinition_2=ruleBindingDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BindingDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeElement"


    // $ANTLR start "entryRulePrimitiveElement"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2262:1: entryRulePrimitiveElement returns [EObject current=null] : iv_rulePrimitiveElement= rulePrimitiveElement EOF ;
    public final EObject entryRulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveElement = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2263:2: (iv_rulePrimitiveElement= rulePrimitiveElement EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2264:2: iv_rulePrimitiveElement= rulePrimitiveElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveElementRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement4431);
            iv_rulePrimitiveElement=rulePrimitiveElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveElement4441); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveElement"


    // $ANTLR start "rulePrimitiveElement"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2271:1: rulePrimitiveElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) ;
    public final EObject rulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_ImplementationDefinition_1 = null;

        EObject this_AttributeDefinition_2 = null;

        EObject this_DataDefinition_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2274:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2275:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2275:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                int LA58_1 = input.LA(2);

                if ( (synpred74_InternalAdl()) ) {
                    alt58=1;
                }
                else if ( (synpred75_InternalAdl()) ) {
                    alt58=2;
                }
                else if ( (synpred76_InternalAdl()) ) {
                    alt58=3;
                }
                else if ( (true) ) {
                    alt58=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 35:
            case 37:
            case 38:
                {
                alt58=1;
                }
                break;
            case 67:
                {
                alt58=2;
                }
                break;
            case 66:
                {
                alt58=3;
                }
                break;
            case 68:
                {
                alt58=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2276:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement4491);
                    this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HostedInterfaceDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2289:2: this_ImplementationDefinition_1= ruleImplementationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getImplementationDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement4521);
                    this_ImplementationDefinition_1=ruleImplementationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImplementationDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2302:2: this_AttributeDefinition_2= ruleAttributeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getAttributeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement4551);
                    this_AttributeDefinition_2=ruleAttributeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2315:2: this_DataDefinition_3= ruleDataDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getDataDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveElement4581);
                    this_DataDefinition_3=ruleDataDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataDefinition_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveElement"


    // $ANTLR start "entryRuleBindingDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2334:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2335:2: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2336:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition4616);
            iv_ruleBindingDefinition=ruleBindingDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition4626); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindingDefinition"


    // $ANTLR start "ruleBindingDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2343:1: ruleBindingDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) ;
    public final EObject ruleBindingDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_isSrcParentThis_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_sourceIndex_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_isTgtParentThis_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_targetIndex_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_annotationsList_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2346:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2347:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2347:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2347:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2347:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==70) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2348:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2348:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2349:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition4672);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleBindingDefinition4685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBindingDefinitionAccess().getBindsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2369:1: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            else if ( (LA60_0==45) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2369:2: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2369:2: ( (otherlv_2= RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2370:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2370:1: (otherlv_2= RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2371:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition4710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getBindingDefinitionAccess().getSourceParentSubComponentDefinitionCrossReference_2_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2386:6: ( (lv_isSrcParentThis_3_0= 'this' ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2386:6: ( (lv_isSrcParentThis_3_0= 'this' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2387:1: (lv_isSrcParentThis_3_0= 'this' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2387:1: (lv_isSrcParentThis_3_0= 'this' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2388:3: lv_isSrcParentThis_3_0= 'this'
                    {
                    lv_isSrcParentThis_3_0=(Token)match(input,45,FOLLOW_45_in_ruleBindingDefinition4734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isSrcParentThis_3_0, grammarAccess.getBindingDefinitionAccess().getIsSrcParentThisThisKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "isSrcParentThis", true, "this");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleBindingDefinition4760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2405:1: ( (otherlv_5= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2406:1: (otherlv_5= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2406:1: (otherlv_5= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2407:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition4784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getBindingDefinitionAccess().getSourceInterfaceHostedInterfaceDefinitionCrossReference_4_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2421:2: (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==33) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2421:4: otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleBindingDefinition4797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2425:1: ( (lv_sourceIndex_7_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2426:1: (lv_sourceIndex_7_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2426:1: (lv_sourceIndex_7_0= RULE_INT )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2427:3: lv_sourceIndex_7_0= RULE_INT
                    {
                    lv_sourceIndex_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition4814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sourceIndex_7_0, grammarAccess.getBindingDefinitionAccess().getSourceIndexINTTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sourceIndex",
                              		lv_sourceIndex_7_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleBindingDefinition4831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleBindingDefinition4845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getBindingDefinitionAccess().getToKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2451:1: ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==45) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2451:2: ( (otherlv_10= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2451:2: ( (otherlv_10= RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2452:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2452:1: (otherlv_10= RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2453:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition4870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getBindingDefinitionAccess().getTargetParentSubComponentDefinitionCrossReference_7_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2468:6: ( (lv_isTgtParentThis_11_0= 'this' ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2468:6: ( (lv_isTgtParentThis_11_0= 'this' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2469:1: (lv_isTgtParentThis_11_0= 'this' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2469:1: (lv_isTgtParentThis_11_0= 'this' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2470:3: lv_isTgtParentThis_11_0= 'this'
                    {
                    lv_isTgtParentThis_11_0=(Token)match(input,45,FOLLOW_45_in_ruleBindingDefinition4894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTgtParentThis_11_0, grammarAccess.getBindingDefinitionAccess().getIsTgtParentThisThisKeyword_7_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "isTgtParentThis", true, "this");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleBindingDefinition4920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_8());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2487:1: ( (otherlv_13= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2488:1: (otherlv_13= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2488:1: (otherlv_13= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2489:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition4944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getBindingDefinitionAccess().getTargetInterfaceHostedInterfaceDefinitionCrossReference_9_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2503:2: (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==33) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2503:4: otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']'
                    {
                    otherlv_14=(Token)match(input,33,FOLLOW_33_in_ruleBindingDefinition4957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_10_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2507:1: ( (lv_targetIndex_15_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2508:1: (lv_targetIndex_15_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2508:1: (lv_targetIndex_15_0= RULE_INT )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2509:3: lv_targetIndex_15_0= RULE_INT
                    {
                    lv_targetIndex_15_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition4974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_targetIndex_15_0, grammarAccess.getBindingDefinitionAccess().getTargetIndexINTTerminalRuleCall_10_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"targetIndex",
                              		lv_targetIndex_15_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,34,FOLLOW_34_in_ruleBindingDefinition4991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_10_2());
                          
                    }

                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleBindingDefinition5005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getBindingDefinitionAccess().getSemicolonKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingDefinition"


    // $ANTLR start "entryRuleFormalArgument"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2541:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2542:2: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2543:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument5041);
            iv_ruleFormalArgument=ruleFormalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument5051); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalArgument"


    // $ANTLR start "ruleFormalArgument"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2550:1: ruleFormalArgument returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2553:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2554:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2554:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2555:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2555:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2556:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument5092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFormalArgumentAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFormalArgumentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalArgument"


    // $ANTLR start "entryRuleFormalArgumentsList"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2580:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2581:2: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2582:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentsListRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList5132);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList5142); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalArgumentsList"


    // $ANTLR start "ruleFormalArgumentsList"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2589:1: ruleFormalArgumentsList returns [EObject current=null] : (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalArguments_1_0 = null;

        EObject lv_formalArguments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2592:28: ( (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2593:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2593:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2593:3: otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFormalArgumentsList5179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2597:1: ( (lv_formalArguments_1_0= ruleFormalArgument ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2598:1: (lv_formalArguments_1_0= ruleFormalArgument )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2598:1: (lv_formalArguments_1_0= ruleFormalArgument )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2599:3: lv_formalArguments_1_0= ruleFormalArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList5200);
            lv_formalArguments_1_0=ruleFormalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFormalArgumentsListRule());
              	        }
                     		add(
                     			current, 
                     			"formalArguments",
                      		lv_formalArguments_1_0, 
                      		"FormalArgument");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2615:2: (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==21) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2615:4: otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFormalArgumentsList5213); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2619:1: ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2620:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2620:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2621:3: lv_formalArguments_3_0= ruleFormalArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList5234);
            	    lv_formalArguments_3_0=ruleFormalArgument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFormalArgumentsListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"formalArguments",
            	              		lv_formalArguments_3_0, 
            	              		"FormalArgument");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleFormalArgumentsList5248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFormalArgumentsListAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalArgumentsList"


    // $ANTLR start "entryRuleTemplateSpecifier"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2649:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2650:2: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2651:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier5284);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier5294); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateSpecifier"


    // $ANTLR start "ruleTemplateSpecifier"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2658:1: ruleTemplateSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2661:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2662:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2662:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2662:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2662:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2663:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2663:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2664:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier5336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTemplateSpecifierAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateSpecifierRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleTemplateSpecifier5353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2684:1: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2685:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2685:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2686:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateSpecifierRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateSpecifierAccess().getTypeReferenceTypeDefinitionCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier5380);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateSpecifier"


    // $ANTLR start "entryRuleAttributeType"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2710:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2711:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2712:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType5417);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType5428); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2719:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'int8_t' | kw= 'uint8_t' | kw= 'int16_t' | kw= 'uint16_t' | kw= 'int32_t' | kw= 'uint32_t' | kw= 'int64_t' | kw= 'uint64_t' | kw= 'intptr_t' | kw= 'uintptr_t' ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2722:28: ( (kw= 'int' | kw= 'string' | kw= 'int8_t' | kw= 'uint8_t' | kw= 'int16_t' | kw= 'uint16_t' | kw= 'int32_t' | kw= 'uint32_t' | kw= 'int64_t' | kw= 'uint64_t' | kw= 'intptr_t' | kw= 'uintptr_t' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2723:1: (kw= 'int' | kw= 'string' | kw= 'int8_t' | kw= 'uint8_t' | kw= 'int16_t' | kw= 'uint16_t' | kw= 'int32_t' | kw= 'uint32_t' | kw= 'int64_t' | kw= 'uint64_t' | kw= 'intptr_t' | kw= 'uintptr_t' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2723:1: (kw= 'int' | kw= 'string' | kw= 'int8_t' | kw= 'uint8_t' | kw= 'int16_t' | kw= 'uint16_t' | kw= 'int32_t' | kw= 'uint32_t' | kw= 'int64_t' | kw= 'uint64_t' | kw= 'intptr_t' | kw= 'uintptr_t' )
            int alt65=12;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt65=1;
                }
                break;
            case 50:
                {
                alt65=2;
                }
                break;
            case 51:
                {
                alt65=3;
                }
                break;
            case 52:
                {
                alt65=4;
                }
                break;
            case 53:
                {
                alt65=5;
                }
                break;
            case 54:
                {
                alt65=6;
                }
                break;
            case 55:
                {
                alt65=7;
                }
                break;
            case 56:
                {
                alt65=8;
                }
                break;
            case 57:
                {
                alt65=9;
                }
                break;
            case 58:
                {
                alt65=10;
                }
                break;
            case 59:
                {
                alt65=11;
                }
                break;
            case 60:
                {
                alt65=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2724:2: kw= 'int'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleAttributeType5466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getIntKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2731:2: kw= 'string'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleAttributeType5485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getStringKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2738:2: kw= 'int8_t'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleAttributeType5504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getInt8_tKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2745:2: kw= 'uint8_t'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleAttributeType5523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUint8_tKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2752:2: kw= 'int16_t'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleAttributeType5542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getInt16_tKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2759:2: kw= 'uint16_t'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleAttributeType5561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUint16_tKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2766:2: kw= 'int32_t'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleAttributeType5580); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getInt32_tKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2773:2: kw= 'uint32_t'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleAttributeType5599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUint32_tKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2780:2: kw= 'int64_t'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleAttributeType5618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getInt64_tKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2787:2: kw= 'uint64_t'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleAttributeType5637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUint64_tKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2794:2: kw= 'intptr_t'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleAttributeType5656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getIntptr_tKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2801:2: kw= 'uintptr_t'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleAttributeType5675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUintptr_tKeyword_11()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRulesignedINT"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2814:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2815:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2816:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FOLLOW_rulesignedINT_in_entryRulesignedINT5716);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesignedINT5727); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignedINT"


    // $ANTLR start "rulesignedINT"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2823:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2826:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2827:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2827:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2827:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2827:2: (kw= '+' | kw= '-' )?
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==61) ) {
                alt66=1;
            }
            else if ( (LA66_0==62) ) {
                alt66=2;
            }
            switch (alt66) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2828:2: kw= '+'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_rulesignedINT5766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2835:2: kw= '-'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_rulesignedINT5785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesignedINT5802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getSignedINTAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignedINT"


    // $ANTLR start "entryRuleValue"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2855:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2856:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2857:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue5848);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue5859); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2864:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_HEXADECIMAL_TYPE_2=null;
        Token this_STRING_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2867:28: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | kw= 'null' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2868:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | kw= 'null' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2868:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | kw= 'null' )
            int alt67=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt67=1;
                }
                break;
            case RULE_INT:
            case 61:
            case 62:
                {
                alt67=2;
                }
                break;
            case RULE_HEXADECIMAL_TYPE:
                {
                alt67=3;
                }
                break;
            case RULE_STRING:
                {
                alt67=4;
                }
                break;
            case 63:
                {
                alt67=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2868:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue5899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2877:5: this_signedINT_1= rulesignedINT
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulesignedINT_in_ruleValue5932);
                    this_signedINT_1=rulesignedINT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_signedINT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2888:10: this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE
                    {
                    this_HEXADECIMAL_TYPE_2=(Token)match(input,RULE_HEXADECIMAL_TYPE,FOLLOW_RULE_HEXADECIMAL_TYPE_in_ruleValue5958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEXADECIMAL_TYPE_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXADECIMAL_TYPE_2, grammarAccess.getValueAccess().getHEXADECIMAL_TYPETerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2896:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue5984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2905:2: kw= 'null'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleValue6008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValueAccess().getNullKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleValueList"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2918:1: entryRuleValueList returns [EObject current=null] : iv_ruleValueList= ruleValueList EOF ;
    public final EObject entryRuleValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueList = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2919:2: (iv_ruleValueList= ruleValueList EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2920:2: iv_ruleValueList= ruleValueList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueListRule()); 
            }
            pushFollow(FOLLOW_ruleValueList_in_entryRuleValueList6048);
            iv_ruleValueList=ruleValueList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueList6058); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueList"


    // $ANTLR start "ruleValueList"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2927:1: ruleValueList returns [EObject current=null] : (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleValueList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_member_1_0 = null;

        AntlrDatatypeRuleToken lv_member_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2930:28: ( (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2931:1: (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2931:1: (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2931:3: otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleValueList6095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getValueListAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2935:1: ( (lv_member_1_0= ruleValue ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2936:1: (lv_member_1_0= ruleValue )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2936:1: (lv_member_1_0= ruleValue )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2937:3: lv_member_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueListAccess().getMemberValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleValueList6116);
            lv_member_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueListRule());
              	        }
                     		add(
                     			current, 
                     			"member",
                      		lv_member_1_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2953:2: (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==21) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2953:4: otherlv_2= ',' ( (lv_member_3_0= ruleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleValueList6129); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getValueListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2957:1: ( (lv_member_3_0= ruleValue ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2958:1: (lv_member_3_0= ruleValue )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2958:1: (lv_member_3_0= ruleValue )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2959:3: lv_member_3_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValueListAccess().getMemberValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleValueList6150);
            	    lv_member_3_0=ruleValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValueListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"member",
            	              		lv_member_3_0, 
            	              		"Value");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleValueList6164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getValueListAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueList"


    // $ANTLR start "entryRuleTemplateReference"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2987:1: entryRuleTemplateReference returns [EObject current=null] : iv_ruleTemplateReference= ruleTemplateReference EOF ;
    public final EObject entryRuleTemplateReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateReference = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2988:2: (iv_ruleTemplateReference= ruleTemplateReference EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2989:2: iv_ruleTemplateReference= ruleTemplateReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateReference_in_entryRuleTemplateReference6200);
            iv_ruleTemplateReference=ruleTemplateReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateReference6210); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateReference"


    // $ANTLR start "ruleTemplateReference"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2996:1: ruleTemplateReference returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? ) ;
    public final EObject ruleTemplateReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_anyTypeReference_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_name_0_0 = null;

        EObject lv_templatesList_5_0 = null;

        EObject lv_templatesList_7_0 = null;

        EObject lv_argumentsList_10_0 = null;

        EObject lv_argumentsList_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2999:28: ( ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3000:1: ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3000:1: ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3000:2: ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3000:2: ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==48) ) {
                    alt69=1;
                }
            }
            switch (alt69) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3000:3: ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3000:3: ( (lv_name_0_0= ruleTemplateSpecifier ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3001:1: (lv_name_0_0= ruleTemplateSpecifier )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3001:1: (lv_name_0_0= ruleTemplateSpecifier )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3002:3: lv_name_0_0= ruleTemplateSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getNameTemplateSpecifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateReference6257);
                    lv_name_0_0=ruleTemplateSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemplateReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"TemplateSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleTemplateReference6269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTemplateReferenceAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3022:3: ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                alt70=1;
            }
            else if ( (LA70_0==65) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3022:4: ( ( ruleQualifiedName ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3022:4: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3023:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3023:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3024:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemplateReferenceRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getTypeReferenceTypeReferenceCrossReference_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateReference6299);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3041:6: ( (lv_anyTypeReference_3_0= '?' ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3041:6: ( (lv_anyTypeReference_3_0= '?' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3042:1: (lv_anyTypeReference_3_0= '?' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3042:1: (lv_anyTypeReference_3_0= '?' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3043:3: lv_anyTypeReference_3_0= '?'
                    {
                    lv_anyTypeReference_3_0=(Token)match(input,65,FOLLOW_65_in_ruleTemplateReference6323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_anyTypeReference_3_0, grammarAccess.getTemplateReferenceAccess().getAnyTypeReferenceQuestionMarkKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemplateReferenceRule());
                      	        }
                             		setWithLastConsumed(current, "anyTypeReference", true, "?");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3056:3: (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==20) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3056:5: otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTemplateReference6350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTemplateReferenceAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3060:1: ( (lv_templatesList_5_0= ruleTemplateReference ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3061:1: (lv_templatesList_5_0= ruleTemplateReference )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3061:1: (lv_templatesList_5_0= ruleTemplateReference )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3062:3: lv_templatesList_5_0= ruleTemplateReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getTemplatesListTemplateReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateReference_in_ruleTemplateReference6371);
                    lv_templatesList_5_0=ruleTemplateReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemplateReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"templatesList",
                              		lv_templatesList_5_0, 
                              		"TemplateReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3078:2: (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==21) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3078:4: otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleTemplateReference6384); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getTemplateReferenceAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3082:1: ( (lv_templatesList_7_0= ruleTemplateReference ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3083:1: (lv_templatesList_7_0= ruleTemplateReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3083:1: (lv_templatesList_7_0= ruleTemplateReference )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3084:3: lv_templatesList_7_0= ruleTemplateReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getTemplatesListTemplateReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateReference_in_ruleTemplateReference6405);
                    	    lv_templatesList_7_0=ruleTemplateReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTemplateReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templatesList",
                    	              		lv_templatesList_7_0, 
                    	              		"TemplateReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleTemplateReference6419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTemplateReferenceAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3104:3: (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==29) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3104:5: otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')'
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleTemplateReference6434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTemplateReferenceAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3108:1: ( (lv_argumentsList_10_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3109:1: (lv_argumentsList_10_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3109:1: (lv_argumentsList_10_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3110:3: lv_argumentsList_10_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getArgumentsListArgumentDefinitionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference6455);
                    lv_argumentsList_10_0=ruleArgumentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemplateReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"argumentsList",
                              		lv_argumentsList_10_0, 
                              		"ArgumentDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3126:2: (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==21) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3126:4: otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleTemplateReference6468); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getTemplateReferenceAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3130:1: ( (lv_argumentsList_12_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3131:1: (lv_argumentsList_12_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3131:1: (lv_argumentsList_12_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3132:3: lv_argumentsList_12_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getArgumentsListArgumentDefinitionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference6489);
                    	    lv_argumentsList_12_0=ruleArgumentDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTemplateReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"argumentsList",
                    	              		lv_argumentsList_12_0, 
                    	              		"ArgumentDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleTemplateReference6503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTemplateReferenceAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateReference"


    // $ANTLR start "entryRuleArgumentDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3160:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3161:2: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3162:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition6541);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition6551); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentDefinition"


    // $ANTLR start "ruleArgumentDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3169:1: ruleArgumentDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_argumentValue_2_0 = null;

        EObject lv_argumentList_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3172:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3173:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3173:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3173:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3173:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==64) ) {
                    alt75=1;
                }
            }
            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3173:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3173:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3174:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3174:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3175:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition6594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getArgumentDefinitionAccess().getNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArgumentDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleArgumentDefinition6611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3195:3: ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_ID && LA76_0<=RULE_STRING)||(LA76_0>=61 && LA76_0<=63)) ) {
                alt76=1;
            }
            else if ( (LA76_0==24) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3195:4: ( (lv_argumentValue_2_0= ruleValue ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3195:4: ( (lv_argumentValue_2_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3196:1: (lv_argumentValue_2_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3196:1: (lv_argumentValue_2_0= ruleValue )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3197:3: lv_argumentValue_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition6635);
                    lv_argumentValue_2_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArgumentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"argumentValue",
                              		lv_argumentValue_2_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3214:6: ( (lv_argumentList_3_0= ruleValueList ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3214:6: ( (lv_argumentList_3_0= ruleValueList ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3215:1: (lv_argumentList_3_0= ruleValueList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3215:1: (lv_argumentList_3_0= ruleValueList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3216:3: lv_argumentList_3_0= ruleValueList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentListValueListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueList_in_ruleArgumentDefinition6662);
                    lv_argumentList_3_0=ruleValueList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArgumentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"argumentList",
                              		lv_argumentList_3_0, 
                              		"ValueList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentDefinition"


    // $ANTLR start "entryRuleAttributeDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3240:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3241:2: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3242:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition6699);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition6709); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeDefinition"


    // $ANTLR start "ruleAttributeDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3249:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleFlowType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3252:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleFlowType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3253:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleFlowType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3253:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleFlowType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3253:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleFlowType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3253:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==70) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3254:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3254:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3255:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition6755);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleAttributeDefinition6768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3275:1: ( (lv_type_2_0= ruleFlowType ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3276:1: (lv_type_2_0= ruleFlowType )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3276:1: (lv_type_2_0= ruleFlowType )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3277:3: lv_type_2_0= ruleFlowType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeFlowTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFlowType_in_ruleAttributeDefinition6789);
            lv_type_2_0=ruleFlowType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"FlowType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3293:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3294:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3294:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3295:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition6806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3311:2: (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==64) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3311:4: otherlv_4= '=' ( (lv_value_5_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_64_in_ruleAttributeDefinition6824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3315:1: ( (lv_value_5_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3316:1: (lv_value_5_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3316:1: (lv_value_5_0= ruleValue )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3317:3: lv_value_5_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition6845);
                    lv_value_5_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleAttributeDefinition6859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeDefinition"


    // $ANTLR start "entryRuleImplementationDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3345:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3346:2: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3347:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition6895);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition6905); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementationDefinition"


    // $ANTLR start "ruleImplementationDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3354:1: ruleImplementationDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_cFile_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3357:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3358:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3358:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3358:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3358:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==70) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3359:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3359:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3360:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition6951);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleImplementationDefinition6964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3380:1: ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID||LA80_0==RULE_SL||LA80_0==46||LA80_0==69) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_CODE_C) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3380:2: ( (lv_cFile_2_0= ruleFilePath ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3380:2: ( (lv_cFile_2_0= ruleFilePath ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3381:1: (lv_cFile_2_0= ruleFilePath )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3381:1: (lv_cFile_2_0= ruleFilePath )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3382:3: lv_cFile_2_0= ruleFilePath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getCFileFilePathParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFilePath_in_ruleImplementationDefinition6986);
                    lv_cFile_2_0=ruleFilePath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"cFile",
                              		lv_cFile_2_0, 
                              		"FilePath");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3399:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3399:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3400:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3400:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3401:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition7013);
                    lv_inlineCcode_3_0=ruleInlineCodeC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"inlineCcode",
                              		lv_inlineCcode_3_0, 
                              		"InlineCodeC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleImplementationDefinition7026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getImplementationDefinitionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementationDefinition"


    // $ANTLR start "entryRuleDataDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3429:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3430:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3431:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition7062);
            iv_ruleDataDefinition=ruleDataDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition7072); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataDefinition"


    // $ANTLR start "ruleDataDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3438:1: ruleDataDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_cFile_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3441:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3442:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3442:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3442:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3442:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==70) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3443:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3443:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3444:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleDataDefinition7118);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleDataDefinition7131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataDefinitionAccess().getDataKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3464:1: ( ( (lv_cFile_2_0= ruleFilePath ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID||LA82_0==RULE_SL||LA82_0==46||LA82_0==69) ) {
                alt82=1;
            }
            else if ( (LA82_0==RULE_CODE_C) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3464:2: ( (lv_cFile_2_0= ruleFilePath ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3464:2: ( (lv_cFile_2_0= ruleFilePath ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3465:1: (lv_cFile_2_0= ruleFilePath )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3465:1: (lv_cFile_2_0= ruleFilePath )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3466:3: lv_cFile_2_0= ruleFilePath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getCFileFilePathParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFilePath_in_ruleDataDefinition7153);
                    lv_cFile_2_0=ruleFilePath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"cFile",
                              		lv_cFile_2_0, 
                              		"FilePath");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3483:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3483:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3484:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3484:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3485:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition7180);
                    lv_inlineCcode_3_0=ruleInlineCodeC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"inlineCcode",
                              		lv_inlineCcode_3_0, 
                              		"InlineCodeC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDataDefinition7193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDataDefinitionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataDefinition"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3513:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3514:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3515:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7230);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName7241); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3522:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3525:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3526:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3526:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3526:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName7281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3533:1: (kw= '.' this_ID_2= RULE_ID )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==46) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3534:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,46,FOLLOW_46_in_ruleQualifiedName7300); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName7315); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleInlineCodeC"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3554:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3555:2: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3556:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineCodeCRule()); 
            }
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC7362);
            iv_ruleInlineCodeC=ruleInlineCodeC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC7372); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlineCodeC"


    // $ANTLR start "ruleInlineCodeC"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3563:1: ruleInlineCodeC returns [EObject current=null] : ( (lv_codeC_0_0= RULE_CODE_C ) ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3566:28: ( ( (lv_codeC_0_0= RULE_CODE_C ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3567:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3567:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3568:1: (lv_codeC_0_0= RULE_CODE_C )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3568:1: (lv_codeC_0_0= RULE_CODE_C )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3569:3: lv_codeC_0_0= RULE_CODE_C
            {
            lv_codeC_0_0=(Token)match(input,RULE_CODE_C,FOLLOW_RULE_CODE_C_in_ruleInlineCodeC7413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_codeC_0_0, grammarAccess.getInlineCodeCAccess().getCodeCCODE_CTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInlineCodeCRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"codeC",
                      		lv_codeC_0_0, 
                      		"CODE_C");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInlineCodeC"


    // $ANTLR start "entryRuleFilePath"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3593:1: entryRuleFilePath returns [String current=null] : iv_ruleFilePath= ruleFilePath EOF ;
    public final String entryRuleFilePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilePath = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3594:2: (iv_ruleFilePath= ruleFilePath EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3595:2: iv_ruleFilePath= ruleFilePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilePathRule()); 
            }
            pushFollow(FOLLOW_ruleFilePath_in_entryRuleFilePath7454);
            iv_ruleFilePath=ruleFilePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilePath.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePath7465); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilePath"


    // $ANTLR start "ruleFilePath"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3602:1: ruleFilePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SL_0= RULE_SL )? (kw= '.' this_SL_2= RULE_SL )? (kw= '..' this_SL_4= RULE_SL )* this_ID_5= RULE_ID (this_SL_6= RULE_SL this_ID_7= RULE_ID )* (kw= '.' this_ID_9= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFilePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SL_0=null;
        Token kw=null;
        Token this_SL_2=null;
        Token this_SL_4=null;
        Token this_ID_5=null;
        Token this_SL_6=null;
        Token this_ID_7=null;
        Token this_ID_9=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3605:28: ( ( (this_SL_0= RULE_SL )? (kw= '.' this_SL_2= RULE_SL )? (kw= '..' this_SL_4= RULE_SL )* this_ID_5= RULE_ID (this_SL_6= RULE_SL this_ID_7= RULE_ID )* (kw= '.' this_ID_9= RULE_ID )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3606:1: ( (this_SL_0= RULE_SL )? (kw= '.' this_SL_2= RULE_SL )? (kw= '..' this_SL_4= RULE_SL )* this_ID_5= RULE_ID (this_SL_6= RULE_SL this_ID_7= RULE_ID )* (kw= '.' this_ID_9= RULE_ID )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3606:1: ( (this_SL_0= RULE_SL )? (kw= '.' this_SL_2= RULE_SL )? (kw= '..' this_SL_4= RULE_SL )* this_ID_5= RULE_ID (this_SL_6= RULE_SL this_ID_7= RULE_ID )* (kw= '.' this_ID_9= RULE_ID )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3606:2: (this_SL_0= RULE_SL )? (kw= '.' this_SL_2= RULE_SL )? (kw= '..' this_SL_4= RULE_SL )* this_ID_5= RULE_ID (this_SL_6= RULE_SL this_ID_7= RULE_ID )* (kw= '.' this_ID_9= RULE_ID )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3606:2: (this_SL_0= RULE_SL )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_SL) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3606:7: this_SL_0= RULE_SL
                    {
                    this_SL_0=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_ruleFilePath7506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SL_0, grammarAccess.getFilePathAccess().getSLTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3613:3: (kw= '.' this_SL_2= RULE_SL )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==46) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3614:2: kw= '.' this_SL_2= RULE_SL
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleFilePath7527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFilePathAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_SL_2=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_ruleFilePath7542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SL_2, grammarAccess.getFilePathAccess().getSLTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3626:3: (kw= '..' this_SL_4= RULE_SL )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==69) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3627:2: kw= '..' this_SL_4= RULE_SL
            	    {
            	    kw=(Token)match(input,69,FOLLOW_69_in_ruleFilePath7563); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFilePathAccess().getFullStopFullStopKeyword_2_0()); 
            	          
            	    }
            	    this_SL_4=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_ruleFilePath7578); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SL_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SL_4, grammarAccess.getFilePathAccess().getSLTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilePath7600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_5);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_5, grammarAccess.getFilePathAccess().getIDTerminalRuleCall_3()); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3646:1: (this_SL_6= RULE_SL this_ID_7= RULE_ID )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==RULE_SL) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3646:6: this_SL_6= RULE_SL this_ID_7= RULE_ID
            	    {
            	    this_SL_6=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_ruleFilePath7621); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SL_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SL_6, grammarAccess.getFilePathAccess().getSLTerminalRuleCall_4_0()); 
            	          
            	    }
            	    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilePath7641); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_7, grammarAccess.getFilePathAccess().getIDTerminalRuleCall_4_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3660:3: (kw= '.' this_ID_9= RULE_ID )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==46) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3661:2: kw= '.' this_ID_9= RULE_ID
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleFilePath7662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFilePathAccess().getFullStopKeyword_5_0()); 
                          
                    }
                    this_ID_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilePath7677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_9, grammarAccess.getFilePathAccess().getIDTerminalRuleCall_5_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilePath"


    // $ANTLR start "entryRuleAnnotationsList"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3683:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3684:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3685:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsListRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList7726);
            iv_ruleAnnotationsList=ruleAnnotationsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationsList7736); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationsList"


    // $ANTLR start "ruleAnnotationsList"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3692:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3695:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3696:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3696:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3696:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3696:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3697:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3697:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3698:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList7782);
            lv_annotations_0_0=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationsListRule());
              	        }
                     		add(
                     			current, 
                     			"annotations",
                      		lv_annotations_0_0, 
                      		"Annotation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3714:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==70) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3715:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3715:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3716:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList7803);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotationsListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationsList"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3740:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3741:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3742:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation7840);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation7850); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3749:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token lv_name_1_4=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_5 = null;

        EObject lv_annotationElements_3_0 = null;

        EObject lv_annotationElements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3752:28: ( (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3753:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3753:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3753:3: otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleAnnotation7887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3757:1: ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3758:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3758:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3759:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3759:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            int alt90=5;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt90=1;
                }
                break;
            case 72:
                {
                alt90=2;
                }
                break;
            case 73:
                {
                alt90=3;
                }
                break;
            case 74:
                {
                alt90=4;
                }
                break;
            case RULE_ID:
                {
                alt90=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3760:3: lv_name_1_1= 'Override'
                    {
                    lv_name_1_1=(Token)match(input,71,FOLLOW_71_in_ruleAnnotation7907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_1, grammarAccess.getAnnotationAccess().getNameOverrideKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3772:8: lv_name_1_2= 'Singleton'
                    {
                    lv_name_1_2=(Token)match(input,72,FOLLOW_72_in_ruleAnnotation7936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_2, grammarAccess.getAnnotationAccess().getNameSingletonKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3784:8: lv_name_1_3= 'LDFlags'
                    {
                    lv_name_1_3=(Token)match(input,73,FOLLOW_73_in_ruleAnnotation7965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_3, grammarAccess.getAnnotationAccess().getNameLDFlagsKeyword_1_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3796:8: lv_name_1_4= 'CFlags'
                    {
                    lv_name_1_4=(Token)match(input,74,FOLLOW_74_in_ruleAnnotation7994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_4, grammarAccess.getAnnotationAccess().getNameCFlagsKeyword_1_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3808:8: lv_name_1_5= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameQualifiedNameParserRuleCall_1_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnnotation8026);
                    lv_name_1_5=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_5, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3826:2: (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==29) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3826:4: otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleAnnotation8042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3830:1: ( (lv_annotationElements_3_0= ruleAnnotationElement ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3831:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3831:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3832:3: lv_annotationElements_3_0= ruleAnnotationElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation8063);
                    lv_annotationElements_3_0=ruleAnnotationElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotationElements",
                              		lv_annotationElements_3_0, 
                              		"AnnotationElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3848:2: (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==21) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3848:4: otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAnnotation8076); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3852:1: ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3853:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3853:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3854:3: lv_annotationElements_5_0= ruleAnnotationElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation8097);
                    	    lv_annotationElements_5_0=ruleAnnotationElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotationElements",
                    	              		lv_annotationElements_5_0, 
                    	              		"AnnotationElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleAnnotation8111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnnotationElement"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3882:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3883:2: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3884:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationElementRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement8149);
            iv_ruleAnnotationElement=ruleAnnotationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement8159); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationElement"


    // $ANTLR start "ruleAnnotationElement"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3891:1: ruleAnnotationElement returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_elementValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3894:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3895:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3895:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3895:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3895:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==64) ) {
                    alt93=1;
                }
            }
            switch (alt93) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3895:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3895:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3896:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3896:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3897:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement8202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getAnnotationElementAccess().getNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationElementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleAnnotationElement8219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3917:3: ( (lv_elementValue_2_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3918:1: (lv_elementValue_2_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3918:1: (lv_elementValue_2_0= ruleElementValue )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3919:3: lv_elementValue_2_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement8242);
            lv_elementValue_2_0=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationElementRule());
              	        }
                     		set(
                     			current, 
                     			"elementValue",
                      		lv_elementValue_2_0, 
                      		"ElementValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationElement"


    // $ANTLR start "entryRuleElementValue"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3943:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3944:2: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3945:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueRule()); 
            }
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue8278);
            iv_ruleElementValue=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue8288); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementValue"


    // $ANTLR start "ruleElementValue"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3952:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3955:28: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3956:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3956:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt94=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt94=1;
                }
                break;
            case 70:
                {
                alt94=2;
                }
                break;
            case 24:
                {
                alt94=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3957:2: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue8338);
                    this_ConstantValue_0=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3970:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue8368);
                    this_Annotation_1=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Annotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3983:2: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue8398);
                    this_ElementValueArrayInitializer_2=ruleElementValueArrayInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ElementValueArrayInitializer_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementValue"


    // $ANTLR start "entryRuleElementValueArrayInitializer"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4002:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4003:2: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4004:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueArrayInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer8433);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer8443); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementValueArrayInitializer"


    // $ANTLR start "ruleElementValueArrayInitializer"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4011:1: ruleElementValueArrayInitializer returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4014:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4015:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4015:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4015:3: otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleElementValueArrayInitializer8480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4019:1: ( (lv_values_1_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4020:1: (lv_values_1_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4020:1: (lv_values_1_0= ruleElementValue )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4021:3: lv_values_1_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8501);
            lv_values_1_0=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementValueArrayInitializerRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_1_0, 
                      		"ElementValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4037:2: (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==21) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4037:4: otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleElementValueArrayInitializer8514); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4041:1: ( (lv_values_3_0= ruleElementValue ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4042:1: (lv_values_3_0= ruleElementValue )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4042:1: (lv_values_3_0= ruleElementValue )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4043:3: lv_values_3_0= ruleElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8535);
            	    lv_values_3_0=ruleElementValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementValueArrayInitializerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_3_0, 
            	              		"ElementValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleElementValueArrayInitializer8549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getElementValueArrayInitializerAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementValueArrayInitializer"


    // $ANTLR start "entryRuleConstantValue"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4071:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4072:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4073:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue8585);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue8595); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4080:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstantFormat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4083:28: ( ( (lv_value_0_0= ruleConstantFormat ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4084:1: ( (lv_value_0_0= ruleConstantFormat ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4084:1: ( (lv_value_0_0= ruleConstantFormat ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4085:1: (lv_value_0_0= ruleConstantFormat )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4085:1: (lv_value_0_0= ruleConstantFormat )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4086:3: lv_value_0_0= ruleConstantFormat
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue8640);
            lv_value_0_0=ruleConstantFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantValueRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"ConstantFormat");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleConstantFormat"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4110:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4111:2: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4112:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantFormatRule()); 
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat8676);
            iv_ruleConstantFormat=ruleConstantFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat8687); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantFormat"


    // $ANTLR start "ruleConstantFormat"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4119:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4122:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4123:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4123:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            int alt96=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt96=1;
                }
                break;
            case RULE_STRING:
                {
                alt96=2;
                }
                break;
            case RULE_ID:
                {
                alt96=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4123:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat8727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4131:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat8753); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getConstantFormatAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:4139:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantFormat8779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_2, grammarAccess.getConstantFormatAccess().getIDTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantFormat"

    // $ANTLR start synpred1_InternalAdl
    public final void synpred1_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_imports_0_0 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:87:1: ( (lv_imports_0_0= ruleImportDefinition ) )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:87:1: (lv_imports_0_0= ruleImportDefinition )
        {
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:87:1: (lv_imports_0_0= ruleImportDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:88:3: lv_imports_0_0= ruleImportDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAdlFileAccess().getImportsImportDefinitionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleImportDefinition_in_synpred1_InternalAdl137);
        lv_imports_0_0=ruleImportDefinition();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalAdl

    // $ANTLR start synpred13_InternalAdl
    public final void synpred13_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_14_1 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:471:3: (lv_elements_14_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:471:3: lv_elements_14_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_7_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred13_InternalAdl926);
        lv_elements_14_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalAdl

    // $ANTLR start synpred14_InternalAdl
    public final void synpred14_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_14_2 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:486:8: (lv_elements_14_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:486:8: lv_elements_14_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_7_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred14_InternalAdl945);
        lv_elements_14_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalAdl

    // $ANTLR start synpred15_InternalAdl
    public final void synpred15_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_14_3 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:501:8: (lv_elements_14_3= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:501:8: lv_elements_14_3= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsSubComponentDefinitionParserRuleCall_7_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred15_InternalAdl964);
        lv_elements_14_3=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalAdl

    // $ANTLR start synpred16_InternalAdl
    public final void synpred16_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_14_4 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:516:8: (lv_elements_14_4= ruleBindingDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:516:8: lv_elements_14_4= ruleBindingDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsBindingDefinitionParserRuleCall_7_0_3()); 
          	    
        }
        pushFollow(FOLLOW_ruleBindingDefinition_in_synpred16_InternalAdl983);
        lv_elements_14_4=ruleBindingDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalAdl

    // $ANTLR start synpred17_InternalAdl
    public final void synpred17_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_14_5 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:531:8: (lv_elements_14_5= ruleOutputFlowInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:531:8: lv_elements_14_5= ruleOutputFlowInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsOutputFlowInterfaceDefinitionParserRuleCall_7_0_4()); 
          	    
        }
        pushFollow(FOLLOW_ruleOutputFlowInterfaceDefinition_in_synpred17_InternalAdl1002);
        lv_elements_14_5=ruleOutputFlowInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalAdl

    // $ANTLR start synpred24_InternalAdl
    public final void synpred24_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_10_1 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:704:3: (lv_elements_10_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:704:3: lv_elements_10_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_7_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred24_InternalAdl1315);
        lv_elements_10_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalAdl

    // $ANTLR start synpred25_InternalAdl
    public final void synpred25_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_10_2 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:719:8: (lv_elements_10_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:719:8: lv_elements_10_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_7_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred25_InternalAdl1334);
        lv_elements_10_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalAdl

    // $ANTLR start synpred26_InternalAdl
    public final void synpred26_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_10_3 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:734:8: (lv_elements_10_3= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:734:8: lv_elements_10_3= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_7_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred26_InternalAdl1353);
        lv_elements_10_3=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalAdl

    // $ANTLR start synpred27_InternalAdl
    public final void synpred27_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_10_4 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:749:8: (lv_elements_10_4= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:749:8: lv_elements_10_4= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_7_0_3()); 
          	    
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred27_InternalAdl1372);
        lv_elements_10_4=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalAdl

    // $ANTLR start synpred28_InternalAdl
    public final void synpred28_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_10_5 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:764:8: (lv_elements_10_5= ruleDataDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:764:8: lv_elements_10_5= ruleDataDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsDataDefinitionParserRuleCall_7_0_4()); 
          	    
        }
        pushFollow(FOLLOW_ruleDataDefinition_in_synpred28_InternalAdl1391);
        lv_elements_10_5=ruleDataDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalAdl

    // $ANTLR start synpred29_InternalAdl
    public final void synpred29_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_10_6 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:779:8: (lv_elements_10_6= ruleOutputFlowInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:779:8: lv_elements_10_6= ruleOutputFlowInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsOutputFlowInterfaceDefinitionParserRuleCall_7_0_5()); 
          	    
        }
        pushFollow(FOLLOW_ruleOutputFlowInterfaceDefinition_in_synpred29_InternalAdl1410);
        lv_elements_10_6=ruleOutputFlowInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalAdl

    // $ANTLR start synpred33_InternalAdl
    public final void synpred33_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_7_1 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:910:3: (lv_elements_7_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:910:3: lv_elements_7_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_4_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred33_InternalAdl1668);
        lv_elements_7_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalAdl

    // $ANTLR start synpred34_InternalAdl
    public final void synpred34_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_7_2 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:925:8: (lv_elements_7_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:925:8: lv_elements_7_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_4_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred34_InternalAdl1687);
        lv_elements_7_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalAdl

    // $ANTLR start synpred35_InternalAdl
    public final void synpred35_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_7_3 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:940:8: (lv_elements_7_3= ruleOutputFlowInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:940:8: lv_elements_7_3= ruleOutputFlowInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsOutputFlowInterfaceDefinitionParserRuleCall_4_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleOutputFlowInterfaceDefinition_in_synpred35_InternalAdl1706);
        lv_elements_7_3=ruleOutputFlowInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalAdl

    // $ANTLR start synpred43_InternalAdl
    public final void synpred43_InternalAdl_fragment() throws RecognitionException {   
        EObject this_ProvidedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1225:2: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1225:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred43_InternalAdl2289);
        this_ProvidedInterfaceDefinition_0=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalAdl

    // $ANTLR start synpred44_InternalAdl
    public final void synpred44_InternalAdl_fragment() throws RecognitionException {   
        EObject this_RequiredInterfaceDefinition_1 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1238:2: (this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1238:2: this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred44_InternalAdl2319);
        this_RequiredInterfaceDefinition_1=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalAdl

    // $ANTLR start synpred45_InternalAdl
    public final void synpred45_InternalAdl_fragment() throws RecognitionException {   
        EObject this_OutputFlowInterfaceDefinition_2 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1251:2: (this_OutputFlowInterfaceDefinition_2= ruleOutputFlowInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1251:2: this_OutputFlowInterfaceDefinition_2= ruleOutputFlowInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleOutputFlowInterfaceDefinition_in_synpred45_InternalAdl2349);
        this_OutputFlowInterfaceDefinition_2=ruleOutputFlowInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalAdl

    // $ANTLR start synpred72_InternalAdl
    public final void synpred72_InternalAdl_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2217:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2217:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred72_InternalAdl4336);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalAdl

    // $ANTLR start synpred73_InternalAdl
    public final void synpred73_InternalAdl_fragment() throws RecognitionException {   
        EObject this_SubComponentDefinition_1 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2230:2: (this_SubComponentDefinition_1= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2230:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred73_InternalAdl4366);
        this_SubComponentDefinition_1=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_InternalAdl

    // $ANTLR start synpred74_InternalAdl
    public final void synpred74_InternalAdl_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2276:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2276:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred74_InternalAdl4491);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_InternalAdl

    // $ANTLR start synpred75_InternalAdl
    public final void synpred75_InternalAdl_fragment() throws RecognitionException {   
        EObject this_ImplementationDefinition_1 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2289:2: (this_ImplementationDefinition_1= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2289:2: this_ImplementationDefinition_1= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred75_InternalAdl4521);
        this_ImplementationDefinition_1=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_InternalAdl

    // $ANTLR start synpred76_InternalAdl
    public final void synpred76_InternalAdl_fragment() throws RecognitionException {   
        EObject this_AttributeDefinition_2 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2302:2: (this_AttributeDefinition_2= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2302:2: this_AttributeDefinition_2= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred76_InternalAdl4551);
        this_AttributeDefinition_2=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_InternalAdl

    // Delegated rules

    public final boolean synpred72_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleAdlFile_in_entryRuleAdlFile81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdlFile91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlFile137 = new BitSet(new long[]{0x000000001C090000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAdlFile159 = new BitSet(new long[]{0x000000001C080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlFile181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_ruleArchitectureDefinition277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_ruleArchitectureDefinition307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleArchitectureDefinition337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImportDefinition428 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImportDefinition441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDefinition462 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleImportDefinition474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard569 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedNameWithWildcard588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinition640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCompositeDefinition689 = new BitSet(new long[]{0x0000000021900010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition710 = new BitSet(new long[]{0x0000000021900000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeDefinition724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition746 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeDefinition759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition780 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeDefinition795 = new BitSet(new long[]{0x0000000021800000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeDefinition818 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleCompositeDefinition832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeSuperType_in_ruleCompositeDefinition853 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeDefinition866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeSuperType_in_ruleCompositeDefinition887 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_ruleCompositeDefinition903 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleCompositeDefinition926 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleCompositeDefinition945 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition964 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition983 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOutputFlowInterfaceDefinition_in_ruleCompositeDefinition1002 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInputFlowInterfaceDefinition_in_ruleCompositeDefinition1021 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_25_in_ruleCompositeDefinition1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinition1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveDefinition1138 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePrimitiveDefinition1164 = new BitSet(new long[]{0x0000000021800010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1185 = new BitSet(new long[]{0x0000000021800000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1207 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_rulePrimitiveDefinition1221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1242 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveDefinition1255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1276 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveDefinition1292 = new BitSet(new long[]{0x0000186882000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1315 = new BitSet(new long[]{0x0000186882000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1334 = new BitSet(new long[]{0x0000186882000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1353 = new BitSet(new long[]{0x0000186882000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1372 = new BitSet(new long[]{0x0000186882000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1391 = new BitSet(new long[]{0x0000186882000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_ruleOutputFlowInterfaceDefinition_in_rulePrimitiveDefinition1410 = new BitSet(new long[]{0x0000186882000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_ruleInputFlowInterfaceDefinition_in_rulePrimitiveDefinition1429 = new BitSet(new long[]{0x0000186882000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_25_in_rulePrimitiveDefinition1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTypeDefinition1528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1549 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleTypeDefinition1562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1589 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_ruleTypeDefinition1602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1629 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_ruleTypeDefinition1645 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1668 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1687 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOutputFlowInterfaceDefinition_in_ruleTypeDefinition1706 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInputFlowInterfaceDefinition_in_ruleTypeDefinition1725 = new BitSet(new long[]{0x0000186882000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_25_in_ruleTypeDefinition1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSuperType_in_entryRuleCompositeSuperType1777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeSuperType1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeSuperType1839 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeSuperType1852 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1873 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeSuperType1886 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1907 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeSuperType1921 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleCompositeSuperType1936 = new BitSet(new long[]{0xE0000000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1957 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeSuperType1970 = new BitSet(new long[]{0xE0000000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1991 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleCompositeSuperType2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSuperType_in_entryRulePrimitiveSuperType2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveSuperType2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveSuperType2105 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rulePrimitiveSuperType2118 = new BitSet(new long[]{0xE0000000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2139 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveSuperType2152 = new BitSet(new long[]{0xE0000000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2173 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_rulePrimitiveSuperType2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition2229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputFlowInterfaceDefinition_in_ruleHostedInterfaceDefinition2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputFlowInterfaceDefinition_in_ruleHostedInterfaceDefinition2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition2414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition2470 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleProvidedInterfaceDefinition2489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition2529 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleProvidedInterfaceDefinition2541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition2558 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleProvidedInterfaceDefinition2582 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition2612 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleProvidedInterfaceDefinition2630 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProvidedInterfaceDefinition2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition2680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition2736 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRequiredInterfaceDefinition2755 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleRequiredInterfaceDefinition2786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2827 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRequiredInterfaceDefinition2839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2856 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleRequiredInterfaceDefinition2880 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2910 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRequiredInterfaceDefinition2928 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRequiredInterfaceDefinition2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputFlowInterfaceDefinition_in_entryRuleOutputFlowInterfaceDefinition2978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputFlowInterfaceDefinition2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleOutputFlowInterfaceDefinition3034 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleOutputFlowInterfaceDefinition3053 = new BitSet(new long[]{0x1FFE400000000210L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFlowType_in_ruleOutputFlowInterfaceDefinition3087 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOutputFlowInterfaceDefinition3099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputFlowInterfaceDefinition3116 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleOutputFlowInterfaceDefinition3140 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOutputFlowInterfaceDefinition3170 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOutputFlowInterfaceDefinition3188 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOutputFlowInterfaceDefinition3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputFlowInterfaceDefinition_in_entryRuleInputFlowInterfaceDefinition3238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputFlowInterfaceDefinition3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleInputFlowInterfaceDefinition3294 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleInputFlowInterfaceDefinition3313 = new BitSet(new long[]{0x1FFE401000000210L,0x0000000000000020L});
    public static final BitSet FOLLOW_36_in_ruleInputFlowInterfaceDefinition3344 = new BitSet(new long[]{0x1FFE400000000210L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFlowType_in_ruleInputFlowInterfaceDefinition3379 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInputFlowInterfaceDefinition3391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputFlowInterfaceDefinition3408 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleInputFlowInterfaceDefinition3432 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInputFlowInterfaceDefinition3462 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInputFlowInterfaceDefinition3480 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInputFlowInterfaceDefinition3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowType_in_entryRuleFlowType3531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlowType3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleFlowType3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDTType_in_ruleFlowType3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDTType_in_entryRuleIDTType3668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDTType3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePath_in_ruleIDTType3726 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleIDTType3744 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_40_in_ruleIDTType3758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_41_in_ruleIDTType3777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_42_in_ruleIDTType3796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDTType3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition3859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition3915 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSubComponentDefinition3928 = new BitSet(new long[]{0x0000000120100010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition3955 = new BitSet(new long[]{0x0000000120100000L});
    public static final BitSet FOLLOW_20_in_ruleSubComponentDefinition3969 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition3990 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentDefinition4003 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition4024 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleSubComponentDefinition4038 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_29_in_ruleSubComponentDefinition4053 = new BitSet(new long[]{0xE0000000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition4074 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentDefinition4087 = new BitSet(new long[]{0xE0000000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition4108 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleSubComponentDefinition4122 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSubComponentDefinition4136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubComponentDefinition4153 = new BitSet(new long[]{0x000000000C0A0000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition4179 = new BitSet(new long[]{0x000000000C0A0000L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_ruleSubComponentDefinition4203 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_ruleSubComponentDefinition4222 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSubComponentDefinition4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement4276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeElement4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeElement4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement4431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveElement4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveElement4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition4616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition4672 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleBindingDefinition4685 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4710 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45_in_ruleBindingDefinition4734 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleBindingDefinition4760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4784 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition4797 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition4814 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition4831 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleBindingDefinition4845 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4870 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45_in_ruleBindingDefinition4894 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleBindingDefinition4920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition4944 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition4957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition4974 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition4991 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBindingDefinition5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument5041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList5132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFormalArgumentsList5179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList5200 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleFormalArgumentsList5213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList5234 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleFormalArgumentsList5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier5284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier5336 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTemplateSpecifier5353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType5417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAttributeType5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAttributeType5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAttributeType5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAttributeType5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAttributeType5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAttributeType5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAttributeType5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAttributeType5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAttributeType5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleAttributeType5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleAttributeType5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleAttributeType5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT5716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignedINT5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulesignedINT5766 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_62_in_rulesignedINT5785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue5848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_ruleValue5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXADECIMAL_TYPE_in_ruleValue5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleValue6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueList_in_entryRuleValueList6048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueList6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValueList6095 = new BitSet(new long[]{0xE0000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueList6116 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleValueList6129 = new BitSet(new long[]{0xE0000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueList6150 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleValueList6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_entryRuleTemplateReference6200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateReference6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateReference6257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleTemplateReference6269 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateReference6299 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_65_in_ruleTemplateReference6323 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_20_in_ruleTemplateReference6350 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleTemplateReference6371 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleTemplateReference6384 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleTemplateReference6405 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleTemplateReference6419 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTemplateReference6434 = new BitSet(new long[]{0xE0000000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference6455 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleTemplateReference6468 = new BitSet(new long[]{0xE0000000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference6489 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleTemplateReference6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition6541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition6594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleArgumentDefinition6611 = new BitSet(new long[]{0xE0000000010000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueList_in_ruleArgumentDefinition6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition6699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition6755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleAttributeDefinition6768 = new BitSet(new long[]{0x1FFE400000000210L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFlowType_in_ruleAttributeDefinition6789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition6806 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleAttributeDefinition6824 = new BitSet(new long[]{0xE0000000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition6845 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttributeDefinition6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition6895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition6951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleImplementationDefinition6964 = new BitSet(new long[]{0x1FFE400000000310L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFilePath_in_ruleImplementationDefinition6986 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition7013 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleImplementationDefinition7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition7062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleDataDefinition7118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleDataDefinition7131 = new BitSet(new long[]{0x1FFE400000000310L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFilePath_in_ruleDataDefinition7153 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition7180 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataDefinition7193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName7281 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleQualifiedName7300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName7315 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC7362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC7372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_C_in_ruleInlineCodeC7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePath_in_entryRuleFilePath7454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePath7465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_in_ruleFilePath7506 = new BitSet(new long[]{0x0000400000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_46_in_ruleFilePath7527 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_SL_in_ruleFilePath7542 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleFilePath7563 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_SL_in_ruleFilePath7578 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilePath7600 = new BitSet(new long[]{0x0000400000000202L});
    public static final BitSet FOLLOW_RULE_SL_in_ruleFilePath7621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilePath7641 = new BitSet(new long[]{0x0000400000000202L});
    public static final BitSet FOLLOW_46_in_ruleFilePath7662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilePath7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList7726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList7782 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList7803 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation7840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAnnotation7887 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000780L});
    public static final BitSet FOLLOW_71_in_ruleAnnotation7907 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_72_in_ruleAnnotation7936 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_73_in_ruleAnnotation7965 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_74_in_ruleAnnotation7994 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotation8026 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAnnotation8042 = new BitSet(new long[]{0x00000000010000B0L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation8063 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleAnnotation8076 = new BitSet(new long[]{0x00000000010000B0L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation8097 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleAnnotation8111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement8149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement8202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleAnnotationElement8219 = new BitSet(new long[]{0x00000000010000B0L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue8278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue8338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue8368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue8398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer8433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleElementValueArrayInitializer8480 = new BitSet(new long[]{0x00000000010000B0L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8501 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleElementValueArrayInitializer8514 = new BitSet(new long[]{0x00000000010000B0L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer8535 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleElementValueArrayInitializer8549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue8585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue8595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue8640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat8676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat8687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat8727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat8753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantFormat8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_synpred1_InternalAdl137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred13_InternalAdl926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred14_InternalAdl945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred15_InternalAdl964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_synpred16_InternalAdl983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputFlowInterfaceDefinition_in_synpred17_InternalAdl1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred24_InternalAdl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred25_InternalAdl1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred26_InternalAdl1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred27_InternalAdl1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_synpred28_InternalAdl1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputFlowInterfaceDefinition_in_synpred29_InternalAdl1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred33_InternalAdl1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred34_InternalAdl1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputFlowInterfaceDefinition_in_synpred35_InternalAdl1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred43_InternalAdl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred44_InternalAdl2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputFlowInterfaceDefinition_in_synpred45_InternalAdl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred72_InternalAdl4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred73_InternalAdl4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred74_InternalAdl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred75_InternalAdl4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred76_InternalAdl4551 = new BitSet(new long[]{0x0000000000000002L});

}