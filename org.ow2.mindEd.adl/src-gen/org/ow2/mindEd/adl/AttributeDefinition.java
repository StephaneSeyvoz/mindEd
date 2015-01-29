/**
 */
package org.ow2.mindEd.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.AttributeDefinition#getHeaderFile <em>Header File</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.AttributeDefinition#getCType <em>CType</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.AttributeDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.AttributeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.AttributeDefinition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getAttributeDefinition()
 * @model
 * @generated
 */
public interface AttributeDefinition extends PrimitiveElement
{
  /**
   * Returns the value of the '<em><b>Header File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header File</em>' containment reference.
   * @see #setHeaderFile(FileC)
   * @see org.ow2.mindEd.adl.AdlPackage#getAttributeDefinition_HeaderFile()
   * @model containment="true"
   * @generated
   */
  FileC getHeaderFile();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.AttributeDefinition#getHeaderFile <em>Header File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header File</em>' containment reference.
   * @see #getHeaderFile()
   * @generated
   */
  void setHeaderFile(FileC value);

  /**
   * Returns the value of the '<em><b>CType</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CType</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CType</em>' attribute.
   * @see #setCType(String)
   * @see org.ow2.mindEd.adl.AdlPackage#getAttributeDefinition_CType()
   * @model
   * @generated
   */
  String getCType();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.AttributeDefinition#getCType <em>CType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CType</em>' attribute.
   * @see #getCType()
   * @generated
   */
  void setCType(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.ow2.mindEd.adl.AdlPackage#getAttributeDefinition_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.AttributeDefinition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see org.ow2.mindEd.adl.AdlPackage#getAttributeDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.AttributeDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.ow2.mindEd.adl.AdlPackage#getAttributeDefinition_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.AttributeDefinition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // AttributeDefinition
