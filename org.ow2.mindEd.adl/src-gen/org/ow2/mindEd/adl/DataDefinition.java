/**
 */
package org.ow2.mindEd.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.DataDefinition#getCFile <em>CFile</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.DataDefinition#getInlineCcode <em>Inline Ccode</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getDataDefinition()
 * @model
 * @generated
 */
public interface DataDefinition extends PrimitiveElement
{
  /**
   * Returns the value of the '<em><b>CFile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CFile</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CFile</em>' attribute.
   * @see #setCFile(String)
   * @see org.ow2.mindEd.adl.AdlPackage#getDataDefinition_CFile()
   * @model
   * @generated
   */
  String getCFile();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.DataDefinition#getCFile <em>CFile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CFile</em>' attribute.
   * @see #getCFile()
   * @generated
   */
  void setCFile(String value);

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
   * @see org.ow2.mindEd.adl.AdlPackage#getDataDefinition_InlineCcode()
   * @model containment="true"
   * @generated
   */
  InlineCodeC getInlineCcode();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.DataDefinition#getInlineCcode <em>Inline Ccode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inline Ccode</em>' containment reference.
   * @see #getInlineCcode()
   * @generated
   */
  void setInlineCcode(InlineCodeC value);

} // DataDefinition
