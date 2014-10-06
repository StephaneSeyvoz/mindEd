/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.EnumReference;
import org.ow2.mindEd.itf.itf.ItfFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enum Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumReferenceTest extends EnumSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumReferenceTest.class);
	}

	/**
	 * Constructs a new Enum Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enum Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnumReference getFixture() {
		return (EnumReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ItfFactory.eINSTANCE.createEnumReference());
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

} //EnumReferenceTest
