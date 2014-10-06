/**
 */
package org.ow2.mindEd.itf.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.ow2.mindEd.itf.ItfPackage;
import org.ow2.mindEd.itf.QualifiedPointerSpecification;
import org.ow2.mindEd.itf.TypeQualifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Pointer Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.impl.QualifiedPointerSpecificationImpl#getTypeQualifiers <em>Type Qualifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualifiedPointerSpecificationImpl extends MinimalEObjectImpl.Container implements QualifiedPointerSpecification
{
  /**
   * The cached value of the '{@link #getTypeQualifiers() <em>Type Qualifiers</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeQualifiers()
   * @generated
   * @ordered
   */
  protected EList<TypeQualifier> typeQualifiers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualifiedPointerSpecificationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ItfPackage.Literals.QUALIFIED_POINTER_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeQualifier> getTypeQualifiers()
  {
    if (typeQualifiers == null)
    {
      typeQualifiers = new EDataTypeEList<TypeQualifier>(TypeQualifier.class, this, ItfPackage.QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIERS);
    }
    return typeQualifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ItfPackage.QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIERS:
        return getTypeQualifiers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ItfPackage.QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIERS:
        getTypeQualifiers().clear();
        getTypeQualifiers().addAll((Collection<? extends TypeQualifier>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ItfPackage.QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIERS:
        getTypeQualifiers().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ItfPackage.QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIERS:
        return typeQualifiers != null && !typeQualifiers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (typeQualifiers: ");
    result.append(typeQualifiers);
    result.append(')');
    return result.toString();
  }

} //QualifiedPointerSpecificationImpl
