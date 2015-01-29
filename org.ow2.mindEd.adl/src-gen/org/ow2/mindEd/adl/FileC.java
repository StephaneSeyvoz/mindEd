/**
 */
package org.ow2.mindEd.adl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.FileC#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.FileC#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getFileC()
 * @model
 * @generated
 */
public interface FileC extends EObject
{
  /**
   * Returns the value of the '<em><b>Directory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directory</em>' attribute.
   * @see #setDirectory(String)
   * @see org.ow2.mindEd.adl.AdlPackage#getFileC_Directory()
   * @model
   * @generated
   */
  String getDirectory();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.FileC#getDirectory <em>Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Directory</em>' attribute.
   * @see #getDirectory()
   * @generated
   */
  void setDirectory(String value);

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
   * @see org.ow2.mindEd.adl.AdlPackage#getFileC_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.FileC#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // FileC
