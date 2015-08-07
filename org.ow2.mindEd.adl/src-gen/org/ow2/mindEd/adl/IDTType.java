/**
 */
package org.ow2.mindEd.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.IDTType#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getIDTType()
 * @model
 * @generated
 */
public interface IDTType extends FlowType
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(FilePath)
   * @see org.ow2.mindEd.adl.AdlPackage#getIDTType_Path()
   * @model containment="true"
   * @generated
   */
  FilePath getPath();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.IDTType#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(FilePath value);

} // IDTType
