/**
 */
package org.ow2.mindEd.adl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.PrimitiveDefinition#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.PrimitiveDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.PrimitiveDefinition#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.PrimitiveDefinition#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getPrimitiveDefinition()
 * @model
 * @generated
 */
public interface PrimitiveDefinition extends ArchitectureDefinition, PrimitiveSuperTypeDefinition
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see org.ow2.mindEd.adl.AdlPackage#getPrimitiveDefinition_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.PrimitiveDefinition#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Composite Formal Arguments List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composite Formal Arguments List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composite Formal Arguments List</em>' containment reference.
   * @see #setCompositeFormalArgumentsList(FormalArgumentsList)
   * @see org.ow2.mindEd.adl.AdlPackage#getPrimitiveDefinition_CompositeFormalArgumentsList()
   * @model containment="true"
   * @generated
   */
  FormalArgumentsList getCompositeFormalArgumentsList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.PrimitiveDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite Formal Arguments List</em>' containment reference.
   * @see #getCompositeFormalArgumentsList()
   * @generated
   */
  void setCompositeFormalArgumentsList(FormalArgumentsList value);

  /**
   * Returns the value of the '<em><b>Super Types</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.PrimitiveSuperType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Types</em>' containment reference list.
   * @see org.ow2.mindEd.adl.AdlPackage#getPrimitiveDefinition_SuperTypes()
   * @model containment="true"
   * @generated
   */
  EList<PrimitiveSuperType> getSuperTypes();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.PrimitiveElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.ow2.mindEd.adl.AdlPackage#getPrimitiveDefinition_Elements()
   * @model containment="true"
   * @generated
   */
  EList<PrimitiveElement> getElements();

} // PrimitiveDefinition
