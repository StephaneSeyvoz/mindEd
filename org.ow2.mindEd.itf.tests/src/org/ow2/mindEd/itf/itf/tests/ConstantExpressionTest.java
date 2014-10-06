/**
 */
package org.ow2.mindEd.itf.itf.tests;

import junit.textui.TestRunner;

import org.ow2.mindEd.itf.itf.ConstantExpression;
import org.ow2.mindEd.itf.itf.ItfFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Constant Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstantExpressionTest extends PrimaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstantExpressionTest.class);
	}

	/**
	 * Constructs a new Constant Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Constant Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConstantExpression getFixture() {
		return (ConstantExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ItfFactory.eINSTANCE.createConstantExpression());
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

} //ConstantExpressionTest
