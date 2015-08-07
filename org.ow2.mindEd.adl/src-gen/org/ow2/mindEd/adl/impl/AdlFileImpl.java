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

import org.ow2.mindEd.adl.AdlFile;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.AnnotationsList;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ImportDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.impl.AdlFileImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.AdlFileImpl#getAnnotationsList <em>Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.AdlFileImpl#getArchitectureDefinition <em>Architecture Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdlFileImpl extends MinimalEObjectImpl.Container implements AdlFile
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportDefinition> imports;

  /**
   * The cached value of the '{@link #getAnnotationsList() <em>Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationsList()
   * @generated
   * @ordered
   */
  protected AnnotationsList annotationsList;

  /**
   * The cached value of the '{@link #getArchitectureDefinition() <em>Architecture Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchitectureDefinition()
   * @generated
   * @ordered
   */
  protected ArchitectureDefinition architectureDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdlFileImpl()
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
    return AdlPackage.Literals.ADL_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportDefinition> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportDefinition>(ImportDefinition.class, this, AdlPackage.ADL_FILE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationsList getAnnotationsList()
  {
    return annotationsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotationsList(AnnotationsList newAnnotationsList, NotificationChain msgs)
  {
    AnnotationsList oldAnnotationsList = annotationsList;
    annotationsList = newAnnotationsList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.ADL_FILE__ANNOTATIONS_LIST, oldAnnotationsList, newAnnotationsList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationsList(AnnotationsList newAnnotationsList)
  {
    if (newAnnotationsList != annotationsList)
    {
      NotificationChain msgs = null;
      if (annotationsList != null)
        msgs = ((InternalEObject)annotationsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.ADL_FILE__ANNOTATIONS_LIST, null, msgs);
      if (newAnnotationsList != null)
        msgs = ((InternalEObject)newAnnotationsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.ADL_FILE__ANNOTATIONS_LIST, null, msgs);
      msgs = basicSetAnnotationsList(newAnnotationsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ADL_FILE__ANNOTATIONS_LIST, newAnnotationsList, newAnnotationsList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDefinition getArchitectureDefinition()
  {
    return architectureDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArchitectureDefinition(ArchitectureDefinition newArchitectureDefinition, NotificationChain msgs)
  {
    ArchitectureDefinition oldArchitectureDefinition = architectureDefinition;
    architectureDefinition = newArchitectureDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.ADL_FILE__ARCHITECTURE_DEFINITION, oldArchitectureDefinition, newArchitectureDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArchitectureDefinition(ArchitectureDefinition newArchitectureDefinition)
  {
    if (newArchitectureDefinition != architectureDefinition)
    {
      NotificationChain msgs = null;
      if (architectureDefinition != null)
        msgs = ((InternalEObject)architectureDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.ADL_FILE__ARCHITECTURE_DEFINITION, null, msgs);
      if (newArchitectureDefinition != null)
        msgs = ((InternalEObject)newArchitectureDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.ADL_FILE__ARCHITECTURE_DEFINITION, null, msgs);
      msgs = basicSetArchitectureDefinition(newArchitectureDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ADL_FILE__ARCHITECTURE_DEFINITION, newArchitectureDefinition, newArchitectureDefinition));
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
      case AdlPackage.ADL_FILE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case AdlPackage.ADL_FILE__ANNOTATIONS_LIST:
        return basicSetAnnotationsList(null, msgs);
      case AdlPackage.ADL_FILE__ARCHITECTURE_DEFINITION:
        return basicSetArchitectureDefinition(null, msgs);
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
      case AdlPackage.ADL_FILE__IMPORTS:
        return getImports();
      case AdlPackage.ADL_FILE__ANNOTATIONS_LIST:
        return getAnnotationsList();
      case AdlPackage.ADL_FILE__ARCHITECTURE_DEFINITION:
        return getArchitectureDefinition();
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
      case AdlPackage.ADL_FILE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportDefinition>)newValue);
        return;
      case AdlPackage.ADL_FILE__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)newValue);
        return;
      case AdlPackage.ADL_FILE__ARCHITECTURE_DEFINITION:
        setArchitectureDefinition((ArchitectureDefinition)newValue);
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
      case AdlPackage.ADL_FILE__IMPORTS:
        getImports().clear();
        return;
      case AdlPackage.ADL_FILE__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)null);
        return;
      case AdlPackage.ADL_FILE__ARCHITECTURE_DEFINITION:
        setArchitectureDefinition((ArchitectureDefinition)null);
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
      case AdlPackage.ADL_FILE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case AdlPackage.ADL_FILE__ANNOTATIONS_LIST:
        return annotationsList != null;
      case AdlPackage.ADL_FILE__ARCHITECTURE_DEFINITION:
        return architectureDefinition != null;
    }
    return super.eIsSet(featureID);
  }

} //AdlFileImpl
