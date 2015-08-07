/**
 */
package org.ow2.mindEd.adl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ow2.mindEd.adl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.adl.AdlPackage
 * @generated
 */
public class AdlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AdlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AdlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AdlPackage.ADL_FILE:
      {
        AdlFile adlFile = (AdlFile)theEObject;
        T result = caseAdlFile(adlFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ARCHITECTURE_DEFINITION:
      {
        ArchitectureDefinition architectureDefinition = (ArchitectureDefinition)theEObject;
        T result = caseArchitectureDefinition(architectureDefinition);
        if (result == null) result = caseTypeReference(architectureDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.IMPORT_DEFINITION:
      {
        ImportDefinition importDefinition = (ImportDefinition)theEObject;
        T result = caseImportDefinition(importDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.COMPOSITE_DEFINITION:
      {
        CompositeDefinition compositeDefinition = (CompositeDefinition)theEObject;
        T result = caseCompositeDefinition(compositeDefinition);
        if (result == null) result = caseArchitectureDefinition(compositeDefinition);
        if (result == null) result = caseCompositeSuperTypeDefinition(compositeDefinition);
        if (result == null) result = caseTypeReference(compositeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PRIMITIVE_DEFINITION:
      {
        PrimitiveDefinition primitiveDefinition = (PrimitiveDefinition)theEObject;
        T result = casePrimitiveDefinition(primitiveDefinition);
        if (result == null) result = caseArchitectureDefinition(primitiveDefinition);
        if (result == null) result = casePrimitiveSuperTypeDefinition(primitiveDefinition);
        if (result == null) result = caseTypeReference(primitiveDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = caseArchitectureDefinition(typeDefinition);
        if (result == null) result = caseCompositeSuperTypeDefinition(typeDefinition);
        if (result == null) result = casePrimitiveSuperTypeDefinition(typeDefinition);
        if (result == null) result = caseTypeReference(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.COMPOSITE_SUPER_TYPE:
      {
        CompositeSuperType compositeSuperType = (CompositeSuperType)theEObject;
        T result = caseCompositeSuperType(compositeSuperType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PRIMITIVE_SUPER_TYPE:
      {
        PrimitiveSuperType primitiveSuperType = (PrimitiveSuperType)theEObject;
        T result = casePrimitiveSuperType(primitiveSuperType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.COMPOSITE_SUPER_TYPE_DEFINITION:
      {
        CompositeSuperTypeDefinition compositeSuperTypeDefinition = (CompositeSuperTypeDefinition)theEObject;
        T result = caseCompositeSuperTypeDefinition(compositeSuperTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PRIMITIVE_SUPER_TYPE_DEFINITION:
      {
        PrimitiveSuperTypeDefinition primitiveSuperTypeDefinition = (PrimitiveSuperTypeDefinition)theEObject;
        T result = casePrimitiveSuperTypeDefinition(primitiveSuperTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.HOSTED_INTERFACE_DEFINITION:
      {
        HostedInterfaceDefinition hostedInterfaceDefinition = (HostedInterfaceDefinition)theEObject;
        T result = caseHostedInterfaceDefinition(hostedInterfaceDefinition);
        if (result == null) result = caseCompositeElement(hostedInterfaceDefinition);
        if (result == null) result = casePrimitiveElement(hostedInterfaceDefinition);
        if (result == null) result = caseElement(hostedInterfaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PROVIDED_INTERFACE_DEFINITION:
      {
        ProvidedInterfaceDefinition providedInterfaceDefinition = (ProvidedInterfaceDefinition)theEObject;
        T result = caseProvidedInterfaceDefinition(providedInterfaceDefinition);
        if (result == null) result = caseHostedInterfaceDefinition(providedInterfaceDefinition);
        if (result == null) result = caseCompositeElement(providedInterfaceDefinition);
        if (result == null) result = casePrimitiveElement(providedInterfaceDefinition);
        if (result == null) result = caseElement(providedInterfaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.REQUIRED_INTERFACE_DEFINITION:
      {
        RequiredInterfaceDefinition requiredInterfaceDefinition = (RequiredInterfaceDefinition)theEObject;
        T result = caseRequiredInterfaceDefinition(requiredInterfaceDefinition);
        if (result == null) result = caseHostedInterfaceDefinition(requiredInterfaceDefinition);
        if (result == null) result = caseCompositeElement(requiredInterfaceDefinition);
        if (result == null) result = casePrimitiveElement(requiredInterfaceDefinition);
        if (result == null) result = caseElement(requiredInterfaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.OUTPUT_FLOW_INTERFACE_DEFINITION:
      {
        OutputFlowInterfaceDefinition outputFlowInterfaceDefinition = (OutputFlowInterfaceDefinition)theEObject;
        T result = caseOutputFlowInterfaceDefinition(outputFlowInterfaceDefinition);
        if (result == null) result = caseHostedInterfaceDefinition(outputFlowInterfaceDefinition);
        if (result == null) result = caseCompositeElement(outputFlowInterfaceDefinition);
        if (result == null) result = casePrimitiveElement(outputFlowInterfaceDefinition);
        if (result == null) result = caseElement(outputFlowInterfaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.INPUT_FLOW_INTERFACE_DEFINITION:
      {
        InputFlowInterfaceDefinition inputFlowInterfaceDefinition = (InputFlowInterfaceDefinition)theEObject;
        T result = caseInputFlowInterfaceDefinition(inputFlowInterfaceDefinition);
        if (result == null) result = caseHostedInterfaceDefinition(inputFlowInterfaceDefinition);
        if (result == null) result = caseCompositeElement(inputFlowInterfaceDefinition);
        if (result == null) result = casePrimitiveElement(inputFlowInterfaceDefinition);
        if (result == null) result = caseElement(inputFlowInterfaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.FLOW_TYPE:
      {
        FlowType flowType = (FlowType)theEObject;
        T result = caseFlowType(flowType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.IDT_TYPE:
      {
        IDTType idtType = (IDTType)theEObject;
        T result = caseIDTType(idtType);
        if (result == null) result = caseFlowType(idtType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.TYPE_REFERENCE:
      {
        TypeReference typeReference = (TypeReference)theEObject;
        T result = caseTypeReference(typeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.SUB_COMPONENT_DEFINITION:
      {
        SubComponentDefinition subComponentDefinition = (SubComponentDefinition)theEObject;
        T result = caseSubComponentDefinition(subComponentDefinition);
        if (result == null) result = caseCompositeElement(subComponentDefinition);
        if (result == null) result = caseElement(subComponentDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.COMPOSITE_ELEMENT:
      {
        CompositeElement compositeElement = (CompositeElement)theEObject;
        T result = caseCompositeElement(compositeElement);
        if (result == null) result = caseElement(compositeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PRIMITIVE_ELEMENT:
      {
        PrimitiveElement primitiveElement = (PrimitiveElement)theEObject;
        T result = casePrimitiveElement(primitiveElement);
        if (result == null) result = caseElement(primitiveElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.BINDING_DEFINITION:
      {
        BindingDefinition bindingDefinition = (BindingDefinition)theEObject;
        T result = caseBindingDefinition(bindingDefinition);
        if (result == null) result = caseCompositeElement(bindingDefinition);
        if (result == null) result = caseElement(bindingDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.FORMAL_ARGUMENT:
      {
        FormalArgument formalArgument = (FormalArgument)theEObject;
        T result = caseFormalArgument(formalArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.FORMAL_ARGUMENTS_LIST:
      {
        FormalArgumentsList formalArgumentsList = (FormalArgumentsList)theEObject;
        T result = caseFormalArgumentsList(formalArgumentsList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.TEMPLATE_SPECIFIER:
      {
        TemplateSpecifier templateSpecifier = (TemplateSpecifier)theEObject;
        T result = caseTemplateSpecifier(templateSpecifier);
        if (result == null) result = caseTypeReference(templateSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ATTRIBUTE_TYPE:
      {
        AttributeType attributeType = (AttributeType)theEObject;
        T result = caseAttributeType(attributeType);
        if (result == null) result = caseFlowType(attributeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.VALUE_LIST:
      {
        ValueList valueList = (ValueList)theEObject;
        T result = caseValueList(valueList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.TEMPLATE_REFERENCE:
      {
        TemplateReference templateReference = (TemplateReference)theEObject;
        T result = caseTemplateReference(templateReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ARGUMENT_DEFINITION:
      {
        ArgumentDefinition argumentDefinition = (ArgumentDefinition)theEObject;
        T result = caseArgumentDefinition(argumentDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ATTRIBUTE_DEFINITION:
      {
        AttributeDefinition attributeDefinition = (AttributeDefinition)theEObject;
        T result = caseAttributeDefinition(attributeDefinition);
        if (result == null) result = casePrimitiveElement(attributeDefinition);
        if (result == null) result = caseElement(attributeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.IMPLEMENTATION_DEFINITION:
      {
        ImplementationDefinition implementationDefinition = (ImplementationDefinition)theEObject;
        T result = caseImplementationDefinition(implementationDefinition);
        if (result == null) result = casePrimitiveElement(implementationDefinition);
        if (result == null) result = caseElement(implementationDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.DATA_DEFINITION:
      {
        DataDefinition dataDefinition = (DataDefinition)theEObject;
        T result = caseDataDefinition(dataDefinition);
        if (result == null) result = casePrimitiveElement(dataDefinition);
        if (result == null) result = caseElement(dataDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.INLINE_CODE_C:
      {
        InlineCodeC inlineCodeC = (InlineCodeC)theEObject;
        T result = caseInlineCodeC(inlineCodeC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.FILE_PATH:
      {
        FilePath filePath = (FilePath)theEObject;
        T result = caseFilePath(filePath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ANNOTATIONS_LIST:
      {
        AnnotationsList annotationsList = (AnnotationsList)theEObject;
        T result = caseAnnotationsList(annotationsList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = caseElementValue(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ANNOTATION_ELEMENT:
      {
        AnnotationElement annotationElement = (AnnotationElement)theEObject;
        T result = caseAnnotationElement(annotationElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ELEMENT_VALUE:
      {
        ElementValue elementValue = (ElementValue)theEObject;
        T result = caseElementValue(elementValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ELEMENT_VALUE_ARRAY_INITIALIZER:
      {
        ElementValueArrayInitializer elementValueArrayInitializer = (ElementValueArrayInitializer)theEObject;
        T result = caseElementValueArrayInitializer(elementValueArrayInitializer);
        if (result == null) result = caseElementValue(elementValueArrayInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.CONSTANT_VALUE:
      {
        ConstantValue constantValue = (ConstantValue)theEObject;
        T result = caseConstantValue(constantValue);
        if (result == null) result = caseElementValue(constantValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdlFile(AdlFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Architecture Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Architecture Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArchitectureDefinition(ArchitectureDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportDefinition(ImportDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeDefinition(CompositeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveDefinition(PrimitiveDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Super Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Super Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeSuperType(CompositeSuperType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Super Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Super Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveSuperType(PrimitiveSuperType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Super Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Super Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeSuperTypeDefinition(CompositeSuperTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Super Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Super Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveSuperTypeDefinition(PrimitiveSuperTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hosted Interface Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hosted Interface Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHostedInterfaceDefinition(HostedInterfaceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provided Interface Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provided Interface Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvidedInterfaceDefinition(ProvidedInterfaceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Interface Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Interface Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredInterfaceDefinition(RequiredInterfaceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Flow Interface Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Flow Interface Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputFlowInterfaceDefinition(OutputFlowInterfaceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Flow Interface Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Flow Interface Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputFlowInterfaceDefinition(InputFlowInterfaceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowType(FlowType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IDT Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IDT Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIDTType(IDTType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeReference(TypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Component Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Component Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubComponentDefinition(SubComponentDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeElement(CompositeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveElement(PrimitiveElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindingDefinition(BindingDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalArgument(FormalArgument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Arguments List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Arguments List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalArgumentsList(FormalArgumentsList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateSpecifier(TemplateSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeType(AttributeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueList(ValueList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateReference(TemplateReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgumentDefinition(ArgumentDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeDefinition(AttributeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implementation Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implementation Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementationDefinition(ImplementationDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataDefinition(DataDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inline Code C</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inline Code C</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInlineCodeC(InlineCodeC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilePath(FilePath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotations List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotations List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationsList(AnnotationsList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation(Annotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationElement(AnnotationElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementValue(ElementValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Value Array Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Value Array Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementValueArrayInitializer(ElementValueArrayInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantValue(ConstantValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AdlSwitch
