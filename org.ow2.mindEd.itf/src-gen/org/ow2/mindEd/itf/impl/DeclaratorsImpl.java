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

import org.ow2.mindEd.itf.Declarator;
import org.ow2.mindEd.itf.Declarators;
import org.ow2.mindEd.itf.ItfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declarators</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.impl.DeclaratorsImpl#getDec <em>Dec</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.impl.DeclaratorsImpl#getDeclaratorList <em>Declarator List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclaratorsImpl extends MinimalEObjectImpl.Container implements Declarators
{
  /**
   * The cached value of the '{@link #getDec() <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec()
   * @generated
   * @ordered
   */
  protected Declarator dec;

  /**
   * The cached value of the '{@link #getDeclaratorList() <em>Declarator List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaratorList()
   * @generated
   * @ordered
   */
  protected EList<Declarator> declaratorList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclaratorsImpl()
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
    return ItfPackage.Literals.DECLARATORS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarator getDec()
  {
    return dec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDec(Declarator newDec, NotificationChain msgs)
  {
    Declarator oldDec = dec;
    dec = newDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItfPackage.DECLARATORS__DEC, oldDec, newDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDec(Declarator newDec)
  {
    if (newDec != dec)
    {
      NotificationChain msgs = null;
      if (dec != null)
        msgs = ((InternalEObject)dec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItfPackage.DECLARATORS__DEC, null, msgs);
      if (newDec != null)
        msgs = ((InternalEObject)newDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItfPackage.DECLARATORS__DEC, null, msgs);
      msgs = basicSetDec(newDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ItfPackage.DECLARATORS__DEC, newDec, newDec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Declarator> getDeclaratorList()
  {
    if (declaratorList == null)
    {
      declaratorList = new EObjectContainmentEList<Declarator>(Declarator.class, this, ItfPackage.DECLARATORS__DECLARATOR_LIST);
    }
    return declaratorList;
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
      case ItfPackage.DECLARATORS__DEC:
        return basicSetDec(null, msgs);
      case ItfPackage.DECLARATORS__DECLARATOR_LIST:
        return ((InternalEList<?>)getDeclaratorList()).basicRemove(otherEnd, msgs);
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
      case ItfPackage.DECLARATORS__DEC:
        return getDec();
      case ItfPackage.DECLARATORS__DECLARATOR_LIST:
        return getDeclaratorList();
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
      case ItfPackage.DECLARATORS__DEC:
        setDec((Declarator)newValue);
        return;
      case ItfPackage.DECLARATORS__DECLARATOR_LIST:
        getDeclaratorList().clear();
        getDeclaratorList().addAll((Collection<? extends Declarator>)newValue);
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
      case ItfPackage.DECLARATORS__DEC:
        setDec((Declarator)null);
        return;
      case ItfPackage.DECLARATORS__DECLARATOR_LIST:
        getDeclaratorList().clear();
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
      case ItfPackage.DECLARATORS__DEC:
        return dec != null;
      case ItfPackage.DECLARATORS__DECLARATOR_LIST:
        return declaratorList != null && !declaratorList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DeclaratorsImpl
