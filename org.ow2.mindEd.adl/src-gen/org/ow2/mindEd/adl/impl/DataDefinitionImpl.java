/**
 */
package org.ow2.mindEd.adl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.DataDefinition;
import org.ow2.mindEd.adl.FilePath;
import org.ow2.mindEd.adl.InlineCodeC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.impl.DataDefinitionImpl#getCFile <em>CFile</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.DataDefinitionImpl#getInlineCcode <em>Inline Ccode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDefinitionImpl extends PrimitiveElementImpl implements DataDefinition
{
  /**
   * The cached value of the '{@link #getCFile() <em>CFile</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCFile()
   * @generated
   * @ordered
   */
  protected FilePath cFile;

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
  protected DataDefinitionImpl()
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
    return AdlPackage.Literals.DATA_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilePath getCFile()
  {
    return cFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCFile(FilePath newCFile, NotificationChain msgs)
  {
    FilePath oldCFile = cFile;
    cFile = newCFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.DATA_DEFINITION__CFILE, oldCFile, newCFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCFile(FilePath newCFile)
  {
    if (newCFile != cFile)
    {
      NotificationChain msgs = null;
      if (cFile != null)
        msgs = ((InternalEObject)cFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.DATA_DEFINITION__CFILE, null, msgs);
      if (newCFile != null)
        msgs = ((InternalEObject)newCFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.DATA_DEFINITION__CFILE, null, msgs);
      msgs = basicSetCFile(newCFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.DATA_DEFINITION__CFILE, newCFile, newCFile));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.DATA_DEFINITION__INLINE_CCODE, oldInlineCcode, newInlineCcode);
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
        msgs = ((InternalEObject)inlineCcode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.DATA_DEFINITION__INLINE_CCODE, null, msgs);
      if (newInlineCcode != null)
        msgs = ((InternalEObject)newInlineCcode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.DATA_DEFINITION__INLINE_CCODE, null, msgs);
      msgs = basicSetInlineCcode(newInlineCcode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.DATA_DEFINITION__INLINE_CCODE, newInlineCcode, newInlineCcode));
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
      case AdlPackage.DATA_DEFINITION__CFILE:
        return basicSetCFile(null, msgs);
      case AdlPackage.DATA_DEFINITION__INLINE_CCODE:
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
      case AdlPackage.DATA_DEFINITION__CFILE:
        return getCFile();
      case AdlPackage.DATA_DEFINITION__INLINE_CCODE:
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
      case AdlPackage.DATA_DEFINITION__CFILE:
        setCFile((FilePath)newValue);
        return;
      case AdlPackage.DATA_DEFINITION__INLINE_CCODE:
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
      case AdlPackage.DATA_DEFINITION__CFILE:
        setCFile((FilePath)null);
        return;
      case AdlPackage.DATA_DEFINITION__INLINE_CCODE:
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
      case AdlPackage.DATA_DEFINITION__CFILE:
        return cFile != null;
      case AdlPackage.DATA_DEFINITION__INLINE_CCODE:
        return inlineCcode != null;
    }
    return super.eIsSet(featureID);
  }

} //DataDefinitionImpl
