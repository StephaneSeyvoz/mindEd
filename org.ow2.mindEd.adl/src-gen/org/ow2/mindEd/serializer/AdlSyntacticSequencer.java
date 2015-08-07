/*
 * generated by Xtext
 */
package org.ow2.mindEd.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.ow2.mindEd.services.AdlGrammarAccess;

@SuppressWarnings("all")
public class AdlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AdlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AttributeType_Int16_tKeyword_4_or_Int32_tKeyword_6_or_Int64_tKeyword_8_or_Int8_tKeyword_2_or_Intptr_tKeyword_10_or_StringKeyword_1_or_Uint16_tKeyword_5_or_Uint32_tKeyword_7_or_Uint64_tKeyword_9_or_Uint8_tKeyword_3_or_Uintptr_tKeyword_11;
	protected AbstractElementAlias match_FilePath___FullStopFullStopKeyword_3_0_SLTerminalRuleCall_3_1__a;
	protected AbstractElementAlias match_FilePath___FullStopKeyword_2_0_SLTerminalRuleCall_2_1__q;
	protected AbstractElementAlias match_FilePath___FullStopKeyword_6_0_IDTerminalRuleCall_6_1__q;
	protected AbstractElementAlias match_FilePath___SLTerminalRuleCall_5_0_IDTerminalRuleCall_5_1__a;
	protected AbstractElementAlias match_IDTType___EnumKeyword_2_1_or_StructKeyword_2_0_or_UnionKeyword_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AdlGrammarAccess) access;
		match_AttributeType_Int16_tKeyword_4_or_Int32_tKeyword_6_or_Int64_tKeyword_8_or_Int8_tKeyword_2_or_Intptr_tKeyword_10_or_StringKeyword_1_or_Uint16_tKeyword_5_or_Uint32_tKeyword_7_or_Uint64_tKeyword_9_or_Uint8_tKeyword_3_or_Uintptr_tKeyword_11 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAttributeTypeAccess().getInt16_tKeyword_4()), new TokenAlias(false, false, grammarAccess.getAttributeTypeAccess().getInt32_tKeyword_6()), new TokenAlias(false, false, grammarAccess.getAttributeTypeAccess().getInt64_tKeyword_8()), new TokenAlias(false, false, grammarAccess.getAttributeTypeAccess().getInt8_tKeyword_2()), new TokenAlias(false, false, grammarAccess.getAttributeTypeAccess().getIntptr_tKeyword_10()), new TokenAlias(false, false, grammarAccess.getAttributeTypeAccess().getStringKeyword_1()), new TokenAlias(false, false, grammarAccess.getAttributeTypeAccess().getUint16_tKeyword_5()), new TokenAlias(false, false, grammarAccess.getAttributeTypeAccess().getUint32_tKeyword_7()), new TokenAlias(false, false, grammarAccess.getAttributeTypeAccess().getUint64_tKeyword_9()), new TokenAlias(false, false, grammarAccess.getAttributeTypeAccess().getUint8_tKeyword_3()), new TokenAlias(false, false, grammarAccess.getAttributeTypeAccess().getUintptr_tKeyword_11()));
		match_FilePath___FullStopFullStopKeyword_3_0_SLTerminalRuleCall_3_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getFilePathAccess().getFullStopFullStopKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getFilePathAccess().getSLTerminalRuleCall_3_1()));
		match_FilePath___FullStopKeyword_2_0_SLTerminalRuleCall_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFilePathAccess().getFullStopKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getFilePathAccess().getSLTerminalRuleCall_2_1()));
		match_FilePath___FullStopKeyword_6_0_IDTerminalRuleCall_6_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFilePathAccess().getFullStopKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getFilePathAccess().getIDTerminalRuleCall_6_1()));
		match_FilePath___SLTerminalRuleCall_5_0_IDTerminalRuleCall_5_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getFilePathAccess().getSLTerminalRuleCall_5_0()), new TokenAlias(false, false, grammarAccess.getFilePathAccess().getIDTerminalRuleCall_5_1()));
		match_IDTType___EnumKeyword_2_1_or_StructKeyword_2_0_or_UnionKeyword_2_2__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getIDTTypeAccess().getEnumKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getIDTTypeAccess().getStructKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getIDTTypeAccess().getUnionKeyword_2_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSLRule())
			return getSLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal SL :
	 * 	'/';
	 */
	protected String getSLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AttributeType_Int16_tKeyword_4_or_Int32_tKeyword_6_or_Int64_tKeyword_8_or_Int8_tKeyword_2_or_Intptr_tKeyword_10_or_StringKeyword_1_or_Uint16_tKeyword_5_or_Uint32_tKeyword_7_or_Uint64_tKeyword_9_or_Uint8_tKeyword_3_or_Uintptr_tKeyword_11.equals(syntax))
				emit_AttributeType_Int16_tKeyword_4_or_Int32_tKeyword_6_or_Int64_tKeyword_8_or_Int8_tKeyword_2_or_Intptr_tKeyword_10_or_StringKeyword_1_or_Uint16_tKeyword_5_or_Uint32_tKeyword_7_or_Uint64_tKeyword_9_or_Uint8_tKeyword_3_or_Uintptr_tKeyword_11(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FilePath___FullStopFullStopKeyword_3_0_SLTerminalRuleCall_3_1__a.equals(syntax))
				emit_FilePath___FullStopFullStopKeyword_3_0_SLTerminalRuleCall_3_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FilePath___FullStopKeyword_2_0_SLTerminalRuleCall_2_1__q.equals(syntax))
				emit_FilePath___FullStopKeyword_2_0_SLTerminalRuleCall_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FilePath___FullStopKeyword_6_0_IDTerminalRuleCall_6_1__q.equals(syntax))
				emit_FilePath___FullStopKeyword_6_0_IDTerminalRuleCall_6_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FilePath___SLTerminalRuleCall_5_0_IDTerminalRuleCall_5_1__a.equals(syntax))
				emit_FilePath___SLTerminalRuleCall_5_0_IDTerminalRuleCall_5_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IDTType___EnumKeyword_2_1_or_StructKeyword_2_0_or_UnionKeyword_2_2__q.equals(syntax))
				emit_IDTType___EnumKeyword_2_1_or_StructKeyword_2_0_or_UnionKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (
	  *         'string' | 
	  *         'int8_t' | 
	  *         'uint8_t' | 
	  *         'int16_t' | 
	  *         'uint16_t' | 
	  *         'int32_t' | 
	  *         'uint32_t' | 
	  *         'int64_t' | 
	  *         'uint64_t' | 
	  *         'intptr_t' | 
	  *         'uintptr_t'
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_AttributeType_Int16_tKeyword_4_or_Int32_tKeyword_6_or_Int64_tKeyword_8_or_Int8_tKeyword_2_or_Intptr_tKeyword_10_or_StringKeyword_1_or_Uint16_tKeyword_5_or_Uint32_tKeyword_7_or_Uint64_tKeyword_9_or_Uint8_tKeyword_3_or_Uintptr_tKeyword_11(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('..' SL)*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('.' SL)? (ambiguity) ID (SL ID)* ('.' ID)? (rule start)
	 *     name=SL ('.' SL)? (ambiguity) ID (SL ID)* ('.' ID)? (rule end)
	 */
	protected void emit_FilePath___FullStopFullStopKeyword_3_0_SLTerminalRuleCall_3_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('.' SL)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ('..' SL)* ID (SL ID)* ('.' ID)? (rule start)
	 *     name=SL (ambiguity) ('..' SL)* ID (SL ID)* ('.' ID)? (rule end)
	 */
	protected void emit_FilePath___FullStopKeyword_2_0_SLTerminalRuleCall_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('.' ID)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('.' SL)? ('..' SL)* ID (SL ID)* (ambiguity) (rule start)
	 *     name=SL ('.' SL)? ('..' SL)* ID (SL ID)* (ambiguity) (rule end)
	 */
	protected void emit_FilePath___FullStopKeyword_6_0_IDTerminalRuleCall_6_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (SL ID)*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('.' SL)? ('..' SL)* ID (ambiguity) ('.' ID)? (rule start)
	 *     name=SL ('.' SL)? ('..' SL)* ID (ambiguity) ('.' ID)? (rule end)
	 */
	protected void emit_FilePath___SLTerminalRuleCall_5_0_IDTerminalRuleCall_5_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('struct' | 'enum' | 'union')?
	 *
	 * This ambiguous syntax occurs at:
	 *     path=FilePath ':' (ambiguity) name=ID
	 */
	protected void emit_IDTType___EnumKeyword_2_1_or_StructKeyword_2_0_or_UnionKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
