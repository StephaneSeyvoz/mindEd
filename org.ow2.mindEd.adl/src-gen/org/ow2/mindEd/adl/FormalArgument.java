/**
 */
package org.ow2.mindEd.adl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.FormalArgument#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getFormalArgument()
 * @model
 * @generated
 */
public interface FormalArgument extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.ow2.mindEd.adl.AdlPackage#getFormalArgument_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.FormalArgument#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // FormalArgument
