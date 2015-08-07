/**
 */
package org.ow2.mindEd.adl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.TypeDefinition#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.TypeDefinition#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends ArchitectureDefinition, CompositeSuperTypeDefinition, PrimitiveSuperTypeDefinition
{
  /**
   * Returns the value of the '<em><b>Super Types</b></em>' reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.TypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Types</em>' reference list.
   * @see org.ow2.mindEd.adl.AdlPackage#getTypeDefinition_SuperTypes()
   * @model
   * @generated
   */
  EList<TypeDefinition> getSuperTypes();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.HostedInterfaceDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.ow2.mindEd.adl.AdlPackage#getTypeDefinition_Elements()
   * @model containment="true"
   * @generated
   */
  EList<HostedInterfaceDefinition> getElements();

} // TypeDefinition
