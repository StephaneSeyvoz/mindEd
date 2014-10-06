/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.ItfFactory;
import org.ow2.mindEd.itf.itf.ShiftExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shift Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShiftExpressionTest extends TestCase {

	/**
	 * The fixture for this Shift Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftExpression fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShiftExpressionTest.class);
	}

	/**
	 * Constructs a new Shift Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShiftExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Shift Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ShiftExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Shift Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftExpression getFixture() {
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
		setFixture(ItfFactory.eINSTANCE.createShiftExpression());
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

} //ShiftExpressionTest
