/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.EnumDefinition;
import org.ow2.mindEd.itf.itf.ItfFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enum Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumDefinitionTest extends EnumSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumDefinitionTest.class);
	}

	/**
	 * Constructs a new Enum Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enum Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnumDefinition getFixture() {
		return (EnumDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ItfFactory.eINSTANCE.createEnumDefinition());
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

} //EnumDefinitionTest
