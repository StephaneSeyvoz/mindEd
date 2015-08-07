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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.CompositeDefinition;
import org.ow2.mindEd.adl.CompositeElement;
import org.ow2.mindEd.adl.CompositeSuperType;
import org.ow2.mindEd.adl.FormalArgumentsList;
import org.ow2.mindEd.adl.TemplateSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.impl.CompositeDefinitionImpl#getTemplateSpecifiers <em>Template Specifiers</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.CompositeDefinitionImpl#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.CompositeDefinitionImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.impl.CompositeDefinitionImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeDefinitionImpl extends ArchitectureDefinitionImpl implements CompositeDefinition
{
  /**
   * The cached value of the '{@link #getTemplateSpecifiers() <em>Template Specifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateSpecifiers()
   * @generated
   * @ordered
   */
  protected EList<TemplateSpecifier> templateSpecifiers;

  /**
   * The cached value of the '{@link #getCompositeFormalArgumentsList() <em>Composite Formal Arguments List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompositeFormalArgumentsList()
   * @generated
   * @ordered
   */
  protected FormalArgumentsList compositeFormalArgumentsList;

  /**
   * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperTypes()
   * @generated
   * @ordered
   */
  protected EList<CompositeSuperType> superTypes;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<CompositeElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeDefinitionImpl()
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
    return AdlPackage.Literals.COMPOSITE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateSpecifier> getTemplateSpecifiers()
  {
    if (templateSpecifiers == null)
    {
      templateSpecifiers = new EObjectContainmentEList<TemplateSpecifier>(TemplateSpecifier.class, this, AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS);
    }
    return templateSpecifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalArgumentsList getCompositeFormalArgumentsList()
  {
    return compositeFormalArgumentsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompositeFormalArgumentsList(FormalArgumentsList newCompositeFormalArgumentsList, NotificationChain msgs)
  {
    FormalArgumentsList oldCompositeFormalArgumentsList = compositeFormalArgumentsList;
    compositeFormalArgumentsList = newCompositeFormalArgumentsList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, oldCompositeFormalArgumentsList, newCompositeFormalArgumentsList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompositeFormalArgumentsList(FormalArgumentsList newCompositeFormalArgumentsList)
  {
    if (newCompositeFormalArgumentsList != compositeFormalArgumentsList)
    {
      NotificationChain msgs = null;
      if (compositeFormalArgumentsList != null)
        msgs = ((InternalEObject)compositeFormalArgumentsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, null, msgs);
      if (newCompositeFormalArgumentsList != null)
        msgs = ((InternalEObject)newCompositeFormalArgumentsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, null, msgs);
      msgs = basicSetCompositeFormalArgumentsList(newCompositeFormalArgumentsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, newCompositeFormalArgumentsList, newCompositeFormalArgumentsList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompositeSuperType> getSuperTypes()
  {
    if (superTypes == null)
    {
      superTypes = new EObjectContainmentEList<CompositeSuperType>(CompositeSuperType.class, this, AdlPackage.COMPOSITE_DEFINITION__SUPER_TYPES);
    }
    return superTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompositeElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<CompositeElement>(CompositeElement.class, this, AdlPackage.COMPOSITE_DEFINITION__ELEMENTS);
    }
    return elements;
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
      case AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS:
        return ((InternalEList<?>)getTemplateSpecifiers()).basicRemove(otherEnd, msgs);
      case AdlPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        return basicSetCompositeFormalArgumentsList(null, msgs);
      case AdlPackage.COMPOSITE_DEFINITION__SUPER_TYPES:
        return ((InternalEList<?>)getSuperTypes()).basicRemove(otherEnd, msgs);
      case AdlPackage.COMPOSITE_DEFINITION__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS:
        return getTemplateSpecifiers();
      case AdlPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        return getCompositeFormalArgumentsList();
      case AdlPackage.COMPOSITE_DEFINITION__SUPER_TYPES:
        return getSuperTypes();
      case AdlPackage.COMPOSITE_DEFINITION__ELEMENTS:
        return getElements();
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
      case AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS:
        getTemplateSpecifiers().clear();
        getTemplateSpecifiers().addAll((Collection<? extends TemplateSpecifier>)newValue);
        return;
      case AdlPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        setCompositeFormalArgumentsList((FormalArgumentsList)newValue);
        return;
      case AdlPackage.COMPOSITE_DEFINITION__SUPER_TYPES:
        getSuperTypes().clear();
        getSuperTypes().addAll((Collection<? extends CompositeSuperType>)newValue);
        return;
      case AdlPackage.COMPOSITE_DEFINITION__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends CompositeElement>)newValue);
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
      case AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS:
        getTemplateSpecifiers().clear();
        return;
      case AdlPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        setCompositeFormalArgumentsList((FormalArgumentsList)null);
        return;
      case AdlPackage.COMPOSITE_DEFINITION__SUPER_TYPES:
        getSuperTypes().clear();
        return;
      case AdlPackage.COMPOSITE_DEFINITION__ELEMENTS:
        getElements().clear();
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
      case AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS:
        return templateSpecifiers != null && !templateSpecifiers.isEmpty();
      case AdlPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        return compositeFormalArgumentsList != null;
      case AdlPackage.COMPOSITE_DEFINITION__SUPER_TYPES:
        return superTypes != null && !superTypes.isEmpty();
      case AdlPackage.COMPOSITE_DEFINITION__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompositeDefinitionImpl
