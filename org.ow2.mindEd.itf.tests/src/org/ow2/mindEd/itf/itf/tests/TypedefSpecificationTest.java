/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.ItfFactory;
import org.ow2.mindEd.itf.itf.TypedefSpecification;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Typedef Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypedefSpecificationTest extends TypeDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypedefSpecificationTest.class);
	}

	/**
	 * Constructs a new Typedef Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedefSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Typedef Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypedefSpecification getFixture() {
		return (TypedefSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ItfFactory.eINSTANCE.createTypedefSpecification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TypedefSpecificationTest
