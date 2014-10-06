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
import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.Annotation;
import org.ow2.mindEd.adl.AnnotationElement;
import org.ow2.mindEd.adl.AnnotationsList;
import org.ow2.mindEd.adl.ArgumentDefinition;
import org.ow2.mindEd.adl.AttributeDefinition;
import org.ow2.mindEd.adl.BindingDefinition;
import org.ow2.mindEd.adl.CompositeDefinition;
import org.ow2.mindEd.adl.CompositeSuperType;
import org.ow2.mindEd.adl.ConstantValue;
import org.ow2.mindEd.adl.DataDefinition;
import org.ow2.mindEd.adl.ElementValueArrayInitializer;
import org.ow2.mindEd.adl.FileC;
import org.ow2.mindEd.adl.FormalArgument;
import org.ow2.mindEd.adl.FormalArgumentsList;
import org.ow2.mindEd.adl.ImplementationDefinition;
import org.ow2.mindEd.adl.ImportDefinition;
import org.ow2.mindEd.adl.InlineCodeC;
import org.ow2.mindEd.adl.PrimitiveDefinition;
import org.ow2.mindEd.adl.PrimitiveSuperType;
import org.ow2.mindEd.adl.ProvidedInterfaceDefinition;
import org.ow2.mindEd.adl.RequiredInterfaceDefinition;
import org.ow2.mindEd.adl.SubComponentDefinition;
import org.ow2.mindEd.adl.TemplateReference;
import org.ow2.mindEd.adl.TemplateSpecifier;
import org.ow2.mindEd.adl.TypeDefinition;
import org.ow2.mindEd.adl.ValueList;
import org.ow2.mindEd.services.AdlGrammarAccess;

