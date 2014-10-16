package org.ow2.mindEd.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.ow2.mindEd.services.IdtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIdtParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#endif'", "'#ifndef'"
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
    public String getGrammarFileName() { return "../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g"; }


     
     	private IdtGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IdtGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleIdtFile"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:61:1: entryRuleIdtFile : ruleIdtFile EOF ;
    public final void entryRuleIdtFile() throws RecognitionException {
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:62:1: ( ruleIdtFile EOF )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:63:1: ruleIdtFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileRule()); 
            }
            pushFollow(FOLLOW_ruleIdtFile_in_entryRuleIdtFile67);
            ruleIdtFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdtFile74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdtFile"


    // $ANTLR start "ruleIdtFile"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:70:1: ruleIdtFile : ( ( rule__IdtFile__Group__0 ) ) ;
    public final void ruleIdtFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:74:2: ( ( ( rule__IdtFile__Group__0 ) ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:75:1: ( ( rule__IdtFile__Group__0 ) )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:75:1: ( ( rule__IdtFile__Group__0 ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:76:1: ( rule__IdtFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getGroup()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:77:1: ( rule__IdtFile__Group__0 )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:77:2: rule__IdtFile__Group__0
            {
            pushFollow(FOLLOW_rule__IdtFile__Group__0_in_ruleIdtFile100);
            rule__IdtFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdtFile"


    // $ANTLR start "entryRuleConstantDefinitionBegin"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:89:1: entryRuleConstantDefinitionBegin : ruleConstantDefinitionBegin EOF ;
    public final void entryRuleConstantDefinitionBegin() throws RecognitionException {
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:90:1: ( ruleConstantDefinitionBegin EOF )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:91:1: ruleConstantDefinitionBegin EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionBeginRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin127);
            ruleConstantDefinitionBegin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionBeginRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionBegin134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantDefinitionBegin"


    // $ANTLR start "ruleConstantDefinitionBegin"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:98:1: ruleConstantDefinitionBegin : ( ( rule__ConstantDefinitionBegin__Group__0 ) ) ;
    public final void ruleConstantDefinitionBegin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:102:2: ( ( ( rule__ConstantDefinitionBegin__Group__0 ) ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:103:1: ( ( rule__ConstantDefinitionBegin__Group__0 ) )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:103:1: ( ( rule__ConstantDefinitionBegin__Group__0 ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:104:1: ( rule__ConstantDefinitionBegin__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionBeginAccess().getGroup()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:105:1: ( rule__ConstantDefinitionBegin__Group__0 )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:105:2: rule__ConstantDefinitionBegin__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionBegin__Group__0_in_ruleConstantDefinitionBegin160);
            rule__ConstantDefinitionBegin__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionBeginAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantDefinitionBegin"


    // $ANTLR start "entryRuleConstantDefinitionEnd"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:117:1: entryRuleConstantDefinitionEnd : ruleConstantDefinitionEnd EOF ;
    public final void entryRuleConstantDefinitionEnd() throws RecognitionException {
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:118:1: ( ruleConstantDefinitionEnd EOF )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:119:1: ruleConstantDefinitionEnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionEndRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd187);
            ruleConstantDefinitionEnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionEndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionEnd194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantDefinitionEnd"


    // $ANTLR start "ruleConstantDefinitionEnd"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:126:1: ruleConstantDefinitionEnd : ( '#endif' ) ;
    public final void ruleConstantDefinitionEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:130:2: ( ( '#endif' ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:131:1: ( '#endif' )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:131:1: ( '#endif' )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:132:1: '#endif'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionEndAccess().getEndifKeyword()); 
            }
            match(input,11,FOLLOW_11_in_ruleConstantDefinitionEnd221); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionEndAccess().getEndifKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantDefinitionEnd"


    // $ANTLR start "rule__IdtFile__Alternatives_3"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:147:1: rule__IdtFile__Alternatives_3 : ( ( ( rule__IdtFile__ConstantAssignment_3_0 ) ) | ( ( rule__IdtFile__TypeAssignment_3_1 ) ) );
    public final void rule__IdtFile__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:151:1: ( ( ( rule__IdtFile__ConstantAssignment_3_0 ) ) | ( ( rule__IdtFile__TypeAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (synpred1_InternalIdt()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:152:1: ( ( rule__IdtFile__ConstantAssignment_3_0 ) )
                    {
                    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:152:1: ( ( rule__IdtFile__ConstantAssignment_3_0 ) )
                    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:153:1: ( rule__IdtFile__ConstantAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdtFileAccess().getConstantAssignment_3_0()); 
                    }
                    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:154:1: ( rule__IdtFile__ConstantAssignment_3_0 )
                    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:154:2: rule__IdtFile__ConstantAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__IdtFile__ConstantAssignment_3_0_in_rule__IdtFile__Alternatives_3258);
                    rule__IdtFile__ConstantAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdtFileAccess().getConstantAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:158:6: ( ( rule__IdtFile__TypeAssignment_3_1 ) )
                    {
                    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:158:6: ( ( rule__IdtFile__TypeAssignment_3_1 ) )
                    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:159:1: ( rule__IdtFile__TypeAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdtFileAccess().getTypeAssignment_3_1()); 
                    }
                    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:160:1: ( rule__IdtFile__TypeAssignment_3_1 )
                    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:160:2: rule__IdtFile__TypeAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__IdtFile__TypeAssignment_3_1_in_rule__IdtFile__Alternatives_3276);
                    rule__IdtFile__TypeAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdtFileAccess().getTypeAssignment_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__Alternatives_3"


    // $ANTLR start "rule__IdtFile__Group__0"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:171:1: rule__IdtFile__Group__0 : rule__IdtFile__Group__0__Impl rule__IdtFile__Group__1 ;
    public final void rule__IdtFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:175:1: ( rule__IdtFile__Group__0__Impl rule__IdtFile__Group__1 )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:176:2: rule__IdtFile__Group__0__Impl rule__IdtFile__Group__1
            {
            pushFollow(FOLLOW_rule__IdtFile__Group__0__Impl_in_rule__IdtFile__Group__0307);
            rule__IdtFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IdtFile__Group__1_in_rule__IdtFile__Group__0310);
            rule__IdtFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__Group__0"


    // $ANTLR start "rule__IdtFile__Group__0__Impl"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:183:1: rule__IdtFile__Group__0__Impl : ( ( rule__IdtFile__BegindefAssignment_0 ) ) ;
    public final void rule__IdtFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:187:1: ( ( ( rule__IdtFile__BegindefAssignment_0 ) ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:188:1: ( ( rule__IdtFile__BegindefAssignment_0 ) )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:188:1: ( ( rule__IdtFile__BegindefAssignment_0 ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:189:1: ( rule__IdtFile__BegindefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getBegindefAssignment_0()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:190:1: ( rule__IdtFile__BegindefAssignment_0 )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:190:2: rule__IdtFile__BegindefAssignment_0
            {
            pushFollow(FOLLOW_rule__IdtFile__BegindefAssignment_0_in_rule__IdtFile__Group__0__Impl337);
            rule__IdtFile__BegindefAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getBegindefAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__Group__0__Impl"


    // $ANTLR start "rule__IdtFile__Group__1"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:200:1: rule__IdtFile__Group__1 : rule__IdtFile__Group__1__Impl rule__IdtFile__Group__2 ;
    public final void rule__IdtFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:204:1: ( rule__IdtFile__Group__1__Impl rule__IdtFile__Group__2 )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:205:2: rule__IdtFile__Group__1__Impl rule__IdtFile__Group__2
            {
            pushFollow(FOLLOW_rule__IdtFile__Group__1__Impl_in_rule__IdtFile__Group__1367);
            rule__IdtFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IdtFile__Group__2_in_rule__IdtFile__Group__1370);
            rule__IdtFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__Group__1"


    // $ANTLR start "rule__IdtFile__Group__1__Impl"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:212:1: rule__IdtFile__Group__1__Impl : ( ( rule__IdtFile__DefAssignment_1 ) ) ;
    public final void rule__IdtFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:216:1: ( ( ( rule__IdtFile__DefAssignment_1 ) ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:217:1: ( ( rule__IdtFile__DefAssignment_1 ) )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:217:1: ( ( rule__IdtFile__DefAssignment_1 ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:218:1: ( rule__IdtFile__DefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getDefAssignment_1()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:219:1: ( rule__IdtFile__DefAssignment_1 )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:219:2: rule__IdtFile__DefAssignment_1
            {
            pushFollow(FOLLOW_rule__IdtFile__DefAssignment_1_in_rule__IdtFile__Group__1__Impl397);
            rule__IdtFile__DefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getDefAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__Group__1__Impl"


    // $ANTLR start "rule__IdtFile__Group__2"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:229:1: rule__IdtFile__Group__2 : rule__IdtFile__Group__2__Impl rule__IdtFile__Group__3 ;
    public final void rule__IdtFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:233:1: ( rule__IdtFile__Group__2__Impl rule__IdtFile__Group__3 )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:234:2: rule__IdtFile__Group__2__Impl rule__IdtFile__Group__3
            {
            pushFollow(FOLLOW_rule__IdtFile__Group__2__Impl_in_rule__IdtFile__Group__2427);
            rule__IdtFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IdtFile__Group__3_in_rule__IdtFile__Group__2430);
            rule__IdtFile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__Group__2"


    // $ANTLR start "rule__IdtFile__Group__2__Impl"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:241:1: rule__IdtFile__Group__2__Impl : ( ( rule__IdtFile__IncludesAssignment_2 )* ) ;
    public final void rule__IdtFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:245:1: ( ( ( rule__IdtFile__IncludesAssignment_2 )* ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:246:1: ( ( rule__IdtFile__IncludesAssignment_2 )* )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:246:1: ( ( rule__IdtFile__IncludesAssignment_2 )* )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:247:1: ( rule__IdtFile__IncludesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getIncludesAssignment_2()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:248:1: ( rule__IdtFile__IncludesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_1 = input.LA(2);

                    if ( (synpred2_InternalIdt()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:248:2: rule__IdtFile__IncludesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__IdtFile__IncludesAssignment_2_in_rule__IdtFile__Group__2__Impl457);
            	    rule__IdtFile__IncludesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getIncludesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__Group__2__Impl"


    // $ANTLR start "rule__IdtFile__Group__3"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:258:1: rule__IdtFile__Group__3 : rule__IdtFile__Group__3__Impl rule__IdtFile__Group__4 ;
    public final void rule__IdtFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:262:1: ( rule__IdtFile__Group__3__Impl rule__IdtFile__Group__4 )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:263:2: rule__IdtFile__Group__3__Impl rule__IdtFile__Group__4
            {
            pushFollow(FOLLOW_rule__IdtFile__Group__3__Impl_in_rule__IdtFile__Group__3488);
            rule__IdtFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IdtFile__Group__4_in_rule__IdtFile__Group__3491);
            rule__IdtFile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__Group__3"


    // $ANTLR start "rule__IdtFile__Group__3__Impl"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:270:1: rule__IdtFile__Group__3__Impl : ( ( rule__IdtFile__Alternatives_3 )* ) ;
    public final void rule__IdtFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:274:1: ( ( ( rule__IdtFile__Alternatives_3 )* ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:275:1: ( ( rule__IdtFile__Alternatives_3 )* )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:275:1: ( ( rule__IdtFile__Alternatives_3 )* )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:276:1: ( rule__IdtFile__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getAlternatives_3()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:277:1: ( rule__IdtFile__Alternatives_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:277:2: rule__IdtFile__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__IdtFile__Alternatives_3_in_rule__IdtFile__Group__3__Impl518);
            	    rule__IdtFile__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__Group__3__Impl"


    // $ANTLR start "rule__IdtFile__Group__4"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:287:1: rule__IdtFile__Group__4 : rule__IdtFile__Group__4__Impl ;
    public final void rule__IdtFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:291:1: ( rule__IdtFile__Group__4__Impl )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:292:2: rule__IdtFile__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__IdtFile__Group__4__Impl_in_rule__IdtFile__Group__4549);
            rule__IdtFile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__Group__4"


    // $ANTLR start "rule__IdtFile__Group__4__Impl"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:298:1: rule__IdtFile__Group__4__Impl : ( ( rule__IdtFile__EndDefAssignment_4 ) ) ;
    public final void rule__IdtFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:302:1: ( ( ( rule__IdtFile__EndDefAssignment_4 ) ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:303:1: ( ( rule__IdtFile__EndDefAssignment_4 ) )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:303:1: ( ( rule__IdtFile__EndDefAssignment_4 ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:304:1: ( rule__IdtFile__EndDefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getEndDefAssignment_4()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:305:1: ( rule__IdtFile__EndDefAssignment_4 )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:305:2: rule__IdtFile__EndDefAssignment_4
            {
            pushFollow(FOLLOW_rule__IdtFile__EndDefAssignment_4_in_rule__IdtFile__Group__4__Impl576);
            rule__IdtFile__EndDefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getEndDefAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__Group__4__Impl"


    // $ANTLR start "rule__ConstantDefinitionBegin__Group__0"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:325:1: rule__ConstantDefinitionBegin__Group__0 : rule__ConstantDefinitionBegin__Group__0__Impl rule__ConstantDefinitionBegin__Group__1 ;
    public final void rule__ConstantDefinitionBegin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:329:1: ( rule__ConstantDefinitionBegin__Group__0__Impl rule__ConstantDefinitionBegin__Group__1 )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:330:2: rule__ConstantDefinitionBegin__Group__0__Impl rule__ConstantDefinitionBegin__Group__1
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionBegin__Group__0__Impl_in_rule__ConstantDefinitionBegin__Group__0616);
            rule__ConstantDefinitionBegin__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstantDefinitionBegin__Group__1_in_rule__ConstantDefinitionBegin__Group__0619);
            rule__ConstantDefinitionBegin__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinitionBegin__Group__0"


    // $ANTLR start "rule__ConstantDefinitionBegin__Group__0__Impl"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:337:1: rule__ConstantDefinitionBegin__Group__0__Impl : ( '#ifndef' ) ;
    public final void rule__ConstantDefinitionBegin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:341:1: ( ( '#ifndef' ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:342:1: ( '#ifndef' )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:342:1: ( '#ifndef' )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:343:1: '#ifndef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0()); 
            }
            match(input,12,FOLLOW_12_in_rule__ConstantDefinitionBegin__Group__0__Impl647); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinitionBegin__Group__0__Impl"


    // $ANTLR start "rule__ConstantDefinitionBegin__Group__1"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:356:1: rule__ConstantDefinitionBegin__Group__1 : rule__ConstantDefinitionBegin__Group__1__Impl ;
    public final void rule__ConstantDefinitionBegin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:360:1: ( rule__ConstantDefinitionBegin__Group__1__Impl )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:361:2: rule__ConstantDefinitionBegin__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionBegin__Group__1__Impl_in_rule__ConstantDefinitionBegin__Group__1678);
            rule__ConstantDefinitionBegin__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinitionBegin__Group__1"


    // $ANTLR start "rule__ConstantDefinitionBegin__Group__1__Impl"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:367:1: rule__ConstantDefinitionBegin__Group__1__Impl : ( ( rule__ConstantDefinitionBegin__NameAssignment_1 ) ) ;
    public final void rule__ConstantDefinitionBegin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:371:1: ( ( ( rule__ConstantDefinitionBegin__NameAssignment_1 ) ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:372:1: ( ( rule__ConstantDefinitionBegin__NameAssignment_1 ) )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:372:1: ( ( rule__ConstantDefinitionBegin__NameAssignment_1 ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:373:1: ( rule__ConstantDefinitionBegin__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionBeginAccess().getNameAssignment_1()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:374:1: ( rule__ConstantDefinitionBegin__NameAssignment_1 )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:374:2: rule__ConstantDefinitionBegin__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionBegin__NameAssignment_1_in_rule__ConstantDefinitionBegin__Group__1__Impl705);
            rule__ConstantDefinitionBegin__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionBeginAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinitionBegin__Group__1__Impl"


    // $ANTLR start "rule__IdtFile__BegindefAssignment_0"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:389:1: rule__IdtFile__BegindefAssignment_0 : ( ruleConstantDefinitionBegin ) ;
    public final void rule__IdtFile__BegindefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:393:1: ( ( ruleConstantDefinitionBegin ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:394:1: ( ruleConstantDefinitionBegin )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:394:1: ( ruleConstantDefinitionBegin )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:395:1: ruleConstantDefinitionBegin
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_rule__IdtFile__BegindefAssignment_0744);
            ruleConstantDefinitionBegin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__BegindefAssignment_0"


    // $ANTLR start "rule__IdtFile__DefAssignment_1"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:404:1: rule__IdtFile__DefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__IdtFile__DefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:408:1: ( ( ( RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:409:1: ( ( RULE_ID ) )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:409:1: ( ( RULE_ID ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:410:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getDefConstantDefinitionCrossReference_1_0()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:411:1: ( RULE_ID )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:412:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getDefConstantDefinitionIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IdtFile__DefAssignment_1779); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getDefConstantDefinitionIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getDefConstantDefinitionCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__DefAssignment_1"


    // $ANTLR start "rule__IdtFile__IncludesAssignment_2"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:423:1: rule__IdtFile__IncludesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__IdtFile__IncludesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:427:1: ( ( ( RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:428:1: ( ( RULE_ID ) )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:428:1: ( ( RULE_ID ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:429:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveCrossReference_2_0()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:430:1: ( RULE_ID )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:431:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IdtFile__IncludesAssignment_2818); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__IncludesAssignment_2"


    // $ANTLR start "rule__IdtFile__ConstantAssignment_3_0"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:442:1: rule__IdtFile__ConstantAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__IdtFile__ConstantAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:446:1: ( ( ( RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:447:1: ( ( RULE_ID ) )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:447:1: ( ( RULE_ID ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:448:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionCrossReference_3_0_0()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:449:1: ( RULE_ID )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:450:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionIDTerminalRuleCall_3_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IdtFile__ConstantAssignment_3_0857); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionIDTerminalRuleCall_3_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionCrossReference_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__ConstantAssignment_3_0"


    // $ANTLR start "rule__IdtFile__TypeAssignment_3_1"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:461:1: rule__IdtFile__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__IdtFile__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:465:1: ( ( ( RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:466:1: ( ( RULE_ID ) )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:466:1: ( ( RULE_ID ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:467:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionCrossReference_3_1_0()); 
            }
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:468:1: ( RULE_ID )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:469:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IdtFile__TypeAssignment_3_1896); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__TypeAssignment_3_1"


    // $ANTLR start "rule__IdtFile__EndDefAssignment_4"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:480:1: rule__IdtFile__EndDefAssignment_4 : ( ruleConstantDefinitionEnd ) ;
    public final void rule__IdtFile__EndDefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:484:1: ( ( ruleConstantDefinitionEnd ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:485:1: ( ruleConstantDefinitionEnd )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:485:1: ( ruleConstantDefinitionEnd )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:486:1: ruleConstantDefinitionEnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getEndDefConstantDefinitionEndParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_rule__IdtFile__EndDefAssignment_4931);
            ruleConstantDefinitionEnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getEndDefConstantDefinitionEndParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdtFile__EndDefAssignment_4"


    // $ANTLR start "rule__ConstantDefinitionBegin__NameAssignment_1"
    // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:495:1: rule__ConstantDefinitionBegin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstantDefinitionBegin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:499:1: ( ( RULE_ID ) )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:500:1: ( RULE_ID )
            {
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:500:1: ( RULE_ID )
            // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:501:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionBeginAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantDefinitionBegin__NameAssignment_1962); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionBeginAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDefinitionBegin__NameAssignment_1"

    // $ANTLR start synpred1_InternalIdt
    public final void synpred1_InternalIdt_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:152:1: ( ( ( rule__IdtFile__ConstantAssignment_3_0 ) ) )
        // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:152:1: ( ( rule__IdtFile__ConstantAssignment_3_0 ) )
        {
        // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:152:1: ( ( rule__IdtFile__ConstantAssignment_3_0 ) )
        // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:153:1: ( rule__IdtFile__ConstantAssignment_3_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getIdtFileAccess().getConstantAssignment_3_0()); 
        }
        // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:154:1: ( rule__IdtFile__ConstantAssignment_3_0 )
        // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:154:2: rule__IdtFile__ConstantAssignment_3_0
        {
        pushFollow(FOLLOW_rule__IdtFile__ConstantAssignment_3_0_in_synpred1_InternalIdt258);
        rule__IdtFile__ConstantAssignment_3_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalIdt

    // $ANTLR start synpred2_InternalIdt
    public final void synpred2_InternalIdt_fragment() throws RecognitionException {   
        // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:248:2: ( rule__IdtFile__IncludesAssignment_2 )
        // ../org.ow2.mindEd.idt.ui/src-gen/org/ow2/mindEd/ui/contentassist/antlr/internal/InternalIdt.g:248:2: rule__IdtFile__IncludesAssignment_2
        {
        pushFollow(FOLLOW_rule__IdtFile__IncludesAssignment_2_in_synpred2_InternalIdt457);
        rule__IdtFile__IncludesAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalIdt

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


 

    public static final BitSet FOLLOW_ruleIdtFile_in_entryRuleIdtFile67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdtFile74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__0_in_ruleIdtFile100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionBegin134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionBegin__Group__0_in_ruleConstantDefinitionBegin160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionEnd194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConstantDefinitionEnd221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__ConstantAssignment_3_0_in_rule__IdtFile__Alternatives_3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__TypeAssignment_3_1_in_rule__IdtFile__Alternatives_3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__0__Impl_in_rule__IdtFile__Group__0307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__1_in_rule__IdtFile__Group__0310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__BegindefAssignment_0_in_rule__IdtFile__Group__0__Impl337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__1__Impl_in_rule__IdtFile__Group__1367 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__2_in_rule__IdtFile__Group__1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__DefAssignment_1_in_rule__IdtFile__Group__1__Impl397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__2__Impl_in_rule__IdtFile__Group__2427 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__3_in_rule__IdtFile__Group__2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__IncludesAssignment_2_in_rule__IdtFile__Group__2__Impl457 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__3__Impl_in_rule__IdtFile__Group__3488 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__4_in_rule__IdtFile__Group__3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__Alternatives_3_in_rule__IdtFile__Group__3__Impl518 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__4__Impl_in_rule__IdtFile__Group__4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__EndDefAssignment_4_in_rule__IdtFile__Group__4__Impl576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionBegin__Group__0__Impl_in_rule__ConstantDefinitionBegin__Group__0616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionBegin__Group__1_in_rule__ConstantDefinitionBegin__Group__0619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ConstantDefinitionBegin__Group__0__Impl647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionBegin__Group__1__Impl_in_rule__ConstantDefinitionBegin__Group__1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionBegin__NameAssignment_1_in_rule__ConstantDefinitionBegin__Group__1__Impl705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_rule__IdtFile__BegindefAssignment_0744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IdtFile__DefAssignment_1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IdtFile__IncludesAssignment_2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IdtFile__ConstantAssignment_3_0857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IdtFile__TypeAssignment_3_1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_rule__IdtFile__EndDefAssignment_4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantDefinitionBegin__NameAssignment_1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__ConstantAssignment_3_0_in_synpred1_InternalIdt258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__IncludesAssignment_2_in_synpred2_InternalIdt457 = new BitSet(new long[]{0x0000000000000002L});

}