/**
 */
package org.ow2.mindEd.itf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Pointer Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.QualifiedPointerSpecification#getTypeQualifiers <em>Type Qualifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.ItfPackage#getQualifiedPointerSpecification()
 * @model
 * @generated
 */
public interface QualifiedPointerSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Qualifiers</b></em>' attribute list.
   * The list contents are of type {@link org.ow2.mindEd.itf.TypeQualifier}.
   * The literals are from the enumeration {@link org.ow2.mindEd.itf.TypeQualifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Qualifiers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Qualifiers</em>' attribute list.
   * @see org.ow2.mindEd.itf.TypeQualifier
   * @see org.ow2.mindEd.itf.ItfPackage#getQualifiedPointerSpecification_TypeQualifiers()
   * @model unique="false"
   * @generated
   */
  EList<TypeQualifier> getTypeQualifiers();

} // QualifiedPointerSpecification
