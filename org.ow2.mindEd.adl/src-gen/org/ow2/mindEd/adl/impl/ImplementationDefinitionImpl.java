/**
 */
package org.ow2.mindEd.adl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ImplementationDefinition;
import org.ow2.mindEd.adl.InlineCodeC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.impl.ImplementationDefinitionImpl#getCFile <em>CFile</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.ImplementationDefinitionImpl#getInlineCcode <em>Inline Ccode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationDefinitionImpl extends PrimitiveElementImpl implements ImplementationDefinition
{
  /**
   * The default value of the '{@link #getCFile() <em>CFile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCFile()
   * @generated
   * @ordered
   */
  protected static final String CFILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCFile() <em>CFile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCFile()
   * @generated
   * @ordered
   */
  protected String cFile = CFILE_EDEFAULT;

  /**
   * The cached value of the '{@link #getInlineCcode() <em>Inline Ccode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInlineCcode()
   * @generated
   * @ordered
   */
  protected InlineCodeC inlineCcode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplementationDefinitionImpl()
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
    return AdlPackage.Literals.IMPLEMENTATION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCFile()
  {
    return cFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCFile(String newCFile)
  {
    String oldCFile = cFile;
    cFile = newCFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.IMPLEMENTATION_DEFINITION__CFILE, oldCFile, cFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InlineCodeC getInlineCcode()
  {
    return inlineCcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInlineCcode(InlineCodeC newInlineCcode, NotificationChain msgs)
  {
    InlineCodeC oldInlineCcode = inlineCcode;
    inlineCcode = newInlineCcode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.IMPLEMENTATION_DEFINITION__INLINE_CCODE, oldInlineCcode, newInlineCcode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInlineCcode(InlineCodeC newInlineCcode)
  {
    if (newInlineCcode != inlineCcode)
    {
      NotificationChain msgs = null;
      if (inlineCcode != null)
        msgs = ((InternalEObject)inlineCcode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.IMPLEMENTATION_DEFINITION__INLINE_CCODE, null, msgs);
      if (newInlineCcode != null)
        msgs = ((InternalEObject)newInlineCcode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.IMPLEMENTATION_DEFINITION__INLINE_CCODE, null, msgs);
      msgs = basicSetInlineCcode(newInlineCcode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.IMPLEMENTATION_DEFINITION__INLINE_CCODE, newInlineCcode, newInlineCcode));
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
      case AdlPackage.IMPLEMENTATION_DEFINITION__INLINE_CCODE:
        return basicSetInlineCcode(null, msgs);
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
      case AdlPackage.IMPLEMENTATION_DEFINITION__CFILE:
        return getCFile();
      case AdlPackage.IMPLEMENTATION_DEFINITION__INLINE_CCODE:
        return getInlineCcode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdlPackage.IMPLEMENTATION_DEFINITION__CFILE:
        setCFile((String)newValue);
        return;
      case AdlPackage.IMPLEMENTATION_DEFINITION__INLINE_CCODE:
        setInlineCcode((InlineCodeC)newValue);
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
      case AdlPackage.IMPLEMENTATION_DEFINITION__CFILE:
        setCFile(CFILE_EDEFAULT);
        return;
      case AdlPackage.IMPLEMENTATION_DEFINITION__INLINE_CCODE:
        setInlineCcode((InlineCodeC)null);
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
      case AdlPackage.IMPLEMENTATION_DEFINITION__CFILE:
        return CFILE_EDEFAULT == null ? cFile != null : !CFILE_EDEFAULT.equals(cFile);
      case AdlPackage.IMPLEMENTATION_DEFINITION__INLINE_CCODE:
        return inlineCcode != null;
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
    result.append(" (cFile: ");
    result.append(cFile);
    result.append(')');
    return result.toString();
  }

} //ImplementationDefinitionImpl
