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
import org.ow2.mindEd.services.IdtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIdtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#ifndef'", "'#endif'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalIdtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIdtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIdtParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private IdtGrammarAccess grammarAccess;
     	
        public InternalIdtParser(TokenStream input, IdtGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "IdtFile";	
       	}
       	
       	@Override
       	protected IdtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleIdtFile"
    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:73:1: entryRuleIdtFile returns [EObject current=null] : iv_ruleIdtFile= ruleIdtFile EOF ;
    public final EObject entryRuleIdtFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdtFile = null;


        try {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:74:2: (iv_ruleIdtFile= ruleIdtFile EOF )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:75:2: iv_ruleIdtFile= ruleIdtFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdtFileRule()); 
            }
            pushFollow(FOLLOW_ruleIdtFile_in_entryRuleIdtFile81);
            iv_ruleIdtFile=ruleIdtFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdtFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdtFile91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdtFile"


    // $ANTLR start "ruleIdtFile"
    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:82:1: ruleIdtFile returns [EObject current=null] : ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )* ( ( (otherlv_3= RULE_ID ) ) | ( (otherlv_4= RULE_ID ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) ) ;
    public final EObject ruleIdtFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_begindef_0_0 = null;

        AntlrDatatypeRuleToken lv_endDef_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:85:28: ( ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )* ( ( (otherlv_3= RULE_ID ) ) | ( (otherlv_4= RULE_ID ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) ) )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:86:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )* ( ( (otherlv_3= RULE_ID ) ) | ( (otherlv_4= RULE_ID ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) )
            {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:86:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )* ( ( (otherlv_3= RULE_ID ) ) | ( (otherlv_4= RULE_ID ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:86:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )* ( ( (otherlv_3= RULE_ID ) ) | ( (otherlv_4= RULE_ID ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) )
            {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:86:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:87:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:87:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:88:3: lv_begindef_0_0= ruleConstantDefinitionBegin
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile137);
            lv_begindef_0_0=ruleConstantDefinitionBegin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
              	        }
                     		set(
                     			current, 
                     			"begindef",
                      		lv_begindef_0_0, 
                      		"ConstantDefinitionBegin");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:104:2: ( (otherlv_1= RULE_ID ) )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:105:1: (otherlv_1= RULE_ID )
            {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:105:1: (otherlv_1= RULE_ID )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:106:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdtFileRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdtFile161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getIdtFileAccess().getDefConstantDefinitionCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:120:2: ( (otherlv_2= RULE_ID ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (synpred1_InternalIdt()) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:121:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:121:1: (otherlv_2= RULE_ID )
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:122:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getIdtFileRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdtFile185); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveCrossReference_2_0()); 
            	      	
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:136:3: ( ( (otherlv_3= RULE_ID ) ) | ( (otherlv_4= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2_InternalIdt()) ) {
                        alt2=1;
                    }
                    else if ( (synpred3_InternalIdt()) ) {
                        alt2=2;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:136:4: ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:136:4: ( (otherlv_3= RULE_ID ) )
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:137:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:137:1: (otherlv_3= RULE_ID )
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:138:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getIdtFileRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdtFile211); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getIdtFileAccess().getConstantConstantDefinitionCrossReference_3_0_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:153:6: ( (otherlv_4= RULE_ID ) )
            	    {
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:153:6: ( (otherlv_4= RULE_ID ) )
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:154:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:154:1: (otherlv_4= RULE_ID )
            	    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:155:3: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getIdtFileRule());
            	      	        }
            	              
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdtFile241); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_4, grammarAccess.getIdtFileAccess().getTypeTypeDefinitionCrossReference_3_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:169:4: ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:170:1: (lv_endDef_5_0= ruleConstantDefinitionEnd )
            {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:170:1: (lv_endDef_5_0= ruleConstantDefinitionEnd )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:171:3: lv_endDef_5_0= ruleConstantDefinitionEnd
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdtFileAccess().getEndDefConstantDefinitionEndParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_ruleIdtFile264);
            lv_endDef_5_0=ruleConstantDefinitionEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
              	        }
                     		set(
                     			current, 
                     			"endDef",
                      		lv_endDef_5_0, 
                      		"ConstantDefinitionEnd");
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
    // $ANTLR end "ruleIdtFile"


    // $ANTLR start "entryRuleConstantDefinitionBegin"
    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:195:1: entryRuleConstantDefinitionBegin returns [EObject current=null] : iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF ;
    public final EObject entryRuleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinitionBegin = null;


        try {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:196:2: (iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:197:2: iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionBeginRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin300);
            iv_ruleConstantDefinitionBegin=ruleConstantDefinitionBegin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinitionBegin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionBegin310); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantDefinitionBegin"


    // $ANTLR start "ruleConstantDefinitionBegin"
    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:204:1: ruleConstantDefinitionBegin returns [EObject current=null] : (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:207:28: ( (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:208:1: (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:208:1: (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:208:3: otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleConstantDefinitionBegin347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:212:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:213:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:213:1: (lv_name_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:214:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantDefinitionBeginAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDefinitionBeginRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleConstantDefinitionBegin"


    // $ANTLR start "entryRuleConstantDefinitionEnd"
    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:238:1: entryRuleConstantDefinitionEnd returns [String current=null] : iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF ;
    public final String entryRuleConstantDefinitionEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantDefinitionEnd = null;


        try {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:239:2: (iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:240:2: iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionEndRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd406);
            iv_ruleConstantDefinitionEnd=ruleConstantDefinitionEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinitionEnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionEnd417); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantDefinitionEnd"


    // $ANTLR start "ruleConstantDefinitionEnd"
    // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:247:1: ruleConstantDefinitionEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#endif' ;
    public final AntlrDatatypeRuleToken ruleConstantDefinitionEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:250:28: (kw= '#endif' )
            // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:252:2: kw= '#endif'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleConstantDefinitionEnd454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getConstantDefinitionEndAccess().getEndifKeyword()); 
                  
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
    // $ANTLR end "ruleConstantDefinitionEnd"

    // $ANTLR start synpred1_InternalIdt
    public final void synpred1_InternalIdt_fragment() throws RecognitionException {   
        Token otherlv_2=null;

        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:121:1: ( (otherlv_2= RULE_ID ) )
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:121:1: (otherlv_2= RULE_ID )
        {
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:121:1: (otherlv_2= RULE_ID )
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:122:3: otherlv_2= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalIdt185); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalIdt

    // $ANTLR start synpred2_InternalIdt
    public final void synpred2_InternalIdt_fragment() throws RecognitionException {   
        Token otherlv_3=null;

        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:136:4: ( ( (otherlv_3= RULE_ID ) ) )
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:136:4: ( (otherlv_3= RULE_ID ) )
        {
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:136:4: ( (otherlv_3= RULE_ID ) )
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:137:1: (otherlv_3= RULE_ID )
        {
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:137:1: (otherlv_3= RULE_ID )
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:138:3: otherlv_3= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred2_InternalIdt211); if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalIdt

    // $ANTLR start synpred3_InternalIdt
    public final void synpred3_InternalIdt_fragment() throws RecognitionException {   
        Token otherlv_4=null;

        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:153:6: ( ( (otherlv_4= RULE_ID ) ) )
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:153:6: ( (otherlv_4= RULE_ID ) )
        {
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:153:6: ( (otherlv_4= RULE_ID ) )
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:154:1: (otherlv_4= RULE_ID )
        {
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:154:1: (otherlv_4= RULE_ID )
        // ../org.ow2.mindEd.idt/src-gen/org/ow2/mindEd/parser/antlr/internal/InternalIdt.g:155:3: otherlv_4= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred3_InternalIdt241); if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalIdt

    // Delegated rules

    public final boolean synpred2_InternalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleIdtFile_in_entryRuleIdtFile81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdtFile91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdtFile161 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdtFile185 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdtFile211 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdtFile241 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_ruleIdtFile264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionBegin310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConstantDefinitionBegin347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionEnd417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConstantDefinitionEnd454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalIdt185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred2_InternalIdt211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred3_InternalIdt241 = new BitSet(new long[]{0x0000000000000002L});

}