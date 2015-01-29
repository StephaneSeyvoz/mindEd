/**
 */
package org.ow2.mindEd.idt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.idt.IdtPackage
 * @generated
 */
public interface IdtFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IdtFactory eINSTANCE = org.ow2.mindEd.idt.impl.IdtFactoryImpl.init();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  IdtFile createIdtFile();

  /**
   * Returns a new object of class '<em>Constant Definition Begin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Definition Begin</em>'.
   * @generated
   */
  ConstantDefinitionBegin createConstantDefinitionBegin();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IdtPackage getIdtPackage();

} //IdtFactory
