package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CompositeReferenceDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.CustomDragDropEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.FixedChildrenLayoutEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSubCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.MindSuperCreationEditPolicy;
import org.ow2.fractal.mind.diagram.custom.edit.policies.OpenDefinitionEditPolicy;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.layouts.ConstrainedFlowLayout;
import org.ow2.fractal.mind.diagram.custom.layouts.IFractalSize;

import adl.diagram.edit.parts.CompositeReferenceEditPart;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * Extends CompositeReferenceDefinitionEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * - Grid layout data<p>
 * This is a reference contained in a CompositeReferencesList
 * @author maroto
 *
 */
public class CompositeReferenceCustomEditPart extends
		CompositeReferenceEditPart {

	protected MindEditPart genericEditPart = MindEditPart.INSTANCE.createGenericEditPart (this, VISUAL_ID);
	
	public CompositeReferenceCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		IFigure shape = genericEditPart.setupContentPane(nodeShape);
		if (shape != null) return shape;
		return super.setupContentPane(nodeShape);
	}
	
	@Override
	protected void refreshBounds() {
		genericEditPart.refreshBounds();
	}
	
	/**
	 * Get the area of the reference, which contains the children
	 * @return the CompositeReferenceAreaCustomEditPart or null
	 */
	public CompositeReferenceCompartmentCustomEditPart getPane() {
		EditPart pane = getChildBySemanticHint(MindVisualIDRegistry
				.getType(CompositeReferenceCompartmentCustomEditPart.VISUAL_ID));
		if (pane instanceof CompositeReferenceCompartmentCustomEditPart)
			return (CompositeReferenceCompartmentCustomEditPart) pane;
		return null;
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended layout features
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				createLayoutEditPolicy());
		// Extended creation features
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new MindSuperCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeReferenceDefinitionCustomItemSemanticEditPolicy());
		// Extended drag and drop features
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomDragDropEditPolicy());
		// To open the referenced component on double clic
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
	}
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
		// This edit policy does not allow children to be dragged
		return new FixedChildrenLayoutEditPolicy();
	}
	

	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
			// If the component is merged handle custom behaviour
			ComponentHelper.handleMergedElement(this);
		refreshBounds();
	}
	
	
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositeReferenceDefinitionReferenceNameEditPart) {
			((CompositeReferenceDefinitionReferenceNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getLabel());
			// To open the referenced component on double clic
			childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
			return true;
		}
		if (childEditPart instanceof CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart) {
			IFigure pane = getPrimaryShape().getArea();
			setupContentPane(pane);
			pane.add(((CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart) childEditPart)
							.getFigure());
			// To open the referenced component on double clic
			childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
			return true;
		}
		return false;
	}
	
//	@Override
//	public DragTracker getDragTracker(Request request) {
//		return new NoDragTracker(this);
//	}
	
	@Override
	protected void addChild(EditPart childEditPart, int index) {
		super.addChild(childEditPart, index);
		// Should implement a listener instead
		// and use handleChildAdded
		getParent().refresh();
	}
	
	@Override
	protected void removeChild(EditPart childEditPart) {
		super.removeChild(childEditPart);
		// Should implement a listener instead
		// and use handleChildRemoved
		getParent().refresh();
	}
	
	@Override
	public void refresh() {
		super.refresh();
		getParent().refresh();
	}

}