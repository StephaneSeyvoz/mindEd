/**
 */
package org.ow2.mindEd.idt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.ow2.mindEd.idt.ConstantDefinitionBegin;
import org.ow2.mindEd.idt.IdtFile;
import org.ow2.mindEd.idt.IdtPackage;

import org.ow2.mindEd.itf.ConstantDefinition;
import org.ow2.mindEd.itf.IncludeDirective;
import org.ow2.mindEd.itf.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.idt.impl.IdtFileImpl#getBegindef <em>Begindef</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.impl.IdtFileImpl#getDef <em>Def</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.impl.IdtFileImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.impl.IdtFileImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.impl.IdtFileImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.impl.IdtFileImpl#getEndDef <em>End Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdtFileImpl extends MinimalEObjectImpl.Container implements IdtFile
{
  /**
   * The cached value of the '{@link #getBegindef() <em>Begindef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBegindef()
   * @generated
   * @ordered
   */
  protected ConstantDefinitionBegin begindef;

  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected ConstantDefinition def;

  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<IncludeDirective> includes;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected EList<ConstantDefinition> constant;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<TypeDefinition> type;

  /**
   * The default value of the '{@link #getEndDef() <em>End Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndDef()
   * @generated
   * @ordered
   */
  protected static final String END_DEF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndDef() <em>End Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndDef()
   * @generated
   * @ordered
   */
  protected String endDef = END_DEF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdtFileImpl()
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
    return IdtPackage.Literals.IDT_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinitionBegin getBegindef()
  {
    return begindef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBegindef(ConstantDefinitionBegin newBegindef, NotificationChain msgs)
  {
    ConstantDefinitionBegin oldBegindef = begindef;
    begindef = newBegindef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdtPackage.IDT_FILE__BEGINDEF, oldBegindef, newBegindef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBegindef(ConstantDefinitionBegin newBegindef)
  {
    if (newBegindef != begindef)
    {
      NotificationChain msgs = null;
      if (begindef != null)
        msgs = ((InternalEObject)begindef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdtPackage.IDT_FILE__BEGINDEF, null, msgs);
      if (newBegindef != null)
        msgs = ((InternalEObject)newBegindef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdtPackage.IDT_FILE__BEGINDEF, null, msgs);
      msgs = basicSetBegindef(newBegindef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdtPackage.IDT_FILE__BEGINDEF, newBegindef, newBegindef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinition getDef()
  {
    if (def != null && def.eIsProxy())
    {
      InternalEObject oldDef = (InternalEObject)def;
      def = (ConstantDefinition)eResolveProxy(oldDef);
      if (def != oldDef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdtPackage.IDT_FILE__DEF, oldDef, def));
      }
    }
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinition basicGetDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(ConstantDefinition newDef)
  {
    ConstantDefinition oldDef = def;
    def = newDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdtPackage.IDT_FILE__DEF, oldDef, def));
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
      includes = new EObjectResolvingEList<IncludeDirective>(IncludeDirective.class, this, IdtPackage.IDT_FILE__INCLUDES);
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
      constant = new EObjectResolvingEList<ConstantDefinition>(ConstantDefinition.class, this, IdtPackage.IDT_FILE__CONSTANT);
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
      type = new EObjectResolvingEList<TypeDefinition>(TypeDefinition.class, this, IdtPackage.IDT_FILE__TYPE);
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndDef()
  {
    return endDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndDef(String newEndDef)
  {
    String oldEndDef = endDef;
    endDef = newEndDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdtPackage.IDT_FILE__END_DEF, oldEndDef, endDef));
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
      case IdtPackage.IDT_FILE__BEGINDEF:
        return basicSetBegindef(null, msgs);
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
      case IdtPackage.IDT_FILE__BEGINDEF:
        return getBegindef();
      case IdtPackage.IDT_FILE__DEF:
        if (resolve) return getDef();
        return basicGetDef();
      case IdtPackage.IDT_FILE__INCLUDES:
        return getIncludes();
      case IdtPackage.IDT_FILE__CONSTANT:
        return getConstant();
      case IdtPackage.IDT_FILE__TYPE:
        return getType();
      case IdtPackage.IDT_FILE__END_DEF:
        return getEndDef();
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
      case IdtPackage.IDT_FILE__BEGINDEF:
        setBegindef((ConstantDefinitionBegin)newValue);
        return;
      case IdtPackage.IDT_FILE__DEF:
        setDef((ConstantDefinition)newValue);
        return;
      case IdtPackage.IDT_FILE__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends IncludeDirective>)newValue);
        return;
      case IdtPackage.IDT_FILE__CONSTANT:
        getConstant().clear();
        getConstant().addAll((Collection<? extends ConstantDefinition>)newValue);
        return;
      case IdtPackage.IDT_FILE__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends TypeDefinition>)newValue);
        return;
      case IdtPackage.IDT_FILE__END_DEF:
        setEndDef((String)newValue);
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
      case IdtPackage.IDT_FILE__BEGINDEF:
        setBegindef((ConstantDefinitionBegin)null);
        return;
      case IdtPackage.IDT_FILE__DEF:
        setDef((ConstantDefinition)null);
        return;
      case IdtPackage.IDT_FILE__INCLUDES:
        getIncludes().clear();
        return;
      case IdtPackage.IDT_FILE__CONSTANT:
        getConstant().clear();
        return;
      case IdtPackage.IDT_FILE__TYPE:
        getType().clear();
        return;
      case IdtPackage.IDT_FILE__END_DEF:
        setEndDef(END_DEF_EDEFAULT);
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
      case IdtPackage.IDT_FILE__BEGINDEF:
        return begindef != null;
      case IdtPackage.IDT_FILE__DEF:
        return def != null;
      case IdtPackage.IDT_FILE__INCLUDES:
        return includes != null && !includes.isEmpty();
      case IdtPackage.IDT_FILE__CONSTANT:
        return constant != null && !constant.isEmpty();
      case IdtPackage.IDT_FILE__TYPE:
        return type != null && !type.isEmpty();
      case IdtPackage.IDT_FILE__END_DEF:
        return END_DEF_EDEFAULT == null ? endDef != null : !END_DEF_EDEFAULT.equals(endDef);
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
    result.append(" (endDef: ");
    result.append(endDef);
    result.append(')');
    return result.toString();
  }

} //IdtFileImpl
