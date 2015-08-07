/**
 */
package org.ow2.mindEd.adl;

import org.ow2.mindEd.itf.InterfaceDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.RequiredInterfaceDefinition#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.RequiredInterfaceDefinition#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getRequiredInterfaceDefinition()
 * @model
 * @generated
 */
public interface RequiredInterfaceDefinition extends HostedInterfaceDefinition
{
  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see org.ow2.mindEd.adl.AdlPackage#getRequiredInterfaceDefinition_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.RequiredInterfaceDefinition#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' reference.
   * @see #setSignature(InterfaceDefinition)
   * @see org.ow2.mindEd.adl.AdlPackage#getRequiredInterfaceDefinition_Signature()
   * @model
   * @generated
   */
  InterfaceDefinition getSignature();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.RequiredInterfaceDefinition#getSignature <em>Signature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(InterfaceDefinition value);

} // RequiredInterfaceDefinition
