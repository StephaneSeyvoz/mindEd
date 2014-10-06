/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.ItfFactory;
import org.ow2.mindEd.itf.itf.XorExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xor Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XorExpressionTest extends TestCase {

	/**
	 * The fixture for this Xor Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XorExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XorExpressionTest.class);
	}

	/**
	 * Constructs a new Xor Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XorExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Xor Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(XorExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Xor Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XorExpression getFixture() {
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
		setFixture(ItfFactory.eINSTANCE.createXorExpression());
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

} //XorExpressionTest
