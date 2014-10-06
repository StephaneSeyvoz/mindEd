/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.AnnotationsList;
import org.ow2.mindEd.itf.itf.ItfFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Annotations List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsListTest extends TestCase {

	/**
	 * The fixture for this Annotations List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationsList fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnnotationsListTest.class);
	}

	/**
	 * Constructs a new Annotations List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Annotations List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AnnotationsList fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Annotations List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationsList getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ItfFactory.eINSTANCE.createAnnotationsList());
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

} //AnnotationsListTest
