/**
 */
package org.ow2.mindEd.itf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.itf.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.itf.ItfPackage
 * @generated
 */
public class ItfAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ItfPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItfAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ItfPackage.eINSTANCE;
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
  protected ItfSwitch<Adapter> modelSwitch =
    new ItfSwitch<Adapter>()
    {
      @Override
      public Adapter caseItfFile(ItfFile object)
      {
        return createItfFileAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseTypedefSpecification(TypedefSpecification object)
      {
        return createTypedefSpecificationAdapter();
      }
      @Override
      public Adapter caseQualifiedTypeSpecification(QualifiedTypeSpecification object)
      {
        return createQualifiedTypeSpecificationAdapter();
      }
      @Override
      public Adapter caseTypeSpecification(TypeSpecification object)
      {
        return createTypeSpecificationAdapter();
      }
      @Override
      public Adapter caseStructOrUnionSpecification(StructOrUnionSpecification object)
      {
        return createStructOrUnionSpecificationAdapter();
      }
      @Override
      public Adapter caseStructOrUnionDefinition(StructOrUnionDefinition object)
      {
        return createStructOrUnionDefinitionAdapter();
      }
      @Override
      public Adapter caseStructorUnionReference(StructorUnionReference object)
      {
        return createStructorUnionReferenceAdapter();
      }
      @Override
      public Adapter caseStructMember(StructMember object)
      {
        return createStructMemberAdapter();
      }
      @Override
      public Adapter caseEnumSpecification(EnumSpecification object)
      {
        return createEnumSpecificationAdapter();
      }
      @Override
      public Adapter caseEnumDefinition(EnumDefinition object)
      {
        return createEnumDefinitionAdapter();
      }
      @Override
      public Adapter caseEnumReference(EnumReference object)
      {
        return createEnumReferenceAdapter();
      }
      @Override
      public Adapter caseEnumMemberList(EnumMemberList object)
      {
        return createEnumMemberListAdapter();
      }
      @Override
      public Adapter caseEnumMember(EnumMember object)
      {
        return createEnumMemberAdapter();
      }
      @Override
      public Adapter caseDeclarators(Declarators object)
      {
        return createDeclaratorsAdapter();
      }
      @Override
      public Adapter caseDeclarator(Declarator object)
      {
        return createDeclaratorAdapter();
      }
      @Override
      public Adapter caseQualifiedPointerSpecification(QualifiedPointerSpecification object)
      {
        return createQualifiedPointerSpecificationAdapter();
      }
      @Override
      public Adapter caseDirectNamedDeclarator(DirectNamedDeclarator object)
      {
        return createDirectNamedDeclaratorAdapter();
      }
      @Override
      public Adapter caseDirectAnonymousDeclarator(DirectAnonymousDeclarator object)
      {
        return createDirectAnonymousDeclaratorAdapter();
      }
      @Override
      public Adapter caseArraySpecification(ArraySpecification object)
      {
        return createArraySpecificationAdapter();
      }
      @Override
      public Adapter caseConstantDefinition(ConstantDefinition object)
      {
        return createConstantDefinitionAdapter();
      }
      @Override
      public Adapter caseInterfaceDefinition(InterfaceDefinition object)
      {
        return createInterfaceDefinitionAdapter();
      }
      @Override
      public Adapter caseMethodDefinition(MethodDefinition object)
      {
        return createMethodDefinitionAdapter();
      }
      @Override
      public Adapter caseParameterList(ParameterList object)
      {
        return createParameterListAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseIncludeDirective(IncludeDirective object)
      {
        return createIncludeDirectiveAdapter();
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
      public Adapter caseAnnotationValuePair(AnnotationValuePair object)
      {
        return createAnnotationValuePairAdapter();
      }
      @Override
      public Adapter caseAnnotationValue(AnnotationValue object)
      {
        return createAnnotationValueAdapter();
      }
      @Override
      public Adapter caseArrayAnnotationValue(ArrayAnnotationValue object)
      {
        return createArrayAnnotationValueAdapter();
      }
      @Override
      public Adapter caseConstantExpression(ConstantExpression object)
      {
        return createConstantExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalOrExpression(LogicalOrExpression object)
      {
        return createLogicalOrExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalAndExpression(LogicalAndExpression object)
      {
        return createLogicalAndExpressionAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseXorExpression(XorExpression object)
      {
        return createXorExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseShiftExpression(ShiftExpression object)
      {
        return createShiftExpressionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpression(AdditiveExpression object)
      {
        return createAdditiveExpressionAdapter();
      }
      @Override
      public Adapter caseMulExpression(MulExpression object)
      {
        return createMulExpressionAdapter();
      }
      @Override
      public Adapter caseCastExpression(CastExpression object)
      {
        return createCastExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter casePrimaryExpression(PrimaryExpression object)
      {
        return createPrimaryExpressionAdapter();
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
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.ItfFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.ItfFile
   * @generated
   */
  public Adapter createItfFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.TypedefSpecification <em>Typedef Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.TypedefSpecification
   * @generated
   */
  public Adapter createTypedefSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.QualifiedTypeSpecification <em>Qualified Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.QualifiedTypeSpecification
   * @generated
   */
  public Adapter createQualifiedTypeSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.TypeSpecification <em>Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.TypeSpecification
   * @generated
   */
  public Adapter createTypeSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.StructOrUnionSpecification <em>Struct Or Union Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.StructOrUnionSpecification
   * @generated
   */
  public Adapter createStructOrUnionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.StructOrUnionDefinition <em>Struct Or Union Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.StructOrUnionDefinition
   * @generated
   */
  public Adapter createStructOrUnionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.StructorUnionReference <em>Structor Union Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.StructorUnionReference
   * @generated
   */
  public Adapter createStructorUnionReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.StructMember <em>Struct Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.StructMember
   * @generated
   */
  public Adapter createStructMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.EnumSpecification <em>Enum Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.EnumSpecification
   * @generated
   */
  public Adapter createEnumSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.EnumDefinition <em>Enum Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.EnumDefinition
   * @generated
   */
  public Adapter createEnumDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.EnumReference <em>Enum Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.EnumReference
   * @generated
   */
  public Adapter createEnumReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.EnumMemberList <em>Enum Member List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.EnumMemberList
   * @generated
   */
  public Adapter createEnumMemberListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.EnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.EnumMember
   * @generated
   */
  public Adapter createEnumMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.Declarators <em>Declarators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.Declarators
   * @generated
   */
  public Adapter createDeclaratorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.Declarator <em>Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.Declarator
   * @generated
   */
  public Adapter createDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.QualifiedPointerSpecification <em>Qualified Pointer Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.QualifiedPointerSpecification
   * @generated
   */
  public Adapter createQualifiedPointerSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.DirectNamedDeclarator <em>Direct Named Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.DirectNamedDeclarator
   * @generated
   */
  public Adapter createDirectNamedDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.DirectAnonymousDeclarator <em>Direct Anonymous Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.DirectAnonymousDeclarator
   * @generated
   */
  public Adapter createDirectAnonymousDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.ArraySpecification <em>Array Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.ArraySpecification
   * @generated
   */
  public Adapter createArraySpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.ConstantDefinition
   * @generated
   */
  public Adapter createConstantDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.InterfaceDefinition <em>Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.InterfaceDefinition
   * @generated
   */
  public Adapter createInterfaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.MethodDefinition <em>Method Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.MethodDefinition
   * @generated
   */
  public Adapter createMethodDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.ParameterList
   * @generated
   */
  public Adapter createParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.IncludeDirective <em>Include Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.IncludeDirective
   * @generated
   */
  public Adapter createIncludeDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.AnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.AnnotationsList
   * @generated
   */
  public Adapter createAnnotationsListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.AnnotationValuePair <em>Annotation Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.AnnotationValuePair
   * @generated
   */
  public Adapter createAnnotationValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.AnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.AnnotationValue
   * @generated
   */
  public Adapter createAnnotationValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.ArrayAnnotationValue <em>Array Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.ArrayAnnotationValue
   * @generated
   */
  public Adapter createArrayAnnotationValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.ConstantExpression <em>Constant Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.ConstantExpression
   * @generated
   */
  public Adapter createConstantExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.LogicalOrExpression <em>Logical Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.LogicalOrExpression
   * @generated
   */
  public Adapter createLogicalOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.LogicalAndExpression <em>Logical And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.LogicalAndExpression
   * @generated
   */
  public Adapter createLogicalAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.XorExpression <em>Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.XorExpression
   * @generated
   */
  public Adapter createXorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.ShiftExpression <em>Shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.ShiftExpression
   * @generated
   */
  public Adapter createShiftExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.AdditiveExpression
   * @generated
   */
  public Adapter createAdditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.MulExpression <em>Mul Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.MulExpression
   * @generated
   */
  public Adapter createMulExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.CastExpression
   * @generated
   */
  public Adapter createCastExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.PrimaryExpression
   * @generated
   */
  public Adapter createPrimaryExpressionAdapter()
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

} //ItfAdapterFactory
