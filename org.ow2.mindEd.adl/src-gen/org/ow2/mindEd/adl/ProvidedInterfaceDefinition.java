/**
 */
package org.ow2.mindEd.adl;

import org.ow2.mindEd.itf.InterfaceDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.ProvidedInterfaceDefinition#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getProvidedInterfaceDefinition()
 * @model
 * @generated
 */
public interface ProvidedInterfaceDefinition extends HostedInterfaceDefinition
{
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
   * @see org.ow2.mindEd.adl.AdlPackage#getProvidedInterfaceDefinition_Signature()
   * @model
   * @generated
   */
  InterfaceDefinition getSignature();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.ProvidedInterfaceDefinition#getSignature <em>Signature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(InterfaceDefinition value);

} // ProvidedInterfaceDefinition
