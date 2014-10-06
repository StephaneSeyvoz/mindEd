/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.ItfFactory;
import org.ow2.mindEd.itf.itf.MulExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mul Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MulExpressionTest extends TestCase {

	/**
	 * The fixture for this Mul Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MulExpressionTest.class);
	}

	/**
	 * Constructs a new Mul Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mul Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MulExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mul Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulExpression getFixture() {
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
		setFixture(ItfFactory.eINSTANCE.createMulExpression());
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

} //MulExpressionTest
