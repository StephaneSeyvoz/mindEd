package org.ow2.mindEd.adl.sirius.editors;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.operation.IRunnableWithProgress;
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
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.ow2.mindEd.adl.AdlFile;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.sirius.helpers.AdlRepresentationsFactory;

public class ProjectRelationsEditor {

	/**
	 * 
	 */
	protected String					representationDescriptionName = "ProjectRelationsDiagram";
	/**
	 * 
	 */
	protected String					representationSuffix = " Project Relations Diagram";

	// Utility fields

	private Session 					session = null;
	private Resource 					resource = null;
	private EObject 					semanticElement = null;

	private ArrayList<IResource> 		allAdlFiles = null;

	private Set<Viewpoint> 				viewpointSet = null;
	private Set<Viewpoint> 				emptySet = new HashSet<Viewpoint>();

	private boolean 					createNewRepresentations = false; // TODO: check if ok ?

	private DRepresentation 			representation = null;
	private String 						representationName = null;
	private RepresentationDescription 	representationDesc = null;

	/**
	 * Open a Sirius Viewpoint ArchitectureDiagram editor instance, creating it if needed.
	 * See the related ProjectRelationsEditorAction for caller.
	 */
	public void open(IProject project) {

		// Workbench access
		IWorkbench workbench = PlatformUI.getWorkbench();
		IProgressService progressService = workbench.getProgressService();

		// Create Session (aka Representation) if needed
		session = AdlRepresentationsFactory.getInstance(project);

		// Check if semantic resources are already registered in the Sirius session
		Collection<Resource> sessionSemanticResources = session.getSemanticResources();
		if (sessionSemanticResources.isEmpty()) {

			// try to find an ADL file in the project and to add it as semantic resources
			allAdlFiles = new ArrayList<IResource>();
			IPath projectPath = project.getLocation();
			IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

			recursiveFindAdlFiles(allAdlFiles, projectPath, workspaceRoot);

			if (!allAdlFiles.isEmpty()) {

				// - Add all project resources to session
				try {
					progressService.run(false, false, new IRunnableWithProgress() {
						public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
							IResource resource;
							Iterator<IResource> it = allAdlFiles.iterator();
							while (it.hasNext()) {
								resource = it.next();
								session.getTransactionalEditingDomain().getCommandStack().execute(new AddSemanticResourceCommand(session,
										URI.createPlatformResourceURI(resource.getFullPath().toOSString(), true),
										monitor));
							}
						}
					});

					// Re-obtain them now we populated Sirius with the semantic resources...
					sessionSemanticResources = session.getSemanticResources();

				} catch (InvocationTargetException e) {
					return;
				} catch (InterruptedException e) {
					return;
				}
			} else return;
		}

		// Otherwise any semantic resource is Ok for this scenario: Take the first.
		// Note: we know all our considered semantic elements will be of AdlFile type (we should filter otherwise !)
		resource = sessionSemanticResources.iterator().next();

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
						try {
							progressService.run(false, false, new IRunnableWithProgress() {
								public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
									DialectUIManager.INSTANCE.openEditor(session, representation, monitor);
								}
							});
						} catch (InvocationTargetException e) {
							return;
						} catch (InterruptedException e) {
							return;
						}

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

							viewpointSet = new HashSet<Viewpoint>();
							viewpointSet.add(currentViewpoint);

							final ViewpointSelectionCallback selectionCallback = new ViewpointSelectionCallback();
							final TransactionalEditingDomain domain = session.getTransactionalEditingDomain();

							try {
								progressService.run(false, false, new IRunnableWithProgress() {
									public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
										final Command command = new ChangeViewpointSelectionCommand(session, selectionCallback, viewpointSet, emptySet, createNewRepresentations, monitor);
										domain.getCommandStack().execute(command);
									}
								});
							} catch (InvocationTargetException e) {
								return;
							} catch (InterruptedException e) {
								return;
							}
						}

						break;
					}
				}

				if (representationDesc != null)
					break;
			}

			try {
				progressService.run(false, false, new IRunnableWithProgress() {
					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						CreateRepresentationCommand createRepresentationCommand = new CreateRepresentationCommand(session, representationDesc, semanticElement, representationName, monitor);

						IEditingSession editingSession = SessionUIManager.INSTANCE.getUISession(session);
						editingSession.notify(EditingSessionEvent.REPRESENTATION_ABOUT_TO_BE_CREATED_BEFORE_OPENING);
						session.getTransactionalEditingDomain().getCommandStack().execute(createRepresentationCommand);
						editingSession.notify(EditingSessionEvent.REPRESENTATION_CREATED_BEFORE_OPENING);
						representation = createRepresentationCommand.getCreatedRepresentation();

						DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
					}
				});
			} catch (InvocationTargetException e) {
				return;
			} catch (InterruptedException e) {
				return;
			}

		}

	}

	protected void recursiveFindAdlFiles(List<IResource> adlFiles, IPath path, IWorkspaceRoot myWorkspaceRoot){
		IContainer container =  myWorkspaceRoot.getContainerForLocation(path);

		if (container == null)
			return;

		try {
			IResource[] resources = container.members();
			for (IResource currResource : resources){

				// found .adl file
				if ("adl".equalsIgnoreCase(currResource.getFileExtension()))
					adlFiles.add(currResource);

				if (currResource.getType() == IResource.FOLDER){
					IPath folderPath = currResource.getLocation();
					recursiveFindAdlFiles(adlFiles, folderPath, myWorkspaceRoot);
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

}
