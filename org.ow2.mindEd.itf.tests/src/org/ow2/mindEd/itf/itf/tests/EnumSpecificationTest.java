/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.EnumSpecification;
import org.ow2.mindEd.itf.itf.ItfFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enum Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumSpecificationTest extends TypeDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumSpecificationTest.class);
	}

	/**
	 * Constructs a new Enum Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enum Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnumSpecification getFixture() {
		return (EnumSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ItfFactory.eINSTANCE.createEnumSpecification());
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

} //EnumSpecificationTest
