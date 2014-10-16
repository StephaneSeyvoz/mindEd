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
import org.ow2.mindEd.itf.AdditiveExpression;
import org.ow2.mindEd.itf.AndExpression;
import org.ow2.mindEd.itf.Annotation;
import org.ow2.mindEd.itf.AnnotationValue;
import org.ow2.mindEd.itf.AnnotationValuePair;
import org.ow2.mindEd.itf.AnnotationsList;
import org.ow2.mindEd.itf.ArrayAnnotationValue;
import org.ow2.mindEd.itf.ArraySpecification;
import org.ow2.mindEd.itf.CastExpression;
import org.ow2.mindEd.itf.ConstantDefinition;
import org.ow2.mindEd.itf.Declarator;
import org.ow2.mindEd.itf.Declarators;
import org.ow2.mindEd.itf.DirectAnonymousDeclarator;
import org.ow2.mindEd.itf.DirectNamedDeclarator;
import org.ow2.mindEd.itf.EnumDefinition;
import org.ow2.mindEd.itf.EnumMember;
import org.ow2.mindEd.itf.EnumMemberList;
import org.ow2.mindEd.itf.EnumReference;
import org.ow2.mindEd.itf.IncludeDirective;
import org.ow2.mindEd.itf.InterfaceDefinition;
import org.ow2.mindEd.itf.ItfFile;
import org.ow2.mindEd.itf.ItfPackage;
import org.ow2.mindEd.itf.LogicalAndExpression;
import org.ow2.mindEd.itf.LogicalOrExpression;
import org.ow2.mindEd.itf.MethodDefinition;
import org.ow2.mindEd.itf.MulExpression;
import org.ow2.mindEd.itf.OrExpression;
import org.ow2.mindEd.itf.Parameter;
import org.ow2.mindEd.itf.ParameterList;
import org.ow2.mindEd.itf.PrimaryExpression;
import org.ow2.mindEd.itf.QualifiedPointerSpecification;
import org.ow2.mindEd.itf.QualifiedTypeSpecification;
import org.ow2.mindEd.itf.ShiftExpression;
import org.ow2.mindEd.itf.StructMember;
import org.ow2.mindEd.itf.StructOrUnionDefinition;
import org.ow2.mindEd.itf.StructorUnionReference;
import org.ow2.mindEd.itf.TypeSpecification;
import org.ow2.mindEd.itf.TypedefSpecification;
import org.ow2.mindEd.itf.UnaryExpression;
import org.ow2.mindEd.itf.XorExpression;
import org.ow2.mindEd.services.ItfGrammarAccess;

