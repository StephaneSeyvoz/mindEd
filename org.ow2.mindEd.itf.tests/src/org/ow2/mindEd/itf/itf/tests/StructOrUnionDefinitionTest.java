/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.ItfFactory;
import org.ow2.mindEd.itf.itf.StructOrUnionDefinition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Struct Or Union Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructOrUnionDefinitionTest extends StructOrUnionSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructOrUnionDefinitionTest.class);
	}

	/**
	 * Constructs a new Struct Or Union Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructOrUnionDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Struct Or Union Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructOrUnionDefinition getFixture() {
		return (StructOrUnionDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ItfFactory.eINSTANCE.createStructOrUnionDefinition());
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

} //StructOrUnionDefinitionTest
