package org.ow2.mindEd.adl.sirius.editors;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.EditingSessionEvent;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IEditorLauncher;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.ow2.mindEd.adl.AdlFile;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.sirius.helpers.AdlRepresentationsFactory;

public abstract class AbstractGraphicalAdlEditor implements IEditorLauncher {

	/**
	 * Sub-classes must provide a representation description name, used to retrieve the right 
	 * representation description in the Viewpoint (see our VSM / ODesign file), allowing
	 * specific representation opening / creation.
	 * 
	 */
	protected final String				representationDescriptionName;
	/**
	 * Sub-classes must provide a representation name suffix (for storage / user-friendliness).
	 */
	protected final String				representationSuffix;
	
	// Utility fields
	
	private IFile 						targetFile = null;
	private IProject 					project = null;

	private Session 					session = null;
	private Resource 					resource = null;
	private EObject 					semanticElement = null;

	private DRepresentation 			representation = null;
	private String 						representationName = null;
	private RepresentationDescription 	representationDesc = null;
	
	/**
	 * 
	 * @param representationDescriptionName The kind of representation to be created by the sub-class (selected from our Viewpoint Specification Model, see .odesign file)
	 * @param representationSuffix Used by sub-classes to name each created Representation in a user-friendly way.
	 */
	AbstractGraphicalAdlEditor(String representationDescriptionName, String representationSuffix) {
		this.representationDescriptionName = representationDescriptionName;
		this.representationSuffix = representationSuffix;
	}
	
	/**
	 * Open a Sirius Viewpoint ArchitectureDiagram editor instance, creating it if needed.
	 * The action is contributed to the IDE thanks to the plugin.xml org.eclipse.ui.editors
	 * extension point.
	 */
	@Override
	public void open(IPath arg0) {

		// Workbench init
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		
		// redundant with arg0, but not very important...
		IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();

		// shouldn't even happen
		if (!(selection.getFirstElement() instanceof IFile))
			return;

		targetFile = (IFile) selection.getFirstElement();
		URI fileURI = URI.createPlatformResourceURI(targetFile.getFullPath().toOSString(), true);

		project = targetFile.getProject();

		// Create Session (aka Representation) if needed
		session = AdlRepresentationsFactory.getInstance(project);

		// Try to find the semantic resource in the session
		Collection<Resource> sessionSemanticResources = session.getSemanticResources();
		for (Resource semanticRsc : sessionSemanticResources) {
			if (semanticRsc.getURI().equals(fileURI)) {
				resource = semanticRsc;
				break;
			}
		}

		if (resource == null) {

			// - Add resource to session
			Command addSemanticResourceCmd = new AddSemanticResourceCommand(session, fileURI, new NullProgressMonitor());
			session.getTransactionalEditingDomain().getCommandStack().execute(addSemanticResourceCmd);
			
			/*
			 *  VERY IMPORTANT /!\
			 *  
			 *  Do NOT use the resource.getContents().get(0) semantic element from Xtext, otherwise the CreateRepresentationCommand
			 *  in the end will fail, trying to retrieve an "Interpreter" matching the Xtext semantic element in the Session, which
			 *  it does NOT know. We have to do it the Sirius way to make the CreateRepresentationCommand succeed !
			 *  
			 *  So, now we added the semantic resource in the Session, Sirius way, we have to retrieve its corresponding object, 
			 *  in the Sirius model.
			 */
			for (Resource semanticRsc : sessionSemanticResources) {
				if (semanticRsc.getURI().equals(fileURI)) {
					resource = semanticRsc;
					break;
				}
			}
		}
		
		// In any case
		semanticElement = resource.getContents().get(0);

		// should be anyway since we are linked to .adl files
		if (semanticElement instanceof AdlFile) {
			ArchitectureDefinition archDef = ((AdlFile) semanticElement).getArchitectureDefinition();
			representationName = archDef.getName() + representationSuffix;

			// try to find an existing representation
			Collection<DRepresentation> sessionRepresentations = DialectManager.INSTANCE.getRepresentations(semanticElement, session);

			if (!sessionRepresentations.isEmpty()) {

				Iterator<DRepresentation> sessionRepresentationsIterator = sessionRepresentations.iterator();

				while (sessionRepresentationsIterator.hasNext()) {
					representation = sessionRepresentationsIterator.next();
					representationDesc = DialectManager.INSTANCE.getDescription(representation);

					if (representationDesc.getName().equals(representationDescriptionName)) {
						// found
						DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
						// TODO: do this with a Command and register a callback to close the session when the edition is finished
						return;
					}
				}

			}

			// No representation at all OR no matching representation exist: CREATE ONE
			Collection<Viewpoint> adlViewpoints = ViewpointSelection.getViewpoints("adl"); // by file extension

			Iterator<Viewpoint> viewpointsIterator = adlViewpoints.iterator();
			while (viewpointsIterator.hasNext()) {

				Viewpoint currentViewpoint = viewpointsIterator.next();
				Collection<RepresentationDescription> representationDescs = currentViewpoint.getOwnedRepresentations();
				Iterator<RepresentationDescription> representationDescIterator = representationDescs.iterator();

				while (representationDescIterator.hasNext()) {
					RepresentationDescription currDesc = representationDescIterator.next();
					if (currDesc.getName().equals(representationDescriptionName)) {
						representationDesc = currDesc;

						Collection<Viewpoint> viewpoints = session.getSelectedViewpoints(false);
						if (viewpoints.isEmpty()) {
							// Select and Initialize the Viewpoint for Session

							Set<Viewpoint> viewpointSet = new HashSet<Viewpoint>();
							Set<Viewpoint> emptySet = new HashSet<Viewpoint>();
							viewpointSet.add(currentViewpoint);

							final ViewpointSelectionCallback selectionCallback = new ViewpointSelectionCallback();
							final TransactionalEditingDomain domain = session.getTransactionalEditingDomain();

							boolean createNewRepresentations = false; // TODO: check if ok ?

							// Maybe should we do a similar Command, but ours to not have the "restriction" warning ?
							final Command command = new ChangeViewpointSelectionCommand(session, selectionCallback, viewpointSet, emptySet, createNewRepresentations, new NullProgressMonitor());
							domain.getCommandStack().execute(command);
						}

						break;
					}
				}

				if (representationDesc != null)
					break;
			}

			CreateRepresentationCommand createRepresentationCommand = new CreateRepresentationCommand(session, representationDesc, semanticElement, representationName, new NullProgressMonitor());

			IEditingSession editingSession = SessionUIManager.INSTANCE.getUISession(session);
			editingSession.notify(EditingSessionEvent.REPRESENTATION_ABOUT_TO_BE_CREATED_BEFORE_OPENING);
			session.getTransactionalEditingDomain().getCommandStack().execute(createRepresentationCommand);
			editingSession.notify(EditingSessionEvent.REPRESENTATION_CREATED_BEFORE_OPENING);
			representation = createRepresentationCommand.getCreatedRepresentation();


			DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());

		}

	}
	
}
