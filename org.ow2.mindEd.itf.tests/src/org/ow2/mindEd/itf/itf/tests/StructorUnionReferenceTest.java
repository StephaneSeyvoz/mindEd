/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.ItfFactory;
import org.ow2.mindEd.itf.itf.StructorUnionReference;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structor Union Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructorUnionReferenceTest extends StructOrUnionSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructorUnionReferenceTest.class);
	}

	/**
	 * Constructs a new Structor Union Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructorUnionReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structor Union Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructorUnionReference getFixture() {
		return (StructorUnionReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ItfFactory.eINSTANCE.createStructorUnionReference());
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

} //StructorUnionReferenceTest
