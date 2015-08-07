/**
 */
package org.ow2.mindEd.adl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ow2.mindEd.adl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdlFactoryImpl extends EFactoryImpl implements AdlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AdlFactory init()
  {
    try
    {
      AdlFactory theAdlFactory = (AdlFactory)EPackage.Registry.INSTANCE.getEFactory(AdlPackage.eNS_URI);
      if (theAdlFactory != null)
      {
        return theAdlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AdlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdlFactoryImpl()
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
      case AdlPackage.ADL_FILE: return createAdlFile();
      case AdlPackage.ARCHITECTURE_DEFINITION: return createArchitectureDefinition();
      case AdlPackage.IMPORT_DEFINITION: return createImportDefinition();
      case AdlPackage.COMPOSITE_DEFINITION: return createCompositeDefinition();
      case AdlPackage.PRIMITIVE_DEFINITION: return createPrimitiveDefinition();
      case AdlPackage.TYPE_DEFINITION: return createTypeDefinition();
      case AdlPackage.COMPOSITE_SUPER_TYPE: return createCompositeSuperType();
      case AdlPackage.PRIMITIVE_SUPER_TYPE: return createPrimitiveSuperType();
      case AdlPackage.COMPOSITE_SUPER_TYPE_DEFINITION: return createCompositeSuperTypeDefinition();
      case AdlPackage.PRIMITIVE_SUPER_TYPE_DEFINITION: return createPrimitiveSuperTypeDefinition();
      case AdlPackage.HOSTED_INTERFACE_DEFINITION: return createHostedInterfaceDefinition();
      case AdlPackage.PROVIDED_INTERFACE_DEFINITION: return createProvidedInterfaceDefinition();
      case AdlPackage.REQUIRED_INTERFACE_DEFINITION: return createRequiredInterfaceDefinition();
      case AdlPackage.OUTPUT_FLOW_INTERFACE_DEFINITION: return createOutputFlowInterfaceDefinition();
      case AdlPackage.INPUT_FLOW_INTERFACE_DEFINITION: return createInputFlowInterfaceDefinition();
      case AdlPackage.TYPE_REFERENCE: return createTypeReference();
      case AdlPackage.SUB_COMPONENT_DEFINITION: return createSubComponentDefinition();
      case AdlPackage.ELEMENT: return createElement();
      case AdlPackage.COMPOSITE_ELEMENT: return createCompositeElement();
      case AdlPackage.PRIMITIVE_ELEMENT: return createPrimitiveElement();
      case AdlPackage.BINDING_DEFINITION: return createBindingDefinition();
      case AdlPackage.FORMAL_ARGUMENT: return createFormalArgument();
      case AdlPackage.FORMAL_ARGUMENTS_LIST: return createFormalArgumentsList();
      case AdlPackage.TEMPLATE_SPECIFIER: return createTemplateSpecifier();
      case AdlPackage.VALUE_LIST: return createValueList();
      case AdlPackage.TEMPLATE_REFERENCE: return createTemplateReference();
      case AdlPackage.ARGUMENT_DEFINITION: return createArgumentDefinition();
      case AdlPackage.ATTRIBUTE_DEFINITION: return createAttributeDefinition();
      case AdlPackage.IMPLEMENTATION_DEFINITION: return createImplementationDefinition();
      case AdlPackage.DATA_DEFINITION: return createDataDefinition();
      case AdlPackage.INLINE_CODE_C: return createInlineCodeC();
      case AdlPackage.ANNOTATIONS_LIST: return createAnnotationsList();
      case AdlPackage.ANNOTATION: return createAnnotation();
      case AdlPackage.ANNOTATION_ELEMENT: return createAnnotationElement();
      case AdlPackage.ELEMENT_VALUE: return createElementValue();
      case AdlPackage.ELEMENT_VALUE_ARRAY_INITIALIZER: return createElementValueArrayInitializer();
      case AdlPackage.CONSTANT_VALUE: return createConstantValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdlFile createAdlFile()
  {
    AdlFileImpl adlFile = new AdlFileImpl();
    return adlFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDefinition createArchitectureDefinition()
  {
    ArchitectureDefinitionImpl architectureDefinition = new ArchitectureDefinitionImpl();
    return architectureDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportDefinition createImportDefinition()
  {
    ImportDefinitionImpl importDefinition = new ImportDefinitionImpl();
    return importDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeDefinition createCompositeDefinition()
  {
    CompositeDefinitionImpl compositeDefinition = new CompositeDefinitionImpl();
    return compositeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveDefinition createPrimitiveDefinition()
  {
    PrimitiveDefinitionImpl primitiveDefinition = new PrimitiveDefinitionImpl();
    return primitiveDefinition;
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
  public CompositeSuperType createCompositeSuperType()
  {
    CompositeSuperTypeImpl compositeSuperType = new CompositeSuperTypeImpl();
    return compositeSuperType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveSuperType createPrimitiveSuperType()
  {
    PrimitiveSuperTypeImpl primitiveSuperType = new PrimitiveSuperTypeImpl();
    return primitiveSuperType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeSuperTypeDefinition createCompositeSuperTypeDefinition()
  {
    CompositeSuperTypeDefinitionImpl compositeSuperTypeDefinition = new CompositeSuperTypeDefinitionImpl();
    return compositeSuperTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveSuperTypeDefinition createPrimitiveSuperTypeDefinition()
  {
    PrimitiveSuperTypeDefinitionImpl primitiveSuperTypeDefinition = new PrimitiveSuperTypeDefinitionImpl();
    return primitiveSuperTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostedInterfaceDefinition createHostedInterfaceDefinition()
  {
    HostedInterfaceDefinitionImpl hostedInterfaceDefinition = new HostedInterfaceDefinitionImpl();
    return hostedInterfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedInterfaceDefinition createProvidedInterfaceDefinition()
  {
    ProvidedInterfaceDefinitionImpl providedInterfaceDefinition = new ProvidedInterfaceDefinitionImpl();
    return providedInterfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredInterfaceDefinition createRequiredInterfaceDefinition()
  {
    RequiredInterfaceDefinitionImpl requiredInterfaceDefinition = new RequiredInterfaceDefinitionImpl();
    return requiredInterfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputFlowInterfaceDefinition createOutputFlowInterfaceDefinition()
  {
    OutputFlowInterfaceDefinitionImpl outputFlowInterfaceDefinition = new OutputFlowInterfaceDefinitionImpl();
    return outputFlowInterfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputFlowInterfaceDefinition createInputFlowInterfaceDefinition()
  {
    InputFlowInterfaceDefinitionImpl inputFlowInterfaceDefinition = new InputFlowInterfaceDefinitionImpl();
    return inputFlowInterfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponentDefinition createSubComponentDefinition()
  {
    SubComponentDefinitionImpl subComponentDefinition = new SubComponentDefinitionImpl();
    return subComponentDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeElement createCompositeElement()
  {
    CompositeElementImpl compositeElement = new CompositeElementImpl();
    return compositeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveElement createPrimitiveElement()
  {
    PrimitiveElementImpl primitiveElement = new PrimitiveElementImpl();
    return primitiveElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingDefinition createBindingDefinition()
  {
    BindingDefinitionImpl bindingDefinition = new BindingDefinitionImpl();
    return bindingDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalArgument createFormalArgument()
  {
    FormalArgumentImpl formalArgument = new FormalArgumentImpl();
    return formalArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalArgumentsList createFormalArgumentsList()
  {
    FormalArgumentsListImpl formalArgumentsList = new FormalArgumentsListImpl();
    return formalArgumentsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSpecifier createTemplateSpecifier()
  {
    TemplateSpecifierImpl templateSpecifier = new TemplateSpecifierImpl();
    return templateSpecifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueList createValueList()
  {
    ValueListImpl valueList = new ValueListImpl();
    return valueList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateReference createTemplateReference()
  {
    TemplateReferenceImpl templateReference = new TemplateReferenceImpl();
    return templateReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentDefinition createArgumentDefinition()
  {
    ArgumentDefinitionImpl argumentDefinition = new ArgumentDefinitionImpl();
    return argumentDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDefinition createAttributeDefinition()
  {
    AttributeDefinitionImpl attributeDefinition = new AttributeDefinitionImpl();
    return attributeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementationDefinition createImplementationDefinition()
  {
    ImplementationDefinitionImpl implementationDefinition = new ImplementationDefinitionImpl();
    return implementationDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataDefinition createDataDefinition()
  {
    DataDefinitionImpl dataDefinition = new DataDefinitionImpl();
    return dataDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InlineCodeC createInlineCodeC()
  {
    InlineCodeCImpl inlineCodeC = new InlineCodeCImpl();
    return inlineCodeC;
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
  public AnnotationElement createAnnotationElement()
  {
    AnnotationElementImpl annotationElement = new AnnotationElementImpl();
    return annotationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementValue createElementValue()
  {
    ElementValueImpl elementValue = new ElementValueImpl();
    return elementValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementValueArrayInitializer createElementValueArrayInitializer()
  {
    ElementValueArrayInitializerImpl elementValueArrayInitializer = new ElementValueArrayInitializerImpl();
    return elementValueArrayInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantValue createConstantValue()
  {
    ConstantValueImpl constantValue = new ConstantValueImpl();
    return constantValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdlPackage getAdlPackage()
  {
    return (AdlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AdlPackage getPackage()
  {
    return AdlPackage.eINSTANCE;
  }

} //AdlFactoryImpl
