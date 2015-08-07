/**
 */
package org.ow2.mindEd.adl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Value Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.ElementValueArrayInitializer#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getElementValueArrayInitializer()
 * @model
 * @generated
 */
public interface ElementValueArrayInitializer extends ElementValue
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.ElementValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.ow2.mindEd.adl.AdlPackage#getElementValueArrayInitializer_Values()
   * @model containment="true"
   * @generated
   */
  EList<ElementValue> getValues();

} // ElementValueArrayInitializer
