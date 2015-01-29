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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL_TYPE", "RULE_STRING", "RULE_CODE_C", "RULE_SL", "RULE_DOUBLE_LEFT_CURLY_BRACKETS", "RULE_DOUBLE_RIGHT_CURLY_BRACKETS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'.*'", "'composite'", "'<'", "','", "'>'", "'extends'", "'{'", "'}'", "'abstract'", "'primitive'", "'type'", "'('", "')'", "'provides'", "'as'", "'['", "']'", "'requires'", "'optional'", "'contains'", "'binds'", "'this'", "'.'", "'to'", "'conformsto'", "'STRUCT'", "'UNION'", "'ENUM'", "'+'", "'-'", "'null'", "'='", "'?'", "'attribute'", "':'", "'source'", "'data'", "'..'", "'@'", "'Override'", "'Singleton'", "'LDFlags'", "'CFlags'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_HEXADECIMAL_TYPE=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int RULE_DOUBLE_RIGHT_CURLY_BRACKETS=11;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_CODE_C=8;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_DOUBLE_LEFT_CURLY_BRACKETS=10;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SL=9;
    public static final int RULE_WS=14;

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

                if ( (LA1_0==56) ) {
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

            if ( (LA2_0==56) ) {
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

            if ( (LA4_0==56) ) {
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:319:1: ruleCompositeDefinition returns [EObject current=null] : ( () otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) )? (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition ) ) )* otherlv_15= '}' ) ;
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


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:322:28: ( ( () otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) )? (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition ) ) )* otherlv_15= '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:323:1: ( () otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) )? (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition ) ) )* otherlv_15= '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:323:1: ( () otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) )? (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition ) ) )* otherlv_15= '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:323:2: () otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) )? (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( (lv_superTypes_10_0= ruleCompositeSuperType ) ) (otherlv_11= ',' ( (lv_superTypes_12_0= ruleCompositeSuperType ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition ) ) )* otherlv_15= '}'
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:468:1: ( ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31||LA13_0==35||(LA13_0>=37 && LA13_0<=38)||LA13_0==56) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:469:1: ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:469:1: ( (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:470:1: (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:470:1: (lv_elements_14_1= ruleProvidedInterfaceDefinition | lv_elements_14_2= ruleRequiredInterfaceDefinition | lv_elements_14_3= ruleSubComponentDefinition | lv_elements_14_4= ruleBindingDefinition )
            	    int alt12=4;
            	    switch ( input.LA(1) ) {
            	    case 56:
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
            	        else if ( (true) ) {
            	            alt12=4;
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
            	    case 37:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt12=4;
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

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleCompositeDefinition999); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:546:1: entryRulePrimitiveDefinition returns [EObject current=null] : iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF ;
    public final EObject entryRulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:547:2: (iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:548:2: iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition1035);
            iv_rulePrimitiveDefinition=rulePrimitiveDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinition1045); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:555:1: rulePrimitiveDefinition returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )* otherlv_11= '}' ) ;
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


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:558:28: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )* otherlv_11= '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:559:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )* otherlv_11= '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:559:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )* otherlv_11= '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:559:2: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )* otherlv_11= '}'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:559:2: ()
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:560:2: 
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:568:2: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:569:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:569:1: (lv_abstract_1_0= 'abstract' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:570:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,26,FOLLOW_26_in_rulePrimitiveDefinition1100); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePrimitiveDefinition1126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimitiveDefinitionAccess().getPrimitiveKeyword_2());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:587:1: ( (lv_name_3_0= ruleQualifiedName ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:588:1: (lv_name_3_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:588:1: (lv_name_3_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:589:3: lv_name_3_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getNameQualifiedNameParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1147);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:605:3: ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:606:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:606:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:607:3: lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1169);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:623:3: (otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:623:5: otherlv_5= 'extends' ( (lv_superTypes_6_0= rulePrimitiveSuperType ) ) (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )*
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_rulePrimitiveDefinition1183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPrimitiveDefinitionAccess().getExtendsKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:627:1: ( (lv_superTypes_6_0= rulePrimitiveSuperType ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:628:1: (lv_superTypes_6_0= rulePrimitiveSuperType )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:628:1: (lv_superTypes_6_0= rulePrimitiveSuperType )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:629:3: lv_superTypes_6_0= rulePrimitiveSuperType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypesPrimitiveSuperTypeParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1204);
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

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:645:2: (otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:645:4: otherlv_7= ',' ( (lv_superTypes_8_0= rulePrimitiveSuperType ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveDefinition1217); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getPrimitiveDefinitionAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:649:1: ( (lv_superTypes_8_0= rulePrimitiveSuperType ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:650:1: (lv_superTypes_8_0= rulePrimitiveSuperType )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:650:1: (lv_superTypes_8_0= rulePrimitiveSuperType )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:651:3: lv_superTypes_8_0= rulePrimitiveSuperType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypesPrimitiveSuperTypeParserRuleCall_5_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1238);
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

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_rulePrimitiveDefinition1254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPrimitiveDefinitionAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:671:1: ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31||LA20_0==35||LA20_0==51||(LA20_0>=53 && LA20_0<=54)||LA20_0==56) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:672:1: ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:672:1: ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:673:1: (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:673:1: (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition )
            	    int alt19=5;
            	    switch ( input.LA(1) ) {
            	    case 56:
            	        {
            	        int LA19_1 = input.LA(2);

            	        if ( (synpred22_InternalAdl()) ) {
            	            alt19=1;
            	        }
            	        else if ( (synpred23_InternalAdl()) ) {
            	            alt19=2;
            	        }
            	        else if ( (synpred24_InternalAdl()) ) {
            	            alt19=3;
            	        }
            	        else if ( (synpred25_InternalAdl()) ) {
            	            alt19=4;
            	        }
            	        else if ( (true) ) {
            	            alt19=5;
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
            	    case 53:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt19=5;
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
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:674:3: lv_elements_10_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_7_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1277);
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
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:689:8: lv_elements_10_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_7_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1296);
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
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:704:8: lv_elements_10_3= ruleImplementationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_7_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1315);
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
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:719:8: lv_elements_10_4= ruleAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_7_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1334);
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
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:734:8: lv_elements_10_5= ruleDataDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsDataDefinitionParserRuleCall_7_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1353);
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

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_11=(Token)match(input,25,FOLLOW_25_in_rulePrimitiveDefinition1369); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:764:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:765:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:766:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1405);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition1415); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:773:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' ) ;
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


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:776:28: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:777:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:777:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:777:3: otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleTypeDefinition1452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:781:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:782:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:782:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:783:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1473);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:799:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:799:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleTypeDefinition1486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTypeDefinitionAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:803:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:804:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:804:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:805:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1513);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:821:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==21) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:821:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTypeDefinition1526); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTypeDefinitionAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:825:1: ( ( ruleQualifiedName ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:826:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:826:1: ( ruleQualifiedName )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:827:3: ruleQualifiedName
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
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1553);
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

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleTypeDefinition1569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTypeDefinitionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:847:1: ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31||LA24_0==35||LA24_0==56) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:848:1: ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:848:1: ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:849:1: (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:849:1: (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition )
            	    int alt23=2;
            	    switch ( input.LA(1) ) {
            	    case 56:
            	        {
            	        int LA23_1 = input.LA(2);

            	        if ( (synpred29_InternalAdl()) ) {
            	            alt23=1;
            	        }
            	        else if ( (true) ) {
            	            alt23=2;
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
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:850:3: lv_elements_7_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1592);
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
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:865:8: lv_elements_7_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1611);
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

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleTypeDefinition1627); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:895:1: entryRuleCompositeSuperType returns [EObject current=null] : iv_ruleCompositeSuperType= ruleCompositeSuperType EOF ;
    public final EObject entryRuleCompositeSuperType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeSuperType = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:896:2: (iv_ruleCompositeSuperType= ruleCompositeSuperType EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:897:2: iv_ruleCompositeSuperType= ruleCompositeSuperType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeSuperTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeSuperType_in_entryRuleCompositeSuperType1663);
            iv_ruleCompositeSuperType=ruleCompositeSuperType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeSuperType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeSuperType1673); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:904:1: ruleCompositeSuperType returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? ) ;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:907:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:908:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:908:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:908:2: ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:908:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:909:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:909:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:910:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeSuperType1725);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:926:2: (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:926:4: otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCompositeSuperType1738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCompositeSuperTypeAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:930:1: ( (lv_templatesList_2_0= ruleTemplateReference ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:931:1: (lv_templatesList_2_0= ruleTemplateReference )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:931:1: (lv_templatesList_2_0= ruleTemplateReference )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:932:3: lv_templatesList_2_0= ruleTemplateReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getTemplatesListTemplateReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1759);
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

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:948:2: (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==21) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:948:4: otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleCompositeSuperType1772); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCompositeSuperTypeAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:952:1: ( (lv_templatesList_4_0= ruleTemplateReference ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:953:1: (lv_templatesList_4_0= ruleTemplateReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:953:1: (lv_templatesList_4_0= ruleTemplateReference )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:954:3: lv_templatesList_4_0= ruleTemplateReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getTemplatesListTemplateReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1793);
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

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleCompositeSuperType1807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCompositeSuperTypeAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:974:3: (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:974:5: otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleCompositeSuperType1822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompositeSuperTypeAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:978:1: ( (lv_argumentsList_7_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:979:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:979:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:980:3: lv_argumentsList_7_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1843);
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

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:996:2: (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==21) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:996:4: otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleCompositeSuperType1856); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getCompositeSuperTypeAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1000:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1001:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1001:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1002:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1877);
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

                    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleCompositeSuperType1891); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1030:1: entryRulePrimitiveSuperType returns [EObject current=null] : iv_rulePrimitiveSuperType= rulePrimitiveSuperType EOF ;
    public final EObject entryRulePrimitiveSuperType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveSuperType = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1031:2: (iv_rulePrimitiveSuperType= rulePrimitiveSuperType EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1032:2: iv_rulePrimitiveSuperType= rulePrimitiveSuperType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveSuperTypeRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveSuperType_in_entryRulePrimitiveSuperType1929);
            iv_rulePrimitiveSuperType=rulePrimitiveSuperType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveSuperType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveSuperType1939); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1039:1: rulePrimitiveSuperType returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? ) ;
    public final EObject rulePrimitiveSuperType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argumentsList_2_0 = null;

        EObject lv_argumentsList_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1042:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1043:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1043:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1043:2: ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1043:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1044:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1044:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1045:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveSuperType1991);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1061:2: (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1061:4: otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_rulePrimitiveSuperType2004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimitiveSuperTypeAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1065:1: ( (lv_argumentsList_2_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1066:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1066:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1067:3: lv_argumentsList_2_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2025);
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

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1083:2: (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==21) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1083:4: otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveSuperType2038); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getPrimitiveSuperTypeAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1087:1: ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1088:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1088:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1089:3: lv_argumentsList_4_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimitiveSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2059);
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

                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_rulePrimitiveSuperType2073); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1121:1: entryRuleHostedInterfaceDefinition returns [EObject current=null] : iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF ;
    public final EObject entryRuleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1122:2: (iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1123:2: iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition2115);
            iv_ruleHostedInterfaceDefinition=ruleHostedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition2125); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1130:1: ruleHostedInterfaceDefinition returns [EObject current=null] : (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) ;
    public final EObject ruleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ProvidedInterfaceDefinition_0 = null;

        EObject this_RequiredInterfaceDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1133:28: ( (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1134:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1134:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            int alt31=2;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA31_1 = input.LA(2);

                if ( (synpred37_InternalAdl()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
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
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1135:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getProvidedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition2175);
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1148:2: this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getRequiredInterfaceDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition2205);
                    this_RequiredInterfaceDefinition_1=ruleRequiredInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RequiredInterfaceDefinition_1; 
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1167:1: entryRuleProvidedInterfaceDefinition returns [EObject current=null] : iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF ;
    public final EObject entryRuleProvidedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1168:2: (iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1169:2: iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition2240);
            iv_ruleProvidedInterfaceDefinition=ruleProvidedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition2250); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1176:1: ruleProvidedInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) ;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1179:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1180:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1180:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1180:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1180:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==56) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1181:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1181:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1182:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition2296);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1198:3: ( (lv_role_1_0= 'provides' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1199:1: (lv_role_1_0= 'provides' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1199:1: (lv_role_1_0= 'provides' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1200:3: lv_role_1_0= 'provides'
            {
            lv_role_1_0=(Token)match(input,31,FOLLOW_31_in_ruleProvidedInterfaceDefinition2315); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1213:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1214:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1214:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1215:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition2355);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleProvidedInterfaceDefinition2367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProvidedInterfaceDefinitionAccess().getAsKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1235:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1236:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1236:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1237:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition2384); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1253:2: ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1253:3: ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1253:3: ( (lv_collection_5_0= '[' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1254:1: (lv_collection_5_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1254:1: (lv_collection_5_0= '[' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1255:3: lv_collection_5_0= '['
                    {
                    lv_collection_5_0=(Token)match(input,33,FOLLOW_33_in_ruleProvidedInterfaceDefinition2408); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1268:2: ( (lv_collectionsize_6_0= RULE_INT ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_INT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1269:1: (lv_collectionsize_6_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1269:1: (lv_collectionsize_6_0= RULE_INT )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1270:3: lv_collectionsize_6_0= RULE_INT
                            {
                            lv_collectionsize_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition2438); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleProvidedInterfaceDefinition2456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getProvidedInterfaceDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleProvidedInterfaceDefinition2470); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1302:1: entryRuleRequiredInterfaceDefinition returns [EObject current=null] : iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF ;
    public final EObject entryRuleRequiredInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1303:2: (iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1304:2: iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition2506);
            iv_ruleRequiredInterfaceDefinition=ruleRequiredInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition2516); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1311:1: ruleRequiredInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) ;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1314:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1315:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1315:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1315:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1315:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==56) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1316:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1316:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1317:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition2562);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1333:3: ( (lv_role_1_0= 'requires' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1334:1: (lv_role_1_0= 'requires' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1334:1: (lv_role_1_0= 'requires' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1335:3: lv_role_1_0= 'requires'
            {
            lv_role_1_0=(Token)match(input,35,FOLLOW_35_in_ruleRequiredInterfaceDefinition2581); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1348:2: ( (lv_optional_2_0= 'optional' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1349:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1349:1: (lv_optional_2_0= 'optional' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1350:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)match(input,36,FOLLOW_36_in_ruleRequiredInterfaceDefinition2612); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1363:3: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1364:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1364:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1365:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2653);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleRequiredInterfaceDefinition2665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRequiredInterfaceDefinitionAccess().getAsKeyword_4());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1385:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1386:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1386:1: (lv_name_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1387:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2682); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1403:2: ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1403:3: ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1403:3: ( (lv_collection_6_0= '[' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1404:1: (lv_collection_6_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1404:1: (lv_collection_6_0= '[' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1405:3: lv_collection_6_0= '['
                    {
                    lv_collection_6_0=(Token)match(input,33,FOLLOW_33_in_ruleRequiredInterfaceDefinition2706); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1418:2: ( (lv_collectionsize_7_0= RULE_INT ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_INT) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1419:1: (lv_collectionsize_7_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1419:1: (lv_collectionsize_7_0= RULE_INT )
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1420:3: lv_collectionsize_7_0= RULE_INT
                            {
                            lv_collectionsize_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2736); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleRequiredInterfaceDefinition2754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getRequiredInterfaceDefinitionAccess().getRightSquareBracketKeyword_6_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleRequiredInterfaceDefinition2768); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSubComponentDefinition"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1454:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1455:2: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1456:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2806);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition2816); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1463:1: ruleSubComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' ) ;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1466:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1467:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1467:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1467:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1467:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==56) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1468:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1468:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1469:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2862);
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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleSubComponentDefinition2875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1489:1: ( ( ruleQualifiedName ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1490:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1490:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1491:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2902);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1507:3: (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==20) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1507:5: otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSubComponentDefinition2916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSubComponentDefinitionAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1511:1: ( (lv_templatesList_4_0= ruleTemplateReference ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1512:1: (lv_templatesList_4_0= ruleTemplateReference )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1512:1: (lv_templatesList_4_0= ruleTemplateReference )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1513:3: lv_templatesList_4_0= ruleTemplateReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition2937);
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

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1529:2: (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==21) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1529:4: otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentDefinition2950); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1533:1: ( (lv_templatesList_6_0= ruleTemplateReference ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1534:1: (lv_templatesList_6_0= ruleTemplateReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1534:1: (lv_templatesList_6_0= ruleTemplateReference )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1535:3: lv_templatesList_6_0= ruleTemplateReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition2971);
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleSubComponentDefinition2985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSubComponentDefinitionAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1555:3: (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==29) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1555:5: otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleSubComponentDefinition3000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSubComponentDefinitionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1559:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1560:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1560:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1561:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition3021);
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

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1577:2: (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==21) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1577:4: otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentDefinition3034); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1581:1: ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1582:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1582:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1583:3: lv_argumentsList_11_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition3055);
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
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleSubComponentDefinition3069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSubComponentDefinitionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,32,FOLLOW_32_in_ruleSubComponentDefinition3083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getSubComponentDefinitionAccess().getAsKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1607:1: ( (lv_name_14_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1608:1: (lv_name_14_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1608:1: (lv_name_14_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1609:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubComponentDefinition3100); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1625:2: ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1626:1: (lv_bodyAnnotationsList_15_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1626:1: (lv_bodyAnnotationsList_15_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1627:3: lv_bodyAnnotationsList_15_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodyAnnotationsListAnnotationsListParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition3126);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1643:3: ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==19||(LA47_0>=26 && LA47_0<=27)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1644:1: ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1644:1: ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1645:1: (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1645:1: (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==19) ) {
                        alt46=1;
                    }
                    else if ( ((LA46_0>=26 && LA46_0<=27)) ) {
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
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1646:3: lv_body_16_1= ruleCompositeDefinition
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodyCompositeDefinitionParserRuleCall_8_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCompositeDefinition_in_ruleSubComponentDefinition3150);
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
                            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1661:8: lv_body_16_2= rulePrimitiveDefinition
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodyPrimitiveDefinitionParserRuleCall_8_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePrimitiveDefinition_in_ruleSubComponentDefinition3169);
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

            otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleSubComponentDefinition3185); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1693:1: entryRuleCompositeElement returns [EObject current=null] : iv_ruleCompositeElement= ruleCompositeElement EOF ;
    public final EObject entryRuleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeElement = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1694:2: (iv_ruleCompositeElement= ruleCompositeElement EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1695:2: iv_ruleCompositeElement= ruleCompositeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeElementRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement3223);
            iv_ruleCompositeElement=ruleCompositeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeElement3233); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1702:1: ruleCompositeElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ;
    public final EObject ruleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_SubComponentDefinition_1 = null;

        EObject this_BindingDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1705:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1706:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1706:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA48_1 = input.LA(2);

                if ( (synpred54_InternalAdl()) ) {
                    alt48=1;
                }
                else if ( (synpred55_InternalAdl()) ) {
                    alt48=2;
                }
                else if ( (true) ) {
                    alt48=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 35:
                {
                alt48=1;
                }
                break;
            case 37:
                {
                alt48=2;
                }
                break;
            case 38:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1707:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3283);
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1720:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getSubComponentDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3313);
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1733:2: this_BindingDefinition_2= ruleBindingDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getBindingDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3343);
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1752:1: entryRulePrimitiveElement returns [EObject current=null] : iv_rulePrimitiveElement= rulePrimitiveElement EOF ;
    public final EObject entryRulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveElement = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1753:2: (iv_rulePrimitiveElement= rulePrimitiveElement EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1754:2: iv_rulePrimitiveElement= rulePrimitiveElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveElementRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3378);
            iv_rulePrimitiveElement=rulePrimitiveElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveElement3388); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1761:1: rulePrimitiveElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) ;
    public final EObject rulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_ImplementationDefinition_1 = null;

        EObject this_AttributeDefinition_2 = null;

        EObject this_DataDefinition_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1764:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1765:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1765:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA49_1 = input.LA(2);

                if ( (synpred56_InternalAdl()) ) {
                    alt49=1;
                }
                else if ( (synpred57_InternalAdl()) ) {
                    alt49=2;
                }
                else if ( (synpred58_InternalAdl()) ) {
                    alt49=3;
                }
                else if ( (true) ) {
                    alt49=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 35:
                {
                alt49=1;
                }
                break;
            case 53:
                {
                alt49=2;
                }
                break;
            case 51:
                {
                alt49=3;
                }
                break;
            case 54:
                {
                alt49=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1766:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3438);
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1779:2: this_ImplementationDefinition_1= ruleImplementationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getImplementationDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3468);
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1792:2: this_AttributeDefinition_2= ruleAttributeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getAttributeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3498);
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1805:2: this_DataDefinition_3= ruleDataDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getDataDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3528);
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1824:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1825:2: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1826:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3563);
            iv_ruleBindingDefinition=ruleBindingDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition3573); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1833:1: ruleBindingDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) ;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1836:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1837:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1837:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1837:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1837:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==56) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1838:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1838:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1839:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition3619);
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

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleBindingDefinition3632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBindingDefinitionAccess().getBindsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1859:1: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            else if ( (LA51_0==39) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1859:2: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1859:2: ( (otherlv_2= RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1860:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1860:1: (otherlv_2= RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1861:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getBindingDefinitionAccess().getSourceParentSubComponentDefinitionCrossReference_2_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1876:6: ( (lv_isSrcParentThis_3_0= 'this' ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1876:6: ( (lv_isSrcParentThis_3_0= 'this' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1877:1: (lv_isSrcParentThis_3_0= 'this' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1877:1: (lv_isSrcParentThis_3_0= 'this' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1878:3: lv_isSrcParentThis_3_0= 'this'
                    {
                    lv_isSrcParentThis_3_0=(Token)match(input,39,FOLLOW_39_in_ruleBindingDefinition3681); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleBindingDefinition3707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1895:1: ( (otherlv_5= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1896:1: (otherlv_5= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1896:1: (otherlv_5= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1897:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getBindingDefinitionAccess().getSourceInterfaceHostedInterfaceDefinitionCrossReference_4_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1911:2: (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==33) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1911:4: otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleBindingDefinition3744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1915:1: ( (lv_sourceIndex_7_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1916:1: (lv_sourceIndex_7_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1916:1: (lv_sourceIndex_7_0= RULE_INT )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1917:3: lv_sourceIndex_7_0= RULE_INT
                    {
                    lv_sourceIndex_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition3761); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleBindingDefinition3778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleBindingDefinition3792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getBindingDefinitionAccess().getToKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1941:1: ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            else if ( (LA53_0==39) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1941:2: ( (otherlv_10= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1941:2: ( (otherlv_10= RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1942:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1942:1: (otherlv_10= RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1943:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getBindingDefinitionAccess().getTargetParentSubComponentDefinitionCrossReference_7_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1958:6: ( (lv_isTgtParentThis_11_0= 'this' ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1958:6: ( (lv_isTgtParentThis_11_0= 'this' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1959:1: (lv_isTgtParentThis_11_0= 'this' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1959:1: (lv_isTgtParentThis_11_0= 'this' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1960:3: lv_isTgtParentThis_11_0= 'this'
                    {
                    lv_isTgtParentThis_11_0=(Token)match(input,39,FOLLOW_39_in_ruleBindingDefinition3841); if (state.failed) return current;
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

            otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleBindingDefinition3867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_8());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1977:1: ( (otherlv_13= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1978:1: (otherlv_13= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1978:1: (otherlv_13= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1979:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getBindingDefinitionAccess().getTargetInterfaceHostedInterfaceDefinitionCrossReference_9_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1993:2: (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==33) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1993:4: otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']'
                    {
                    otherlv_14=(Token)match(input,33,FOLLOW_33_in_ruleBindingDefinition3904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_10_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1997:1: ( (lv_targetIndex_15_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1998:1: (lv_targetIndex_15_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1998:1: (lv_targetIndex_15_0= RULE_INT )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1999:3: lv_targetIndex_15_0= RULE_INT
                    {
                    lv_targetIndex_15_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition3921); if (state.failed) return current;
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

                    otherlv_16=(Token)match(input,34,FOLLOW_34_in_ruleBindingDefinition3938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_10_2());
                          
                    }

                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleBindingDefinition3952); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2031:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2032:2: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2033:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument3988);
            iv_ruleFormalArgument=ruleFormalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument3998); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2040:1: ruleFormalArgument returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2043:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2044:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2044:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2045:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2045:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2046:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument4039); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2070:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2071:2: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2072:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentsListRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList4079);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList4089); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2079:1: ruleFormalArgumentsList returns [EObject current=null] : (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalArguments_1_0 = null;

        EObject lv_formalArguments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2082:28: ( (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2083:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2083:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2083:3: otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFormalArgumentsList4126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2087:1: ( (lv_formalArguments_1_0= ruleFormalArgument ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2088:1: (lv_formalArguments_1_0= ruleFormalArgument )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2088:1: (lv_formalArguments_1_0= ruleFormalArgument )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2089:3: lv_formalArguments_1_0= ruleFormalArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4147);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2105:2: (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==21) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2105:4: otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFormalArgumentsList4160); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2109:1: ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2110:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2110:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2111:3: lv_formalArguments_3_0= ruleFormalArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4181);
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
            	    break loop55;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleFormalArgumentsList4195); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2139:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2140:2: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2141:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier4231);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier4241); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2148:1: ruleTemplateSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2151:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2152:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2152:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2152:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2152:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2153:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2153:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2154:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier4283); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleTemplateSpecifier4300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2174:1: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2175:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2175:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2176:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4327);
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2200:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2201:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2202:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType4364);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType4375); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2209:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2212:28: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2213:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2213:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt56=1;
                }
                break;
            case 44:
                {
                alt56=2;
                }
                break;
            case 45:
                {
                alt56=3;
                }
                break;
            case RULE_ID:
                {
                alt56=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2214:2: kw= 'STRUCT'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleAttributeType4413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2221:2: kw= 'UNION'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleAttributeType4432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2228:2: kw= 'ENUM'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleAttributeType4451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getENUMKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2234:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeType4472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_3, grammarAccess.getAttributeTypeAccess().getIDTerminalRuleCall_3()); 
                          
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2249:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2250:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2251:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FOLLOW_rulesignedINT_in_entryRulesignedINT4518);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesignedINT4529); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2258:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2261:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2262:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2262:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2262:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2262:2: (kw= '+' | kw= '-' )?
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==46) ) {
                alt57=1;
            }
            else if ( (LA57_0==47) ) {
                alt57=2;
            }
            switch (alt57) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2263:2: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_rulesignedINT4568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2270:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_rulesignedINT4587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesignedINT4604); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2290:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2291:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2292:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4650);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4661); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2299:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_HEXADECIMAL_TYPE_2=null;
        Token this_STRING_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2302:28: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | kw= 'null' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2303:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | kw= 'null' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2303:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | kw= 'null' )
            int alt58=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt58=1;
                }
                break;
            case RULE_INT:
            case 46:
            case 47:
                {
                alt58=2;
                }
                break;
            case RULE_HEXADECIMAL_TYPE:
                {
                alt58=3;
                }
                break;
            case RULE_STRING:
                {
                alt58=4;
                }
                break;
            case 48:
                {
                alt58=5;
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2303:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue4701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2312:5: this_signedINT_1= rulesignedINT
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulesignedINT_in_ruleValue4734);
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2323:10: this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE
                    {
                    this_HEXADECIMAL_TYPE_2=(Token)match(input,RULE_HEXADECIMAL_TYPE,FOLLOW_RULE_HEXADECIMAL_TYPE_in_ruleValue4760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEXADECIMAL_TYPE_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXADECIMAL_TYPE_2, grammarAccess.getValueAccess().getHEXADECIMAL_TYPETerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2331:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue4786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2340:2: kw= 'null'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleValue4810); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2353:1: entryRuleValueList returns [EObject current=null] : iv_ruleValueList= ruleValueList EOF ;
    public final EObject entryRuleValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueList = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2354:2: (iv_ruleValueList= ruleValueList EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2355:2: iv_ruleValueList= ruleValueList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueListRule()); 
            }
            pushFollow(FOLLOW_ruleValueList_in_entryRuleValueList4850);
            iv_ruleValueList=ruleValueList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueList4860); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2362:1: ruleValueList returns [EObject current=null] : (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleValueList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_member_1_0 = null;

        AntlrDatatypeRuleToken lv_member_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2365:28: ( (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2366:1: (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2366:1: (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2366:3: otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleValueList4897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getValueListAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2370:1: ( (lv_member_1_0= ruleValue ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2371:1: (lv_member_1_0= ruleValue )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2371:1: (lv_member_1_0= ruleValue )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2372:3: lv_member_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueListAccess().getMemberValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleValueList4918);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2388:2: (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==21) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2388:4: otherlv_2= ',' ( (lv_member_3_0= ruleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleValueList4931); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getValueListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2392:1: ( (lv_member_3_0= ruleValue ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2393:1: (lv_member_3_0= ruleValue )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2393:1: (lv_member_3_0= ruleValue )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2394:3: lv_member_3_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValueListAccess().getMemberValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleValueList4952);
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
            	    break loop59;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleValueList4966); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2422:1: entryRuleTemplateReference returns [EObject current=null] : iv_ruleTemplateReference= ruleTemplateReference EOF ;
    public final EObject entryRuleTemplateReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateReference = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2423:2: (iv_ruleTemplateReference= ruleTemplateReference EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2424:2: iv_ruleTemplateReference= ruleTemplateReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateReference_in_entryRuleTemplateReference5002);
            iv_ruleTemplateReference=ruleTemplateReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateReference5012); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2431:1: ruleTemplateReference returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? ) ;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2434:28: ( ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2435:1: ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2435:1: ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2435:2: ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )?
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2435:2: ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==42) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2435:3: ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2435:3: ( (lv_name_0_0= ruleTemplateSpecifier ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2436:1: (lv_name_0_0= ruleTemplateSpecifier )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2436:1: (lv_name_0_0= ruleTemplateSpecifier )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2437:3: lv_name_0_0= ruleTemplateSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getNameTemplateSpecifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateReference5059);
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

                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleTemplateReference5071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTemplateReferenceAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2457:3: ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==50) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2457:4: ( ( ruleQualifiedName ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2457:4: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2458:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2458:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2459:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateReference5101);
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2476:6: ( (lv_anyTypeReference_3_0= '?' ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2476:6: ( (lv_anyTypeReference_3_0= '?' ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2477:1: (lv_anyTypeReference_3_0= '?' )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2477:1: (lv_anyTypeReference_3_0= '?' )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2478:3: lv_anyTypeReference_3_0= '?'
                    {
                    lv_anyTypeReference_3_0=(Token)match(input,50,FOLLOW_50_in_ruleTemplateReference5125); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2491:3: (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==20) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2491:5: otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTemplateReference5152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTemplateReferenceAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2495:1: ( (lv_templatesList_5_0= ruleTemplateReference ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2496:1: (lv_templatesList_5_0= ruleTemplateReference )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2496:1: (lv_templatesList_5_0= ruleTemplateReference )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2497:3: lv_templatesList_5_0= ruleTemplateReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getTemplatesListTemplateReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateReference_in_ruleTemplateReference5173);
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

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2513:2: (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==21) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2513:4: otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleTemplateReference5186); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getTemplateReferenceAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2517:1: ( (lv_templatesList_7_0= ruleTemplateReference ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2518:1: (lv_templatesList_7_0= ruleTemplateReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2518:1: (lv_templatesList_7_0= ruleTemplateReference )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2519:3: lv_templatesList_7_0= ruleTemplateReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getTemplatesListTemplateReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateReference_in_ruleTemplateReference5207);
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
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleTemplateReference5221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTemplateReferenceAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2539:3: (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==29) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2539:5: otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')'
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleTemplateReference5236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTemplateReferenceAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2543:1: ( (lv_argumentsList_10_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2544:1: (lv_argumentsList_10_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2544:1: (lv_argumentsList_10_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2545:3: lv_argumentsList_10_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getArgumentsListArgumentDefinitionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference5257);
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

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2561:2: (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==21) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2561:4: otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleTemplateReference5270); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getTemplateReferenceAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2565:1: ( (lv_argumentsList_12_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2566:1: (lv_argumentsList_12_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2566:1: (lv_argumentsList_12_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2567:3: lv_argumentsList_12_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getArgumentsListArgumentDefinitionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference5291);
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleTemplateReference5305); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2595:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2596:2: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2597:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5343);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition5353); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2604:1: ruleArgumentDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_argumentValue_2_0 = null;

        EObject lv_argumentList_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2607:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2608:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2608:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2608:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2608:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==49) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2608:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2608:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2609:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2609:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2610:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition5396); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleArgumentDefinition5413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2630:3: ( ( (lv_argumentValue_2_0= ruleValue ) ) | ( (lv_argumentList_3_0= ruleValueList ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_STRING)||(LA67_0>=46 && LA67_0<=48)) ) {
                alt67=1;
            }
            else if ( (LA67_0==24) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2630:4: ( (lv_argumentValue_2_0= ruleValue ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2630:4: ( (lv_argumentValue_2_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2631:1: (lv_argumentValue_2_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2631:1: (lv_argumentValue_2_0= ruleValue )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2632:3: lv_argumentValue_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5437);
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2649:6: ( (lv_argumentList_3_0= ruleValueList ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2649:6: ( (lv_argumentList_3_0= ruleValueList ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2650:1: (lv_argumentList_3_0= ruleValueList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2650:1: (lv_argumentList_3_0= ruleValueList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2651:3: lv_argumentList_3_0= ruleValueList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentListValueListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueList_in_ruleArgumentDefinition5464);
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2675:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2676:2: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2677:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5501);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition5511); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2684:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )? ( (lv_cType_4_0= ruleAttributeType ) )? ( (lv_type_5_0= RULE_ID ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= ';' ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_type_5_0=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_headerFile_2_0 = null;

        AntlrDatatypeRuleToken lv_cType_4_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2687:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )? ( (lv_cType_4_0= ruleAttributeType ) )? ( (lv_type_5_0= RULE_ID ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2688:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )? ( (lv_cType_4_0= ruleAttributeType ) )? ( (lv_type_5_0= RULE_ID ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2688:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )? ( (lv_cType_4_0= ruleAttributeType ) )? ( (lv_type_5_0= RULE_ID ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2688:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )? ( (lv_cType_4_0= ruleAttributeType ) )? ( (lv_type_5_0= RULE_ID ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2688:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==56) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2689:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2689:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2690:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition5557);
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

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleAttributeDefinition5570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2710:1: ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==RULE_SL||LA69_1==40||LA69_1==52) ) {
                    alt69=1;
                }
            }
            else if ( (LA69_0==RULE_SL||LA69_0==40||LA69_0==55) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2710:2: ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':'
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2710:2: ( (lv_headerFile_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2711:1: (lv_headerFile_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2711:1: (lv_headerFile_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2712:3: lv_headerFile_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getHeaderFileFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleAttributeDefinition5592);
                    lv_headerFile_2_0=ruleFileC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"headerFile",
                              		lv_headerFile_2_0, 
                              		"FileC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleAttributeDefinition5604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2732:3: ( (lv_cType_4_0= ruleAttributeType ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=43 && LA70_0<=45)) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_ID) ) {
                int LA70_2 = input.LA(2);

                if ( (synpred85_InternalAdl()) ) {
                    alt70=1;
                }
            }
            switch (alt70) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2733:1: (lv_cType_4_0= ruleAttributeType )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2733:1: (lv_cType_4_0= ruleAttributeType )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2734:3: lv_cType_4_0= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getCTypeAttributeTypeParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5627);
                    lv_cType_4_0=ruleAttributeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"cType",
                              		lv_cType_4_0, 
                              		"AttributeType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2750:3: ( (lv_type_5_0= RULE_ID ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==RULE_ID) ) {
                    alt71=1;
                }
            }
            switch (alt71) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2751:1: (lv_type_5_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2751:1: (lv_type_5_0= RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2752:3: lv_type_5_0= RULE_ID
                    {
                    lv_type_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_5_0, grammarAccess.getAttributeDefinitionAccess().getTypeIDTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2768:3: ( (lv_name_6_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2769:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2769:1: (lv_name_6_0= RULE_ID )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2770:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_6_0, grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2786:2: (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==49) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2786:4: otherlv_7= '=' ( (lv_value_8_0= ruleValue ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleAttributeDefinition5686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2790:1: ( (lv_value_8_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2791:1: (lv_value_8_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2791:1: (lv_value_8_0= ruleValue )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2792:3: lv_value_8_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition5707);
                    lv_value_8_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_8_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleAttributeDefinition5721); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_7());
                  
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2820:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2821:2: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2822:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5757);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition5767); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2829:1: ruleImplementationDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2832:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2833:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2833:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2833:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2833:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==56) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2834:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2834:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2835:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5813);
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

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleImplementationDefinition5826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2855:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID||LA74_0==RULE_SL||LA74_0==40||LA74_0==55) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_CODE_C) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2855:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2855:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2856:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2856:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2857:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleImplementationDefinition5848);
                    lv_fileC_2_0=ruleFileC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"fileC",
                              		lv_fileC_2_0, 
                              		"FileC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2874:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2874:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2875:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2875:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2876:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5875);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleImplementationDefinition5888); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2904:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2905:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2906:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5924);
            iv_ruleDataDefinition=ruleDataDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition5934); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2913:1: ruleDataDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2916:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2917:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2917:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2917:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2917:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==56) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2918:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2918:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2919:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5980);
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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleDataDefinition5993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataDefinitionAccess().getDataKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2939:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID||LA76_0==RULE_SL||LA76_0==40||LA76_0==55) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_CODE_C) ) {
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2939:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2939:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2940:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2940:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2941:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleDataDefinition6015);
                    lv_fileC_2_0=ruleFileC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"fileC",
                              		lv_fileC_2_0, 
                              		"FileC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2958:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2958:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2959:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2959:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2960:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition6042);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDataDefinition6055); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2988:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2989:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2990:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6092);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName6103); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2997:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3000:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3001:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3001:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3001:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3008:1: (kw= '.' this_ID_2= RULE_ID )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==40) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3009:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleQualifiedName6162); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6177); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop77;
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


    // $ANTLR start "entryRuleFileC"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3029:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3030:2: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3031:2: iv_ruleFileC= ruleFileC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileCRule()); 
            }
            pushFollow(FOLLOW_ruleFileC_in_entryRuleFileC6224);
            iv_ruleFileC=ruleFileC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileC6234); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFileC"


    // $ANTLR start "ruleFileC"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3038:1: ruleFileC returns [EObject current=null] : ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_directory_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3041:28: ( ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3042:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3042:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3042:2: ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3042:2: ( (lv_directory_0_0= rulePath ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==RULE_SL) ) {
                    alt78=1;
                }
            }
            else if ( (LA78_0==RULE_SL||LA78_0==40||LA78_0==55) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3043:1: (lv_directory_0_0= rulePath )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3043:1: (lv_directory_0_0= rulePath )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3044:3: lv_directory_0_0= rulePath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFileCAccess().getDirectoryPathParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePath_in_ruleFileC6280);
                    lv_directory_0_0=rulePath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFileCRule());
                      	        }
                             		set(
                             			current, 
                             			"directory",
                              		lv_directory_0_0, 
                              		"Path");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3060:3: ( (lv_name_1_0= ruleFileName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3061:1: (lv_name_1_0= ruleFileName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3061:1: (lv_name_1_0= ruleFileName )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3062:3: lv_name_1_0= ruleFileName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFileCAccess().getNameFileNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFileName_in_ruleFileC6302);
            lv_name_1_0=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFileCRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"FileName");
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
    // $ANTLR end "ruleFileC"


    // $ANTLR start "entryRuleInlineCodeC"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3086:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3087:2: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3088:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineCodeCRule()); 
            }
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6338);
            iv_ruleInlineCodeC=ruleInlineCodeC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC6348); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3095:1: ruleInlineCodeC returns [EObject current=null] : ( (lv_codeC_0_0= RULE_CODE_C ) ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3098:28: ( ( (lv_codeC_0_0= RULE_CODE_C ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3099:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3099:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3100:1: (lv_codeC_0_0= RULE_CODE_C )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3100:1: (lv_codeC_0_0= RULE_CODE_C )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3101:3: lv_codeC_0_0= RULE_CODE_C
            {
            lv_codeC_0_0=(Token)match(input,RULE_CODE_C,FOLLOW_RULE_CODE_C_in_ruleInlineCodeC6389); if (state.failed) return current;
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


    // $ANTLR start "entryRulePath"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3125:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3126:2: (iv_rulePath= rulePath EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3127:2: iv_rulePath= rulePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_rulePath_in_entryRulePath6430);
            iv_rulePath=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePath6441); if (state.failed) return current;

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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3134:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_SL_3=null;
        Token this_ID_4=null;
        Token this_SL_7=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3137:28: ( ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3138:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3138:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3138:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3138:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )?
            int alt79=4;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt79=1;
                    }
                    break;
                case 40:
                    {
                    alt79=2;
                    }
                    break;
                case 55:
                    {
                    alt79=3;
                    }
                    break;
            }

            switch (alt79) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3138:7: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath6482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getPathAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3147:2: kw= '.'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_rulePath6506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3154:2: kw= '..'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_rulePath6525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopFullStopKeyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3159:3: (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RULE_SL) ) {
                    int LA83_1 = input.LA(2);

                    if ( (LA83_1==RULE_ID) ) {
                        int LA83_2 = input.LA(3);

                        if ( (LA83_2==RULE_ID||LA83_2==RULE_SL||LA83_2==47) ) {
                            alt83=1;
                        }


                    }
                    else if ( (LA83_1==RULE_SL||LA83_1==55) ) {
                        alt83=1;
                    }


                }


                switch (alt83) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3159:8: this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    {
            	    this_SL_3=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath6543); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SL_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SL_3, grammarAccess.getPathAccess().getSLTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3166:1: ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==RULE_ID||LA82_0==RULE_SL) ) {
            	        alt82=1;
            	    }
            	    else if ( (LA82_0==55) ) {
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
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3166:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            {
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3166:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            loop81:
            	            do {
            	                int alt81=2;
            	                int LA81_0 = input.LA(1);

            	                if ( (LA81_0==RULE_ID) ) {
            	                    alt81=1;
            	                }


            	                switch (alt81) {
            	            	case 1 :
            	            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3166:7: this_ID_4= RULE_ID (kw= '-' )?
            	            	    {
            	            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath6565); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      		current.merge(this_ID_4);
            	            	          
            	            	    }
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	          newLeafNode(this_ID_4, grammarAccess.getPathAccess().getIDTerminalRuleCall_1_1_0_0()); 
            	            	          
            	            	    }
            	            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3173:1: (kw= '-' )?
            	            	    int alt80=2;
            	            	    int LA80_0 = input.LA(1);

            	            	    if ( (LA80_0==47) ) {
            	            	        alt80=1;
            	            	    }
            	            	    switch (alt80) {
            	            	        case 1 :
            	            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3174:2: kw= '-'
            	            	            {
            	            	            kw=(Token)match(input,47,FOLLOW_47_in_rulePath6584); if (state.failed) return current;
            	            	            if ( state.backtracking==0 ) {

            	            	                      current.merge(kw);
            	            	                      newLeafNode(kw, grammarAccess.getPathAccess().getHyphenMinusKeyword_1_1_0_1()); 
            	            	                  
            	            	            }

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop81;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3181:2: kw= '..'
            	            {
            	            kw=(Token)match(input,55,FOLLOW_55_in_rulePath6607); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getPathAccess().getFullStopFullStopKeyword_1_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            this_SL_7=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath6625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SL_7);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SL_7, grammarAccess.getPathAccess().getSLTerminalRuleCall_2()); 
                  
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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleFileName"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3201:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3202:2: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3203:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FOLLOW_ruleFileName_in_entryRuleFileName6671);
            iv_ruleFileName=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileName6682); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFileName"


    // $ANTLR start "ruleFileName"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3210:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3213:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3214:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3214:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3214:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3221:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==40) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3222:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleFileName6741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFileNameAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_2, grammarAccess.getFileNameAccess().getIDTerminalRuleCall_1_1()); 
                          
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
    // $ANTLR end "ruleFileName"


    // $ANTLR start "entryRuleAnnotationsList"
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3242:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3243:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3244:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsListRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6803);
            iv_ruleAnnotationsList=ruleAnnotationsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationsList6813); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3251:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3254:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3255:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3255:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3255:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3255:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3256:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3256:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3257:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList6859);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3273:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==56) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3274:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3274:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3275:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList6880);
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
            	    break loop85;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3299:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3300:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3301:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6917);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6927); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3308:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) ;
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
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3311:28: ( (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3312:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3312:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3312:3: otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleAnnotation6964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3316:1: ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3317:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3317:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3318:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3318:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            int alt86=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt86=1;
                }
                break;
            case 58:
                {
                alt86=2;
                }
                break;
            case 59:
                {
                alt86=3;
                }
                break;
            case 60:
                {
                alt86=4;
                }
                break;
            case RULE_ID:
                {
                alt86=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3319:3: lv_name_1_1= 'Override'
                    {
                    lv_name_1_1=(Token)match(input,57,FOLLOW_57_in_ruleAnnotation6984); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3331:8: lv_name_1_2= 'Singleton'
                    {
                    lv_name_1_2=(Token)match(input,58,FOLLOW_58_in_ruleAnnotation7013); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3343:8: lv_name_1_3= 'LDFlags'
                    {
                    lv_name_1_3=(Token)match(input,59,FOLLOW_59_in_ruleAnnotation7042); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3355:8: lv_name_1_4= 'CFlags'
                    {
                    lv_name_1_4=(Token)match(input,60,FOLLOW_60_in_ruleAnnotation7071); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3367:8: lv_name_1_5= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameQualifiedNameParserRuleCall_1_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnnotation7103);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3385:2: (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==29) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3385:4: otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleAnnotation7119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3389:1: ( (lv_annotationElements_3_0= ruleAnnotationElement ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3390:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3390:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3391:3: lv_annotationElements_3_0= ruleAnnotationElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7140);
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

                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3407:2: (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==21) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3407:4: otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAnnotation7153); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3411:1: ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3412:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    {
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3412:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3413:3: lv_annotationElements_5_0= ruleAnnotationElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7174);
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
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleAnnotation7188); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3441:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3442:2: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3443:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationElementRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7226);
            iv_ruleAnnotationElement=ruleAnnotationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement7236); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3450:1: ruleAnnotationElement returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_elementValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3453:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3454:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3454:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3454:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3454:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==49) ) {
                    alt89=1;
                }
            }
            switch (alt89) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3454:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3454:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3455:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3455:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3456:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement7279); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleAnnotationElement7296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3476:3: ( (lv_elementValue_2_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3477:1: (lv_elementValue_2_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3477:1: (lv_elementValue_2_0= ruleElementValue )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3478:3: lv_elementValue_2_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement7319);
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3502:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3503:2: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3504:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueRule()); 
            }
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue7355);
            iv_ruleElementValue=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue7365); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3511:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3514:28: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3515:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3515:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt90=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt90=1;
                }
                break;
            case 56:
                {
                alt90=2;
                }
                break;
            case 24:
                {
                alt90=3;
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3516:2: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue7415);
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3529:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue7445);
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
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3542:2: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7475);
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3561:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3562:2: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3563:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueArrayInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7510);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7520); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3570:1: ruleElementValueArrayInitializer returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3573:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3574:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3574:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3574:3: otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleElementValueArrayInitializer7557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3578:1: ( (lv_values_1_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3579:1: (lv_values_1_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3579:1: (lv_values_1_0= ruleElementValue )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3580:3: lv_values_1_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7578);
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

            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3596:2: (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==21) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3596:4: otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleElementValueArrayInitializer7591); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3600:1: ( (lv_values_3_0= ruleElementValue ) )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3601:1: (lv_values_3_0= ruleElementValue )
            	    {
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3601:1: (lv_values_3_0= ruleElementValue )
            	    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3602:3: lv_values_3_0= ruleElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7612);
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
            	    break loop91;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleElementValueArrayInitializer7626); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3630:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3631:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3632:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue7662);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue7672); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3639:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstantFormat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3642:28: ( ( (lv_value_0_0= ruleConstantFormat ) ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3643:1: ( (lv_value_0_0= ruleConstantFormat ) )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3643:1: ( (lv_value_0_0= ruleConstantFormat ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3644:1: (lv_value_0_0= ruleConstantFormat )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3644:1: (lv_value_0_0= ruleConstantFormat )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3645:3: lv_value_0_0= ruleConstantFormat
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue7717);
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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3669:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3670:2: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3671:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantFormatRule()); 
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7753);
            iv_ruleConstantFormat=ruleConstantFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat7764); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3678:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3681:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) )
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3682:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            {
            // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3682:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            int alt92=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt92=1;
                }
                break;
            case RULE_STRING:
                {
                alt92=2;
                }
                break;
            case RULE_ID:
                {
                alt92=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3682:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat7804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3690:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat7830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getConstantFormatAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:3698:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantFormat7856); if (state.failed) return current;
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

    // $ANTLR start synpred22_InternalAdl
    public final void synpred22_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_10_1 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:674:3: (lv_elements_10_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:674:3: lv_elements_10_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_7_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred22_InternalAdl1277);
        lv_elements_10_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalAdl

    // $ANTLR start synpred23_InternalAdl
    public final void synpred23_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_10_2 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:689:8: (lv_elements_10_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:689:8: lv_elements_10_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_7_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred23_InternalAdl1296);
        lv_elements_10_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalAdl

    // $ANTLR start synpred24_InternalAdl
    public final void synpred24_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_10_3 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:704:8: (lv_elements_10_3= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:704:8: lv_elements_10_3= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_7_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred24_InternalAdl1315);
        lv_elements_10_3=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalAdl

    // $ANTLR start synpred25_InternalAdl
    public final void synpred25_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_10_4 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:719:8: (lv_elements_10_4= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:719:8: lv_elements_10_4= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_7_0_3()); 
          	    
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred25_InternalAdl1334);
        lv_elements_10_4=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalAdl

    // $ANTLR start synpred29_InternalAdl
    public final void synpred29_InternalAdl_fragment() throws RecognitionException {   
        EObject lv_elements_7_1 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:850:3: (lv_elements_7_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:850:3: lv_elements_7_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_4_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred29_InternalAdl1592);
        lv_elements_7_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalAdl

    // $ANTLR start synpred37_InternalAdl
    public final void synpred37_InternalAdl_fragment() throws RecognitionException {   
        EObject this_ProvidedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1135:2: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1135:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred37_InternalAdl2175);
        this_ProvidedInterfaceDefinition_0=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalAdl

    // $ANTLR start synpred54_InternalAdl
    public final void synpred54_InternalAdl_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1707:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1707:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred54_InternalAdl3283);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalAdl

    // $ANTLR start synpred55_InternalAdl
    public final void synpred55_InternalAdl_fragment() throws RecognitionException {   
        EObject this_SubComponentDefinition_1 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1720:2: (this_SubComponentDefinition_1= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1720:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred55_InternalAdl3313);
        this_SubComponentDefinition_1=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalAdl

    // $ANTLR start synpred56_InternalAdl
    public final void synpred56_InternalAdl_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1766:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1766:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred56_InternalAdl3438);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalAdl

    // $ANTLR start synpred57_InternalAdl
    public final void synpred57_InternalAdl_fragment() throws RecognitionException {   
        EObject this_ImplementationDefinition_1 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1779:2: (this_ImplementationDefinition_1= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1779:2: this_ImplementationDefinition_1= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred57_InternalAdl3468);
        this_ImplementationDefinition_1=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalAdl

    // $ANTLR start synpred58_InternalAdl
    public final void synpred58_InternalAdl_fragment() throws RecognitionException {   
        EObject this_AttributeDefinition_2 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1792:2: (this_AttributeDefinition_2= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:1792:2: this_AttributeDefinition_2= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred58_InternalAdl3498);
        this_AttributeDefinition_2=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalAdl

    // $ANTLR start synpred85_InternalAdl
    public final void synpred85_InternalAdl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_cType_4_0 = null;


        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2733:1: ( (lv_cType_4_0= ruleAttributeType ) )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2733:1: (lv_cType_4_0= ruleAttributeType )
        {
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2733:1: (lv_cType_4_0= ruleAttributeType )
        // ../org.ow2.mindEd.adl/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalAdl.g:2734:3: lv_cType_4_0= ruleAttributeType
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getCTypeAttributeTypeParserRuleCall_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAttributeType_in_synpred85_InternalAdl5627);
        lv_cType_4_0=ruleAttributeType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred85_InternalAdl

    // Delegated rules

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
    public final boolean synpred85_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalAdl_fragment(); // can never throw exception
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
    public final boolean synpred22_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalAdl_fragment(); // can never throw exception
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
    public final boolean synpred54_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalAdl_fragment(); // can never throw exception
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
    public final boolean synpred23_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalAdl_fragment(); // can never throw exception
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
    public final boolean synpred37_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalAdl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalAdl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalAdl_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlFile137 = new BitSet(new long[]{0x010000001C090000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAdlFile159 = new BitSet(new long[]{0x010000001C080000L});
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
    public static final BitSet FOLLOW_24_in_ruleCompositeDefinition903 = new BitSet(new long[]{0x0100006882000000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleCompositeDefinition926 = new BitSet(new long[]{0x0100006882000000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleCompositeDefinition945 = new BitSet(new long[]{0x0100006882000000L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition964 = new BitSet(new long[]{0x0100006882000000L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition983 = new BitSet(new long[]{0x0100006882000000L});
    public static final BitSet FOLLOW_25_in_ruleCompositeDefinition999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition1035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinition1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveDefinition1100 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePrimitiveDefinition1126 = new BitSet(new long[]{0x0000000021800010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1147 = new BitSet(new long[]{0x0000000021800000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1169 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_rulePrimitiveDefinition1183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1204 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveDefinition1217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1238 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveDefinition1254 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1277 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1296 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1315 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1334 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1353 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_25_in_rulePrimitiveDefinition1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTypeDefinition1452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1473 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleTypeDefinition1486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1513 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_ruleTypeDefinition1526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1553 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_ruleTypeDefinition1569 = new BitSet(new long[]{0x0100000882000000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1592 = new BitSet(new long[]{0x0100000882000000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1611 = new BitSet(new long[]{0x0100000882000000L});
    public static final BitSet FOLLOW_25_in_ruleTypeDefinition1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSuperType_in_entryRuleCompositeSuperType1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeSuperType1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeSuperType1725 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeSuperType1738 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1759 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeSuperType1772 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1793 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeSuperType1807 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleCompositeSuperType1822 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1843 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeSuperType1856 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1877 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleCompositeSuperType1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSuperType_in_entryRulePrimitiveSuperType1929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveSuperType1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveSuperType1991 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rulePrimitiveSuperType2004 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2025 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveSuperType2038 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2059 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_rulePrimitiveSuperType2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition2115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition2240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition2296 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleProvidedInterfaceDefinition2315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition2355 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleProvidedInterfaceDefinition2367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition2384 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleProvidedInterfaceDefinition2408 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition2438 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleProvidedInterfaceDefinition2456 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProvidedInterfaceDefinition2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition2506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition2562 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRequiredInterfaceDefinition2581 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleRequiredInterfaceDefinition2612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2653 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRequiredInterfaceDefinition2665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2682 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleRequiredInterfaceDefinition2706 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2736 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRequiredInterfaceDefinition2754 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRequiredInterfaceDefinition2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2862 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSubComponentDefinition2875 = new BitSet(new long[]{0x0000000120100010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2902 = new BitSet(new long[]{0x0000000120100000L});
    public static final BitSet FOLLOW_20_in_ruleSubComponentDefinition2916 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition2937 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentDefinition2950 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition2971 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleSubComponentDefinition2985 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_29_in_ruleSubComponentDefinition3000 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition3021 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentDefinition3034 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition3055 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleSubComponentDefinition3069 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSubComponentDefinition3083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubComponentDefinition3100 = new BitSet(new long[]{0x010000000C0A0000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition3126 = new BitSet(new long[]{0x000000000C0A0000L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_ruleSubComponentDefinition3150 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_ruleSubComponentDefinition3169 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSubComponentDefinition3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement3223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeElement3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveElement3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition3619 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBindingDefinition3632 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3657 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39_in_ruleBindingDefinition3681 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleBindingDefinition3707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3731 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition3744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition3761 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition3778 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleBindingDefinition3792 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3817 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39_in_ruleBindingDefinition3841 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleBindingDefinition3867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3891 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition3904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition3921 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition3938 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBindingDefinition3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument3988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList4079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFormalArgumentsList4126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4147 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleFormalArgumentsList4160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4181 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleFormalArgumentsList4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier4231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier4283 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleTemplateSpecifier4300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType4364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAttributeType4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAttributeType4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAttributeType4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT4518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignedINT4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulesignedINT4568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_47_in_rulesignedINT4587 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_ruleValue4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXADECIMAL_TYPE_in_ruleValue4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValue4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueList_in_entryRuleValueList4850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueList4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValueList4897 = new BitSet(new long[]{0x0001C000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueList4918 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleValueList4931 = new BitSet(new long[]{0x0001C000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueList4952 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleValueList4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_entryRuleTemplateReference5002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateReference5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateReference5059 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTemplateReference5071 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateReference5101 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_50_in_ruleTemplateReference5125 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_20_in_ruleTemplateReference5152 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleTemplateReference5173 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleTemplateReference5186 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleTemplateReference5207 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleTemplateReference5221 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTemplateReference5236 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference5257 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleTemplateReference5270 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference5291 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleTemplateReference5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition5396 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleArgumentDefinition5413 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueList_in_ruleArgumentDefinition5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition5557 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleAttributeDefinition5570 = new BitSet(new long[]{0x0080390000000210L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleAttributeDefinition5592 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleAttributeDefinition5604 = new BitSet(new long[]{0x0000380000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5668 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_49_in_ruleAttributeDefinition5686 = new BitSet(new long[]{0x0001C000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition5707 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttributeDefinition5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5813 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleImplementationDefinition5826 = new BitSet(new long[]{0x0080010000000310L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition5848 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5875 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleImplementationDefinition5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5980 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleDataDefinition5993 = new BitSet(new long[]{0x0080010000000310L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition6015 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition6042 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataDefinition6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6143 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleQualifiedName6162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6177 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC6224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileC6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_ruleFileC6280 = new BitSet(new long[]{0x0080010000000210L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleFileC6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_C_in_ruleInlineCodeC6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath6430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath6482 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_40_in_rulePath6506 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_55_in_rulePath6525 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath6543 = new BitSet(new long[]{0x0080000000000210L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath6565 = new BitSet(new long[]{0x0000800000000210L});
    public static final BitSet FOLLOW_47_in_rulePath6584 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_55_in_rulePath6607 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName6671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileName6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6722 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleFileName6741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6859 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6880 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAnnotation6964 = new BitSet(new long[]{0x1E00000000000010L});
    public static final BitSet FOLLOW_57_in_ruleAnnotation6984 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_58_in_ruleAnnotation7013 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_59_in_ruleAnnotation7042 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_60_in_ruleAnnotation7071 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotation7103 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAnnotation7119 = new BitSet(new long[]{0x01000000010000B0L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7140 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleAnnotation7153 = new BitSet(new long[]{0x01000000010000B0L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7174 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleAnnotation7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement7279 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleAnnotationElement7296 = new BitSet(new long[]{0x01000000010000B0L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement7319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue7355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue7365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue7445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleElementValueArrayInitializer7557 = new BitSet(new long[]{0x01000000010000B0L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7578 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleElementValueArrayInitializer7591 = new BitSet(new long[]{0x01000000010000B0L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7612 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleElementValueArrayInitializer7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue7662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat7764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantFormat7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_synpred1_InternalAdl137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred13_InternalAdl926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred14_InternalAdl945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred15_InternalAdl964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred22_InternalAdl1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred23_InternalAdl1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred24_InternalAdl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred25_InternalAdl1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred29_InternalAdl1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred37_InternalAdl2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred54_InternalAdl3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred55_InternalAdl3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred56_InternalAdl3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred57_InternalAdl3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred58_InternalAdl3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_synpred85_InternalAdl5627 = new BitSet(new long[]{0x0000000000000002L});

}