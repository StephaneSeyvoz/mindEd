/**
 */
package org.ow2.mindEd.idt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.idt.IdtFactory
 * @model kind="package"
 * @generated
 */
public interface IdtPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "idt";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ow2.org/mindEd/idt/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "idt";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IdtPackage eINSTANCE = org.ow2.mindEd.idt.impl.IdtPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ow2.mindEd.idt.impl.IdtFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.idt.impl.IdtFileImpl
   * @see org.ow2.mindEd.idt.impl.IdtPackageImpl#getIdtFile()
   * @generated
   */
  int IDT_FILE = 0;

  /**
   * The feature id for the '<em><b>Begindef</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__BEGINDEF = 0;

  /**
   * The feature id for the '<em><b>Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__DEF = 1;

  /**
   * The feature id for the '<em><b>Includes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__INCLUDES = 2;

  /**
   * The feature id for the '<em><b>Constant</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__CONSTANT = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__TYPE = 4;

  /**
   * The feature id for the '<em><b>End Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__END_DEF = 5;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.idt.impl.ConstantDefinitionBeginImpl <em>Constant Definition Begin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.idt.impl.ConstantDefinitionBeginImpl
   * @see org.ow2.mindEd.idt.impl.IdtPackageImpl#getConstantDefinitionBegin()
   * @generated
   */
  int CONSTANT_DEFINITION_BEGIN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_BEGIN__NAME = 0;

  /**
   * The number of structural features of the '<em>Constant Definition Begin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_BEGIN_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.idt.IdtFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.ow2.mindEd.idt.IdtFile
   * @generated
   */
  EClass getIdtFile();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.idt.IdtFile#getBegindef <em>Begindef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Begindef</em>'.
   * @see org.ow2.mindEd.idt.IdtFile#getBegindef()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Begindef();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.idt.IdtFile#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Def</em>'.
   * @see org.ow2.mindEd.idt.IdtFile#getDef()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Def();

  /**
   * Returns the meta object for the reference list '{@link org.ow2.mindEd.idt.IdtFile#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Includes</em>'.
   * @see org.ow2.mindEd.idt.IdtFile#getIncludes()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Includes();

  /**
   * Returns the meta object for the reference list '{@link org.ow2.mindEd.idt.IdtFile#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Constant</em>'.
   * @see org.ow2.mindEd.idt.IdtFile#getConstant()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Constant();

  /**
   * Returns the meta object for the reference list '{@link org.ow2.mindEd.idt.IdtFile#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Type</em>'.
   * @see org.ow2.mindEd.idt.IdtFile#getType()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Type();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.idt.IdtFile#getEndDef <em>End Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Def</em>'.
   * @see org.ow2.mindEd.idt.IdtFile#getEndDef()
   * @see #getIdtFile()
   * @generated
   */
  EAttribute getIdtFile_EndDef();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.idt.ConstantDefinitionBegin <em>Constant Definition Begin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Definition Begin</em>'.
   * @see org.ow2.mindEd.idt.ConstantDefinitionBegin
   * @generated
   */
  EClass getConstantDefinitionBegin();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.idt.ConstantDefinitionBegin#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.idt.ConstantDefinitionBegin#getName()
   * @see #getConstantDefinitionBegin()
   * @generated
   */
  EAttribute getConstantDefinitionBegin_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  IdtFactory getIdtFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ow2.mindEd.idt.impl.IdtFileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.idt.impl.IdtFileImpl
     * @see org.ow2.mindEd.idt.impl.IdtPackageImpl#getIdtFile()
     * @generated
     */
    EClass IDT_FILE = eINSTANCE.getIdtFile();

    /**
     * The meta object literal for the '<em><b>Begindef</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__BEGINDEF = eINSTANCE.getIdtFile_Begindef();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__DEF = eINSTANCE.getIdtFile_Def();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__INCLUDES = eINSTANCE.getIdtFile_Includes();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__CONSTANT = eINSTANCE.getIdtFile_Constant();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__TYPE = eINSTANCE.getIdtFile_Type();

    /**
     * The meta object literal for the '<em><b>End Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDT_FILE__END_DEF = eINSTANCE.getIdtFile_EndDef();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.idt.impl.ConstantDefinitionBeginImpl <em>Constant Definition Begin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.idt.impl.ConstantDefinitionBeginImpl
     * @see org.ow2.mindEd.idt.impl.IdtPackageImpl#getConstantDefinitionBegin()
     * @generated
     */
    EClass CONSTANT_DEFINITION_BEGIN = eINSTANCE.getConstantDefinitionBegin();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DEFINITION_BEGIN__NAME = eINSTANCE.getConstantDefinitionBegin_Name();

  }

} //IdtPackage
