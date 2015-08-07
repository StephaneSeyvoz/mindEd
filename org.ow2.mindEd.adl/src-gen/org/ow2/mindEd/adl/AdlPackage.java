/**
 */
package org.ow2.mindEd.adl;

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
 * @see org.ow2.mindEd.adl.AdlFactory
 * @model kind="package"
 * @generated
 */
public interface AdlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "adl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ow2.org/mindEd/adl/Adl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "adl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdlPackage eINSTANCE = org.ow2.mindEd.adl.impl.AdlPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.AdlFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.AdlFileImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getAdlFile()
   * @generated
   */
  int ADL_FILE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADL_FILE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADL_FILE__ANNOTATIONS_LIST = 1;

  /**
   * The feature id for the '<em><b>Architecture Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADL_FILE__ARCHITECTURE_DEFINITION = 2;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADL_FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.TypeReferenceImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.ArchitectureDefinitionImpl <em>Architecture Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.ArchitectureDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getArchitectureDefinition()
   * @generated
   */
  int ARCHITECTURE_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_DEFINITION__NAME = TYPE_REFERENCE__NAME;

  /**
   * The number of structural features of the '<em>Architecture Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_DEFINITION_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.ImportDefinitionImpl <em>Import Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.ImportDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getImportDefinition()
   * @generated
   */
  int IMPORT_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DEFINITION__ANNOTATIONS_LIST = 0;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DEFINITION__IMPORTED_NAMESPACE = 1;

  /**
   * The number of structural features of the '<em>Import Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.CompositeDefinitionImpl <em>Composite Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.CompositeDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getCompositeDefinition()
   * @generated
   */
  int COMPOSITE_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__NAME = ARCHITECTURE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Template Specifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Composite Formal Arguments List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__SUPER_TYPES = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__ELEMENTS = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Composite Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION_FEATURE_COUNT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.PrimitiveDefinitionImpl <em>Primitive Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.PrimitiveDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getPrimitiveDefinition()
   * @generated
   */
  int PRIMITIVE_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__NAME = ARCHITECTURE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__ABSTRACT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Composite Formal Arguments List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__SUPER_TYPES = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__ELEMENTS = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Primitive Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION_FEATURE_COUNT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.TypeDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__NAME = ARCHITECTURE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Super Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__SUPER_TYPES = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__ELEMENTS = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.CompositeSuperTypeImpl <em>Composite Super Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.CompositeSuperTypeImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getCompositeSuperType()
   * @generated
   */
  int COMPOSITE_SUPER_TYPE = 6;

  /**
   * The feature id for the '<em><b>Target Arch Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SUPER_TYPE__TARGET_ARCH_DEF = 0;

  /**
   * The feature id for the '<em><b>Templates List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SUPER_TYPE__TEMPLATES_LIST = 1;

  /**
   * The feature id for the '<em><b>Arguments List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SUPER_TYPE__ARGUMENTS_LIST = 2;

  /**
   * The number of structural features of the '<em>Composite Super Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SUPER_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.PrimitiveSuperTypeImpl <em>Primitive Super Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.PrimitiveSuperTypeImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getPrimitiveSuperType()
   * @generated
   */
  int PRIMITIVE_SUPER_TYPE = 7;

  /**
   * The feature id for the '<em><b>Target Arch Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_SUPER_TYPE__TARGET_ARCH_DEF = 0;

  /**
   * The feature id for the '<em><b>Arguments List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_SUPER_TYPE__ARGUMENTS_LIST = 1;

  /**
   * The number of structural features of the '<em>Primitive Super Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_SUPER_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.CompositeSuperTypeDefinitionImpl <em>Composite Super Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.CompositeSuperTypeDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getCompositeSuperTypeDefinition()
   * @generated
   */
  int COMPOSITE_SUPER_TYPE_DEFINITION = 8;

  /**
   * The number of structural features of the '<em>Composite Super Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_SUPER_TYPE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.PrimitiveSuperTypeDefinitionImpl <em>Primitive Super Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.PrimitiveSuperTypeDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getPrimitiveSuperTypeDefinition()
   * @generated
   */
  int PRIMITIVE_SUPER_TYPE_DEFINITION = 9;

  /**
   * The number of structural features of the '<em>Primitive Super Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_SUPER_TYPE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.ElementImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 17;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ANNOTATIONS_LIST = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.HostedInterfaceDefinitionImpl <em>Hosted Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.HostedInterfaceDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getHostedInterfaceDefinition()
   * @generated
   */
  int HOSTED_INTERFACE_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION__ANNOTATIONS_LIST = ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION__ROLE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION__NAME = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION__COLLECTION = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Collectionsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Hosted Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.ProvidedInterfaceDefinitionImpl <em>Provided Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.ProvidedInterfaceDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getProvidedInterfaceDefinition()
   * @generated
   */
  int PROVIDED_INTERFACE_DEFINITION = 11;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__ANNOTATIONS_LIST = HOSTED_INTERFACE_DEFINITION__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__ROLE = HOSTED_INTERFACE_DEFINITION__ROLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__NAME = HOSTED_INTERFACE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__COLLECTION = HOSTED_INTERFACE_DEFINITION__COLLECTION;

  /**
   * The feature id for the '<em><b>Collectionsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__COLLECTIONSIZE = HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE;

  /**
   * The feature id for the '<em><b>Signature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION__SIGNATURE = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Provided Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_INTERFACE_DEFINITION_FEATURE_COUNT = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.RequiredInterfaceDefinitionImpl <em>Required Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.RequiredInterfaceDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getRequiredInterfaceDefinition()
   * @generated
   */
  int REQUIRED_INTERFACE_DEFINITION = 12;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__ANNOTATIONS_LIST = HOSTED_INTERFACE_DEFINITION__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__ROLE = HOSTED_INTERFACE_DEFINITION__ROLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__NAME = HOSTED_INTERFACE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__COLLECTION = HOSTED_INTERFACE_DEFINITION__COLLECTION;

  /**
   * The feature id for the '<em><b>Collectionsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__COLLECTIONSIZE = HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__OPTIONAL = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Signature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION__SIGNATURE = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Required Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_INTERFACE_DEFINITION_FEATURE_COUNT = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.OutputFlowInterfaceDefinitionImpl <em>Output Flow Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.OutputFlowInterfaceDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getOutputFlowInterfaceDefinition()
   * @generated
   */
  int OUTPUT_FLOW_INTERFACE_DEFINITION = 13;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FLOW_INTERFACE_DEFINITION__ANNOTATIONS_LIST = HOSTED_INTERFACE_DEFINITION__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FLOW_INTERFACE_DEFINITION__ROLE = HOSTED_INTERFACE_DEFINITION__ROLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FLOW_INTERFACE_DEFINITION__NAME = HOSTED_INTERFACE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FLOW_INTERFACE_DEFINITION__COLLECTION = HOSTED_INTERFACE_DEFINITION__COLLECTION;

  /**
   * The feature id for the '<em><b>Collectionsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FLOW_INTERFACE_DEFINITION__COLLECTIONSIZE = HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE;

  /**
   * The feature id for the '<em><b>Signature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FLOW_INTERFACE_DEFINITION__SIGNATURE = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Output Flow Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FLOW_INTERFACE_DEFINITION_FEATURE_COUNT = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.InputFlowInterfaceDefinitionImpl <em>Input Flow Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.InputFlowInterfaceDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getInputFlowInterfaceDefinition()
   * @generated
   */
  int INPUT_FLOW_INTERFACE_DEFINITION = 14;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FLOW_INTERFACE_DEFINITION__ANNOTATIONS_LIST = HOSTED_INTERFACE_DEFINITION__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FLOW_INTERFACE_DEFINITION__ROLE = HOSTED_INTERFACE_DEFINITION__ROLE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FLOW_INTERFACE_DEFINITION__NAME = HOSTED_INTERFACE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FLOW_INTERFACE_DEFINITION__COLLECTION = HOSTED_INTERFACE_DEFINITION__COLLECTION;

  /**
   * The feature id for the '<em><b>Collectionsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FLOW_INTERFACE_DEFINITION__COLLECTIONSIZE = HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FLOW_INTERFACE_DEFINITION__OPTIONAL = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Signature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FLOW_INTERFACE_DEFINITION__SIGNATURE = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Input Flow Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FLOW_INTERFACE_DEFINITION_FEATURE_COUNT = HOSTED_INTERFACE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.CompositeElementImpl <em>Composite Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.CompositeElementImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getCompositeElement()
   * @generated
   */
  int COMPOSITE_ELEMENT = 18;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ELEMENT__ANNOTATIONS_LIST = ELEMENT__ANNOTATIONS_LIST;

  /**
   * The number of structural features of the '<em>Composite Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.SubComponentDefinitionImpl <em>Sub Component Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.SubComponentDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getSubComponentDefinition()
   * @generated
   */
  int SUB_COMPONENT_DEFINITION = 16;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__ANNOTATIONS_LIST = COMPOSITE_ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__TYPE = COMPOSITE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Templates List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__TEMPLATES_LIST = COMPOSITE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST = COMPOSITE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__NAME = COMPOSITE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST = COMPOSITE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION__BODY = COMPOSITE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Sub Component Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_DEFINITION_FEATURE_COUNT = COMPOSITE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.PrimitiveElementImpl <em>Primitive Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.PrimitiveElementImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getPrimitiveElement()
   * @generated
   */
  int PRIMITIVE_ELEMENT = 19;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_ELEMENT__ANNOTATIONS_LIST = ELEMENT__ANNOTATIONS_LIST;

  /**
   * The number of structural features of the '<em>Primitive Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.BindingDefinitionImpl <em>Binding Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.BindingDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getBindingDefinition()
   * @generated
   */
  int BINDING_DEFINITION = 20;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__ANNOTATIONS_LIST = COMPOSITE_ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Source Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__SOURCE_PARENT = COMPOSITE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Src Parent This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__IS_SRC_PARENT_THIS = COMPOSITE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__SOURCE_INTERFACE = COMPOSITE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Source Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__SOURCE_INDEX = COMPOSITE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Target Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__TARGET_PARENT = COMPOSITE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Is Tgt Parent This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__IS_TGT_PARENT_THIS = COMPOSITE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Target Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__TARGET_INTERFACE = COMPOSITE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Target Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION__TARGET_INDEX = COMPOSITE_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Binding Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_DEFINITION_FEATURE_COUNT = COMPOSITE_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.FormalArgumentImpl <em>Formal Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.FormalArgumentImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getFormalArgument()
   * @generated
   */
  int FORMAL_ARGUMENT = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_ARGUMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Formal Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_ARGUMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.FormalArgumentsListImpl <em>Formal Arguments List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.FormalArgumentsListImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getFormalArgumentsList()
   * @generated
   */
  int FORMAL_ARGUMENTS_LIST = 22;

  /**
   * The feature id for the '<em><b>Formal Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>Formal Arguments List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_ARGUMENTS_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.TemplateSpecifierImpl <em>Template Specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.TemplateSpecifierImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getTemplateSpecifier()
   * @generated
   */
  int TEMPLATE_SPECIFIER = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SPECIFIER__NAME = TYPE_REFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SPECIFIER__TYPE_REFERENCE = TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template Specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SPECIFIER_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.ValueListImpl <em>Value List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.ValueListImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getValueList()
   * @generated
   */
  int VALUE_LIST = 24;

  /**
   * The feature id for the '<em><b>Member</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST__MEMBER = 0;

  /**
   * The number of structural features of the '<em>Value List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.TemplateReferenceImpl <em>Template Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.TemplateReferenceImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getTemplateReference()
   * @generated
   */
  int TEMPLATE_REFERENCE = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE__TYPE_REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Any Type Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE__ANY_TYPE_REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Templates List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE__TEMPLATES_LIST = 3;

  /**
   * The feature id for the '<em><b>Arguments List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE__ARGUMENTS_LIST = 4;

  /**
   * The number of structural features of the '<em>Template Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REFERENCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.ArgumentDefinitionImpl <em>Argument Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.ArgumentDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getArgumentDefinition()
   * @generated
   */
  int ARGUMENT_DEFINITION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Argument Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DEFINITION__ARGUMENT_VALUE = 1;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DEFINITION__ARGUMENT_LIST = 2;

  /**
   * The number of structural features of the '<em>Argument Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.AttributeDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getAttributeDefinition()
   * @generated
   */
  int ATTRIBUTE_DEFINITION = 27;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION__ANNOTATIONS_LIST = PRIMITIVE_ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION__TYPE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION__NAME = PRIMITIVE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION__VALUE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Attribute Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION_FEATURE_COUNT = PRIMITIVE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.ImplementationDefinitionImpl <em>Implementation Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.ImplementationDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getImplementationDefinition()
   * @generated
   */
  int IMPLEMENTATION_DEFINITION = 28;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_DEFINITION__ANNOTATIONS_LIST = PRIMITIVE_ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>CFile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_DEFINITION__CFILE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inline Ccode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_DEFINITION__INLINE_CCODE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Implementation Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_DEFINITION_FEATURE_COUNT = PRIMITIVE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.DataDefinitionImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getDataDefinition()
   * @generated
   */
  int DATA_DEFINITION = 29;

  /**
   * The feature id for the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION__ANNOTATIONS_LIST = PRIMITIVE_ELEMENT__ANNOTATIONS_LIST;

  /**
   * The feature id for the '<em><b>CFile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION__CFILE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inline Ccode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION__INLINE_CCODE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_FEATURE_COUNT = PRIMITIVE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.InlineCodeCImpl <em>Inline Code C</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.InlineCodeCImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getInlineCodeC()
   * @generated
   */
  int INLINE_CODE_C = 30;

  /**
   * The feature id for the '<em><b>Code C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_CODE_C__CODE_C = 0;

  /**
   * The number of structural features of the '<em>Inline Code C</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_CODE_C_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.AnnotationsListImpl <em>Annotations List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.AnnotationsListImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getAnnotationsList()
   * @generated
   */
  int ANNOTATIONS_LIST = 31;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATIONS_LIST__ANNOTATIONS = 0;

  /**
   * The number of structural features of the '<em>Annotations List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATIONS_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.ElementValueImpl <em>Element Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.ElementValueImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getElementValue()
   * @generated
   */
  int ELEMENT_VALUE = 34;

  /**
   * The number of structural features of the '<em>Element Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.AnnotationImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME = ELEMENT_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotation Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION_ELEMENTS = ELEMENT_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = ELEMENT_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.AnnotationElementImpl <em>Annotation Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.AnnotationElementImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getAnnotationElement()
   * @generated
   */
  int ANNOTATION_ELEMENT = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Element Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ELEMENT__ELEMENT_VALUE = 1;

  /**
   * The number of structural features of the '<em>Annotation Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.ElementValueArrayInitializerImpl <em>Element Value Array Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.ElementValueArrayInitializerImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getElementValueArrayInitializer()
   * @generated
   */
  int ELEMENT_VALUE_ARRAY_INITIALIZER = 35;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_VALUE_ARRAY_INITIALIZER__VALUES = ELEMENT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Value Array Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_VALUE_ARRAY_INITIALIZER_FEATURE_COUNT = ELEMENT_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.adl.impl.ConstantValueImpl <em>Constant Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.adl.impl.ConstantValueImpl
   * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getConstantValue()
   * @generated
   */
  int CONSTANT_VALUE = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_VALUE__VALUE = ELEMENT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_VALUE_FEATURE_COUNT = ELEMENT_VALUE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.AdlFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.ow2.mindEd.adl.AdlFile
   * @generated
   */
  EClass getAdlFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.AdlFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.ow2.mindEd.adl.AdlFile#getImports()
   * @see #getAdlFile()
   * @generated
   */
  EReference getAdlFile_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.AdlFile#getAnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.adl.AdlFile#getAnnotationsList()
   * @see #getAdlFile()
   * @generated
   */
  EReference getAdlFile_AnnotationsList();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.AdlFile#getArchitectureDefinition <em>Architecture Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Architecture Definition</em>'.
   * @see org.ow2.mindEd.adl.AdlFile#getArchitectureDefinition()
   * @see #getAdlFile()
   * @generated
   */
  EReference getAdlFile_ArchitectureDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.ArchitectureDefinition <em>Architecture Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architecture Definition</em>'.
   * @see org.ow2.mindEd.adl.ArchitectureDefinition
   * @generated
   */
  EClass getArchitectureDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.ImportDefinition <em>Import Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Definition</em>'.
   * @see org.ow2.mindEd.adl.ImportDefinition
   * @generated
   */
  EClass getImportDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.ImportDefinition#getAnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.adl.ImportDefinition#getAnnotationsList()
   * @see #getImportDefinition()
   * @generated
   */
  EReference getImportDefinition_AnnotationsList();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.ImportDefinition#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.ow2.mindEd.adl.ImportDefinition#getImportedNamespace()
   * @see #getImportDefinition()
   * @generated
   */
  EAttribute getImportDefinition_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.CompositeDefinition <em>Composite Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Definition</em>'.
   * @see org.ow2.mindEd.adl.CompositeDefinition
   * @generated
   */
  EClass getCompositeDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.CompositeDefinition#getTemplateSpecifiers <em>Template Specifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template Specifiers</em>'.
   * @see org.ow2.mindEd.adl.CompositeDefinition#getTemplateSpecifiers()
   * @see #getCompositeDefinition()
   * @generated
   */
  EReference getCompositeDefinition_TemplateSpecifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.CompositeDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite Formal Arguments List</em>'.
   * @see org.ow2.mindEd.adl.CompositeDefinition#getCompositeFormalArgumentsList()
   * @see #getCompositeDefinition()
   * @generated
   */
  EReference getCompositeDefinition_CompositeFormalArgumentsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.CompositeDefinition#getSuperTypes <em>Super Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Super Types</em>'.
   * @see org.ow2.mindEd.adl.CompositeDefinition#getSuperTypes()
   * @see #getCompositeDefinition()
   * @generated
   */
  EReference getCompositeDefinition_SuperTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.CompositeDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.ow2.mindEd.adl.CompositeDefinition#getElements()
   * @see #getCompositeDefinition()
   * @generated
   */
  EReference getCompositeDefinition_Elements();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.PrimitiveDefinition <em>Primitive Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Definition</em>'.
   * @see org.ow2.mindEd.adl.PrimitiveDefinition
   * @generated
   */
  EClass getPrimitiveDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.PrimitiveDefinition#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.ow2.mindEd.adl.PrimitiveDefinition#isAbstract()
   * @see #getPrimitiveDefinition()
   * @generated
   */
  EAttribute getPrimitiveDefinition_Abstract();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.PrimitiveDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite Formal Arguments List</em>'.
   * @see org.ow2.mindEd.adl.PrimitiveDefinition#getCompositeFormalArgumentsList()
   * @see #getPrimitiveDefinition()
   * @generated
   */
  EReference getPrimitiveDefinition_CompositeFormalArgumentsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.PrimitiveDefinition#getSuperTypes <em>Super Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Super Types</em>'.
   * @see org.ow2.mindEd.adl.PrimitiveDefinition#getSuperTypes()
   * @see #getPrimitiveDefinition()
   * @generated
   */
  EReference getPrimitiveDefinition_SuperTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.PrimitiveDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.ow2.mindEd.adl.PrimitiveDefinition#getElements()
   * @see #getPrimitiveDefinition()
   * @generated
   */
  EReference getPrimitiveDefinition_Elements();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see org.ow2.mindEd.adl.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for the reference list '{@link org.ow2.mindEd.adl.TypeDefinition#getSuperTypes <em>Super Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Types</em>'.
   * @see org.ow2.mindEd.adl.TypeDefinition#getSuperTypes()
   * @see #getTypeDefinition()
   * @generated
   */
  EReference getTypeDefinition_SuperTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.TypeDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.ow2.mindEd.adl.TypeDefinition#getElements()
   * @see #getTypeDefinition()
   * @generated
   */
  EReference getTypeDefinition_Elements();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.CompositeSuperType <em>Composite Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Super Type</em>'.
   * @see org.ow2.mindEd.adl.CompositeSuperType
   * @generated
   */
  EClass getCompositeSuperType();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.CompositeSuperType#getTargetArchDef <em>Target Arch Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Arch Def</em>'.
   * @see org.ow2.mindEd.adl.CompositeSuperType#getTargetArchDef()
   * @see #getCompositeSuperType()
   * @generated
   */
  EReference getCompositeSuperType_TargetArchDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.CompositeSuperType#getTemplatesList <em>Templates List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Templates List</em>'.
   * @see org.ow2.mindEd.adl.CompositeSuperType#getTemplatesList()
   * @see #getCompositeSuperType()
   * @generated
   */
  EReference getCompositeSuperType_TemplatesList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.CompositeSuperType#getArgumentsList <em>Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments List</em>'.
   * @see org.ow2.mindEd.adl.CompositeSuperType#getArgumentsList()
   * @see #getCompositeSuperType()
   * @generated
   */
  EReference getCompositeSuperType_ArgumentsList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.PrimitiveSuperType <em>Primitive Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Super Type</em>'.
   * @see org.ow2.mindEd.adl.PrimitiveSuperType
   * @generated
   */
  EClass getPrimitiveSuperType();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.PrimitiveSuperType#getTargetArchDef <em>Target Arch Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Arch Def</em>'.
   * @see org.ow2.mindEd.adl.PrimitiveSuperType#getTargetArchDef()
   * @see #getPrimitiveSuperType()
   * @generated
   */
  EReference getPrimitiveSuperType_TargetArchDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.PrimitiveSuperType#getArgumentsList <em>Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments List</em>'.
   * @see org.ow2.mindEd.adl.PrimitiveSuperType#getArgumentsList()
   * @see #getPrimitiveSuperType()
   * @generated
   */
  EReference getPrimitiveSuperType_ArgumentsList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.CompositeSuperTypeDefinition <em>Composite Super Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Super Type Definition</em>'.
   * @see org.ow2.mindEd.adl.CompositeSuperTypeDefinition
   * @generated
   */
  EClass getCompositeSuperTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.PrimitiveSuperTypeDefinition <em>Primitive Super Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Super Type Definition</em>'.
   * @see org.ow2.mindEd.adl.PrimitiveSuperTypeDefinition
   * @generated
   */
  EClass getPrimitiveSuperTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.HostedInterfaceDefinition <em>Hosted Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hosted Interface Definition</em>'.
   * @see org.ow2.mindEd.adl.HostedInterfaceDefinition
   * @generated
   */
  EClass getHostedInterfaceDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.HostedInterfaceDefinition#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see org.ow2.mindEd.adl.HostedInterfaceDefinition#getRole()
   * @see #getHostedInterfaceDefinition()
   * @generated
   */
  EAttribute getHostedInterfaceDefinition_Role();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.HostedInterfaceDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.HostedInterfaceDefinition#getName()
   * @see #getHostedInterfaceDefinition()
   * @generated
   */
  EAttribute getHostedInterfaceDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.HostedInterfaceDefinition#isCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see org.ow2.mindEd.adl.HostedInterfaceDefinition#isCollection()
   * @see #getHostedInterfaceDefinition()
   * @generated
   */
  EAttribute getHostedInterfaceDefinition_Collection();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.HostedInterfaceDefinition#getCollectionsize <em>Collectionsize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collectionsize</em>'.
   * @see org.ow2.mindEd.adl.HostedInterfaceDefinition#getCollectionsize()
   * @see #getHostedInterfaceDefinition()
   * @generated
   */
  EAttribute getHostedInterfaceDefinition_Collectionsize();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.ProvidedInterfaceDefinition <em>Provided Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Interface Definition</em>'.
   * @see org.ow2.mindEd.adl.ProvidedInterfaceDefinition
   * @generated
   */
  EClass getProvidedInterfaceDefinition();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.ProvidedInterfaceDefinition#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signature</em>'.
   * @see org.ow2.mindEd.adl.ProvidedInterfaceDefinition#getSignature()
   * @see #getProvidedInterfaceDefinition()
   * @generated
   */
  EReference getProvidedInterfaceDefinition_Signature();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.RequiredInterfaceDefinition <em>Required Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Interface Definition</em>'.
   * @see org.ow2.mindEd.adl.RequiredInterfaceDefinition
   * @generated
   */
  EClass getRequiredInterfaceDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.RequiredInterfaceDefinition#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.ow2.mindEd.adl.RequiredInterfaceDefinition#isOptional()
   * @see #getRequiredInterfaceDefinition()
   * @generated
   */
  EAttribute getRequiredInterfaceDefinition_Optional();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.RequiredInterfaceDefinition#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signature</em>'.
   * @see org.ow2.mindEd.adl.RequiredInterfaceDefinition#getSignature()
   * @see #getRequiredInterfaceDefinition()
   * @generated
   */
  EReference getRequiredInterfaceDefinition_Signature();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.OutputFlowInterfaceDefinition <em>Output Flow Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Flow Interface Definition</em>'.
   * @see org.ow2.mindEd.adl.OutputFlowInterfaceDefinition
   * @generated
   */
  EClass getOutputFlowInterfaceDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.OutputFlowInterfaceDefinition#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Signature</em>'.
   * @see org.ow2.mindEd.adl.OutputFlowInterfaceDefinition#getSignature()
   * @see #getOutputFlowInterfaceDefinition()
   * @generated
   */
  EAttribute getOutputFlowInterfaceDefinition_Signature();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.InputFlowInterfaceDefinition <em>Input Flow Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Flow Interface Definition</em>'.
   * @see org.ow2.mindEd.adl.InputFlowInterfaceDefinition
   * @generated
   */
  EClass getInputFlowInterfaceDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.InputFlowInterfaceDefinition#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.ow2.mindEd.adl.InputFlowInterfaceDefinition#isOptional()
   * @see #getInputFlowInterfaceDefinition()
   * @generated
   */
  EAttribute getInputFlowInterfaceDefinition_Optional();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.InputFlowInterfaceDefinition#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Signature</em>'.
   * @see org.ow2.mindEd.adl.InputFlowInterfaceDefinition#getSignature()
   * @see #getInputFlowInterfaceDefinition()
   * @generated
   */
  EAttribute getInputFlowInterfaceDefinition_Signature();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see org.ow2.mindEd.adl.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.TypeReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.TypeReference#getName()
   * @see #getTypeReference()
   * @generated
   */
  EAttribute getTypeReference_Name();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.SubComponentDefinition <em>Sub Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Component Definition</em>'.
   * @see org.ow2.mindEd.adl.SubComponentDefinition
   * @generated
   */
  EClass getSubComponentDefinition();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.SubComponentDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.ow2.mindEd.adl.SubComponentDefinition#getType()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EReference getSubComponentDefinition_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.SubComponentDefinition#getTemplatesList <em>Templates List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Templates List</em>'.
   * @see org.ow2.mindEd.adl.SubComponentDefinition#getTemplatesList()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EReference getSubComponentDefinition_TemplatesList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.SubComponentDefinition#getArgumentsList <em>Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments List</em>'.
   * @see org.ow2.mindEd.adl.SubComponentDefinition#getArgumentsList()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EReference getSubComponentDefinition_ArgumentsList();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.SubComponentDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.SubComponentDefinition#getName()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EAttribute getSubComponentDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.SubComponentDefinition#getBodyAnnotationsList <em>Body Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body Annotations List</em>'.
   * @see org.ow2.mindEd.adl.SubComponentDefinition#getBodyAnnotationsList()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EReference getSubComponentDefinition_BodyAnnotationsList();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.SubComponentDefinition#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.ow2.mindEd.adl.SubComponentDefinition#getBody()
   * @see #getSubComponentDefinition()
   * @generated
   */
  EReference getSubComponentDefinition_Body();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.ow2.mindEd.adl.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.Element#getAnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.adl.Element#getAnnotationsList()
   * @see #getElement()
   * @generated
   */
  EReference getElement_AnnotationsList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.CompositeElement <em>Composite Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Element</em>'.
   * @see org.ow2.mindEd.adl.CompositeElement
   * @generated
   */
  EClass getCompositeElement();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.PrimitiveElement <em>Primitive Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Element</em>'.
   * @see org.ow2.mindEd.adl.PrimitiveElement
   * @generated
   */
  EClass getPrimitiveElement();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.BindingDefinition <em>Binding Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding Definition</em>'.
   * @see org.ow2.mindEd.adl.BindingDefinition
   * @generated
   */
  EClass getBindingDefinition();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.BindingDefinition#getSourceParent <em>Source Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Parent</em>'.
   * @see org.ow2.mindEd.adl.BindingDefinition#getSourceParent()
   * @see #getBindingDefinition()
   * @generated
   */
  EReference getBindingDefinition_SourceParent();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.BindingDefinition#isIsSrcParentThis <em>Is Src Parent This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Src Parent This</em>'.
   * @see org.ow2.mindEd.adl.BindingDefinition#isIsSrcParentThis()
   * @see #getBindingDefinition()
   * @generated
   */
  EAttribute getBindingDefinition_IsSrcParentThis();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.BindingDefinition#getSourceInterface <em>Source Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Interface</em>'.
   * @see org.ow2.mindEd.adl.BindingDefinition#getSourceInterface()
   * @see #getBindingDefinition()
   * @generated
   */
  EReference getBindingDefinition_SourceInterface();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.BindingDefinition#getSourceIndex <em>Source Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Index</em>'.
   * @see org.ow2.mindEd.adl.BindingDefinition#getSourceIndex()
   * @see #getBindingDefinition()
   * @generated
   */
  EAttribute getBindingDefinition_SourceIndex();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.BindingDefinition#getTargetParent <em>Target Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Parent</em>'.
   * @see org.ow2.mindEd.adl.BindingDefinition#getTargetParent()
   * @see #getBindingDefinition()
   * @generated
   */
  EReference getBindingDefinition_TargetParent();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.BindingDefinition#isIsTgtParentThis <em>Is Tgt Parent This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Tgt Parent This</em>'.
   * @see org.ow2.mindEd.adl.BindingDefinition#isIsTgtParentThis()
   * @see #getBindingDefinition()
   * @generated
   */
  EAttribute getBindingDefinition_IsTgtParentThis();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.BindingDefinition#getTargetInterface <em>Target Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Interface</em>'.
   * @see org.ow2.mindEd.adl.BindingDefinition#getTargetInterface()
   * @see #getBindingDefinition()
   * @generated
   */
  EReference getBindingDefinition_TargetInterface();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.BindingDefinition#getTargetIndex <em>Target Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Index</em>'.
   * @see org.ow2.mindEd.adl.BindingDefinition#getTargetIndex()
   * @see #getBindingDefinition()
   * @generated
   */
  EAttribute getBindingDefinition_TargetIndex();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.FormalArgument <em>Formal Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Argument</em>'.
   * @see org.ow2.mindEd.adl.FormalArgument
   * @generated
   */
  EClass getFormalArgument();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.FormalArgument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.FormalArgument#getName()
   * @see #getFormalArgument()
   * @generated
   */
  EAttribute getFormalArgument_Name();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.FormalArgumentsList <em>Formal Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Arguments List</em>'.
   * @see org.ow2.mindEd.adl.FormalArgumentsList
   * @generated
   */
  EClass getFormalArgumentsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.FormalArgumentsList#getFormalArguments <em>Formal Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Formal Arguments</em>'.
   * @see org.ow2.mindEd.adl.FormalArgumentsList#getFormalArguments()
   * @see #getFormalArgumentsList()
   * @generated
   */
  EReference getFormalArgumentsList_FormalArguments();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.TemplateSpecifier <em>Template Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Specifier</em>'.
   * @see org.ow2.mindEd.adl.TemplateSpecifier
   * @generated
   */
  EClass getTemplateSpecifier();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.TemplateSpecifier#getTypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Reference</em>'.
   * @see org.ow2.mindEd.adl.TemplateSpecifier#getTypeReference()
   * @see #getTemplateSpecifier()
   * @generated
   */
  EReference getTemplateSpecifier_TypeReference();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.ValueList <em>Value List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value List</em>'.
   * @see org.ow2.mindEd.adl.ValueList
   * @generated
   */
  EClass getValueList();

  /**
   * Returns the meta object for the attribute list '{@link org.ow2.mindEd.adl.ValueList#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Member</em>'.
   * @see org.ow2.mindEd.adl.ValueList#getMember()
   * @see #getValueList()
   * @generated
   */
  EAttribute getValueList_Member();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.TemplateReference <em>Template Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Reference</em>'.
   * @see org.ow2.mindEd.adl.TemplateReference
   * @generated
   */
  EClass getTemplateReference();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.TemplateReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.TemplateReference#getName()
   * @see #getTemplateReference()
   * @generated
   */
  EReference getTemplateReference_Name();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mindEd.adl.TemplateReference#getTypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Reference</em>'.
   * @see org.ow2.mindEd.adl.TemplateReference#getTypeReference()
   * @see #getTemplateReference()
   * @generated
   */
  EReference getTemplateReference_TypeReference();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.TemplateReference#isAnyTypeReference <em>Any Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Any Type Reference</em>'.
   * @see org.ow2.mindEd.adl.TemplateReference#isAnyTypeReference()
   * @see #getTemplateReference()
   * @generated
   */
  EAttribute getTemplateReference_AnyTypeReference();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.TemplateReference#getTemplatesList <em>Templates List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Templates List</em>'.
   * @see org.ow2.mindEd.adl.TemplateReference#getTemplatesList()
   * @see #getTemplateReference()
   * @generated
   */
  EReference getTemplateReference_TemplatesList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.TemplateReference#getArgumentsList <em>Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments List</em>'.
   * @see org.ow2.mindEd.adl.TemplateReference#getArgumentsList()
   * @see #getTemplateReference()
   * @generated
   */
  EReference getTemplateReference_ArgumentsList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.ArgumentDefinition <em>Argument Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Definition</em>'.
   * @see org.ow2.mindEd.adl.ArgumentDefinition
   * @generated
   */
  EClass getArgumentDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.ArgumentDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.ArgumentDefinition#getName()
   * @see #getArgumentDefinition()
   * @generated
   */
  EAttribute getArgumentDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.ArgumentDefinition#getArgumentValue <em>Argument Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Argument Value</em>'.
   * @see org.ow2.mindEd.adl.ArgumentDefinition#getArgumentValue()
   * @see #getArgumentDefinition()
   * @generated
   */
  EAttribute getArgumentDefinition_ArgumentValue();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.ArgumentDefinition#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument List</em>'.
   * @see org.ow2.mindEd.adl.ArgumentDefinition#getArgumentList()
   * @see #getArgumentDefinition()
   * @generated
   */
  EReference getArgumentDefinition_ArgumentList();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.AttributeDefinition <em>Attribute Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Definition</em>'.
   * @see org.ow2.mindEd.adl.AttributeDefinition
   * @generated
   */
  EClass getAttributeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.AttributeDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.ow2.mindEd.adl.AttributeDefinition#getType()
   * @see #getAttributeDefinition()
   * @generated
   */
  EAttribute getAttributeDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.AttributeDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.AttributeDefinition#getName()
   * @see #getAttributeDefinition()
   * @generated
   */
  EAttribute getAttributeDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.AttributeDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ow2.mindEd.adl.AttributeDefinition#getValue()
   * @see #getAttributeDefinition()
   * @generated
   */
  EAttribute getAttributeDefinition_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.ImplementationDefinition <em>Implementation Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implementation Definition</em>'.
   * @see org.ow2.mindEd.adl.ImplementationDefinition
   * @generated
   */
  EClass getImplementationDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.ImplementationDefinition#getCFile <em>CFile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>CFile</em>'.
   * @see org.ow2.mindEd.adl.ImplementationDefinition#getCFile()
   * @see #getImplementationDefinition()
   * @generated
   */
  EAttribute getImplementationDefinition_CFile();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.ImplementationDefinition#getInlineCcode <em>Inline Ccode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inline Ccode</em>'.
   * @see org.ow2.mindEd.adl.ImplementationDefinition#getInlineCcode()
   * @see #getImplementationDefinition()
   * @generated
   */
  EReference getImplementationDefinition_InlineCcode();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.DataDefinition <em>Data Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Definition</em>'.
   * @see org.ow2.mindEd.adl.DataDefinition
   * @generated
   */
  EClass getDataDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.DataDefinition#getCFile <em>CFile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>CFile</em>'.
   * @see org.ow2.mindEd.adl.DataDefinition#getCFile()
   * @see #getDataDefinition()
   * @generated
   */
  EAttribute getDataDefinition_CFile();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.DataDefinition#getInlineCcode <em>Inline Ccode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inline Ccode</em>'.
   * @see org.ow2.mindEd.adl.DataDefinition#getInlineCcode()
   * @see #getDataDefinition()
   * @generated
   */
  EReference getDataDefinition_InlineCcode();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.InlineCodeC <em>Inline Code C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline Code C</em>'.
   * @see org.ow2.mindEd.adl.InlineCodeC
   * @generated
   */
  EClass getInlineCodeC();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.InlineCodeC#getCodeC <em>Code C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code C</em>'.
   * @see org.ow2.mindEd.adl.InlineCodeC#getCodeC()
   * @see #getInlineCodeC()
   * @generated
   */
  EAttribute getInlineCodeC_CodeC();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.AnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotations List</em>'.
   * @see org.ow2.mindEd.adl.AnnotationsList
   * @generated
   */
  EClass getAnnotationsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.AnnotationsList#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.ow2.mindEd.adl.AnnotationsList#getAnnotations()
   * @see #getAnnotationsList()
   * @generated
   */
  EReference getAnnotationsList_Annotations();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.ow2.mindEd.adl.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.Annotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.Annotation#getName()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.Annotation#getAnnotationElements <em>Annotation Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation Elements</em>'.
   * @see org.ow2.mindEd.adl.Annotation#getAnnotationElements()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_AnnotationElements();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.AnnotationElement <em>Annotation Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Element</em>'.
   * @see org.ow2.mindEd.adl.AnnotationElement
   * @generated
   */
  EClass getAnnotationElement();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.AnnotationElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mindEd.adl.AnnotationElement#getName()
   * @see #getAnnotationElement()
   * @generated
   */
  EAttribute getAnnotationElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.adl.AnnotationElement#getElementValue <em>Element Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Value</em>'.
   * @see org.ow2.mindEd.adl.AnnotationElement#getElementValue()
   * @see #getAnnotationElement()
   * @generated
   */
  EReference getAnnotationElement_ElementValue();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.ElementValue <em>Element Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Value</em>'.
   * @see org.ow2.mindEd.adl.ElementValue
   * @generated
   */
  EClass getElementValue();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.ElementValueArrayInitializer <em>Element Value Array Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Value Array Initializer</em>'.
   * @see org.ow2.mindEd.adl.ElementValueArrayInitializer
   * @generated
   */
  EClass getElementValueArrayInitializer();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.adl.ElementValueArrayInitializer#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.ow2.mindEd.adl.ElementValueArrayInitializer#getValues()
   * @see #getElementValueArrayInitializer()
   * @generated
   */
  EReference getElementValueArrayInitializer_Values();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.adl.ConstantValue <em>Constant Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Value</em>'.
   * @see org.ow2.mindEd.adl.ConstantValue
   * @generated
   */
  EClass getConstantValue();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.adl.ConstantValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ow2.mindEd.adl.ConstantValue#getValue()
   * @see #getConstantValue()
   * @generated
   */
  EAttribute getConstantValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AdlFactory getAdlFactory();

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
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.AdlFileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.AdlFileImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getAdlFile()
     * @generated
     */
    EClass ADL_FILE = eINSTANCE.getAdlFile();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADL_FILE__IMPORTS = eINSTANCE.getAdlFile_Imports();

    /**
     * The meta object literal for the '<em><b>Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADL_FILE__ANNOTATIONS_LIST = eINSTANCE.getAdlFile_AnnotationsList();

    /**
     * The meta object literal for the '<em><b>Architecture Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADL_FILE__ARCHITECTURE_DEFINITION = eINSTANCE.getAdlFile_ArchitectureDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.ArchitectureDefinitionImpl <em>Architecture Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.ArchitectureDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getArchitectureDefinition()
     * @generated
     */
    EClass ARCHITECTURE_DEFINITION = eINSTANCE.getArchitectureDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.ImportDefinitionImpl <em>Import Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.ImportDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getImportDefinition()
     * @generated
     */
    EClass IMPORT_DEFINITION = eINSTANCE.getImportDefinition();

    /**
     * The meta object literal for the '<em><b>Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT_DEFINITION__ANNOTATIONS_LIST = eINSTANCE.getImportDefinition_AnnotationsList();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DEFINITION__IMPORTED_NAMESPACE = eINSTANCE.getImportDefinition_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.CompositeDefinitionImpl <em>Composite Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.CompositeDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getCompositeDefinition()
     * @generated
     */
    EClass COMPOSITE_DEFINITION = eINSTANCE.getCompositeDefinition();

    /**
     * The meta object literal for the '<em><b>Template Specifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS = eINSTANCE.getCompositeDefinition_TemplateSpecifiers();

    /**
     * The meta object literal for the '<em><b>Composite Formal Arguments List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST = eINSTANCE.getCompositeDefinition_CompositeFormalArgumentsList();

    /**
     * The meta object literal for the '<em><b>Super Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_DEFINITION__SUPER_TYPES = eINSTANCE.getCompositeDefinition_SuperTypes();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_DEFINITION__ELEMENTS = eINSTANCE.getCompositeDefinition_Elements();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.PrimitiveDefinitionImpl <em>Primitive Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.PrimitiveDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getPrimitiveDefinition()
     * @generated
     */
    EClass PRIMITIVE_DEFINITION = eINSTANCE.getPrimitiveDefinition();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_DEFINITION__ABSTRACT = eINSTANCE.getPrimitiveDefinition_Abstract();

    /**
     * The meta object literal for the '<em><b>Composite Formal Arguments List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST = eINSTANCE.getPrimitiveDefinition_CompositeFormalArgumentsList();

    /**
     * The meta object literal for the '<em><b>Super Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_DEFINITION__SUPER_TYPES = eINSTANCE.getPrimitiveDefinition_SuperTypes();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_DEFINITION__ELEMENTS = eINSTANCE.getPrimitiveDefinition_Elements();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.TypeDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION__SUPER_TYPES = eINSTANCE.getTypeDefinition_SuperTypes();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEFINITION__ELEMENTS = eINSTANCE.getTypeDefinition_Elements();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.CompositeSuperTypeImpl <em>Composite Super Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.CompositeSuperTypeImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getCompositeSuperType()
     * @generated
     */
    EClass COMPOSITE_SUPER_TYPE = eINSTANCE.getCompositeSuperType();

    /**
     * The meta object literal for the '<em><b>Target Arch Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_SUPER_TYPE__TARGET_ARCH_DEF = eINSTANCE.getCompositeSuperType_TargetArchDef();

    /**
     * The meta object literal for the '<em><b>Templates List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_SUPER_TYPE__TEMPLATES_LIST = eINSTANCE.getCompositeSuperType_TemplatesList();

    /**
     * The meta object literal for the '<em><b>Arguments List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_SUPER_TYPE__ARGUMENTS_LIST = eINSTANCE.getCompositeSuperType_ArgumentsList();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.PrimitiveSuperTypeImpl <em>Primitive Super Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.PrimitiveSuperTypeImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getPrimitiveSuperType()
     * @generated
     */
    EClass PRIMITIVE_SUPER_TYPE = eINSTANCE.getPrimitiveSuperType();

    /**
     * The meta object literal for the '<em><b>Target Arch Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_SUPER_TYPE__TARGET_ARCH_DEF = eINSTANCE.getPrimitiveSuperType_TargetArchDef();

    /**
     * The meta object literal for the '<em><b>Arguments List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_SUPER_TYPE__ARGUMENTS_LIST = eINSTANCE.getPrimitiveSuperType_ArgumentsList();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.CompositeSuperTypeDefinitionImpl <em>Composite Super Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.CompositeSuperTypeDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getCompositeSuperTypeDefinition()
     * @generated
     */
    EClass COMPOSITE_SUPER_TYPE_DEFINITION = eINSTANCE.getCompositeSuperTypeDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.PrimitiveSuperTypeDefinitionImpl <em>Primitive Super Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.PrimitiveSuperTypeDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getPrimitiveSuperTypeDefinition()
     * @generated
     */
    EClass PRIMITIVE_SUPER_TYPE_DEFINITION = eINSTANCE.getPrimitiveSuperTypeDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.HostedInterfaceDefinitionImpl <em>Hosted Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.HostedInterfaceDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getHostedInterfaceDefinition()
     * @generated
     */
    EClass HOSTED_INTERFACE_DEFINITION = eINSTANCE.getHostedInterfaceDefinition();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOSTED_INTERFACE_DEFINITION__ROLE = eINSTANCE.getHostedInterfaceDefinition_Role();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOSTED_INTERFACE_DEFINITION__NAME = eINSTANCE.getHostedInterfaceDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOSTED_INTERFACE_DEFINITION__COLLECTION = eINSTANCE.getHostedInterfaceDefinition_Collection();

    /**
     * The meta object literal for the '<em><b>Collectionsize</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE = eINSTANCE.getHostedInterfaceDefinition_Collectionsize();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.ProvidedInterfaceDefinitionImpl <em>Provided Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.ProvidedInterfaceDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getProvidedInterfaceDefinition()
     * @generated
     */
    EClass PROVIDED_INTERFACE_DEFINITION = eINSTANCE.getProvidedInterfaceDefinition();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_INTERFACE_DEFINITION__SIGNATURE = eINSTANCE.getProvidedInterfaceDefinition_Signature();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.RequiredInterfaceDefinitionImpl <em>Required Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.RequiredInterfaceDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getRequiredInterfaceDefinition()
     * @generated
     */
    EClass REQUIRED_INTERFACE_DEFINITION = eINSTANCE.getRequiredInterfaceDefinition();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_INTERFACE_DEFINITION__OPTIONAL = eINSTANCE.getRequiredInterfaceDefinition_Optional();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_INTERFACE_DEFINITION__SIGNATURE = eINSTANCE.getRequiredInterfaceDefinition_Signature();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.OutputFlowInterfaceDefinitionImpl <em>Output Flow Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.OutputFlowInterfaceDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getOutputFlowInterfaceDefinition()
     * @generated
     */
    EClass OUTPUT_FLOW_INTERFACE_DEFINITION = eINSTANCE.getOutputFlowInterfaceDefinition();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_FLOW_INTERFACE_DEFINITION__SIGNATURE = eINSTANCE.getOutputFlowInterfaceDefinition_Signature();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.InputFlowInterfaceDefinitionImpl <em>Input Flow Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.InputFlowInterfaceDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getInputFlowInterfaceDefinition()
     * @generated
     */
    EClass INPUT_FLOW_INTERFACE_DEFINITION = eINSTANCE.getInputFlowInterfaceDefinition();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_FLOW_INTERFACE_DEFINITION__OPTIONAL = eINSTANCE.getInputFlowInterfaceDefinition_Optional();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_FLOW_INTERFACE_DEFINITION__SIGNATURE = eINSTANCE.getInputFlowInterfaceDefinition_Signature();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.TypeReferenceImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_REFERENCE__NAME = eINSTANCE.getTypeReference_Name();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.SubComponentDefinitionImpl <em>Sub Component Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.SubComponentDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getSubComponentDefinition()
     * @generated
     */
    EClass SUB_COMPONENT_DEFINITION = eINSTANCE.getSubComponentDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT_DEFINITION__TYPE = eINSTANCE.getSubComponentDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Templates List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT_DEFINITION__TEMPLATES_LIST = eINSTANCE.getSubComponentDefinition_TemplatesList();

    /**
     * The meta object literal for the '<em><b>Arguments List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST = eINSTANCE.getSubComponentDefinition_ArgumentsList();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_COMPONENT_DEFINITION__NAME = eINSTANCE.getSubComponentDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Body Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT_DEFINITION__BODY_ANNOTATIONS_LIST = eINSTANCE.getSubComponentDefinition_BodyAnnotationsList();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT_DEFINITION__BODY = eINSTANCE.getSubComponentDefinition_Body();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.ElementImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Annotations List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__ANNOTATIONS_LIST = eINSTANCE.getElement_AnnotationsList();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.CompositeElementImpl <em>Composite Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.CompositeElementImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getCompositeElement()
     * @generated
     */
    EClass COMPOSITE_ELEMENT = eINSTANCE.getCompositeElement();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.PrimitiveElementImpl <em>Primitive Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.PrimitiveElementImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getPrimitiveElement()
     * @generated
     */
    EClass PRIMITIVE_ELEMENT = eINSTANCE.getPrimitiveElement();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.BindingDefinitionImpl <em>Binding Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.BindingDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getBindingDefinition()
     * @generated
     */
    EClass BINDING_DEFINITION = eINSTANCE.getBindingDefinition();

    /**
     * The meta object literal for the '<em><b>Source Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_DEFINITION__SOURCE_PARENT = eINSTANCE.getBindingDefinition_SourceParent();

    /**
     * The meta object literal for the '<em><b>Is Src Parent This</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING_DEFINITION__IS_SRC_PARENT_THIS = eINSTANCE.getBindingDefinition_IsSrcParentThis();

    /**
     * The meta object literal for the '<em><b>Source Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_DEFINITION__SOURCE_INTERFACE = eINSTANCE.getBindingDefinition_SourceInterface();

    /**
     * The meta object literal for the '<em><b>Source Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING_DEFINITION__SOURCE_INDEX = eINSTANCE.getBindingDefinition_SourceIndex();

    /**
     * The meta object literal for the '<em><b>Target Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_DEFINITION__TARGET_PARENT = eINSTANCE.getBindingDefinition_TargetParent();

    /**
     * The meta object literal for the '<em><b>Is Tgt Parent This</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING_DEFINITION__IS_TGT_PARENT_THIS = eINSTANCE.getBindingDefinition_IsTgtParentThis();

    /**
     * The meta object literal for the '<em><b>Target Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_DEFINITION__TARGET_INTERFACE = eINSTANCE.getBindingDefinition_TargetInterface();

    /**
     * The meta object literal for the '<em><b>Target Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING_DEFINITION__TARGET_INDEX = eINSTANCE.getBindingDefinition_TargetIndex();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.FormalArgumentImpl <em>Formal Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.FormalArgumentImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getFormalArgument()
     * @generated
     */
    EClass FORMAL_ARGUMENT = eINSTANCE.getFormalArgument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMAL_ARGUMENT__NAME = eINSTANCE.getFormalArgument_Name();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.FormalArgumentsListImpl <em>Formal Arguments List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.FormalArgumentsListImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getFormalArgumentsList()
     * @generated
     */
    EClass FORMAL_ARGUMENTS_LIST = eINSTANCE.getFormalArgumentsList();

    /**
     * The meta object literal for the '<em><b>Formal Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS = eINSTANCE.getFormalArgumentsList_FormalArguments();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.TemplateSpecifierImpl <em>Template Specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.TemplateSpecifierImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getTemplateSpecifier()
     * @generated
     */
    EClass TEMPLATE_SPECIFIER = eINSTANCE.getTemplateSpecifier();

    /**
     * The meta object literal for the '<em><b>Type Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_SPECIFIER__TYPE_REFERENCE = eINSTANCE.getTemplateSpecifier_TypeReference();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.ValueListImpl <em>Value List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.ValueListImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getValueList()
     * @generated
     */
    EClass VALUE_LIST = eINSTANCE.getValueList();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_LIST__MEMBER = eINSTANCE.getValueList_Member();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.TemplateReferenceImpl <em>Template Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.TemplateReferenceImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getTemplateReference()
     * @generated
     */
    EClass TEMPLATE_REFERENCE = eINSTANCE.getTemplateReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_REFERENCE__NAME = eINSTANCE.getTemplateReference_Name();

    /**
     * The meta object literal for the '<em><b>Type Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_REFERENCE__TYPE_REFERENCE = eINSTANCE.getTemplateReference_TypeReference();

    /**
     * The meta object literal for the '<em><b>Any Type Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE_REFERENCE__ANY_TYPE_REFERENCE = eINSTANCE.getTemplateReference_AnyTypeReference();

    /**
     * The meta object literal for the '<em><b>Templates List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_REFERENCE__TEMPLATES_LIST = eINSTANCE.getTemplateReference_TemplatesList();

    /**
     * The meta object literal for the '<em><b>Arguments List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_REFERENCE__ARGUMENTS_LIST = eINSTANCE.getTemplateReference_ArgumentsList();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.ArgumentDefinitionImpl <em>Argument Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.ArgumentDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getArgumentDefinition()
     * @generated
     */
    EClass ARGUMENT_DEFINITION = eINSTANCE.getArgumentDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT_DEFINITION__NAME = eINSTANCE.getArgumentDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Argument Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT_DEFINITION__ARGUMENT_VALUE = eINSTANCE.getArgumentDefinition_ArgumentValue();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_DEFINITION__ARGUMENT_LIST = eINSTANCE.getArgumentDefinition_ArgumentList();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.AttributeDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getAttributeDefinition()
     * @generated
     */
    EClass ATTRIBUTE_DEFINITION = eINSTANCE.getAttributeDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_DEFINITION__TYPE = eINSTANCE.getAttributeDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_DEFINITION__NAME = eINSTANCE.getAttributeDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_DEFINITION__VALUE = eINSTANCE.getAttributeDefinition_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.ImplementationDefinitionImpl <em>Implementation Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.ImplementationDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getImplementationDefinition()
     * @generated
     */
    EClass IMPLEMENTATION_DEFINITION = eINSTANCE.getImplementationDefinition();

    /**
     * The meta object literal for the '<em><b>CFile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPLEMENTATION_DEFINITION__CFILE = eINSTANCE.getImplementationDefinition_CFile();

    /**
     * The meta object literal for the '<em><b>Inline Ccode</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTATION_DEFINITION__INLINE_CCODE = eINSTANCE.getImplementationDefinition_InlineCcode();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.DataDefinitionImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getDataDefinition()
     * @generated
     */
    EClass DATA_DEFINITION = eINSTANCE.getDataDefinition();

    /**
     * The meta object literal for the '<em><b>CFile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_DEFINITION__CFILE = eINSTANCE.getDataDefinition_CFile();

    /**
     * The meta object literal for the '<em><b>Inline Ccode</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEFINITION__INLINE_CCODE = eINSTANCE.getDataDefinition_InlineCcode();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.InlineCodeCImpl <em>Inline Code C</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.InlineCodeCImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getInlineCodeC()
     * @generated
     */
    EClass INLINE_CODE_C = eINSTANCE.getInlineCodeC();

    /**
     * The meta object literal for the '<em><b>Code C</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INLINE_CODE_C__CODE_C = eINSTANCE.getInlineCodeC_CodeC();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.AnnotationsListImpl <em>Annotations List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.AnnotationsListImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getAnnotationsList()
     * @generated
     */
    EClass ANNOTATIONS_LIST = eINSTANCE.getAnnotationsList();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATIONS_LIST__ANNOTATIONS = eINSTANCE.getAnnotationsList_Annotations();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.AnnotationImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

    /**
     * The meta object literal for the '<em><b>Annotation Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ANNOTATION_ELEMENTS = eINSTANCE.getAnnotation_AnnotationElements();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.AnnotationElementImpl <em>Annotation Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.AnnotationElementImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getAnnotationElement()
     * @generated
     */
    EClass ANNOTATION_ELEMENT = eINSTANCE.getAnnotationElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_ELEMENT__NAME = eINSTANCE.getAnnotationElement_Name();

    /**
     * The meta object literal for the '<em><b>Element Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_ELEMENT__ELEMENT_VALUE = eINSTANCE.getAnnotationElement_ElementValue();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.ElementValueImpl <em>Element Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.ElementValueImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getElementValue()
     * @generated
     */
    EClass ELEMENT_VALUE = eINSTANCE.getElementValue();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.ElementValueArrayInitializerImpl <em>Element Value Array Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.ElementValueArrayInitializerImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getElementValueArrayInitializer()
     * @generated
     */
    EClass ELEMENT_VALUE_ARRAY_INITIALIZER = eINSTANCE.getElementValueArrayInitializer();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_VALUE_ARRAY_INITIALIZER__VALUES = eINSTANCE.getElementValueArrayInitializer_Values();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.adl.impl.ConstantValueImpl <em>Constant Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.adl.impl.ConstantValueImpl
     * @see org.ow2.mindEd.adl.impl.AdlPackageImpl#getConstantValue()
     * @generated
     */
    EClass CONSTANT_VALUE = eINSTANCE.getConstantValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_VALUE__VALUE = eINSTANCE.getConstantValue_Value();

  }

} //AdlPackage
