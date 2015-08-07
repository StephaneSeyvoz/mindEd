/**
 */
package org.ow2.mindEd.adl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ArgumentDefinition;
import org.ow2.mindEd.adl.TemplateReference;
import org.ow2.mindEd.adl.TemplateSpecifier;
import org.ow2.mindEd.adl.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.impl.TemplateReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.TemplateReferenceImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.TemplateReferenceImpl#isAnyTypeReference <em>Any Type Reference</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.TemplateReferenceImpl#getTemplatesList <em>Templates List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.TemplateReferenceImpl#getArgumentsList <em>Arguments List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateReferenceImpl extends MinimalEObjectImpl.Container implements TemplateReference
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected TemplateSpecifier name;

  /**
   * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeReference()
   * @generated
   * @ordered
   */
  protected TypeReference typeReference;

  /**
   * The default value of the '{@link #isAnyTypeReference() <em>Any Type Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnyTypeReference()
   * @generated
   * @ordered
   */
  protected static final boolean ANY_TYPE_REFERENCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnyTypeReference() <em>Any Type Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnyTypeReference()
   * @generated
   * @ordered
   */
  protected boolean anyTypeReference = ANY_TYPE_REFERENCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTemplatesList() <em>Templates List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplatesList()
   * @generated
   * @ordered
   */
  protected EList<TemplateReference> templatesList;

  /**
   * The cached value of the '{@link #getArgumentsList() <em>Arguments List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgumentsList()
   * @generated
   * @ordered
   */
  protected EList<ArgumentDefinition> argumentsList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateReferenceImpl()
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
    return AdlPackage.Literals.TEMPLATE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSpecifier getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(TemplateSpecifier newName, NotificationChain msgs)
  {
    TemplateSpecifier oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_REFERENCE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(TemplateSpecifier newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.TEMPLATE_REFERENCE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.TEMPLATE_REFERENCE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_REFERENCE__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getTypeReference()
  {
    if (typeReference != null && typeReference.eIsProxy())
    {
      InternalEObject oldTypeReference = (InternalEObject)typeReference;
      typeReference = (TypeReference)eResolveProxy(oldTypeReference);
      if (typeReference != oldTypeReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.TEMPLATE_REFERENCE__TYPE_REFERENCE, oldTypeReference, typeReference));
      }
    }
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference basicGetTypeReference()
  {
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeReference(TypeReference newTypeReference)
  {
    TypeReference oldTypeReference = typeReference;
    typeReference = newTypeReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_REFERENCE__TYPE_REFERENCE, oldTypeReference, typeReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAnyTypeReference()
  {
    return anyTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnyTypeReference(boolean newAnyTypeReference)
  {
    boolean oldAnyTypeReference = anyTypeReference;
    anyTypeReference = newAnyTypeReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.TEMPLATE_REFERENCE__ANY_TYPE_REFERENCE, oldAnyTypeReference, anyTypeReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateReference> getTemplatesList()
  {
    if (templatesList == null)
    {
      templatesList = new EObjectContainmentEList<TemplateReference>(TemplateReference.class, this, AdlPackage.TEMPLATE_REFERENCE__TEMPLATES_LIST);
    }
    return templatesList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArgumentDefinition> getArgumentsList()
  {
    if (argumentsList == null)
    {
      argumentsList = new EObjectContainmentEList<ArgumentDefinition>(ArgumentDefinition.class, this, AdlPackage.TEMPLATE_REFERENCE__ARGUMENTS_LIST);
    }
    return argumentsList;
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
      case AdlPackage.TEMPLATE_REFERENCE__NAME:
        return basicSetName(null, msgs);
      case AdlPackage.TEMPLATE_REFERENCE__TEMPLATES_LIST:
        return ((InternalEList<?>)getTemplatesList()).basicRemove(otherEnd, msgs);
      case AdlPackage.TEMPLATE_REFERENCE__ARGUMENTS_LIST:
        return ((InternalEList<?>)getArgumentsList()).basicRemove(otherEnd, msgs);
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
      case AdlPackage.TEMPLATE_REFERENCE__NAME:
        return getName();
      case AdlPackage.TEMPLATE_REFERENCE__TYPE_REFERENCE:
        if (resolve) return getTypeReference();
        return basicGetTypeReference();
      case AdlPackage.TEMPLATE_REFERENCE__ANY_TYPE_REFERENCE:
        return isAnyTypeReference();
      case AdlPackage.TEMPLATE_REFERENCE__TEMPLATES_LIST:
        return getTemplatesList();
      case AdlPackage.TEMPLATE_REFERENCE__ARGUMENTS_LIST:
        return getArgumentsList();
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
      case AdlPackage.TEMPLATE_REFERENCE__NAME:
        setName((TemplateSpecifier)newValue);
        return;
      case AdlPackage.TEMPLATE_REFERENCE__TYPE_REFERENCE:
        setTypeReference((TypeReference)newValue);
        return;
      case AdlPackage.TEMPLATE_REFERENCE__ANY_TYPE_REFERENCE:
        setAnyTypeReference((Boolean)newValue);
        return;
      case AdlPackage.TEMPLATE_REFERENCE__TEMPLATES_LIST:
        getTemplatesList().clear();
        getTemplatesList().addAll((Collection<? extends TemplateReference>)newValue);
        return;
      case AdlPackage.TEMPLATE_REFERENCE__ARGUMENTS_LIST:
        getArgumentsList().clear();
        getArgumentsList().addAll((Collection<? extends ArgumentDefinition>)newValue);
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
      case AdlPackage.TEMPLATE_REFERENCE__NAME:
        setName((TemplateSpecifier)null);
        return;
      case AdlPackage.TEMPLATE_REFERENCE__TYPE_REFERENCE:
        setTypeReference((TypeReference)null);
        return;
      case AdlPackage.TEMPLATE_REFERENCE__ANY_TYPE_REFERENCE:
        setAnyTypeReference(ANY_TYPE_REFERENCE_EDEFAULT);
        return;
      case AdlPackage.TEMPLATE_REFERENCE__TEMPLATES_LIST:
        getTemplatesList().clear();
        return;
      case AdlPackage.TEMPLATE_REFERENCE__ARGUMENTS_LIST:
        getArgumentsList().clear();
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
      case AdlPackage.TEMPLATE_REFERENCE__NAME:
        return name != null;
      case AdlPackage.TEMPLATE_REFERENCE__TYPE_REFERENCE:
        return typeReference != null;
      case AdlPackage.TEMPLATE_REFERENCE__ANY_TYPE_REFERENCE:
        return anyTypeReference != ANY_TYPE_REFERENCE_EDEFAULT;
      case AdlPackage.TEMPLATE_REFERENCE__TEMPLATES_LIST:
        return templatesList != null && !templatesList.isEmpty();
      case AdlPackage.TEMPLATE_REFERENCE__ARGUMENTS_LIST:
        return argumentsList != null && !argumentsList.isEmpty();
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
    result.append(" (anyTypeReference: ");
    result.append(anyTypeReference);
    result.append(')');
    return result.toString();
  }

} //TemplateReferenceImpl