@SuppressWarnings("all")
public class ItfSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ItfGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ItfPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ItfPackage.ADDITIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule()) {
					sequence_AdditiveExpression(context, (AdditiveExpression) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.AND_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule()) {
					sequence_AndExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.ANNOTATION_VALUE:
				if(context == grammarAccess.getAnnotationValueRule()) {
					sequence_AnnotationValue(context, (AnnotationValue) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.ANNOTATION_VALUE_PAIR:
				if(context == grammarAccess.getAnnotationValuePairRule()) {
					sequence_AnnotationValuePair(context, (AnnotationValuePair) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.ANNOTATIONS_LIST:
				if(context == grammarAccess.getAnnotationsListRule()) {
					sequence_AnnotationsList(context, (AnnotationsList) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.ARRAY_ANNOTATION_VALUE:
				if(context == grammarAccess.getArrayAnnotationValueRule()) {
					sequence_ArrayAnnotationValue(context, (ArrayAnnotationValue) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.ARRAY_SPECIFICATION:
				if(context == grammarAccess.getArraySpecificationRule()) {
					sequence_ArraySpecification(context, (ArraySpecification) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.CAST_EXPRESSION:
				if(context == grammarAccess.getCastExpressionRule()) {
					sequence_CastExpression(context, (CastExpression) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.CONSTANT_DEFINITION:
				if(context == grammarAccess.getConstantDefinitionRule()) {
					sequence_ConstantDefinition(context, (ConstantDefinition) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.DECLARATOR:
				if(context == grammarAccess.getDeclaratorRule()) {
					sequence_Declarator(context, (Declarator) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.DECLARATORS:
				if(context == grammarAccess.getDeclaratorsRule()) {
					sequence_Declarators(context, (Declarators) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.DIRECT_ANONYMOUS_DECLARATOR:
				if(context == grammarAccess.getDirectAnonymousDeclaratorRule()) {
					sequence_DirectAnonymousDeclarator(context, (DirectAnonymousDeclarator) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.DIRECT_NAMED_DECLARATOR:
				if(context == grammarAccess.getDirectNamedDeclaratorRule()) {
					sequence_DirectNamedDeclarator(context, (DirectNamedDeclarator) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.ENUM_DEFINITION:
				if(context == grammarAccess.getEnumDefinitionRule() ||
				   context == grammarAccess.getEnumSpecificationRule() ||
				   context == grammarAccess.getTypeDefinitionRule() ||
				   context == grammarAccess.getTypeSpecificationRule()) {
					sequence_EnumDefinition(context, (EnumDefinition) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.ENUM_MEMBER:
				if(context == grammarAccess.getEnumMemberRule()) {
					sequence_EnumMember(context, (EnumMember) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.ENUM_MEMBER_LIST:
				if(context == grammarAccess.getEnumMemberListRule()) {
					sequence_EnumMemberList(context, (EnumMemberList) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.ENUM_REFERENCE:
				if(context == grammarAccess.getEnumReferenceRule() ||
				   context == grammarAccess.getEnumSpecificationRule() ||
				   context == grammarAccess.getTypeDefinitionRule() ||
				   context == grammarAccess.getTypeSpecificationRule()) {
					sequence_EnumReference(context, (EnumReference) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.INCLUDE_DIRECTIVE:
				if(context == grammarAccess.getIncludeDirectiveRule()) {
					sequence_IncludeDirective(context, (IncludeDirective) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.INTERFACE_DEFINITION:
				if(context == grammarAccess.getInterfaceDefinitionRule()) {
					sequence_InterfaceDefinition(context, (InterfaceDefinition) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.ITF_FILE:
				if(context == grammarAccess.getItfFileRule()) {
					sequence_ItfFile(context, (ItfFile) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.LOGICAL_AND_EXPRESSION:
				if(context == grammarAccess.getLogicalAndExpressionRule()) {
					sequence_LogicalAndExpression(context, (LogicalAndExpression) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.LOGICAL_OR_EXPRESSION:
				if(context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_LogicalOrExpression(context, (LogicalOrExpression) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.METHOD_DEFINITION:
				if(context == grammarAccess.getMethodDefinitionRule()) {
					sequence_MethodDefinition(context, (MethodDefinition) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.MUL_EXPRESSION:
				if(context == grammarAccess.getMulExpressionRule()) {
					sequence_MulExpression(context, (MulExpression) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.OR_EXPRESSION:
				if(context == grammarAccess.getOrExpressionRule()) {
					sequence_OrExpression(context, (OrExpression) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.PARAMETER_LIST:
				if(context == grammarAccess.getParameterListRule()) {
					sequence_ParameterList(context, (ParameterList) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.PRIMARY_EXPRESSION:
				if(context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (PrimaryExpression) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.QUALIFIED_POINTER_SPECIFICATION:
				if(context == grammarAccess.getQualifiedPointerSpecificationRule()) {
					sequence_QualifiedPointerSpecification(context, (QualifiedPointerSpecification) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.QUALIFIED_TYPE_SPECIFICATION:
				if(context == grammarAccess.getQualifiedTypeSpecificationRule()) {
					sequence_QualifiedTypeSpecification(context, (QualifiedTypeSpecification) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.SHIFT_EXPRESSION:
				if(context == grammarAccess.getShiftExpressionRule()) {
					sequence_ShiftExpression(context, (ShiftExpression) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.STRUCT_MEMBER:
				if(context == grammarAccess.getStructMemberRule()) {
					sequence_StructMember(context, (StructMember) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.STRUCT_OR_UNION_DEFINITION:
				if(context == grammarAccess.getStructOrUnionDefinitionRule() ||
				   context == grammarAccess.getStructOrUnionSpecificationRule() ||
				   context == grammarAccess.getTypeDefinitionRule() ||
				   context == grammarAccess.getTypeSpecificationRule()) {
					sequence_StructOrUnionDefinition(context, (StructOrUnionDefinition) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.STRUCTOR_UNION_REFERENCE:
				if(context == grammarAccess.getStructOrUnionSpecificationRule() ||
				   context == grammarAccess.getStructorUnionReferenceRule() ||
				   context == grammarAccess.getTypeDefinitionRule() ||
				   context == grammarAccess.getTypeSpecificationRule()) {
					sequence_StructorUnionReference(context, (StructorUnionReference) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.TYPE_SPECIFICATION:
				if(context == grammarAccess.getTypeSpecificationRule()) {
					sequence_TypeSpecification(context, (TypeSpecification) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.TYPEDEF_SPECIFICATION:
				if(context == grammarAccess.getTypeDefinitionRule() ||
				   context == grammarAccess.getTypedefSpecificationRule()) {
					sequence_TypedefSpecification(context, (TypedefSpecification) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case ItfPackage.XOR_EXPRESSION:
				if(context == grammarAccess.getXorExpressionRule()) {
					sequence_XorExpression(context, (XorExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (leftExpr=MulExpression (op=ADDITIVE_OPERATION rightExpr=AdditiveExpression)?)
	 */
	protected void sequence_AdditiveExpression(EObject context, AdditiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpr=ShiftExpression rightExpr=AndExpression?)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? value=AnnotationValue)
	 */
	protected void sequence_AnnotationValuePair(EObject context, AnnotationValuePair semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value=signedINT | 
	 *         value='null' | 
	 *         value=BOOLEAN | 
	 *         value=QualifiedName | 
	 *         value=STRING | 
	 *         arrayValue=ArrayAnnotationValue
	 *     )
	 */
	protected void sequence_AnnotationValue(EObject context, AnnotationValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName (annotationParametersList+=AnnotationValuePair annotationParametersList+=AnnotationValuePair*)?)
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
	 *     (values+=AnnotationValue values+=AnnotationValue*)
	 */
	protected void sequence_ArrayAnnotationValue(EObject context, ArrayAnnotationValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unspecifiedSize?='[' | fixedSize=ConstantExpression)
	 */
	protected void sequence_ArraySpecification(EObject context, ArraySpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type=QualifiedTypeSpecification expr=CastExpression) | unaryExpr=UnaryExpression)
	 */
	protected void sequence_CastExpression(EObject context, CastExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expr=ConstantExpression?)
	 */
	protected void sequence_ConstantDefinition(EObject context, ConstantDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pointer+=QualifiedPointerSpecification* (dc=DirectNamedDeclarator | dc=DirectAnonymousDeclarator | dec=Declarator))
	 */
	protected void sequence_Declarator(EObject context, Declarator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dec=Declarator declaratorList+=Declarator*)
	 */
	protected void sequence_Declarators(EObject context, Declarators semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (array+=ArraySpecification*)
	 */
	protected void sequence_DirectAnonymousDeclarator(EObject context, DirectAnonymousDeclarator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID array+=ArraySpecification*)
	 */
	protected void sequence_DirectNamedDeclarator(EObject context, DirectNamedDeclarator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? enumMemberList=EnumMemberList)
	 */
	protected void sequence_EnumDefinition(EObject context, EnumDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (enumMember+=EnumMember enumMember+=EnumMember*)
	 */
	protected void sequence_EnumMemberList(EObject context, EnumMemberList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID constExpr=ConstantExpression?)
	 */
	protected void sequence_EnumMember(EObject context, EnumMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_EnumReference(EObject context, EnumReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importedURI=STRING | includeID=INCLUDE_LIB)
	 */
	protected void sequence_IncludeDirective(EObject context, IncludeDirective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? name=QualifiedName fqn2=[InterfaceDefinition|QualifiedName]? methodDef+=MethodDefinition*)
	 */
	protected void sequence_InterfaceDefinition(EObject context, InterfaceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (includes+=IncludeDirective* (constant+=ConstantDefinition | type+=TypeDefinition)* interface=InterfaceDefinition)
	 */
	protected void sequence_ItfFile(EObject context, ItfFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpr=OrExpression rightExpr=LogicalAndExpression?)
	 */
	protected void sequence_LogicalAndExpression(EObject context, LogicalAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpr=LogicalAndExpression rightExpr=LogicalOrExpression?)
	 */
	protected void sequence_LogicalOrExpression(EObject context, LogicalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotationsList=AnnotationsList? 
	 *         qualifiedTypeSpec=QualifiedTypeSpecification 
	 *         pointerSpecification+=QualifiedPointerSpecification* 
	 *         name=ID 
	 *         ParameterList=ParameterList?
	 *     )
	 */
	protected void sequence_MethodDefinition(EObject context, MethodDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpr=CastExpression (op=MUL_OPERATION rightExpr=MulExpression)?)
	 */
	protected void sequence_MulExpression(EObject context, MulExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpr=XorExpression rightExpr=OrExpression?)
	 */
	protected void sequence_OrExpression(EObject context, OrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params+=Parameter params+=Parameter*)
	 */
	protected void sequence_ParameterList(EObject context, ParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? ParameterQualifier+=ParameterQualifier* qualifiedTypeSpec=QualifiedTypeSpecification dec=Declarator)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     literal=Literal
	 */
	protected void sequence_PrimaryExpression(EObject context, PrimaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ItfPackage.Literals.PRIMARY_EXPRESSION__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ItfPackage.Literals.PRIMARY_EXPRESSION__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getLiteralLiteralParserRuleCall_0_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (typeQualifiers+=TypeQualifier*)
	 */
	protected void sequence_QualifiedPointerSpecification(EObject context, QualifiedPointerSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeQualifier+=TypeQualifier* typeSpec=TypeSpecification)
	 */
	protected void sequence_QualifiedTypeSpecification(EObject context, QualifiedTypeSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpr=AdditiveExpression (op=SHIFT_OPERATION rightExpr=ShiftExpression)?)
	 */
	protected void sequence_ShiftExpression(EObject context, ShiftExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationsList=AnnotationsList? qualType=QualifiedTypeSpecification dec=Declarators constExpr=ConstantExpression?)
	 */
	protected void sequence_StructMember(EObject context, StructMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (struct=StructOrUnion id=ID? structMember+=StructMember*)
	 */
	protected void sequence_StructOrUnionDefinition(EObject context, StructOrUnionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (struct=StructOrUnion id=ID)
	 */
	protected void sequence_StructorUnionReference(EObject context, StructorUnionReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeDefName=QualifiedName | (typeSpecifier+=TypeSpecifier typeSpecifier+=TypeSpecifier*))
	 */
	protected void sequence_TypeSpecification(EObject context, TypeSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualifedType=QualifiedTypeSpecification dec=Declarators)
	 */
	protected void sequence_TypedefSpecification(EObject context, TypedefSpecification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ItfPackage.Literals.TYPEDEF_SPECIFICATION__QUALIFED_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ItfPackage.Literals.TYPEDEF_SPECIFICATION__QUALIFED_TYPE));
			if(transientValues.isValueTransient(semanticObject, ItfPackage.Literals.TYPEDEF_SPECIFICATION__DEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ItfPackage.Literals.TYPEDEF_SPECIFICATION__DEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0(), semanticObject.getQualifedType());
		feeder.accept(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0(), semanticObject.getDec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpr=UNARY_OPERATION? primaryExpr=PrimaryExpression)
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpr=AndExpression rightExpr=XorExpression?)
	 */
	protected void sequence_XorExpression(EObject context, XorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
