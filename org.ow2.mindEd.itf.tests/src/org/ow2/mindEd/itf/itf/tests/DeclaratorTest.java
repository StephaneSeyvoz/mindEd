/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.Declarator;
import org.ow2.mindEd.itf.itf.ItfFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Declarator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclaratorTest extends TestCase {

	/**
	 * The fixture for this Declarator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Declarator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeclaratorTest.class);
	}

	/**
	 * Constructs a new Declarator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaratorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Declarator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Declarator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Declarator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Declarator getFixture() {
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
		setFixture(ItfFactory.eINSTANCE.createDeclarator());
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

} //DeclaratorTest
