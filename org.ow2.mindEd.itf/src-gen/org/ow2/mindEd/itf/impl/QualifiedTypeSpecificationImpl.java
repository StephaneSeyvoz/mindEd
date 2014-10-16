/**
 */
package org.ow2.mindEd.itf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.ow2.mindEd.itf.ItfPackage;
import org.ow2.mindEd.itf.QualifiedTypeSpecification;
import org.ow2.mindEd.itf.TypeQualifier;
import org.ow2.mindEd.itf.TypeSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Type Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.impl.QualifiedTypeSpecificationImpl#getTypeQualifier <em>Type Qualifier</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.impl.QualifiedTypeSpecificationImpl#getTypeSpec <em>Type Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualifiedTypeSpecificationImpl extends MinimalEObjectImpl.Container implements QualifiedTypeSpecification
{
  /**
   * The cached value of the '{@link #getTypeQualifier() <em>Type Qualifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeQualifier()
   * @generated
   * @ordered
   */
  protected EList<TypeQualifier> typeQualifier;

  /**
   * The cached value of the '{@link #getTypeSpec() <em>Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpec()
   * @generated
   * @ordered
   */
  protected TypeSpecification typeSpec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualifiedTypeSpecificationImpl()
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
    return ItfPackage.Literals.QUALIFIED_TYPE_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeQualifier> getTypeQualifier()
  {
    if (typeQualifier == null)
    {
      typeQualifier = new EDataTypeEList<TypeQualifier>(TypeQualifier.class, this, ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_QUALIFIER);
    }
    return typeQualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecification getTypeSpec()
  {
    return typeSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeSpec(TypeSpecification newTypeSpec, NotificationChain msgs)
  {
    TypeSpecification oldTypeSpec = typeSpec;
    typeSpec = newTypeSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC, oldTypeSpec, newTypeSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeSpec(TypeSpecification newTypeSpec)
  {
    if (newTypeSpec != typeSpec)
    {
      NotificationChain msgs = null;
      if (typeSpec != null)
        msgs = ((InternalEObject)typeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC, null, msgs);
      if (newTypeSpec != null)
        msgs = ((InternalEObject)newTypeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC, null, msgs);
      msgs = basicSetTypeSpec(newTypeSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC, newTypeSpec, newTypeSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC:
        return basicSetTypeSpec(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_QUALIFIER:
        return getTypeQualifier();
      case ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC:
        return getTypeSpec();
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
      case ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_QUALIFIER:
        getTypeQualifier().clear();
        getTypeQualifier().addAll((Collection<? extends TypeQualifier>)newValue);
        return;
      case ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC:
        setTypeSpec((TypeSpecification)newValue);
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
      case ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_QUALIFIER:
        getTypeQualifier().clear();
        return;
      case ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC:
        setTypeSpec((TypeSpecification)null);
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
      case ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_QUALIFIER:
        return typeQualifier != null && !typeQualifier.isEmpty();
      case ItfPackage.QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC:
        return typeSpec != null;
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
    result.append(" (typeQualifier: ");
    result.append(typeQualifier);
    result.append(')');
    return result.toString();
  }

} //QualifiedTypeSpecificationImpl
