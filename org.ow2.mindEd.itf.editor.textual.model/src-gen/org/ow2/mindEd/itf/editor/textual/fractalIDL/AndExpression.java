/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression#getLeftExpr <em>Left Expr</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression#getRightExpr <em>Right Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAndExpression()
 * @model
 * @generated
 */
public interface AndExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Expr</em>' containment reference.
   * @see #setLeftExpr(ShiftExpression)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAndExpression_LeftExpr()
   * @model containment="true"
   * @generated
   */
  ShiftExpression getLeftExpr();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression#getLeftExpr <em>Left Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Expr</em>' containment reference.
   * @see #getLeftExpr()
   * @generated
   */
  void setLeftExpr(ShiftExpression value);

  /**
   * Returns the value of the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Expr</em>' containment reference.
   * @see #setRightExpr(AndExpression)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAndExpression_RightExpr()
   * @model containment="true"
   * @generated
   */
  AndExpression getRightExpr();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression#getRightExpr <em>Right Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Expr</em>' containment reference.
   * @see #getRightExpr()
   * @generated
   */
  void setRightExpr(AndExpression value);

} // AndExpression
