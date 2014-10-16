/**
 */
package org.ow2.mindEd.adl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.adl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.adl.AdlPackage
 * @generated
 */
public class AdlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AdlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AdlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdlSwitch<Adapter> modelSwitch =
    new AdlSwitch<Adapter>()
    {
      @Override
      public Adapter caseAdlFile(AdlFile object)
      {
        return createAdlFileAdapter();
      }
      @Override
      public Adapter caseArchitectureDefinition(ArchitectureDefinition object)
      {
        return createArchitectureDefinitionAdapter();
      }
      @Override
      public Adapter caseImportDefinition(ImportDefinition object)
      {
        return createImportDefinitionAdapter();
      }
      @Override
      public Adapter caseCompositeDefinition(CompositeDefinition object)
      {
        return createCompositeDefinitionAdapter();
      }
      @Override
      public Adapter casePrimitiveDefinition(PrimitiveDefinition object)
      {
        return createPrimitiveDefinitionAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseCompositeSuperType(CompositeSuperType object)
      {
        return createCompositeSuperTypeAdapter();
      }
      @Override
      public Adapter casePrimitiveSuperType(PrimitiveSuperType object)
      {
        return createPrimitiveSuperTypeAdapter();
      }
      @Override
      public Adapter caseCompositeSuperTypeDefinition(CompositeSuperTypeDefinition object)
      {
        return createCompositeSuperTypeDefinitionAdapter();
      }
      @Override
      public Adapter casePrimitiveSuperTypeDefinition(PrimitiveSuperTypeDefinition object)
      {
        return createPrimitiveSuperTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseHostedInterfaceDefinition(HostedInterfaceDefinition object)
      {
        return createHostedInterfaceDefinitionAdapter();
      }
      @Override
      public Adapter caseProvidedInterfaceDefinition(ProvidedInterfaceDefinition object)
      {
        return createProvidedInterfaceDefinitionAdapter();
      }
      @Override
      public Adapter caseRequiredInterfaceDefinition(RequiredInterfaceDefinition object)
      {
        return createRequiredInterfaceDefinitionAdapter();
      }
      @Override
      public Adapter caseTypeReference(TypeReference object)
      {
        return createTypeReferenceAdapter();
      }
      @Override
      public Adapter caseSubComponentDefinition(SubComponentDefinition object)
      {
        return createSubComponentDefinitionAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseCompositeElement(CompositeElement object)
      {
        return createCompositeElementAdapter();
      }
      @Override
      public Adapter casePrimitiveElement(PrimitiveElement object)
      {
        return createPrimitiveElementAdapter();
      }
      @Override
      public Adapter caseBindingDefinition(BindingDefinition object)
      {
        return createBindingDefinitionAdapter();
      }
      @Override
      public Adapter caseFormalArgument(FormalArgument object)
      {
        return createFormalArgumentAdapter();
      }
      @Override
      public Adapter caseFormalArgumentsList(FormalArgumentsList object)
      {
        return createFormalArgumentsListAdapter();
      }
      @Override
      public Adapter caseTemplateSpecifier(TemplateSpecifier object)
      {
        return createTemplateSpecifierAdapter();
      }
      @Override
      public Adapter caseValueList(ValueList object)
      {
        return createValueListAdapter();
      }
      @Override
      public Adapter caseTemplateReference(TemplateReference object)
      {
        return createTemplateReferenceAdapter();
      }
      @Override
      public Adapter caseArgumentDefinition(ArgumentDefinition object)
      {
        return createArgumentDefinitionAdapter();
      }
      @Override
      public Adapter caseAttributeDefinition(AttributeDefinition object)
      {
        return createAttributeDefinitionAdapter();
      }
      @Override
      public Adapter caseImplementationDefinition(ImplementationDefinition object)
      {
        return createImplementationDefinitionAdapter();
      }
      @Override
      public Adapter caseDataDefinition(DataDefinition object)
      {
        return createDataDefinitionAdapter();
      }
      @Override
      public Adapter caseFileC(FileC object)
      {
        return createFileCAdapter();
      }
      @Override
      public Adapter caseInlineCodeC(InlineCodeC object)
      {
        return createInlineCodeCAdapter();
      }
      @Override
      public Adapter caseAnnotationsList(AnnotationsList object)
      {
        return createAnnotationsListAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseAnnotationElement(AnnotationElement object)
      {
        return createAnnotationElementAdapter();
      }
      @Override
      public Adapter caseElementValue(ElementValue object)
      {
        return createElementValueAdapter();
      }
      @Override
      public Adapter caseElementValueArrayInitializer(ElementValueArrayInitializer object)
      {
        return createElementValueArrayInitializerAdapter();
      }
      @Override
      public Adapter caseConstantValue(ConstantValue object)
      {
        return createConstantValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.AdlFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.AdlFile
   * @generated
   */
  public Adapter createAdlFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.ArchitectureDefinition <em>Architecture Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.ArchitectureDefinition
   * @generated
   */
  public Adapter createArchitectureDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.ImportDefinition <em>Import Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.ImportDefinition
   * @generated
   */
  public Adapter createImportDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.CompositeDefinition <em>Composite Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.CompositeDefinition
   * @generated
   */
  public Adapter createCompositeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.PrimitiveDefinition <em>Primitive Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.PrimitiveDefinition
   * @generated
   */
  public Adapter createPrimitiveDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.CompositeSuperType <em>Composite Super Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.CompositeSuperType
   * @generated
   */
  public Adapter createCompositeSuperTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.PrimitiveSuperType <em>Primitive Super Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.PrimitiveSuperType
   * @generated
   */
  public Adapter createPrimitiveSuperTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.CompositeSuperTypeDefinition <em>Composite Super Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.CompositeSuperTypeDefinition
   * @generated
   */
  public Adapter createCompositeSuperTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.PrimitiveSuperTypeDefinition <em>Primitive Super Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.PrimitiveSuperTypeDefinition
   * @generated
   */
  public Adapter createPrimitiveSuperTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.HostedInterfaceDefinition <em>Hosted Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.HostedInterfaceDefinition
   * @generated
   */
  public Adapter createHostedInterfaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.ProvidedInterfaceDefinition <em>Provided Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.ProvidedInterfaceDefinition
   * @generated
   */
  public Adapter createProvidedInterfaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.RequiredInterfaceDefinition <em>Required Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.RequiredInterfaceDefinition
   * @generated
   */
  public Adapter createRequiredInterfaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.TypeReference
   * @generated
   */
  public Adapter createTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.SubComponentDefinition <em>Sub Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.SubComponentDefinition
   * @generated
   */
  public Adapter createSubComponentDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.CompositeElement <em>Composite Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.CompositeElement
   * @generated
   */
  public Adapter createCompositeElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.PrimitiveElement <em>Primitive Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.PrimitiveElement
   * @generated
   */
  public Adapter createPrimitiveElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.BindingDefinition <em>Binding Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.BindingDefinition
   * @generated
   */
  public Adapter createBindingDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.FormalArgument <em>Formal Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.FormalArgument
   * @generated
   */
  public Adapter createFormalArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.FormalArgumentsList <em>Formal Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.FormalArgumentsList
   * @generated
   */
  public Adapter createFormalArgumentsListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.TemplateSpecifier <em>Template Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.TemplateSpecifier
   * @generated
   */
  public Adapter createTemplateSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.ValueList <em>Value List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.ValueList
   * @generated
   */
  public Adapter createValueListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.TemplateReference <em>Template Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.TemplateReference
   * @generated
   */
  public Adapter createTemplateReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.ArgumentDefinition <em>Argument Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.ArgumentDefinition
   * @generated
   */
  public Adapter createArgumentDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.AttributeDefinition <em>Attribute Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.AttributeDefinition
   * @generated
   */
  public Adapter createAttributeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.ImplementationDefinition <em>Implementation Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.ImplementationDefinition
   * @generated
   */
  public Adapter createImplementationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.DataDefinition <em>Data Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.DataDefinition
   * @generated
   */
  public Adapter createDataDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.FileC <em>File C</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.FileC
   * @generated
   */
  public Adapter createFileCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.InlineCodeC <em>Inline Code C</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.InlineCodeC
   * @generated
   */
  public Adapter createInlineCodeCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.AnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.AnnotationsList
   * @generated
   */
  public Adapter createAnnotationsListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.AnnotationElement <em>Annotation Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.AnnotationElement
   * @generated
   */
  public Adapter createAnnotationElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.ElementValue <em>Element Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.ElementValue
   * @generated
   */
  public Adapter createElementValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.ElementValueArrayInitializer <em>Element Value Array Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.ElementValueArrayInitializer
   * @generated
   */
  public Adapter createElementValueArrayInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.ConstantValue <em>Constant Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.ConstantValue
   * @generated
   */
  public Adapter createConstantValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AdlAdapterFactory
