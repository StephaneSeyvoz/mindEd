/**
 */
package org.ow2.mindEd.adl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.ValueList#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getValueList()
 * @model
 * @generated
 */
public interface ValueList extends EObject
{
  /**
   * Returns the value of the '<em><b>Member</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' attribute list.
   * @see org.ow2.mindEd.adl.AdlPackage#getValueList_Member()
   * @model unique="false"
   * @generated
   */
  EList<String> getMember();

} // ValueList