@SuppressWarnings("all")
public class AdlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AdlGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AdlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AdlPackage.ADL_DEFINITION:
				if(context == grammarAccess.getAdlDefinitionRule()) {
					sequence_AdlDefinition(context, (AdlDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getElementValueRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.ANNOTATION_ELEMENT:
				if(context == grammarAccess.getAnnotationElementRule()) {
					sequence_AnnotationElement(context, (AnnotationElement) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.ANNOTATIONS_LIST:
				if(context == grammarAccess.getAnnotationsListRule()) {
					sequence_AnnotationsList(context, (AnnotationsList) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.ARGUMENT_DEFINITION:
				if(context == grammarAccess.getArgumentDefinitionRule()) {
					sequence_ArgumentDefinition(context, (ArgumentDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.ATTRIBUTE_DEFINITION:
				if(context == grammarAccess.getAttributeDefinitionRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getPrimitiveElementRule()) {
					sequence_AttributeDefinition(context, (AttributeDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.BINDING_DEFINITION:
				if(context == grammarAccess.getBindingDefinitionRule() ||
				   context == grammarAccess.getCompositeElementRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_BindingDefinition(context, (BindingDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.COMPOSITE_DEFINITION:
				if(context == grammarAccess.getArchitectureDefinitionRule() ||
				   context == grammarAccess.getCompositeDefinitionRule() ||
				   context == grammarAccess.getCompositeSuperTypeDefinitionRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_CompositeDefinition(context, (CompositeDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.COMPOSITE_SUPER_TYPE:
				if(context == grammarAccess.getCompositeSuperTypeRule()) {
					sequence_CompositeSuperType(context, (CompositeSuperType) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.CONSTANT_VALUE:
				if(context == grammarAccess.getConstantValueRule() ||
				   context == grammarAccess.getElementValueRule()) {
					sequence_ConstantValue(context, (ConstantValue) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.DATA_DEFINITION:
				if(context == grammarAccess.getDataDefinitionRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getPrimitiveElementRule()) {
					sequence_DataDefinition(context, (DataDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.ELEMENT_VALUE_ARRAY_INITIALIZER:
				if(context == grammarAccess.getElementValueRule() ||
				   context == grammarAccess.getElementValueArrayInitializerRule()) {
					sequence_ElementValueArrayInitializer(context, (ElementValueArrayInitializer) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.FILE_C:
				if(context == grammarAccess.getFileCRule()) {
					sequence_FileC(context, (FileC) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.FORMAL_ARGUMENT:
				if(context == grammarAccess.getFormalArgumentRule()) {
					sequence_FormalArgument(context, (FormalArgument) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.FORMAL_ARGUMENTS_LIST:
				if(context == grammarAccess.getFormalArgumentsListRule()) {
					sequence_FormalArgumentsList(context, (FormalArgumentsList) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.IMPLEMENTATION_DEFINITION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getImplementationDefinitionRule() ||
				   context == grammarAccess.getPrimitiveElementRule()) {
					sequence_ImplementationDefinition(context, (ImplementationDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.IMPORT_DEFINITION:
				if(context == grammarAccess.getImportDefinitionRule()) {
					sequence_ImportDefinition(context, (ImportDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.INLINE_CODE_C:
				if(context == grammarAccess.getInlineCodeCRule()) {
					sequence_InlineCodeC(context, (InlineCodeC) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.PRIMITIVE_DEFINITION:
				if(context == grammarAccess.getArchitectureDefinitionRule() ||
				   context == grammarAccess.getPrimitiveDefinitionRule() ||
				   context == grammarAccess.getPrimitiveSuperTypeDefinitionRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_PrimitiveDefinition(context, (PrimitiveDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.PRIMITIVE_SUPER_TYPE:
				if(context == grammarAccess.getPrimitiveSuperTypeRule()) {
					sequence_PrimitiveSuperType(context, (PrimitiveSuperType) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.PROVIDED_INTERFACE_DEFINITION:
				if(context == grammarAccess.getCompositeElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getHostedInterfaceDefinitionRule() ||
				   context == grammarAccess.getPrimitiveElementRule() ||
				   context == grammarAccess.getProvidedInterfaceDefinitionRule()) {
					sequence_ProvidedInterfaceDefinition(context, (ProvidedInterfaceDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.REQUIRED_INTERFACE_DEFINITION:
				if(context == grammarAccess.getCompositeElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getHostedInterfaceDefinitionRule() ||
				   context == grammarAccess.getPrimitiveElementRule() ||
				   context == grammarAccess.getRequiredInterfaceDefinitionRule()) {
					sequence_RequiredInterfaceDefinition(context, (RequiredInterfaceDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.SUB_COMPONENT_DEFINITION:
				if(context == grammarAccess.getCompositeElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getSubComponentDefinitionRule()) {
					sequence_SubComponentDefinition(context, (SubComponentDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.TEMPLATE_REFERENCE:
				if(context == grammarAccess.getTemplateReferenceRule()) {
					sequence_TemplateReference(context, (TemplateReference) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.TEMPLATE_SPECIFIER:
				if(context == grammarAccess.getTemplateSpecifierRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_TemplateSpecifier(context, (TemplateSpecifier) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.TYPE_DEFINITION:
				if(context == grammarAccess.getArchitectureDefinitionRule() ||
				   context == grammarAccess.getCompositeSuperTypeDefinitionRule() ||
				   context == grammarAccess.getPrimitiveSuperTypeDefinitionRule() ||
				   context == grammarAccess.getTypeDefinitionRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_TypeDefinition(context, (TypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case AdlPackage.VALUE_LIST:
				if(context == grammarAccess.getValueListRule()) {
					sequence_ValueList(context, (ValueList) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (imports+=ImportDefinition* annotationsList=AnnotationsList? architectureDefinition=ArchitectureDefinition)
	 */
	protected void sequence_AdlDefinition(EObject context, AdlDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? elementValue=ElementValue)
	 */
	protected void sequence_AnnotationElement(EObject context, AnnotationElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name='Override' | name='Singleton' | name='LDFlags' | name='CFlags' | name=QualifiedName) 
	 *         (annotationElements+=AnnotationElement annotationElements+=AnnotationElement*)?
	 *     )
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation annotations+=Annotation*)
	 */
	protected void sequence_AnnotationsList(EObject context, AnnotationsList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? (argumentValue=Value | argumentList=ValueList))
	 */
	protected void sequence_ArgumentDefinition(EObject context, ArgumentDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotationsList=AnnotationsList? 
	 *         headerFile=FileC? 
	 *         cType=AttributeType? 
	 *         type=ID? 
	 *         name=ID 
	 *         value=Value?
	 *     )
	 */
	protected void sequence_AttributeDefinition(EObject context, AttributeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotationsList=AnnotationsList? 
	 *         (sourceParent=[SubComponentDefinition|ID] | isSrcParentThis?='this') 
	 *         sourceInterface=[HostedInterfaceDefinition|ID] 
	 *         sourceIndex=INT? 
	 *         (targetParent=[SubComponentDefinition|ID] | isTgtParentThis?='this') 
	 *         targetInterface=[HostedInterfaceDefinition|ID] 
	 *         targetIndex=INT?
	 *     )
	 */
	protected void sequence_BindingDefinition(EObject context, BindingDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName? 
	 *         (templateSpecifiers+=TemplateSpecifier templateSpecifiers+=TemplateSpecifier*)? 
	 *         compositeFormalArgumentsList=FormalArgumentsList? 
	 *         (superTypes+=CompositeSuperType superTypes+=CompositeSuperType*)? 
	 *         (elements+=ProvidedInterfaceDefinition | elements+=RequiredInterfaceDefinition | elements+=SubComponentDefinition | elements+=BindingDefinition)*
	 *     )
	 */
	protected void sequence_CompositeDefinition(EObject context, CompositeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         targetArchDef=[CompositeSuperTypeDefinition|QualifiedName] 
	 *         (templatesList+=TemplateReference templatesList+=TemplateReference*)? 
	 *         (argumentsList+=ArgumentDefinition argumentsList+=ArgumentDefinition*)?
	 *     )
	 */
	protected void sequence_CompositeSuperType(EObject context, CompositeSuperType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ConstantFormat
	 */
	protected void sequence_ConstantValue(EObject context, ConstantValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdlPackage.Literals.CONSTANT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdlPackage.Literals.CONSTANT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? (fileC=FileC | inlineCcode=InlineCodeC))
	 */
	protected void sequence_DataDefinition(EObject context, DataDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=ElementValue values+=ElementValue*)
	 */
	protected void sequence_ElementValueArrayInitializer(EObject context, ElementValueArrayInitializer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (directory=Path? name=FileName)
	 */
	protected void sequence_FileC(EObject context, FileC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FormalArgument(EObject context, FormalArgument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdlPackage.Literals.FORMAL_ARGUMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdlPackage.Literals.FORMAL_ARGUMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormalArgumentAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (formalArguments+=FormalArgument formalArguments+=FormalArgument*)
	 */
	protected void sequence_FormalArgumentsList(EObject context, FormalArgumentsList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? (fileC=FileC | inlineCcode=InlineCodeC))
	 */
	protected void sequence_ImplementationDefinition(EObject context, ImplementationDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? importedNamespace=QualifiedNameWithWildcard)
	 */
	protected void sequence_ImportDefinition(EObject context, ImportDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     codeC=CODE_C
	 */
	protected void sequence_InlineCodeC(EObject context, InlineCodeC semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdlPackage.Literals.INLINE_CODE_C__CODE_C) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdlPackage.Literals.INLINE_CODE_C__CODE_C));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInlineCodeCAccess().getCodeCCODE_CTerminalRuleCall_0(), semanticObject.getCodeC());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=QualifiedName? 
	 *         compositeFormalArgumentsList=FormalArgumentsList? 
	 *         (superTypes+=PrimitiveSuperType superTypes+=PrimitiveSuperType*)? 
	 *         (
	 *             elements+=ProvidedInterfaceDefinition | 
	 *             elements+=RequiredInterfaceDefinition | 
	 *             elements+=ImplementationDefinition | 
	 *             elements+=AttributeDefinition | 
	 *             elements+=DataDefinition
	 *         )*
	 *     )
	 */
	protected void sequence_PrimitiveDefinition(EObject context, PrimitiveDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (targetArchDef=[PrimitiveSuperTypeDefinition|QualifiedName] (argumentsList+=ArgumentDefinition argumentsList+=ArgumentDefinition*)?)
	 */
	protected void sequence_PrimitiveSuperType(EObject context, PrimitiveSuperType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? role='provides' signature=[InterfaceDefinition|QualifiedName] name=ID (collection?='[' collectionsize=INT?)?)
	 */
	protected void sequence_ProvidedInterfaceDefinition(EObject context, ProvidedInterfaceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotationsList=AnnotationsList? 
	 *         role='requires' 
	 *         optional?='optional'? 
	 *         signature=[InterfaceDefinition|QualifiedName] 
	 *         name=ID 
	 *         (collection?='[' collectionsize=INT?)?
	 *     )
	 */
	protected void sequence_RequiredInterfaceDefinition(EObject context, RequiredInterfaceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotationsList=AnnotationsList? 
	 *         type=[TypeReference|QualifiedName]? 
	 *         (templatesList+=TemplateReference templatesList+=TemplateReference*)? 
	 *         (argumentsList+=ArgumentDefinition argumentsList+=ArgumentDefinition*)? 
	 *         name=ID 
	 *         bodyAnnotationsList=AnnotationsList? 
	 *         (body=CompositeDefinition | body=PrimitiveDefinition)?
	 *     )
	 */
	protected void sequence_SubComponentDefinition(EObject context, SubComponentDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=TemplateSpecifier? 
	 *         (typeReference=[TypeReference|QualifiedName] | anyTypeReference?='?') 
	 *         (templatesList+=TemplateReference templatesList+=TemplateReference*)? 
	 *         (argumentsList+=ArgumentDefinition argumentsList+=ArgumentDefinition*)?
	 *     )
	 */
	protected void sequence_TemplateReference(EObject context, TemplateReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID typeReference=[TypeDefinition|QualifiedName])
	 */
	protected void sequence_TemplateSpecifier(EObject context, TemplateSpecifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdlPackage.Literals.TYPE_REFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdlPackage.Literals.TYPE_REFERENCE__NAME));
			if(transientValues.isValueTransient(semanticObject, AdlPackage.Literals.TEMPLATE_SPECIFIER__TYPE_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdlPackage.Literals.TEMPLATE_SPECIFIER__TYPE_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTemplateSpecifierAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTemplateSpecifierAccess().getTypeReferenceTypeDefinitionQualifiedNameParserRuleCall_2_0_1(), semanticObject.getTypeReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         (superTypes+=[TypeDefinition|QualifiedName] superTypes+=[TypeDefinition|QualifiedName]*)? 
	 *         (elements+=ProvidedInterfaceDefinition | elements+=RequiredInterfaceDefinition)*
	 *     )
	 */
	protected void sequence_TypeDefinition(EObject context, TypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (member+=Value member+=Value*)
	 */
	protected void sequence_ValueList(EObject context, ValueList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
