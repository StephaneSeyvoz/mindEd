/**
 */
package org.ow2.mindEd.itf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ow2.mindEd.itf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItfFactoryImpl extends EFactoryImpl implements ItfFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ItfFactory init()
  {
    try
    {
      ItfFactory theItfFactory = (ItfFactory)EPackage.Registry.INSTANCE.getEFactory(ItfPackage.eNS_URI);
      if (theItfFactory != null)
      {
        return theItfFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ItfFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItfFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ItfPackage.ITF_FILE: return createItfFile();
      case ItfPackage.TYPE_DEFINITION: return createTypeDefinition();
      case ItfPackage.TYPEDEF_SPECIFICATION: return createTypedefSpecification();
      case ItfPackage.QUALIFIED_TYPE_SPECIFICATION: return createQualifiedTypeSpecification();
      case ItfPackage.TYPE_SPECIFICATION: return createTypeSpecification();
      case ItfPackage.STRUCT_OR_UNION_SPECIFICATION: return createStructOrUnionSpecification();
      case ItfPackage.STRUCT_OR_UNION_DEFINITION: return createStructOrUnionDefinition();
      case ItfPackage.STRUCTOR_UNION_REFERENCE: return createStructorUnionReference();
      case ItfPackage.STRUCT_MEMBER: return createStructMember();
      case ItfPackage.ENUM_SPECIFICATION: return createEnumSpecification();
      case ItfPackage.ENUM_DEFINITION: return createEnumDefinition();
      case ItfPackage.ENUM_REFERENCE: return createEnumReference();
      case ItfPackage.ENUM_MEMBER_LIST: return createEnumMemberList();
      case ItfPackage.ENUM_MEMBER: return createEnumMember();
      case ItfPackage.DECLARATORS: return createDeclarators();
      case ItfPackage.DECLARATOR: return createDeclarator();
      case ItfPackage.QUALIFIED_POINTER_SPECIFICATION: return createQualifiedPointerSpecification();
      case ItfPackage.DIRECT_NAMED_DECLARATOR: return createDirectNamedDeclarator();
      case ItfPackage.DIRECT_ANONYMOUS_DECLARATOR: return createDirectAnonymousDeclarator();
      case ItfPackage.ARRAY_SPECIFICATION: return createArraySpecification();
      case ItfPackage.CONSTANT_DEFINITION: return createConstantDefinition();
      case ItfPackage.INTERFACE_DEFINITION: return createInterfaceDefinition();
      case ItfPackage.METHOD_DEFINITION: return createMethodDefinition();
      case ItfPackage.PARAMETER_LIST: return createParameterList();
      case ItfPackage.PARAMETER: return createParameter();
      case ItfPackage.INCLUDE_DIRECTIVE: return createIncludeDirective();
      case ItfPackage.ANNOTATIONS_LIST: return createAnnotationsList();
      case ItfPackage.ANNOTATION: return createAnnotation();
      case ItfPackage.ANNOTATION_VALUE_PAIR: return createAnnotationValuePair();
      case ItfPackage.ANNOTATION_VALUE: return createAnnotationValue();
      case ItfPackage.ARRAY_ANNOTATION_VALUE: return createArrayAnnotationValue();
      case ItfPackage.CONSTANT_EXPRESSION: return createConstantExpression();
      case ItfPackage.LOGICAL_OR_EXPRESSION: return createLogicalOrExpression();
      case ItfPackage.LOGICAL_AND_EXPRESSION: return createLogicalAndExpression();
      case ItfPackage.OR_EXPRESSION: return createOrExpression();
      case ItfPackage.XOR_EXPRESSION: return createXorExpression();
      case ItfPackage.AND_EXPRESSION: return createAndExpression();
      case ItfPackage.SHIFT_EXPRESSION: return createShiftExpression();
      case ItfPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case ItfPackage.MUL_EXPRESSION: return createMulExpression();
      case ItfPackage.CAST_EXPRESSION: return createCastExpression();
      case ItfPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case ItfPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ItfPackage.TYPE_QUALIFIER:
        return createTypeQualifierFromString(eDataType, initialValue);
      case ItfPackage.TYPE_SPECIFIER:
        return createTypeSpecifierFromString(eDataType, initialValue);
      case ItfPackage.PARAMETER_QUALIFIER:
        return createParameterQualifierFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ItfPackage.TYPE_QUALIFIER:
        return convertTypeQualifierToString(eDataType, instanceValue);
      case ItfPackage.TYPE_SPECIFIER:
        return convertTypeSpecifierToString(eDataType, instanceValue);
      case ItfPackage.PARAMETER_QUALIFIER:
        return convertParameterQualifierToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItfFile createItfFile()
  {
    ItfFileImpl itfFile = new ItfFileImpl();
    return itfFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefSpecification createTypedefSpecification()
  {
    TypedefSpecificationImpl typedefSpecification = new TypedefSpecificationImpl();
    return typedefSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedTypeSpecification createQualifiedTypeSpecification()
  {
    QualifiedTypeSpecificationImpl qualifiedTypeSpecification = new QualifiedTypeSpecificationImpl();
    return qualifiedTypeSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecification createTypeSpecification()
  {
    TypeSpecificationImpl typeSpecification = new TypeSpecificationImpl();
    return typeSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructOrUnionSpecification createStructOrUnionSpecification()
  {
    StructOrUnionSpecificationImpl structOrUnionSpecification = new StructOrUnionSpecificationImpl();
    return structOrUnionSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructOrUnionDefinition createStructOrUnionDefinition()
  {
    StructOrUnionDefinitionImpl structOrUnionDefinition = new StructOrUnionDefinitionImpl();
    return structOrUnionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructorUnionReference createStructorUnionReference()
  {
    StructorUnionReferenceImpl structorUnionReference = new StructorUnionReferenceImpl();
    return structorUnionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructMember createStructMember()
  {
    StructMemberImpl structMember = new StructMemberImpl();
    return structMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumSpecification createEnumSpecification()
  {
    EnumSpecificationImpl enumSpecification = new EnumSpecificationImpl();
    return enumSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDefinition createEnumDefinition()
  {
    EnumDefinitionImpl enumDefinition = new EnumDefinitionImpl();
    return enumDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumReference createEnumReference()
  {
    EnumReferenceImpl enumReference = new EnumReferenceImpl();
    return enumReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMemberList createEnumMemberList()
  {
    EnumMemberListImpl enumMemberList = new EnumMemberListImpl();
    return enumMemberList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMember createEnumMember()
  {
    EnumMemberImpl enumMember = new EnumMemberImpl();
    return enumMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarators createDeclarators()
  {
    DeclaratorsImpl declarators = new DeclaratorsImpl();
    return declarators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarator createDeclarator()
  {
    DeclaratorImpl declarator = new DeclaratorImpl();
    return declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedPointerSpecification createQualifiedPointerSpecification()
  {
    QualifiedPointerSpecificationImpl qualifiedPointerSpecification = new QualifiedPointerSpecificationImpl();
    return qualifiedPointerSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectNamedDeclarator createDirectNamedDeclarator()
  {
    DirectNamedDeclaratorImpl directNamedDeclarator = new DirectNamedDeclaratorImpl();
    return directNamedDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectAnonymousDeclarator createDirectAnonymousDeclarator()
  {
    DirectAnonymousDeclaratorImpl directAnonymousDeclarator = new DirectAnonymousDeclaratorImpl();
    return directAnonymousDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArraySpecification createArraySpecification()
  {
    ArraySpecificationImpl arraySpecification = new ArraySpecificationImpl();
    return arraySpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinition createConstantDefinition()
  {
    ConstantDefinitionImpl constantDefinition = new ConstantDefinitionImpl();
    return constantDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDefinition createInterfaceDefinition()
  {
    InterfaceDefinitionImpl interfaceDefinition = new InterfaceDefinitionImpl();
    return interfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDefinition createMethodDefinition()
  {
    MethodDefinitionImpl methodDefinition = new MethodDefinitionImpl();
    return methodDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList createParameterList()
  {
    ParameterListImpl parameterList = new ParameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeDirective createIncludeDirective()
  {
    IncludeDirectiveImpl includeDirective = new IncludeDirectiveImpl();
    return includeDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationsList createAnnotationsList()
  {
    AnnotationsListImpl annotationsList = new AnnotationsListImpl();
    return annotationsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValuePair createAnnotationValuePair()
  {
    AnnotationValuePairImpl annotationValuePair = new AnnotationValuePairImpl();
    return annotationValuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValue createAnnotationValue()
  {
    AnnotationValueImpl annotationValue = new AnnotationValueImpl();
    return annotationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAnnotationValue createArrayAnnotationValue()
  {
    ArrayAnnotationValueImpl arrayAnnotationValue = new ArrayAnnotationValueImpl();
    return arrayAnnotationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression createConstantExpression()
  {
    ConstantExpressionImpl constantExpression = new ConstantExpressionImpl();
    return constantExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalOrExpression createLogicalOrExpression()
  {
    LogicalOrExpressionImpl logicalOrExpression = new LogicalOrExpressionImpl();
    return logicalOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalAndExpression createLogicalAndExpression()
  {
    LogicalAndExpressionImpl logicalAndExpression = new LogicalAndExpressionImpl();
    return logicalAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XorExpression createXorExpression()
  {
    XorExpressionImpl xorExpression = new XorExpressionImpl();
    return xorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShiftExpression createShiftExpression()
  {
    ShiftExpressionImpl shiftExpression = new ShiftExpressionImpl();
    return shiftExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulExpression createMulExpression()
  {
    MulExpressionImpl mulExpression = new MulExpressionImpl();
    return mulExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpression createCastExpression()
  {
    CastExpressionImpl castExpression = new CastExpressionImpl();
    return castExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeQualifier createTypeQualifierFromString(EDataType eDataType, String initialValue)
  {
    TypeQualifier result = TypeQualifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeQualifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecifier createTypeSpecifierFromString(EDataType eDataType, String initialValue)
  {
    TypeSpecifier result = TypeSpecifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeSpecifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterQualifier createParameterQualifierFromString(EDataType eDataType, String initialValue)
  {
    ParameterQualifier result = ParameterQualifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParameterQualifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItfPackage getItfPackage()
  {
    return (ItfPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ItfPackage getPackage()
  {
    return ItfPackage.eINSTANCE;
  }

} //ItfFactoryImpl
