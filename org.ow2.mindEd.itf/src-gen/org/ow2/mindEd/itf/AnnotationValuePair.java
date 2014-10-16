/**
 */
package org.ow2.mindEd.itf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.AnnotationValuePair#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.AnnotationValuePair#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.ItfPackage#getAnnotationValuePair()
 * @model
 * @generated
 */
public interface AnnotationValuePair extends EObject
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
   * @see org.ow2.mindEd.itf.ItfPackage#getAnnotationValuePair_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.AnnotationValuePair#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(AnnotationValue)
   * @see org.ow2.mindEd.itf.ItfPackage#getAnnotationValuePair_Value()
   * @model containment="true"
   * @generated
   */
  AnnotationValue getValue();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.AnnotationValuePair#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(AnnotationValue value);

} // AnnotationValuePair
