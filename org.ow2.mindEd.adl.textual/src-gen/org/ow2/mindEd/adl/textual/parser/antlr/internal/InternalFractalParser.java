package org.ow2.mindEd.adl.textual.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ow2.mindEd.adl.textual.services.FractalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFractalParser extends AbstractInternalAntlrParser {
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


        public InternalFractalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFractalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFractalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private FractalGrammarAccess grammarAccess;
     	
        public InternalFractalParser(TokenStream input, FractalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AdlDefinition";	
       	}
       	
       	@Override
       	protected FractalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAdlDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:73:1: entryRuleAdlDefinition returns [EObject current=null] : iv_ruleAdlDefinition= ruleAdlDefinition EOF ;
    public final EObject entryRuleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdlDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:74:2: (iv_ruleAdlDefinition= ruleAdlDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:75:2: iv_ruleAdlDefinition= ruleAdlDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdlDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81);
            iv_ruleAdlDefinition=ruleAdlDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdlDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdlDefinition91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdlDefinition"


    // $ANTLR start "ruleAdlDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:82:1: ruleAdlDefinition returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) ) ;
    public final EObject ruleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_annotationsList_1_0 = null;

        EObject lv_architectureDefinition_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:85:28: ( ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:2: ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:2: ( (lv_imports_0_0= ruleImportDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==56) ) {
                    int LA1_1 = input.LA(2);

                    if ( (synpred1_InternalFractal()) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:88:3: lv_imports_0_0= ruleImportDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137);
            	    lv_imports_0_0=ruleImportDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdlDefinitionRule());
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:104:3: ( (lv_annotationsList_1_0= ruleAnnotationsList ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==56) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:105:1: (lv_annotationsList_1_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:105:1: (lv_annotationsList_1_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:106:3: lv_annotationsList_1_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition159);
                    lv_annotationsList_1_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAdlDefinitionRule());
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:122:3: ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:123:1: (lv_architectureDefinition_2_0= ruleArchitectureDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:123:1: (lv_architectureDefinition_2_0= ruleArchitectureDefinition )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:124:3: lv_architectureDefinition_2_0= ruleArchitectureDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getArchitectureDefinitionArchitectureDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition181);
            lv_architectureDefinition_2_0=ruleArchitectureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdlDefinitionRule());
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
    // $ANTLR end "ruleAdlDefinition"


    // $ANTLR start "entryRuleArchitectureDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:148:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:149:2: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:150:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:157:1: ruleArchitectureDefinition returns [EObject current=null] : (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeDefinition_0 = null;

        EObject this_PrimitiveDefinition_1 = null;

        EObject this_TypeDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:160:28: ( (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:161:1: (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:161:1: (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition )
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:162:2: this_CompositeDefinition_0= ruleCompositeDefinition
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:175:2: this_PrimitiveDefinition_1= rulePrimitiveDefinition
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:188:2: this_TypeDefinition_2= ruleTypeDefinition
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:207:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:208:2: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:209:2: iv_ruleImportDefinition= ruleImportDefinition EOF
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:216:1: ruleImportDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:219:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:220:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:220:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:220:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:220:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==56) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:221:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:221:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:222:3: lv_annotationsList_0_0= ruleAnnotationsList
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:242:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:243:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:243:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:244:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:272:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:273:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:274:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:281:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:284:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:285:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:285:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:286:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:296:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:297:2: kw= '.*'
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:310:1: entryRuleCompositeDefinition returns [EObject current=null] : iv_ruleCompositeDefinition= ruleCompositeDefinition EOF ;
    public final EObject entryRuleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:311:2: (iv_ruleCompositeDefinition= ruleCompositeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:312:2: iv_ruleCompositeDefinition= ruleCompositeDefinition EOF
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:319:1: ruleCompositeDefinition returns [EObject current=null] : (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) )? (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )? ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )? (otherlv_8= 'extends' ( (lv_superTypes_9_0= ruleCompositeSuperType ) ) (otherlv_10= ',' ( (lv_superTypes_11_0= ruleCompositeSuperType ) ) )* )? otherlv_12= '{' ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )* otherlv_14= '}' ) ;
    public final EObject ruleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_templateSpecifiers_3_0 = null;

        EObject lv_templateSpecifiers_5_0 = null;

        EObject lv_compositeFormalArgumentsList_7_0 = null;

        EObject lv_superTypes_9_0 = null;

        EObject lv_superTypes_11_0 = null;

        EObject lv_elements_13_1 = null;

        EObject lv_elements_13_2 = null;

        EObject lv_elements_13_3 = null;

        EObject lv_elements_13_4 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:322:28: ( (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) )? (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )? ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )? (otherlv_8= 'extends' ( (lv_superTypes_9_0= ruleCompositeSuperType ) ) (otherlv_10= ',' ( (lv_superTypes_11_0= ruleCompositeSuperType ) ) )* )? otherlv_12= '{' ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )* otherlv_14= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:323:1: (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) )? (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )? ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )? (otherlv_8= 'extends' ( (lv_superTypes_9_0= ruleCompositeSuperType ) ) (otherlv_10= ',' ( (lv_superTypes_11_0= ruleCompositeSuperType ) ) )* )? otherlv_12= '{' ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )* otherlv_14= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:323:1: (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) )? (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )? ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )? (otherlv_8= 'extends' ( (lv_superTypes_9_0= ruleCompositeSuperType ) ) (otherlv_10= ',' ( (lv_superTypes_11_0= ruleCompositeSuperType ) ) )* )? otherlv_12= '{' ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )* otherlv_14= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:323:3: otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) )? (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )? ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )? (otherlv_8= 'extends' ( (lv_superTypes_9_0= ruleCompositeSuperType ) ) (otherlv_10= ',' ( (lv_superTypes_11_0= ruleCompositeSuperType ) ) )* )? otherlv_12= '{' ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCompositeDefinition677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeDefinitionAccess().getCompositeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:327:1: ( (lv_name_1_0= ruleQualifiedName ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:328:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:328:1: (lv_name_1_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:329:3: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition698);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
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
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:345:3: (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:345:5: otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCompositeDefinition712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCompositeDefinitionAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:349:1: ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:349:2: ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )*
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:349:2: ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:350:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:350:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:351:3: lv_templateSpecifiers_3_0= ruleTemplateSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition734);
                    lv_templateSpecifiers_3_0=ruleTemplateSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"templateSpecifiers",
                              		lv_templateSpecifiers_3_0, 
                              		"TemplateSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:367:2: (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:367:4: otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleCompositeDefinition747); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getCompositeDefinitionAccess().getCommaKeyword_2_1_1_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:371:1: ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:372:1: (lv_templateSpecifiers_5_0= ruleTemplateSpecifier )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:372:1: (lv_templateSpecifiers_5_0= ruleTemplateSpecifier )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:373:3: lv_templateSpecifiers_5_0= ruleTemplateSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_2_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition768);
                    	    lv_templateSpecifiers_5_0=ruleTemplateSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templateSpecifiers",
                    	              		lv_templateSpecifiers_5_0, 
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

                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleCompositeDefinition783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompositeDefinitionAccess().getGreaterThanSignKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:393:3: ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:394:1: (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:394:1: (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:395:3: lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_ruleCompositeDefinition806);
                    lv_compositeFormalArgumentsList_7_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_7_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:411:3: (otherlv_8= 'extends' ( (lv_superTypes_9_0= ruleCompositeSuperType ) ) (otherlv_10= ',' ( (lv_superTypes_11_0= ruleCompositeSuperType ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:411:5: otherlv_8= 'extends' ( (lv_superTypes_9_0= ruleCompositeSuperType ) ) (otherlv_10= ',' ( (lv_superTypes_11_0= ruleCompositeSuperType ) ) )*
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleCompositeDefinition820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCompositeDefinitionAccess().getExtendsKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:415:1: ( (lv_superTypes_9_0= ruleCompositeSuperType ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:416:1: (lv_superTypes_9_0= ruleCompositeSuperType )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:416:1: (lv_superTypes_9_0= ruleCompositeSuperType )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:417:3: lv_superTypes_9_0= ruleCompositeSuperType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getSuperTypesCompositeSuperTypeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeSuperType_in_ruleCompositeDefinition841);
                    lv_superTypes_9_0=ruleCompositeSuperType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"superTypes",
                              		lv_superTypes_9_0, 
                              		"CompositeSuperType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:433:2: (otherlv_10= ',' ( (lv_superTypes_11_0= ruleCompositeSuperType ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:433:4: otherlv_10= ',' ( (lv_superTypes_11_0= ruleCompositeSuperType ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleCompositeDefinition854); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getCompositeDefinitionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:437:1: ( (lv_superTypes_11_0= ruleCompositeSuperType ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:438:1: (lv_superTypes_11_0= ruleCompositeSuperType )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:438:1: (lv_superTypes_11_0= ruleCompositeSuperType )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:439:3: lv_superTypes_11_0= ruleCompositeSuperType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getSuperTypesCompositeSuperTypeParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCompositeSuperType_in_ruleCompositeDefinition875);
                    	    lv_superTypes_11_0=ruleCompositeSuperType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"superTypes",
                    	              		lv_superTypes_11_0, 
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

            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleCompositeDefinition891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCompositeDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:459:1: ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31||LA13_0==35||(LA13_0>=37 && LA13_0<=38)||LA13_0==56) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:460:1: ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:460:1: ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:461:1: (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:461:1: (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition )
            	    int alt12=4;
            	    switch ( input.LA(1) ) {
            	    case 56:
            	        {
            	        int LA12_1 = input.LA(2);

            	        if ( (synpred13_InternalFractal()) ) {
            	            alt12=1;
            	        }
            	        else if ( (synpred14_InternalFractal()) ) {
            	            alt12=2;
            	        }
            	        else if ( (synpred15_InternalFractal()) ) {
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:462:3: lv_elements_13_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_6_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleCompositeDefinition914);
            	            lv_elements_13_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_13_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:477:8: lv_elements_13_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_6_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleCompositeDefinition933);
            	            lv_elements_13_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_13_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:492:8: lv_elements_13_3= ruleSubComponentDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsSubComponentDefinitionParserRuleCall_6_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition952);
            	            lv_elements_13_3=ruleSubComponentDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_13_3, 
            	                      		"SubComponentDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:507:8: lv_elements_13_4= ruleBindingDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsBindingDefinitionParserRuleCall_6_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition971);
            	            lv_elements_13_4=ruleBindingDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_13_4, 
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

            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleCompositeDefinition987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getCompositeDefinitionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:537:1: entryRulePrimitiveDefinition returns [EObject current=null] : iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF ;
    public final EObject entryRulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:538:2: (iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:539:2: iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition1023);
            iv_rulePrimitiveDefinition=rulePrimitiveDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinition1033); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:546:1: rulePrimitiveDefinition returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( (lv_superTypes_5_0= rulePrimitiveSuperType ) ) (otherlv_6= ',' ( (lv_superTypes_7_0= rulePrimitiveSuperType ) ) )* )? otherlv_8= '{' ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )* otherlv_10= '}' ) ;
    public final EObject rulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_compositeFormalArgumentsList_3_0 = null;

        EObject lv_superTypes_5_0 = null;

        EObject lv_superTypes_7_0 = null;

        EObject lv_elements_9_1 = null;

        EObject lv_elements_9_2 = null;

        EObject lv_elements_9_3 = null;

        EObject lv_elements_9_4 = null;

        EObject lv_elements_9_5 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:549:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( (lv_superTypes_5_0= rulePrimitiveSuperType ) ) (otherlv_6= ',' ( (lv_superTypes_7_0= rulePrimitiveSuperType ) ) )* )? otherlv_8= '{' ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )* otherlv_10= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:550:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( (lv_superTypes_5_0= rulePrimitiveSuperType ) ) (otherlv_6= ',' ( (lv_superTypes_7_0= rulePrimitiveSuperType ) ) )* )? otherlv_8= '{' ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )* otherlv_10= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:550:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( (lv_superTypes_5_0= rulePrimitiveSuperType ) ) (otherlv_6= ',' ( (lv_superTypes_7_0= rulePrimitiveSuperType ) ) )* )? otherlv_8= '{' ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )* otherlv_10= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:550:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) )? ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( (lv_superTypes_5_0= rulePrimitiveSuperType ) ) (otherlv_6= ',' ( (lv_superTypes_7_0= rulePrimitiveSuperType ) ) )* )? otherlv_8= '{' ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )* otherlv_10= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:550:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:551:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:551:1: (lv_abstract_0_0= 'abstract' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:552:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,26,FOLLOW_26_in_rulePrimitiveDefinition1076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_abstract_0_0, grammarAccess.getPrimitiveDefinitionAccess().getAbstractAbstractKeyword_0_0());
                          
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_rulePrimitiveDefinition1102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPrimitiveDefinitionAccess().getPrimitiveKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:569:1: ( (lv_name_2_0= ruleQualifiedName ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:570:1: (lv_name_2_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:570:1: (lv_name_2_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:571:3: lv_name_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1123);
                    lv_name_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:587:3: ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:588:1: (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:588:1: (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:589:3: lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1145);
                    lv_compositeFormalArgumentsList_3_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_3_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:605:3: (otherlv_4= 'extends' ( (lv_superTypes_5_0= rulePrimitiveSuperType ) ) (otherlv_6= ',' ( (lv_superTypes_7_0= rulePrimitiveSuperType ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:605:5: otherlv_4= 'extends' ( (lv_superTypes_5_0= rulePrimitiveSuperType ) ) (otherlv_6= ',' ( (lv_superTypes_7_0= rulePrimitiveSuperType ) ) )*
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_rulePrimitiveDefinition1159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimitiveDefinitionAccess().getExtendsKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:609:1: ( (lv_superTypes_5_0= rulePrimitiveSuperType ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:610:1: (lv_superTypes_5_0= rulePrimitiveSuperType )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:610:1: (lv_superTypes_5_0= rulePrimitiveSuperType )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:611:3: lv_superTypes_5_0= rulePrimitiveSuperType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypesPrimitiveSuperTypeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1180);
                    lv_superTypes_5_0=rulePrimitiveSuperType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"superTypes",
                              		lv_superTypes_5_0, 
                              		"PrimitiveSuperType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:627:2: (otherlv_6= ',' ( (lv_superTypes_7_0= rulePrimitiveSuperType ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:627:4: otherlv_6= ',' ( (lv_superTypes_7_0= rulePrimitiveSuperType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveDefinition1193); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getPrimitiveDefinitionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:631:1: ( (lv_superTypes_7_0= rulePrimitiveSuperType ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:632:1: (lv_superTypes_7_0= rulePrimitiveSuperType )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:632:1: (lv_superTypes_7_0= rulePrimitiveSuperType )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:633:3: lv_superTypes_7_0= rulePrimitiveSuperType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypesPrimitiveSuperTypeParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1214);
                    	    lv_superTypes_7_0=rulePrimitiveSuperType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"superTypes",
                    	              		lv_superTypes_7_0, 
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

            otherlv_8=(Token)match(input,24,FOLLOW_24_in_rulePrimitiveDefinition1230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getPrimitiveDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:653:1: ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31||LA20_0==35||LA20_0==51||(LA20_0>=53 && LA20_0<=54)||LA20_0==56) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:654:1: ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:654:1: ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:655:1: (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:655:1: (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition )
            	    int alt19=5;
            	    switch ( input.LA(1) ) {
            	    case 56:
            	        {
            	        int LA19_1 = input.LA(2);

            	        if ( (synpred22_InternalFractal()) ) {
            	            alt19=1;
            	        }
            	        else if ( (synpred23_InternalFractal()) ) {
            	            alt19=2;
            	        }
            	        else if ( (synpred24_InternalFractal()) ) {
            	            alt19=3;
            	        }
            	        else if ( (synpred25_InternalFractal()) ) {
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:656:3: lv_elements_9_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_6_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1253);
            	            lv_elements_9_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_9_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:671:8: lv_elements_9_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_6_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1272);
            	            lv_elements_9_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_9_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:686:8: lv_elements_9_3= ruleImplementationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_6_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1291);
            	            lv_elements_9_3=ruleImplementationDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_9_3, 
            	                      		"ImplementationDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:701:8: lv_elements_9_4= ruleAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_6_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1310);
            	            lv_elements_9_4=ruleAttributeDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_9_4, 
            	                      		"AttributeDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:716:8: lv_elements_9_5= ruleDataDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsDataDefinitionParserRuleCall_6_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1329);
            	            lv_elements_9_5=ruleDataDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_9_5, 
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

            otherlv_10=(Token)match(input,25,FOLLOW_25_in_rulePrimitiveDefinition1345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getPrimitiveDefinitionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:746:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:747:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:748:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1381);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition1391); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:755:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:758:28: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:759:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:759:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:759:3: otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleTypeDefinition1428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:763:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:764:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:764:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:765:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1449);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:781:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:781:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleTypeDefinition1462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTypeDefinitionAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:785:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:786:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:786:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:787:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1489);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:803:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==21) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:803:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTypeDefinition1502); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTypeDefinitionAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:807:1: ( ( ruleQualifiedName ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:808:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:808:1: ( ruleQualifiedName )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:809:3: ruleQualifiedName
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
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1529);
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

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleTypeDefinition1545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTypeDefinitionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:829:1: ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31||LA24_0==35||LA24_0==56) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:830:1: ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:830:1: ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:831:1: (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:831:1: (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition )
            	    int alt23=2;
            	    switch ( input.LA(1) ) {
            	    case 56:
            	        {
            	        int LA23_1 = input.LA(2);

            	        if ( (synpred29_InternalFractal()) ) {
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:832:3: lv_elements_7_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1568);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:847:8: lv_elements_7_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1587);
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

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleTypeDefinition1603); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:877:1: entryRuleCompositeSuperType returns [EObject current=null] : iv_ruleCompositeSuperType= ruleCompositeSuperType EOF ;
    public final EObject entryRuleCompositeSuperType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeSuperType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:878:2: (iv_ruleCompositeSuperType= ruleCompositeSuperType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:879:2: iv_ruleCompositeSuperType= ruleCompositeSuperType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeSuperTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeSuperType_in_entryRuleCompositeSuperType1639);
            iv_ruleCompositeSuperType=ruleCompositeSuperType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeSuperType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeSuperType1649); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:886:1: ruleCompositeSuperType returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:889:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:890:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:890:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:890:2: ( ( ruleQualifiedName ) ) (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )? (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )?
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:890:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:891:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:891:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:892:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeSuperType1701);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:908:2: (otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:908:4: otherlv_1= '<' ( (lv_templatesList_2_0= ruleTemplateReference ) ) (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCompositeSuperType1714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCompositeSuperTypeAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:912:1: ( (lv_templatesList_2_0= ruleTemplateReference ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:913:1: (lv_templatesList_2_0= ruleTemplateReference )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:913:1: (lv_templatesList_2_0= ruleTemplateReference )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:914:3: lv_templatesList_2_0= ruleTemplateReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getTemplatesListTemplateReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1735);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:930:2: (otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==21) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:930:4: otherlv_3= ',' ( (lv_templatesList_4_0= ruleTemplateReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleCompositeSuperType1748); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCompositeSuperTypeAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:934:1: ( (lv_templatesList_4_0= ruleTemplateReference ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:935:1: (lv_templatesList_4_0= ruleTemplateReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:935:1: (lv_templatesList_4_0= ruleTemplateReference )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:936:3: lv_templatesList_4_0= ruleTemplateReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getTemplatesListTemplateReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1769);
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

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleCompositeSuperType1783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCompositeSuperTypeAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:956:3: (otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:956:5: otherlv_6= '(' ( (lv_argumentsList_7_0= ruleArgumentDefinition ) ) (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleCompositeSuperType1798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompositeSuperTypeAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:960:1: ( (lv_argumentsList_7_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:961:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:961:1: (lv_argumentsList_7_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:962:3: lv_argumentsList_7_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1819);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:978:2: (otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==21) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:978:4: otherlv_8= ',' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleCompositeSuperType1832); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getCompositeSuperTypeAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:982:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:983:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:983:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:984:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1853);
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

                    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleCompositeSuperType1867); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1012:1: entryRulePrimitiveSuperType returns [EObject current=null] : iv_rulePrimitiveSuperType= rulePrimitiveSuperType EOF ;
    public final EObject entryRulePrimitiveSuperType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveSuperType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1013:2: (iv_rulePrimitiveSuperType= rulePrimitiveSuperType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1014:2: iv_rulePrimitiveSuperType= rulePrimitiveSuperType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveSuperTypeRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveSuperType_in_entryRulePrimitiveSuperType1905);
            iv_rulePrimitiveSuperType=rulePrimitiveSuperType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveSuperType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveSuperType1915); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1021:1: rulePrimitiveSuperType returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? ) ;
    public final EObject rulePrimitiveSuperType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argumentsList_2_0 = null;

        EObject lv_argumentsList_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1024:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1025:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1025:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1025:2: ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )?
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1025:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1026:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1026:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1027:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveSuperType1967);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1043:2: (otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1043:4: otherlv_1= '(' ( (lv_argumentsList_2_0= ruleArgumentDefinition ) ) (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_rulePrimitiveSuperType1980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimitiveSuperTypeAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1047:1: ( (lv_argumentsList_2_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1048:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1048:1: (lv_argumentsList_2_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1049:3: lv_argumentsList_2_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2001);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1065:2: (otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==21) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1065:4: otherlv_3= ',' ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveSuperType2014); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getPrimitiveSuperTypeAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1069:1: ( (lv_argumentsList_4_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1070:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1070:1: (lv_argumentsList_4_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1071:3: lv_argumentsList_4_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimitiveSuperTypeAccess().getArgumentsListArgumentDefinitionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2035);
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

                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_rulePrimitiveSuperType2049); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1103:1: entryRuleHostedInterfaceDefinition returns [EObject current=null] : iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF ;
    public final EObject entryRuleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1104:2: (iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1105:2: iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition2091);
            iv_ruleHostedInterfaceDefinition=ruleHostedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition2101); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1112:1: ruleHostedInterfaceDefinition returns [EObject current=null] : (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) ;
    public final EObject ruleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ProvidedInterfaceDefinition_0 = null;

        EObject this_RequiredInterfaceDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1115:28: ( (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1116:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1116:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            int alt31=2;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA31_1 = input.LA(2);

                if ( (synpred37_InternalFractal()) ) {
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1117:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getProvidedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition2151);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1130:2: this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getRequiredInterfaceDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition2181);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1149:1: entryRuleProvidedInterfaceDefinition returns [EObject current=null] : iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF ;
    public final EObject entryRuleProvidedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1150:2: (iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1151:2: iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition2216);
            iv_ruleProvidedInterfaceDefinition=ruleProvidedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition2226); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1158:1: ruleProvidedInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1161:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1162:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1162:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1162:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1162:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==56) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1163:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1163:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1164:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition2272);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1180:3: ( (lv_role_1_0= 'provides' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1181:1: (lv_role_1_0= 'provides' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1181:1: (lv_role_1_0= 'provides' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1182:3: lv_role_1_0= 'provides'
            {
            lv_role_1_0=(Token)match(input,31,FOLLOW_31_in_ruleProvidedInterfaceDefinition2291); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1195:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1196:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1196:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1197:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition2331);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleProvidedInterfaceDefinition2343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProvidedInterfaceDefinitionAccess().getAsKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1217:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1218:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1218:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1219:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition2360); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1235:2: ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1235:3: ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']'
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1235:3: ( (lv_collection_5_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1236:1: (lv_collection_5_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1236:1: (lv_collection_5_0= '[' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1237:3: lv_collection_5_0= '['
                    {
                    lv_collection_5_0=(Token)match(input,33,FOLLOW_33_in_ruleProvidedInterfaceDefinition2384); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1250:2: ( (lv_collectionsize_6_0= RULE_INT ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_INT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1251:1: (lv_collectionsize_6_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1251:1: (lv_collectionsize_6_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1252:3: lv_collectionsize_6_0= RULE_INT
                            {
                            lv_collectionsize_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition2414); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleProvidedInterfaceDefinition2432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getProvidedInterfaceDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleProvidedInterfaceDefinition2446); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1284:1: entryRuleRequiredInterfaceDefinition returns [EObject current=null] : iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF ;
    public final EObject entryRuleRequiredInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1285:2: (iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1286:2: iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition2482);
            iv_ruleRequiredInterfaceDefinition=ruleRequiredInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition2492); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1293:1: ruleRequiredInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1296:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1297:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1297:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1297:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1297:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==56) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1298:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1298:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1299:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition2538);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1315:3: ( (lv_role_1_0= 'requires' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1316:1: (lv_role_1_0= 'requires' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1316:1: (lv_role_1_0= 'requires' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1317:3: lv_role_1_0= 'requires'
            {
            lv_role_1_0=(Token)match(input,35,FOLLOW_35_in_ruleRequiredInterfaceDefinition2557); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1330:2: ( (lv_optional_2_0= 'optional' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1331:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1331:1: (lv_optional_2_0= 'optional' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1332:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)match(input,36,FOLLOW_36_in_ruleRequiredInterfaceDefinition2588); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1345:3: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1346:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1346:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1347:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2629);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleRequiredInterfaceDefinition2641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRequiredInterfaceDefinitionAccess().getAsKeyword_4());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1367:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1368:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1368:1: (lv_name_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1369:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2658); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1385:2: ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1385:3: ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']'
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1385:3: ( (lv_collection_6_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1386:1: (lv_collection_6_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1386:1: (lv_collection_6_0= '[' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1387:3: lv_collection_6_0= '['
                    {
                    lv_collection_6_0=(Token)match(input,33,FOLLOW_33_in_ruleRequiredInterfaceDefinition2682); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1400:2: ( (lv_collectionsize_7_0= RULE_INT ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_INT) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1401:1: (lv_collectionsize_7_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1401:1: (lv_collectionsize_7_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1402:3: lv_collectionsize_7_0= RULE_INT
                            {
                            lv_collectionsize_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2712); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleRequiredInterfaceDefinition2730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getRequiredInterfaceDefinitionAccess().getRightSquareBracketKeyword_6_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleRequiredInterfaceDefinition2744); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1436:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1437:2: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1438:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2782);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition2792); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1445:1: ruleSubComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1448:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1449:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1449:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1449:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )? ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )? otherlv_17= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1449:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==56) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1450:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1450:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1451:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2838);
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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleSubComponentDefinition2851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1471:1: ( ( ruleQualifiedName ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1472:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1472:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1473:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2878);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1489:3: (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==20) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1489:5: otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateReference ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSubComponentDefinition2892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSubComponentDefinitionAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1493:1: ( (lv_templatesList_4_0= ruleTemplateReference ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1494:1: (lv_templatesList_4_0= ruleTemplateReference )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1494:1: (lv_templatesList_4_0= ruleTemplateReference )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1495:3: lv_templatesList_4_0= ruleTemplateReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition2913);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1511:2: (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==21) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1511:4: otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentDefinition2926); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1515:1: ( (lv_templatesList_6_0= ruleTemplateReference ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1516:1: (lv_templatesList_6_0= ruleTemplateReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1516:1: (lv_templatesList_6_0= ruleTemplateReference )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1517:3: lv_templatesList_6_0= ruleTemplateReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition2947);
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

                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleSubComponentDefinition2961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSubComponentDefinitionAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1537:3: (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==29) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1537:5: otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleSubComponentDefinition2976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSubComponentDefinitionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1541:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1542:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1542:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1543:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2997);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1559:2: (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==21) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1559:4: otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentDefinition3010); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1563:1: ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1564:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1564:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1565:3: lv_argumentsList_11_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition3031);
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

                    otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleSubComponentDefinition3045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSubComponentDefinitionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,32,FOLLOW_32_in_ruleSubComponentDefinition3059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getSubComponentDefinitionAccess().getAsKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1589:1: ( (lv_name_14_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1590:1: (lv_name_14_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1590:1: (lv_name_14_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1591:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubComponentDefinition3076); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1607:2: ( (lv_bodyAnnotationsList_15_0= ruleAnnotationsList ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1608:1: (lv_bodyAnnotationsList_15_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1608:1: (lv_bodyAnnotationsList_15_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1609:3: lv_bodyAnnotationsList_15_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodyAnnotationsListAnnotationsListParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition3102);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1625:3: ( ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==19||(LA47_0>=26 && LA47_0<=27)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1626:1: ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1626:1: ( (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1627:1: (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1627:1: (lv_body_16_1= ruleCompositeDefinition | lv_body_16_2= rulePrimitiveDefinition )
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
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1628:3: lv_body_16_1= ruleCompositeDefinition
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodyCompositeDefinitionParserRuleCall_8_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCompositeDefinition_in_ruleSubComponentDefinition3126);
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
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1643:8: lv_body_16_2= rulePrimitiveDefinition
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodyPrimitiveDefinitionParserRuleCall_8_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePrimitiveDefinition_in_ruleSubComponentDefinition3145);
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

            otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleSubComponentDefinition3161); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1675:1: entryRuleCompositeElement returns [EObject current=null] : iv_ruleCompositeElement= ruleCompositeElement EOF ;
    public final EObject entryRuleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1676:2: (iv_ruleCompositeElement= ruleCompositeElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1677:2: iv_ruleCompositeElement= ruleCompositeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeElementRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement3199);
            iv_ruleCompositeElement=ruleCompositeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeElement3209); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1684:1: ruleCompositeElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ;
    public final EObject ruleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_SubComponentDefinition_1 = null;

        EObject this_BindingDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1687:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1688:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1688:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA48_1 = input.LA(2);

                if ( (synpred54_InternalFractal()) ) {
                    alt48=1;
                }
                else if ( (synpred55_InternalFractal()) ) {
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1689:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3259);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1702:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getSubComponentDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3289);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1715:2: this_BindingDefinition_2= ruleBindingDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getBindingDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3319);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1734:1: entryRulePrimitiveElement returns [EObject current=null] : iv_rulePrimitiveElement= rulePrimitiveElement EOF ;
    public final EObject entryRulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1735:2: (iv_rulePrimitiveElement= rulePrimitiveElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1736:2: iv_rulePrimitiveElement= rulePrimitiveElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveElementRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3354);
            iv_rulePrimitiveElement=rulePrimitiveElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveElement3364); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1743:1: rulePrimitiveElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) ;
    public final EObject rulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_ImplementationDefinition_1 = null;

        EObject this_AttributeDefinition_2 = null;

        EObject this_DataDefinition_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1746:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1747:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1747:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA49_1 = input.LA(2);

                if ( (synpred56_InternalFractal()) ) {
                    alt49=1;
                }
                else if ( (synpred57_InternalFractal()) ) {
                    alt49=2;
                }
                else if ( (synpred58_InternalFractal()) ) {
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1748:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3414);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1761:2: this_ImplementationDefinition_1= ruleImplementationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getImplementationDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3444);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1774:2: this_AttributeDefinition_2= ruleAttributeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getAttributeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3474);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1787:2: this_DataDefinition_3= ruleDataDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getDataDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3504);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1806:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1807:2: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1808:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3539);
            iv_ruleBindingDefinition=ruleBindingDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition3549); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1815:1: ruleBindingDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1818:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1819:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1819:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1819:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1819:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==56) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1820:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1820:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1821:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition3595);
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

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleBindingDefinition3608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBindingDefinitionAccess().getBindsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1841:1: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) )
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1841:2: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1841:2: ( (otherlv_2= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1842:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1842:1: (otherlv_2= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1843:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getBindingDefinitionAccess().getSourceParentSubComponentDefinitionCrossReference_2_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1858:6: ( (lv_isSrcParentThis_3_0= 'this' ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1858:6: ( (lv_isSrcParentThis_3_0= 'this' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1859:1: (lv_isSrcParentThis_3_0= 'this' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1859:1: (lv_isSrcParentThis_3_0= 'this' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1860:3: lv_isSrcParentThis_3_0= 'this'
                    {
                    lv_isSrcParentThis_3_0=(Token)match(input,39,FOLLOW_39_in_ruleBindingDefinition3657); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleBindingDefinition3683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1877:1: ( (otherlv_5= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1878:1: (otherlv_5= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1878:1: (otherlv_5= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1879:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getBindingDefinitionAccess().getSourceInterfaceHostedInterfaceDefinitionCrossReference_4_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1893:2: (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==33) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1893:4: otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleBindingDefinition3720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1897:1: ( (lv_sourceIndex_7_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1898:1: (lv_sourceIndex_7_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1898:1: (lv_sourceIndex_7_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1899:3: lv_sourceIndex_7_0= RULE_INT
                    {
                    lv_sourceIndex_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition3737); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleBindingDefinition3754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleBindingDefinition3768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getBindingDefinitionAccess().getToKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1923:1: ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) )
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1923:2: ( (otherlv_10= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1923:2: ( (otherlv_10= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1924:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1924:1: (otherlv_10= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1925:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getBindingDefinitionAccess().getTargetParentSubComponentDefinitionCrossReference_7_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1940:6: ( (lv_isTgtParentThis_11_0= 'this' ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1940:6: ( (lv_isTgtParentThis_11_0= 'this' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1941:1: (lv_isTgtParentThis_11_0= 'this' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1941:1: (lv_isTgtParentThis_11_0= 'this' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1942:3: lv_isTgtParentThis_11_0= 'this'
                    {
                    lv_isTgtParentThis_11_0=(Token)match(input,39,FOLLOW_39_in_ruleBindingDefinition3817); if (state.failed) return current;
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

            otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleBindingDefinition3843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_8());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1959:1: ( (otherlv_13= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1960:1: (otherlv_13= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1960:1: (otherlv_13= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1961:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getBindingDefinitionAccess().getTargetInterfaceHostedInterfaceDefinitionCrossReference_9_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1975:2: (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==33) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1975:4: otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']'
                    {
                    otherlv_14=(Token)match(input,33,FOLLOW_33_in_ruleBindingDefinition3880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_10_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1979:1: ( (lv_targetIndex_15_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1980:1: (lv_targetIndex_15_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1980:1: (lv_targetIndex_15_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1981:3: lv_targetIndex_15_0= RULE_INT
                    {
                    lv_targetIndex_15_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition3897); if (state.failed) return current;
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

                    otherlv_16=(Token)match(input,34,FOLLOW_34_in_ruleBindingDefinition3914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_10_2());
                          
                    }

                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleBindingDefinition3928); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2013:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2014:2: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2015:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument3964);
            iv_ruleFormalArgument=ruleFormalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument3974); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2022:1: ruleFormalArgument returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2025:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2026:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2026:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2027:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2027:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2028:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument4015); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2052:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2053:2: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2054:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentsListRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList4055);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList4065); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2061:1: ruleFormalArgumentsList returns [EObject current=null] : (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalArguments_1_0 = null;

        EObject lv_formalArguments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2064:28: ( (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2065:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2065:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2065:3: otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFormalArgumentsList4102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2069:1: ( (lv_formalArguments_1_0= ruleFormalArgument ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2070:1: (lv_formalArguments_1_0= ruleFormalArgument )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2070:1: (lv_formalArguments_1_0= ruleFormalArgument )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2071:3: lv_formalArguments_1_0= ruleFormalArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4123);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2087:2: (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==21) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2087:4: otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFormalArgumentsList4136); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2091:1: ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2092:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2092:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2093:3: lv_formalArguments_3_0= ruleFormalArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4157);
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

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleFormalArgumentsList4171); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2121:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2122:2: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2123:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier4207);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier4217); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2130:1: ruleTemplateSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2133:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2134:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2134:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2134:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2134:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2135:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2135:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2136:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier4259); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleTemplateSpecifier4276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2156:1: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2157:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2157:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2158:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4303);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2182:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2183:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2184:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType4340);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType4351); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2191:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2194:28: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2195:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2195:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2196:2: kw= 'STRUCT'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleAttributeType4389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2203:2: kw= 'UNION'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleAttributeType4408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2210:2: kw= 'ENUM'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleAttributeType4427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getENUMKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2216:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeType4448); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2231:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2232:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2233:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FOLLOW_rulesignedINT_in_entryRulesignedINT4494);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesignedINT4505); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2240:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2243:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2244:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2244:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2244:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2244:2: (kw= '+' | kw= '-' )?
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2245:2: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_rulesignedINT4544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2252:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_rulesignedINT4563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesignedINT4580); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2272:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2273:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2274:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4625);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4635); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2281:1: ruleValue returns [EObject current=null] : (this_ID_0= RULE_ID | rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | this_ValueList_4= ruleValueList | otherlv_5= 'null' ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token this_HEXADECIMAL_TYPE_2=null;
        Token this_STRING_3=null;
        Token otherlv_5=null;
        EObject this_ValueList_4 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2284:28: ( (this_ID_0= RULE_ID | rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | this_ValueList_4= ruleValueList | otherlv_5= 'null' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2285:1: (this_ID_0= RULE_ID | rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | this_ValueList_4= ruleValueList | otherlv_5= 'null' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2285:1: (this_ID_0= RULE_ID | rulesignedINT | this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE | this_STRING_3= RULE_STRING | this_ValueList_4= ruleValueList | otherlv_5= 'null' )
            int alt58=6;
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
            case 24:
                {
                alt58=5;
                }
                break;
            case 48:
                {
                alt58=6;
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2285:2: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue4671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2291:2: rulesignedINT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulesignedINT_in_ruleValue4695);
                    rulesignedINT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2302:6: this_HEXADECIMAL_TYPE_2= RULE_HEXADECIMAL_TYPE
                    {
                    this_HEXADECIMAL_TYPE_2=(Token)match(input,RULE_HEXADECIMAL_TYPE,FOLLOW_RULE_HEXADECIMAL_TYPE_in_ruleValue4711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEXADECIMAL_TYPE_2, grammarAccess.getValueAccess().getHEXADECIMAL_TYPETerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2307:6: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue4727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2313:2: this_ValueList_4= ruleValueList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getValueListParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueList_in_ruleValue4757);
                    this_ValueList_4=ruleValueList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValueList_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2325:7: otherlv_5= 'null'
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleValue4774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getValueAccess().getNullKeyword_5());
                          
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2337:1: entryRuleValueList returns [EObject current=null] : iv_ruleValueList= ruleValueList EOF ;
    public final EObject entryRuleValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2338:2: (iv_ruleValueList= ruleValueList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2339:2: iv_ruleValueList= ruleValueList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueListRule()); 
            }
            pushFollow(FOLLOW_ruleValueList_in_entryRuleValueList4810);
            iv_ruleValueList=ruleValueList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueList4820); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2346:1: ruleValueList returns [EObject current=null] : (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleValueList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_member_1_0 = null;

        EObject lv_member_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2349:28: ( (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2350:1: (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2350:1: (otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2350:3: otherlv_0= '{' ( (lv_member_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleValueList4857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getValueListAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2354:1: ( (lv_member_1_0= ruleValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2355:1: (lv_member_1_0= ruleValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2355:1: (lv_member_1_0= ruleValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2356:3: lv_member_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueListAccess().getMemberValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleValueList4878);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2372:2: (otherlv_2= ',' ( (lv_member_3_0= ruleValue ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==21) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2372:4: otherlv_2= ',' ( (lv_member_3_0= ruleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleValueList4891); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getValueListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2376:1: ( (lv_member_3_0= ruleValue ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2377:1: (lv_member_3_0= ruleValue )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2377:1: (lv_member_3_0= ruleValue )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2378:3: lv_member_3_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValueListAccess().getMemberValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleValueList4912);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleValueList4926); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2406:1: entryRuleTemplateReference returns [EObject current=null] : iv_ruleTemplateReference= ruleTemplateReference EOF ;
    public final EObject entryRuleTemplateReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateReference = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2407:2: (iv_ruleTemplateReference= ruleTemplateReference EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2408:2: iv_ruleTemplateReference= ruleTemplateReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateReference_in_entryRuleTemplateReference4962);
            iv_ruleTemplateReference=ruleTemplateReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateReference4972); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2415:1: ruleTemplateReference returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2418:28: ( ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2419:1: ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2419:1: ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2419:2: ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )? (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )?
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2419:2: ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )?
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2419:3: ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2419:3: ( (lv_name_0_0= ruleTemplateSpecifier ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2420:1: (lv_name_0_0= ruleTemplateSpecifier )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2420:1: (lv_name_0_0= ruleTemplateSpecifier )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2421:3: lv_name_0_0= ruleTemplateSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getNameTemplateSpecifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateReference5019);
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

                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleTemplateReference5031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTemplateReferenceAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2441:3: ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) )
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2441:4: ( ( ruleQualifiedName ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2441:4: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2442:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2442:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2443:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateReference5061);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2460:6: ( (lv_anyTypeReference_3_0= '?' ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2460:6: ( (lv_anyTypeReference_3_0= '?' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2461:1: (lv_anyTypeReference_3_0= '?' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2461:1: (lv_anyTypeReference_3_0= '?' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2462:3: lv_anyTypeReference_3_0= '?'
                    {
                    lv_anyTypeReference_3_0=(Token)match(input,50,FOLLOW_50_in_ruleTemplateReference5085); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2475:3: (otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==20) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2475:5: otherlv_4= '<' ( (lv_templatesList_5_0= ruleTemplateReference ) ) (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )* otherlv_8= '>'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTemplateReference5112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTemplateReferenceAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2479:1: ( (lv_templatesList_5_0= ruleTemplateReference ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2480:1: (lv_templatesList_5_0= ruleTemplateReference )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2480:1: (lv_templatesList_5_0= ruleTemplateReference )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2481:3: lv_templatesList_5_0= ruleTemplateReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getTemplatesListTemplateReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateReference_in_ruleTemplateReference5133);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2497:2: (otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==21) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2497:4: otherlv_6= ',' ( (lv_templatesList_7_0= ruleTemplateReference ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleTemplateReference5146); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getTemplateReferenceAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2501:1: ( (lv_templatesList_7_0= ruleTemplateReference ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2502:1: (lv_templatesList_7_0= ruleTemplateReference )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2502:1: (lv_templatesList_7_0= ruleTemplateReference )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2503:3: lv_templatesList_7_0= ruleTemplateReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getTemplatesListTemplateReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateReference_in_ruleTemplateReference5167);
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

                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleTemplateReference5181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTemplateReferenceAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2523:3: (otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==29) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2523:5: otherlv_9= '(' ( (lv_argumentsList_10_0= ruleArgumentDefinition ) ) (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )* otherlv_13= ')'
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleTemplateReference5196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTemplateReferenceAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2527:1: ( (lv_argumentsList_10_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2528:1: (lv_argumentsList_10_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2528:1: (lv_argumentsList_10_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2529:3: lv_argumentsList_10_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getArgumentsListArgumentDefinitionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference5217);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2545:2: (otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==21) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2545:4: otherlv_11= ',' ( (lv_argumentsList_12_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleTemplateReference5230); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getTemplateReferenceAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2549:1: ( (lv_argumentsList_12_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2550:1: (lv_argumentsList_12_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2550:1: (lv_argumentsList_12_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2551:3: lv_argumentsList_12_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTemplateReferenceAccess().getArgumentsListArgumentDefinitionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference5251);
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

                    otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleTemplateReference5265); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2579:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2580:2: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2581:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5303);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition5313); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2588:1: ruleArgumentDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_argumentValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2591:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2592:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2592:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2592:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2592:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2592:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2592:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2593:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2593:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2594:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition5356); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleArgumentDefinition5373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2614:3: ( (lv_argumentValue_2_0= ruleValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2615:1: (lv_argumentValue_2_0= ruleValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2615:1: (lv_argumentValue_2_0= ruleValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2616:3: lv_argumentValue_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5396);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2640:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2641:2: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2642:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5432);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition5442); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2649:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )? ( (lv_cType_4_0= ruleAttributeType ) )? ( (lv_type_5_0= RULE_ID ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= ';' ) ;
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

        EObject lv_value_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2652:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )? ( (lv_cType_4_0= ruleAttributeType ) )? ( (lv_type_5_0= RULE_ID ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2653:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )? ( (lv_cType_4_0= ruleAttributeType ) )? ( (lv_type_5_0= RULE_ID ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2653:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )? ( (lv_cType_4_0= ruleAttributeType ) )? ( (lv_type_5_0= RULE_ID ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2653:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )? ( (lv_cType_4_0= ruleAttributeType ) )? ( (lv_type_5_0= RULE_ID ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )? otherlv_9= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2653:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==56) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2654:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2654:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2655:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition5488);
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

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleAttributeDefinition5501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2675:1: ( ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==RULE_SL||LA68_1==40||LA68_1==52) ) {
                    alt68=1;
                }
            }
            else if ( (LA68_0==RULE_SL||LA68_0==40||LA68_0==55) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2675:2: ( (lv_headerFile_2_0= ruleFileC ) ) otherlv_3= ':'
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2675:2: ( (lv_headerFile_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2676:1: (lv_headerFile_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2676:1: (lv_headerFile_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2677:3: lv_headerFile_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getHeaderFileFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleAttributeDefinition5523);
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

                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleAttributeDefinition5535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2697:3: ( (lv_cType_4_0= ruleAttributeType ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=43 && LA69_0<=45)) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_ID) ) {
                int LA69_2 = input.LA(2);

                if ( (synpred85_InternalFractal()) ) {
                    alt69=1;
                }
            }
            switch (alt69) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2698:1: (lv_cType_4_0= ruleAttributeType )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2698:1: (lv_cType_4_0= ruleAttributeType )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2699:3: lv_cType_4_0= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getCTypeAttributeTypeParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5558);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2715:3: ( (lv_type_5_0= RULE_ID ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==RULE_ID) ) {
                    alt70=1;
                }
            }
            switch (alt70) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2716:1: (lv_type_5_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2716:1: (lv_type_5_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2717:3: lv_type_5_0= RULE_ID
                    {
                    lv_type_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5576); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2733:3: ( (lv_name_6_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2734:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2734:1: (lv_name_6_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2735:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5599); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2751:2: (otherlv_7= '=' ( (lv_value_8_0= ruleValue ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==49) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2751:4: otherlv_7= '=' ( (lv_value_8_0= ruleValue ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleAttributeDefinition5617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2755:1: ( (lv_value_8_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2756:1: (lv_value_8_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2756:1: (lv_value_8_0= ruleValue )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2757:3: lv_value_8_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition5638);
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

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleAttributeDefinition5652); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2785:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2786:2: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2787:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5688);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition5698); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2794:1: ruleImplementationDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2797:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2798:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2798:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2798:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2798:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==56) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2799:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2799:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2800:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5744);
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

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleImplementationDefinition5757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2820:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID||LA73_0==RULE_SL||LA73_0==40||LA73_0==55) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_CODE_C) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2820:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2820:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2821:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2821:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2822:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleImplementationDefinition5779);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2839:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2839:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2840:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2840:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2841:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5806);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleImplementationDefinition5819); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2869:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2870:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2871:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5855);
            iv_ruleDataDefinition=ruleDataDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition5865); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2878:1: ruleDataDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2881:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2882:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2882:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2882:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2882:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==56) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2883:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2883:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2884:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5911);
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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleDataDefinition5924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataDefinitionAccess().getDataKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2904:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID||LA75_0==RULE_SL||LA75_0==40||LA75_0==55) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_CODE_C) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2904:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2904:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2905:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2905:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2906:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleDataDefinition5946);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2923:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2923:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2924:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2924:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2925:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5973);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDataDefinition5986); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2953:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2954:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2955:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6023);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName6034); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2962:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2965:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2966:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2966:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2966:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2973:1: (kw= '.' this_ID_2= RULE_ID )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==40) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2974:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleQualifiedName6093); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6108); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2994:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2995:2: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2996:2: iv_ruleFileC= ruleFileC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileCRule()); 
            }
            pushFollow(FOLLOW_ruleFileC_in_entryRuleFileC6155);
            iv_ruleFileC=ruleFileC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileC6165); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3003:1: ruleFileC returns [EObject current=null] : ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_directory_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3006:28: ( ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3007:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3007:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3007:2: ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3007:2: ( (lv_directory_0_0= rulePath ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==RULE_SL) ) {
                    alt77=1;
                }
            }
            else if ( (LA77_0==RULE_SL||LA77_0==40||LA77_0==55) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3008:1: (lv_directory_0_0= rulePath )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3008:1: (lv_directory_0_0= rulePath )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3009:3: lv_directory_0_0= rulePath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFileCAccess().getDirectoryPathParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePath_in_ruleFileC6211);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3025:3: ( (lv_name_1_0= ruleFileName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3026:1: (lv_name_1_0= ruleFileName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3026:1: (lv_name_1_0= ruleFileName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3027:3: lv_name_1_0= ruleFileName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFileCAccess().getNameFileNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFileName_in_ruleFileC6233);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3051:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3052:2: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3053:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineCodeCRule()); 
            }
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6269);
            iv_ruleInlineCodeC=ruleInlineCodeC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC6279); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3060:1: ruleInlineCodeC returns [EObject current=null] : ( (lv_codeC_0_0= RULE_CODE_C ) ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3063:28: ( ( (lv_codeC_0_0= RULE_CODE_C ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3064:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3064:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3065:1: (lv_codeC_0_0= RULE_CODE_C )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3065:1: (lv_codeC_0_0= RULE_CODE_C )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3066:3: lv_codeC_0_0= RULE_CODE_C
            {
            lv_codeC_0_0=(Token)match(input,RULE_CODE_C,FOLLOW_RULE_CODE_C_in_ruleInlineCodeC6320); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3090:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3091:2: (iv_rulePath= rulePath EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3092:2: iv_rulePath= rulePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_rulePath_in_entryRulePath6361);
            iv_rulePath=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePath6372); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3099:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_SL_3=null;
        Token this_ID_4=null;
        Token this_SL_7=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3102:28: ( ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3103:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3103:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3103:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3103:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )?
            int alt78=4;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt78=1;
                    }
                    break;
                case 40:
                    {
                    alt78=2;
                    }
                    break;
                case 55:
                    {
                    alt78=3;
                    }
                    break;
            }

            switch (alt78) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3103:7: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath6413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getPathAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3112:2: kw= '.'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_rulePath6437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3119:2: kw= '..'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_rulePath6456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopFullStopKeyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3124:3: (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_SL) ) {
                    int LA82_1 = input.LA(2);

                    if ( (LA82_1==RULE_ID) ) {
                        int LA82_2 = input.LA(3);

                        if ( (LA82_2==RULE_ID||LA82_2==RULE_SL||LA82_2==47) ) {
                            alt82=1;
                        }


                    }
                    else if ( (LA82_1==RULE_SL||LA82_1==55) ) {
                        alt82=1;
                    }


                }


                switch (alt82) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3124:8: this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    {
            	    this_SL_3=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath6474); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SL_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SL_3, grammarAccess.getPathAccess().getSLTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3131:1: ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    int alt81=2;
            	    int LA81_0 = input.LA(1);

            	    if ( (LA81_0==RULE_ID||LA81_0==RULE_SL) ) {
            	        alt81=1;
            	    }
            	    else if ( (LA81_0==55) ) {
            	        alt81=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 81, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt81) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3131:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            {
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3131:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            loop80:
            	            do {
            	                int alt80=2;
            	                int LA80_0 = input.LA(1);

            	                if ( (LA80_0==RULE_ID) ) {
            	                    alt80=1;
            	                }


            	                switch (alt80) {
            	            	case 1 :
            	            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3131:7: this_ID_4= RULE_ID (kw= '-' )?
            	            	    {
            	            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath6496); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      		current.merge(this_ID_4);
            	            	          
            	            	    }
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	          newLeafNode(this_ID_4, grammarAccess.getPathAccess().getIDTerminalRuleCall_1_1_0_0()); 
            	            	          
            	            	    }
            	            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3138:1: (kw= '-' )?
            	            	    int alt79=2;
            	            	    int LA79_0 = input.LA(1);

            	            	    if ( (LA79_0==47) ) {
            	            	        alt79=1;
            	            	    }
            	            	    switch (alt79) {
            	            	        case 1 :
            	            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3139:2: kw= '-'
            	            	            {
            	            	            kw=(Token)match(input,47,FOLLOW_47_in_rulePath6515); if (state.failed) return current;
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
            	            	    break loop80;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3146:2: kw= '..'
            	            {
            	            kw=(Token)match(input,55,FOLLOW_55_in_rulePath6538); if (state.failed) return current;
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
            	    break loop82;
                }
            } while (true);

            this_SL_7=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath6556); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3166:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3167:2: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3168:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FOLLOW_ruleFileName_in_entryRuleFileName6602);
            iv_ruleFileName=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileName6613); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3175:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3178:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3179:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3179:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3179:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3186:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==40) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3187:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleFileName6672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFileNameAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6687); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3207:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3208:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3209:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsListRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6734);
            iv_ruleAnnotationsList=ruleAnnotationsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationsList6744); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3216:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3219:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3220:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3220:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3220:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3220:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3221:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3221:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3222:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList6790);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3238:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==56) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3239:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3239:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3240:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList6811);
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
            	    break loop84;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3264:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3265:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3266:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6848);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6858); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3273:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3276:28: ( (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3277:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3277:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3277:3: otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleAnnotation6895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3281:1: ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3282:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3282:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3283:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3283:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            int alt85=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt85=1;
                }
                break;
            case 58:
                {
                alt85=2;
                }
                break;
            case 59:
                {
                alt85=3;
                }
                break;
            case 60:
                {
                alt85=4;
                }
                break;
            case RULE_ID:
                {
                alt85=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3284:3: lv_name_1_1= 'Override'
                    {
                    lv_name_1_1=(Token)match(input,57,FOLLOW_57_in_ruleAnnotation6915); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3296:8: lv_name_1_2= 'Singleton'
                    {
                    lv_name_1_2=(Token)match(input,58,FOLLOW_58_in_ruleAnnotation6944); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3308:8: lv_name_1_3= 'LDFlags'
                    {
                    lv_name_1_3=(Token)match(input,59,FOLLOW_59_in_ruleAnnotation6973); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3320:8: lv_name_1_4= 'CFlags'
                    {
                    lv_name_1_4=(Token)match(input,60,FOLLOW_60_in_ruleAnnotation7002); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3332:8: lv_name_1_5= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameQualifiedNameParserRuleCall_1_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnnotation7034);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3350:2: (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==29) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3350:4: otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleAnnotation7050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3354:1: ( (lv_annotationElements_3_0= ruleAnnotationElement ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3355:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3355:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3356:3: lv_annotationElements_3_0= ruleAnnotationElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7071);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3372:2: (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==21) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3372:4: otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAnnotation7084); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3376:1: ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3377:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3377:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3378:3: lv_annotationElements_5_0= ruleAnnotationElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation7105);
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
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleAnnotation7119); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3406:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3407:2: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3408:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationElementRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7157);
            iv_ruleAnnotationElement=ruleAnnotationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement7167); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3415:1: ruleAnnotationElement returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_elementValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3418:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3419:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3419:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3419:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3419:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID) ) {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==49) ) {
                    alt88=1;
                }
            }
            switch (alt88) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3419:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3419:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3420:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3420:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3421:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement7210); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleAnnotationElement7227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3441:3: ( (lv_elementValue_2_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3442:1: (lv_elementValue_2_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3442:1: (lv_elementValue_2_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3443:3: lv_elementValue_2_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement7250);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3467:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3468:2: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3469:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueRule()); 
            }
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue7286);
            iv_ruleElementValue=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue7296); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3476:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3479:28: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3480:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3480:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt89=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt89=1;
                }
                break;
            case 56:
                {
                alt89=2;
                }
                break;
            case 24:
                {
                alt89=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3481:2: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue7346);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3494:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue7376);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3507:2: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7406);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3526:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3527:2: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3528:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueArrayInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7441);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7451); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3535:1: ruleElementValueArrayInitializer returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3538:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3539:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3539:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3539:3: otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleElementValueArrayInitializer7488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3543:1: ( (lv_values_1_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3544:1: (lv_values_1_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3544:1: (lv_values_1_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3545:3: lv_values_1_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7509);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3561:2: (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==21) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3561:4: otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleElementValueArrayInitializer7522); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3565:1: ( (lv_values_3_0= ruleElementValue ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3566:1: (lv_values_3_0= ruleElementValue )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3566:1: (lv_values_3_0= ruleElementValue )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3567:3: lv_values_3_0= ruleElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7543);
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
            	    break loop90;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleElementValueArrayInitializer7557); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3595:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3596:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3597:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue7593);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue7603); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3604:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstantFormat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3607:28: ( ( (lv_value_0_0= ruleConstantFormat ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3608:1: ( (lv_value_0_0= ruleConstantFormat ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3608:1: ( (lv_value_0_0= ruleConstantFormat ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3609:1: (lv_value_0_0= ruleConstantFormat )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3609:1: (lv_value_0_0= ruleConstantFormat )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3610:3: lv_value_0_0= ruleConstantFormat
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue7648);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3634:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3635:2: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3636:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantFormatRule()); 
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7684);
            iv_ruleConstantFormat=ruleConstantFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat7695); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3643:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3646:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3647:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3647:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            int alt91=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt91=1;
                }
                break;
            case RULE_STRING:
                {
                alt91=2;
                }
                break;
            case RULE_ID:
                {
                alt91=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3647:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat7735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3655:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat7761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getConstantFormatAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3663:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantFormat7787); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalFractal
    public final void synpred1_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_imports_0_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: ( (lv_imports_0_0= ruleImportDefinition ) )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
        {
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:88:3: lv_imports_0_0= ruleImportDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleImportDefinition_in_synpred1_InternalFractal137);
        lv_imports_0_0=ruleImportDefinition();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalFractal

    // $ANTLR start synpred13_InternalFractal
    public final void synpred13_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_13_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:462:3: (lv_elements_13_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:462:3: lv_elements_13_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_6_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred13_InternalFractal914);
        lv_elements_13_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalFractal

    // $ANTLR start synpred14_InternalFractal
    public final void synpred14_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_13_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:477:8: (lv_elements_13_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:477:8: lv_elements_13_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_6_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred14_InternalFractal933);
        lv_elements_13_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalFractal

    // $ANTLR start synpred15_InternalFractal
    public final void synpred15_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_13_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:492:8: (lv_elements_13_3= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:492:8: lv_elements_13_3= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsSubComponentDefinitionParserRuleCall_6_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred15_InternalFractal952);
        lv_elements_13_3=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalFractal

    // $ANTLR start synpred22_InternalFractal
    public final void synpred22_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_9_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:656:3: (lv_elements_9_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:656:3: lv_elements_9_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_6_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred22_InternalFractal1253);
        lv_elements_9_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalFractal

    // $ANTLR start synpred23_InternalFractal
    public final void synpred23_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_9_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:671:8: (lv_elements_9_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:671:8: lv_elements_9_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_6_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred23_InternalFractal1272);
        lv_elements_9_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalFractal

    // $ANTLR start synpred24_InternalFractal
    public final void synpred24_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_9_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:686:8: (lv_elements_9_3= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:686:8: lv_elements_9_3= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_6_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred24_InternalFractal1291);
        lv_elements_9_3=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalFractal

    // $ANTLR start synpred25_InternalFractal
    public final void synpred25_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_9_4 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:701:8: (lv_elements_9_4= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:701:8: lv_elements_9_4= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_6_0_3()); 
          	    
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred25_InternalFractal1310);
        lv_elements_9_4=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalFractal

    // $ANTLR start synpred29_InternalFractal
    public final void synpred29_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_7_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:832:3: (lv_elements_7_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:832:3: lv_elements_7_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_4_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred29_InternalFractal1568);
        lv_elements_7_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalFractal

    // $ANTLR start synpred37_InternalFractal
    public final void synpred37_InternalFractal_fragment() throws RecognitionException {   
        EObject this_ProvidedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1117:2: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1117:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred37_InternalFractal2151);
        this_ProvidedInterfaceDefinition_0=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalFractal

    // $ANTLR start synpred54_InternalFractal
    public final void synpred54_InternalFractal_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1689:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1689:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred54_InternalFractal3259);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalFractal

    // $ANTLR start synpred55_InternalFractal
    public final void synpred55_InternalFractal_fragment() throws RecognitionException {   
        EObject this_SubComponentDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1702:2: (this_SubComponentDefinition_1= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1702:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred55_InternalFractal3289);
        this_SubComponentDefinition_1=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalFractal

    // $ANTLR start synpred56_InternalFractal
    public final void synpred56_InternalFractal_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1748:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1748:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred56_InternalFractal3414);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalFractal

    // $ANTLR start synpred57_InternalFractal
    public final void synpred57_InternalFractal_fragment() throws RecognitionException {   
        EObject this_ImplementationDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1761:2: (this_ImplementationDefinition_1= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1761:2: this_ImplementationDefinition_1= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred57_InternalFractal3444);
        this_ImplementationDefinition_1=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalFractal

    // $ANTLR start synpred58_InternalFractal
    public final void synpred58_InternalFractal_fragment() throws RecognitionException {   
        EObject this_AttributeDefinition_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1774:2: (this_AttributeDefinition_2= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1774:2: this_AttributeDefinition_2= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred58_InternalFractal3474);
        this_AttributeDefinition_2=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalFractal

    // $ANTLR start synpred85_InternalFractal
    public final void synpred85_InternalFractal_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_cType_4_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2698:1: ( (lv_cType_4_0= ruleAttributeType ) )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2698:1: (lv_cType_4_0= ruleAttributeType )
        {
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2698:1: (lv_cType_4_0= ruleAttributeType )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2699:3: lv_cType_4_0= ruleAttributeType
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getCTypeAttributeTypeParserRuleCall_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAttributeType_in_synpred85_InternalFractal5558);
        lv_cType_4_0=ruleAttributeType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred85_InternalFractal

    // Delegated rules

    public final boolean synpred29_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdlDefinition91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137 = new BitSet(new long[]{0x010000001C090000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition159 = new BitSet(new long[]{0x010000001C080000L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition181 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_19_in_ruleCompositeDefinition677 = new BitSet(new long[]{0x0000000021900010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition698 = new BitSet(new long[]{0x0000000021900000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeDefinition712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition734 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeDefinition747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition768 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeDefinition783 = new BitSet(new long[]{0x0000000021800000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeDefinition806 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleCompositeDefinition820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeSuperType_in_ruleCompositeDefinition841 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeDefinition854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompositeSuperType_in_ruleCompositeDefinition875 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_ruleCompositeDefinition891 = new BitSet(new long[]{0x0100006882000000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleCompositeDefinition914 = new BitSet(new long[]{0x0100006882000000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleCompositeDefinition933 = new BitSet(new long[]{0x0100006882000000L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition952 = new BitSet(new long[]{0x0100006882000000L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition971 = new BitSet(new long[]{0x0100006882000000L});
    public static final BitSet FOLLOW_25_in_ruleCompositeDefinition987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinition1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveDefinition1076 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePrimitiveDefinition1102 = new BitSet(new long[]{0x0000000021800010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1123 = new BitSet(new long[]{0x0000000021800000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1145 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_rulePrimitiveDefinition1159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1180 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveDefinition1193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePrimitiveSuperType_in_rulePrimitiveDefinition1214 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveDefinition1230 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1253 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1272 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1291 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1310 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1329 = new BitSet(new long[]{0x0168000882000000L});
    public static final BitSet FOLLOW_25_in_rulePrimitiveDefinition1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTypeDefinition1428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1449 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleTypeDefinition1462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1489 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_ruleTypeDefinition1502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1529 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_ruleTypeDefinition1545 = new BitSet(new long[]{0x0100000882000000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1568 = new BitSet(new long[]{0x0100000882000000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1587 = new BitSet(new long[]{0x0100000882000000L});
    public static final BitSet FOLLOW_25_in_ruleTypeDefinition1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeSuperType_in_entryRuleCompositeSuperType1639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeSuperType1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeSuperType1701 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_20_in_ruleCompositeSuperType1714 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1735 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeSuperType1748 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleCompositeSuperType1769 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeSuperType1783 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleCompositeSuperType1798 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1819 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeSuperType1832 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleCompositeSuperType1853 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleCompositeSuperType1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSuperType_in_entryRulePrimitiveSuperType1905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveSuperType1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveSuperType1967 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rulePrimitiveSuperType1980 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2001 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveSuperType2014 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_rulePrimitiveSuperType2035 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_rulePrimitiveSuperType2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition2091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition2216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition2272 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleProvidedInterfaceDefinition2291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition2331 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleProvidedInterfaceDefinition2343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition2360 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleProvidedInterfaceDefinition2384 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition2414 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleProvidedInterfaceDefinition2432 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProvidedInterfaceDefinition2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition2482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition2538 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRequiredInterfaceDefinition2557 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleRequiredInterfaceDefinition2588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2629 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRequiredInterfaceDefinition2641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2658 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleRequiredInterfaceDefinition2682 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2712 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRequiredInterfaceDefinition2730 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRequiredInterfaceDefinition2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2838 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSubComponentDefinition2851 = new BitSet(new long[]{0x0000000120100010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2878 = new BitSet(new long[]{0x0000000120100000L});
    public static final BitSet FOLLOW_20_in_ruleSubComponentDefinition2892 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition2913 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentDefinition2926 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleSubComponentDefinition2947 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleSubComponentDefinition2961 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_29_in_ruleSubComponentDefinition2976 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2997 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentDefinition3010 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition3031 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleSubComponentDefinition3045 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSubComponentDefinition3059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubComponentDefinition3076 = new BitSet(new long[]{0x010000000C0A0000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition3102 = new BitSet(new long[]{0x000000000C0A0000L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_ruleSubComponentDefinition3126 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_ruleSubComponentDefinition3145 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSubComponentDefinition3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement3199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeElement3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveElement3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition3595 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBindingDefinition3608 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3633 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39_in_ruleBindingDefinition3657 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleBindingDefinition3683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3707 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition3720 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition3737 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition3754 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleBindingDefinition3768 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3793 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39_in_ruleBindingDefinition3817 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleBindingDefinition3843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3867 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleBindingDefinition3880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition3897 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBindingDefinition3914 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBindingDefinition3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument3964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList4055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFormalArgumentsList4102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4123 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleFormalArgumentsList4136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4157 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleFormalArgumentsList4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier4207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier4259 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleTemplateSpecifier4276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType4340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAttributeType4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAttributeType4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAttributeType4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT4494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignedINT4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulesignedINT4544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_47_in_rulesignedINT4563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_ruleValue4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXADECIMAL_TYPE_in_ruleValue4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueList_in_ruleValue4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValue4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueList_in_entryRuleValueList4810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueList4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValueList4857 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueList4878 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleValueList4891 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueList4912 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleValueList4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_entryRuleTemplateReference4962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateReference4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateReference5019 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTemplateReference5031 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateReference5061 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_50_in_ruleTemplateReference5085 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_20_in_ruleTemplateReference5112 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleTemplateReference5133 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleTemplateReference5146 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleTemplateReference_in_ruleTemplateReference5167 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleTemplateReference5181 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTemplateReference5196 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference5217 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleTemplateReference5230 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleTemplateReference5251 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleTemplateReference5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition5356 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleArgumentDefinition5373 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition5488 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleAttributeDefinition5501 = new BitSet(new long[]{0x0080390000000210L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleAttributeDefinition5523 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleAttributeDefinition5535 = new BitSet(new long[]{0x0000380000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5599 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_49_in_ruleAttributeDefinition5617 = new BitSet(new long[]{0x0001C000010000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition5638 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttributeDefinition5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5744 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleImplementationDefinition5757 = new BitSet(new long[]{0x0080010000000310L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition5779 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5806 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleImplementationDefinition5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5911 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleDataDefinition5924 = new BitSet(new long[]{0x0080010000000310L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition5946 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5973 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataDefinition5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6074 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleQualifiedName6093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6108 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC6155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileC6165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_ruleFileC6211 = new BitSet(new long[]{0x0080010000000210L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleFileC6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_C_in_ruleInlineCodeC6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath6361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath6413 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_40_in_rulePath6437 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_55_in_rulePath6456 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath6474 = new BitSet(new long[]{0x0080000000000210L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath6496 = new BitSet(new long[]{0x0000800000000210L});
    public static final BitSet FOLLOW_47_in_rulePath6515 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_55_in_rulePath6538 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName6602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileName6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6653 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleFileName6672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6790 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6811 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAnnotation6895 = new BitSet(new long[]{0x1E00000000000010L});
    public static final BitSet FOLLOW_57_in_ruleAnnotation6915 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_58_in_ruleAnnotation6944 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_59_in_ruleAnnotation6973 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_60_in_ruleAnnotation7002 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotation7034 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAnnotation7050 = new BitSet(new long[]{0x01000000010000B0L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7071 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleAnnotation7084 = new BitSet(new long[]{0x01000000010000B0L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation7105 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleAnnotation7119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement7157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement7210 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleAnnotationElement7227 = new BitSet(new long[]{0x01000000010000B0L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement7250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue7286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue7296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleElementValueArrayInitializer7488 = new BitSet(new long[]{0x01000000010000B0L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7509 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleElementValueArrayInitializer7522 = new BitSet(new long[]{0x01000000010000B0L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7543 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleElementValueArrayInitializer7557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue7593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue7603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue7648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat7761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantFormat7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_synpred1_InternalFractal137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred13_InternalFractal914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred14_InternalFractal933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred15_InternalFractal952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred22_InternalFractal1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred23_InternalFractal1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred24_InternalFractal1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred25_InternalFractal1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred29_InternalFractal1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred37_InternalFractal2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred54_InternalFractal3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred55_InternalFractal3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred56_InternalFractal3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred57_InternalFractal3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred58_InternalFractal3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_synpred85_InternalFractal5558 = new BitSet(new long[]{0x0000000000000002L});

}