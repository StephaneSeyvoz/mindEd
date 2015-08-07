/**
 */
package org.ow2.mindEd.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Flow Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.OutputFlowInterfaceDefinition#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getOutputFlowInterfaceDefinition()
 * @model
 * @generated
 */
public interface OutputFlowInterfaceDefinition extends HostedInterfaceDefinition
{
  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(FlowType)
   * @see org.ow2.mindEd.adl.AdlPackage#getOutputFlowInterfaceDefinition_Signature()
   * @model containment="true"
   * @generated
   */
  FlowType getSignature();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.OutputFlowInterfaceDefinition#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(FlowType value);

} // OutputFlowInterfaceDefinition
