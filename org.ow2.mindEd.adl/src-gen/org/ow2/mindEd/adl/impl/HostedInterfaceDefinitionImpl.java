/**
 */
package org.ow2.mindEd.adl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.HostedInterfaceDefinition;

import org.ow2.mindEd.itf.InterfaceDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hosted Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.impl.HostedInterfaceDefinitionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.HostedInterfaceDefinitionImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.HostedInterfaceDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.HostedInterfaceDefinitionImpl#isCollection <em>Collection</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.HostedInterfaceDefinitionImpl#getCollectionsize <em>Collectionsize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostedInterfaceDefinitionImpl extends ElementImpl implements HostedInterfaceDefinition
{
  /**
   * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected static final String ROLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected String role = ROLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignature()
   * @generated
   * @ordered
   */
  protected InterfaceDefinition signature;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCollection()
   * @generated
   * @ordered
   */
  protected static final boolean COLLECTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCollection()
   * @generated
   * @ordered
   */
  protected boolean collection = COLLECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getCollectionsize() <em>Collectionsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectionsize()
   * @generated
   * @ordered
   */
  protected static final int COLLECTIONSIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCollectionsize() <em>Collectionsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectionsize()
   * @generated
   * @ordered
   */
  protected int collectionsize = COLLECTIONSIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HostedInterfaceDefinitionImpl()
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
    return AdlPackage.Literals.HOSTED_INTERFACE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRole()
  {
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole(String newRole)
  {
    String oldRole = role;
    role = newRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.HOSTED_INTERFACE_DEFINITION__ROLE, oldRole, role));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDefinition getSignature()
  {
    if (signature != null && signature.eIsProxy())
    {
      InternalEObject oldSignature = (InternalEObject)signature;
      signature = (InterfaceDefinition)eResolveProxy(oldSignature);
      if (signature != oldSignature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.HOSTED_INTERFACE_DEFINITION__SIGNATURE, oldSignature, signature));
      }
    }
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDefinition basicGetSignature()
  {
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignature(InterfaceDefinition newSignature)
  {
    InterfaceDefinition oldSignature = signature;
    signature = newSignature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.HOSTED_INTERFACE_DEFINITION__SIGNATURE, oldSignature, signature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.HOSTED_INTERFACE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollection(boolean newCollection)
  {
    boolean oldCollection = collection;
    collection = newCollection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.HOSTED_INTERFACE_DEFINITION__COLLECTION, oldCollection, collection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCollectionsize()
  {
    return collectionsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollectionsize(int newCollectionsize)
  {
    int oldCollectionsize = collectionsize;
    collectionsize = newCollectionsize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE, oldCollectionsize, collectionsize));
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
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__ROLE:
        return getRole();
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__SIGNATURE:
        if (resolve) return getSignature();
        return basicGetSignature();
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__NAME:
        return getName();
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__COLLECTION:
        return isCollection();
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE:
        return getCollectionsize();
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
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__ROLE:
        setRole((String)newValue);
        return;
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__SIGNATURE:
        setSignature((InterfaceDefinition)newValue);
        return;
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__COLLECTION:
        setCollection((Boolean)newValue);
        return;
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE:
        setCollectionsize((Integer)newValue);
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
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__ROLE:
        setRole(ROLE_EDEFAULT);
        return;
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__SIGNATURE:
        setSignature((InterfaceDefinition)null);
        return;
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__COLLECTION:
        setCollection(COLLECTION_EDEFAULT);
        return;
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE:
        setCollectionsize(COLLECTIONSIZE_EDEFAULT);
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
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__ROLE:
        return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__SIGNATURE:
        return signature != null;
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__COLLECTION:
        return collection != COLLECTION_EDEFAULT;
      case AdlPackage.HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE:
        return collectionsize != COLLECTIONSIZE_EDEFAULT;
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
    result.append(" (role: ");
    result.append(role);
    result.append(", name: ");
    result.append(name);
    result.append(", collection: ");
    result.append(collection);
    result.append(", collectionsize: ");
    result.append(collectionsize);
    result.append(')');
    return result.toString();
  }

} //HostedInterfaceDefinitionImpl
