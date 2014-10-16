package org.ow2.mindEd.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.ow2.mindEd.idt.ConstantDefinitionBegin;
import org.ow2.mindEd.idt.IdtFile;
import org.ow2.mindEd.idt.IdtPackage;
import org.ow2.mindEd.services.IdtGrammarAccess;

@SuppressWarnings("all")
public class IdtSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IdtGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == IdtPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case IdtPackage.CONSTANT_DEFINITION_BEGIN:
				if(context == grammarAccess.getConstantDefinitionBeginRule()) {
					sequence_ConstantDefinitionBegin(context, (ConstantDefinitionBegin) semanticObject); 
					return; 
				}
				else break;
			case IdtPackage.IDT_FILE:
				if(context == grammarAccess.getIdtFileRule()) {
					sequence_IdtFile(context, (IdtFile) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ConstantDefinitionBegin(EObject context, ConstantDefinitionBegin semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IdtPackage.Literals.CONSTANT_DEFINITION_BEGIN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IdtPackage.Literals.CONSTANT_DEFINITION_BEGIN__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantDefinitionBeginAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         begindef=ConstantDefinitionBegin 
	 *         def=[ConstantDefinition|ID] 
	 *         includes+=[IncludeDirective|ID]* 
	 *         (constant+=[ConstantDefinition|ID] | type+=[TypeDefinition|ID])* 
	 *         endDef=ConstantDefinitionEnd
	 *     )
	 */
	protected void sequence_IdtFile(EObject context, IdtFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
