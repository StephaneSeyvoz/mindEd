/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.ItfFactory;
import org.ow2.mindEd.itf.itf.StructOrUnionSpecification;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Struct Or Union Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructOrUnionSpecificationTest extends TypeDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructOrUnionSpecificationTest.class);
	}

	/**
	 * Constructs a new Struct Or Union Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructOrUnionSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Struct Or Union Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructOrUnionSpecification getFixture() {
		return (StructOrUnionSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ItfFactory.eINSTANCE.createStructOrUnionSpecification());
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

} //StructOrUnionSpecificationTest
