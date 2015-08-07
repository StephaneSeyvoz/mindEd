/**
 */
package org.ow2.mindEd.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Flow Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.InputFlowInterfaceDefinition#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.InputFlowInterfaceDefinition#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getInputFlowInterfaceDefinition()
 * @model
 * @generated
 */
public interface InputFlowInterfaceDefinition extends HostedInterfaceDefinition
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
   * @see org.ow2.mindEd.adl.AdlPackage#getInputFlowInterfaceDefinition_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.InputFlowInterfaceDefinition#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' attribute.
   * @see #setSignature(String)
   * @see org.ow2.mindEd.adl.AdlPackage#getInputFlowInterfaceDefinition_Signature()
   * @model
   * @generated
   */
  String getSignature();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.InputFlowInterfaceDefinition#getSignature <em>Signature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' attribute.
   * @see #getSignature()
   * @generated
   */
  void setSignature(String value);

} // InputFlowInterfaceDefinition
