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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.itf.ConstantDefinition;
import org.ow2.mindEd.itf.IncludeDirective;
import org.ow2.mindEd.itf.InterfaceDefinition;
import org.ow2.mindEd.itf.ItfFile;
import org.ow2.mindEd.itf.ItfPackage;
import org.ow2.mindEd.itf.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.impl.ItfFileImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.impl.ItfFileImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.impl.ItfFileImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.impl.ItfFileImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItfFileImpl extends MinimalEObjectImpl.Container implements ItfFile
{
  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<IncludeDirective> includes;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected EList<ConstantDefinition> constant;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<TypeDefinition> type;

  /**
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected InterfaceDefinition interface_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItfFileImpl()
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
    return ItfPackage.Literals.ITF_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IncludeDirective> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<IncludeDirective>(IncludeDirective.class, this, ItfPackage.ITF_FILE__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstantDefinition> getConstant()
  {
    if (constant == null)
    {
      constant = new EObjectContainmentEList<ConstantDefinition>(ConstantDefinition.class, this, ItfPackage.ITF_FILE__CONSTANT);
    }
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDefinition> getType()
  {
    if (type == null)
    {
      type = new EObjectContainmentEList<TypeDefinition>(TypeDefinition.class, this, ItfPackage.ITF_FILE__TYPE);
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDefinition getInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterface(InterfaceDefinition newInterface, NotificationChain msgs)
  {
    InterfaceDefinition oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItfPackage.ITF_FILE__INTERFACE, oldInterface, newInterface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(InterfaceDefinition newInterface)
  {
    if (newInterface != interface_)
    {
      NotificationChain msgs = null;
      if (interface_ != null)
        msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItfPackage.ITF_FILE__INTERFACE, null, msgs);
      if (newInterface != null)
        msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItfPackage.ITF_FILE__INTERFACE, null, msgs);
      msgs = basicSetInterface(newInterface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ItfPackage.ITF_FILE__INTERFACE, newInterface, newInterface));
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
      case ItfPackage.ITF_FILE__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
      case ItfPackage.ITF_FILE__CONSTANT:
        return ((InternalEList<?>)getConstant()).basicRemove(otherEnd, msgs);
      case ItfPackage.ITF_FILE__TYPE:
        return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
      case ItfPackage.ITF_FILE__INTERFACE:
        return basicSetInterface(null, msgs);
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
      case ItfPackage.ITF_FILE__INCLUDES:
        return getIncludes();
      case ItfPackage.ITF_FILE__CONSTANT:
        return getConstant();
      case ItfPackage.ITF_FILE__TYPE:
        return getType();
      case ItfPackage.ITF_FILE__INTERFACE:
        return getInterface();
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
      case ItfPackage.ITF_FILE__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends IncludeDirective>)newValue);
        return;
      case ItfPackage.ITF_FILE__CONSTANT:
        getConstant().clear();
        getConstant().addAll((Collection<? extends ConstantDefinition>)newValue);
        return;
      case ItfPackage.ITF_FILE__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends TypeDefinition>)newValue);
        return;
      case ItfPackage.ITF_FILE__INTERFACE:
        setInterface((InterfaceDefinition)newValue);
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
      case ItfPackage.ITF_FILE__INCLUDES:
        getIncludes().clear();
        return;
      case ItfPackage.ITF_FILE__CONSTANT:
        getConstant().clear();
        return;
      case ItfPackage.ITF_FILE__TYPE:
        getType().clear();
        return;
      case ItfPackage.ITF_FILE__INTERFACE:
        setInterface((InterfaceDefinition)null);
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
      case ItfPackage.ITF_FILE__INCLUDES:
        return includes != null && !includes.isEmpty();
      case ItfPackage.ITF_FILE__CONSTANT:
        return constant != null && !constant.isEmpty();
      case ItfPackage.ITF_FILE__TYPE:
        return type != null && !type.isEmpty();
      case ItfPackage.ITF_FILE__INTERFACE:
        return interface_ != null;
    }
    return super.eIsSet(featureID);
  }

} //ItfFileImpl
