/**
 */
package org.ow2.mindEd.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.ImplementationDefinition#getCFile <em>CFile</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.ImplementationDefinition#getInlineCcode <em>Inline Ccode</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getImplementationDefinition()
 * @model
 * @generated
 */
public interface ImplementationDefinition extends PrimitiveElement
{
  /**
   * Returns the value of the '<em><b>CFile</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CFile</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CFile</em>' containment reference.
   * @see #setCFile(FilePath)
   * @see org.ow2.mindEd.adl.AdlPackage#getImplementationDefinition_CFile()
   * @model containment="true"
   * @generated
   */
  FilePath getCFile();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.ImplementationDefinition#getCFile <em>CFile</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CFile</em>' containment reference.
   * @see #getCFile()
   * @generated
   */
  void setCFile(FilePath value);

  /**
   * Returns the value of the '<em><b>Inline Ccode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inline Ccode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inline Ccode</em>' containment reference.
   * @see #setInlineCcode(InlineCodeC)
   * @see org.ow2.mindEd.adl.AdlPackage#getImplementationDefinition_InlineCcode()
   * @model containment="true"
   * @generated
   */
  InlineCodeC getInlineCcode();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.ImplementationDefinition#getInlineCcode <em>Inline Ccode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inline Ccode</em>' containment reference.
   * @see #getInlineCcode()
   * @generated
   */
  void setInlineCcode(InlineCodeC value);

} // ImplementationDefinition
