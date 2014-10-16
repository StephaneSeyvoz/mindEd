/*
* generated by Xtext
*/
package org.ow2.mindEd.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.ow2.mindEd.services.ItfGrammarAccess;

public class ItfParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ItfGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.ow2.mindEd.parser.antlr.internal.InternalItfParser createParser(XtextTokenStream stream) {
		return new org.ow2.mindEd.parser.antlr.internal.InternalItfParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ItfFile";
	}
	
	public ItfGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ItfGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
