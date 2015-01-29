/**
 */
package org.ow2.mindEd.idt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ow2.mindEd.idt.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdtFactoryImpl extends EFactoryImpl implements IdtFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IdtFactory init()
  {
    try
    {
      IdtFactory theIdtFactory = (IdtFactory)EPackage.Registry.INSTANCE.getEFactory(IdtPackage.eNS_URI);
      if (theIdtFactory != null)
      {
        return theIdtFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IdtFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdtFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IdtPackage.IDT_FILE: return createIdtFile();
      case IdtPackage.CONSTANT_DEFINITION_BEGIN: return createConstantDefinitionBegin();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdtFile createIdtFile()
  {
    IdtFileImpl idtFile = new IdtFileImpl();
    return idtFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinitionBegin createConstantDefinitionBegin()
  {
    ConstantDefinitionBeginImpl constantDefinitionBegin = new ConstantDefinitionBeginImpl();
    return constantDefinitionBegin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdtPackage getIdtPackage()
  {
    return (IdtPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IdtPackage getPackage()
  {
    return IdtPackage.eINSTANCE;
  }

} //IdtFactoryImpl
