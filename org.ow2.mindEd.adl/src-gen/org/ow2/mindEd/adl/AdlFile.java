/**
 */
package org.ow2.mindEd.adl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.AdlFile#getImports <em>Imports</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.AdlFile#getAnnotationsList <em>Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.AdlFile#getArchitectureDefinition <em>Architecture Definition</em>}</li>
 * </ul>
 *
 * @see org.ow2.mindEd.adl.AdlPackage#getAdlFile()
 * @model
 * @generated
 */
public interface AdlFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.ImportDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.ow2.mindEd.adl.AdlPackage#getAdlFile_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportDefinition> getImports();

  /**
   * Returns the value of the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations List</em>' containment reference.
   * @see #setAnnotationsList(AnnotationsList)
   * @see org.ow2.mindEd.adl.AdlPackage#getAdlFile_AnnotationsList()
   * @model containment="true"
   * @generated
   */
  AnnotationsList getAnnotationsList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.AdlFile#getAnnotationsList <em>Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotations List</em>' containment reference.
   * @see #getAnnotationsList()
   * @generated
   */
  void setAnnotationsList(AnnotationsList value);

  /**
   * Returns the value of the '<em><b>Architecture Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Architecture Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Architecture Definition</em>' containment reference.
   * @see #setArchitectureDefinition(ArchitectureDefinition)
   * @see org.ow2.mindEd.adl.AdlPackage#getAdlFile_ArchitectureDefinition()
   * @model containment="true"
   * @generated
   */
  ArchitectureDefinition getArchitectureDefinition();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.AdlFile#getArchitectureDefinition <em>Architecture Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Architecture Definition</em>' containment reference.
   * @see #getArchitectureDefinition()
   * @generated
   */
  void setArchitectureDefinition(ArchitectureDefinition value);

} // AdlFile
