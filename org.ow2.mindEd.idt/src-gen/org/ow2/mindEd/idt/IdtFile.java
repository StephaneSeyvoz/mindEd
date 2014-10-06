/**
 */
package org.ow2.mindEd.idt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.itf.ConstantDefinition;
import org.ow2.mindEd.itf.IncludeDirective;
import org.ow2.mindEd.itf.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.idt.IdtFile#getBegindef <em>Begindef</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.IdtFile#getDef <em>Def</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.IdtFile#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.IdtFile#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.IdtFile#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.IdtFile#getEndDef <em>End Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.idt.IdtPackage#getIdtFile()
 * @model
 * @generated
 */
public interface IdtFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Begindef</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Begindef</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Begindef</em>' containment reference.
   * @see #setBegindef(ConstantDefinitionBegin)
   * @see org.ow2.mindEd.idt.IdtPackage#getIdtFile_Begindef()
   * @model containment="true"
   * @generated
   */
  ConstantDefinitionBegin getBegindef();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.idt.IdtFile#getBegindef <em>Begindef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Begindef</em>' containment reference.
   * @see #getBegindef()
   * @generated
   */
  void setBegindef(ConstantDefinitionBegin value);

  /**
   * Returns the value of the '<em><b>Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' reference.
   * @see #setDef(ConstantDefinition)
   * @see org.ow2.mindEd.idt.IdtPackage#getIdtFile_Def()
   * @model
   * @generated
   */
  ConstantDefinition getDef();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.idt.IdtFile#getDef <em>Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' reference.
   * @see #getDef()
   * @generated
   */
  void setDef(ConstantDefinition value);

  /**
   * Returns the value of the '<em><b>Includes</b></em>' reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.IncludeDirective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' reference list.
   * @see org.ow2.mindEd.idt.IdtPackage#getIdtFile_Includes()
   * @model
   * @generated
   */
  EList<IncludeDirective> getIncludes();

  /**
   * Returns the value of the '<em><b>Constant</b></em>' reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.ConstantDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' reference list.
   * @see org.ow2.mindEd.idt.IdtPackage#getIdtFile_Constant()
   * @model
   * @generated
   */
  EList<ConstantDefinition> getConstant();

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.TypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference list.
   * @see org.ow2.mindEd.idt.IdtPackage#getIdtFile_Type()
   * @model
   * @generated
   */
  EList<TypeDefinition> getType();

  /**
   * Returns the value of the '<em><b>End Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Def</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Def</em>' attribute.
   * @see #setEndDef(String)
   * @see org.ow2.mindEd.idt.IdtPackage#getIdtFile_EndDef()
   * @model
   * @generated
   */
  String getEndDef();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.idt.IdtFile#getEndDef <em>End Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Def</em>' attribute.
   * @see #getEndDef()
   * @generated
   */
  void setEndDef(String value);

} // IdtFile
