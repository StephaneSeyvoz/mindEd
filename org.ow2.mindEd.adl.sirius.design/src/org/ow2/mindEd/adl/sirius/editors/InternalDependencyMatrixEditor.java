package org.ow2.mindEd.adl.sirius.editors;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.EditingSessionEvent;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IEditorLauncher;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.ow2.mindEd.adl.AdlFile;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.ui.internal.AdlActivator;

import com.google.inject.Injector;

public class InternalDependencyMatrixEditor implements IEditorLauncher {

	@Override
	public void open(IPath arg0) {

		// Workbench init
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();

		if (selection.getFirstElement() instanceof IFile) {
			IFile file = (IFile) selection.getFirstElement();

			IProject project = file.getProject();


			IFile airdFile = project.getFile("representations.aird");

			URI representationsFileURI = URI.createPlatformResourceURI(airdFile
					.getFullPath().toOSString(), true);

			URI fFileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toOSString(), true);

			Session session = SessionManager.INSTANCE.getExistingSession(representationsFileURI);

			Resource 					foundResource = null;
			DRepresentation 			representation = null;
			String 						representationName = null;
			RepresentationDescription 	representationDesc = null;

			Collection<Resource> sessionSemanticResources = session.getSemanticResources();
			for (Resource semanticRsc : sessionSemanticResources) {
				if (semanticRsc.getURI().equals(fFileURI)) {
					foundResource = semanticRsc;
					break;
				}
			}

			if (foundResource == null)
				return;

			EObject semanticElement = foundResource.getContents().get(0);

			// should be anyway since we are linked to .adl files
			if (semanticElement instanceof AdlFile) {
				ArchitectureDefinition archDef = ((AdlFile) semanticElement).getArchitectureDefinition();
				representationName = archDef.getName() + " Internal Dependencies Matrix";

				// try to find an existing representation
				Collection<DRepresentation> sessionRepresentations = DialectManager.INSTANCE.getRepresentations(semanticElement, session);
				
				if (!sessionRepresentations.isEmpty()) {
					
					Iterator<DRepresentation> sessionRepresentationsIterator = sessionRepresentations.iterator();

					while (sessionRepresentationsIterator.hasNext()) {
						representation = sessionRepresentationsIterator.next();
						representationDesc = DialectManager.INSTANCE.getDescription(representation);
						
						if (representationDesc.getName().equals("InternalDependenciesMatrix")) {
							// found
							DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
							// TODO: do this with a Command and register a callback to close the session when the edition is finished
							return;
						}
					}

				}

				// No representation at all OR no matching representation exist: CREATE ONE
				Collection<Viewpoint> viewpoints = session.getSelectedViewpoints(true);

				Iterator<Viewpoint> viewpointsIterator = viewpoints.iterator();
				while (viewpointsIterator.hasNext()) {

					Collection<RepresentationDescription> representationDescs = viewpointsIterator.next().getOwnedRepresentations();
					Iterator<RepresentationDescription> representationDescIterator = representationDescs.iterator();

					while (representationDescIterator.hasNext()) {
						RepresentationDescription currDesc = representationDescIterator.next();
						if (currDesc.getName().equals("InternalDependenciesMatrix")) {
							representationDesc = currDesc;
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

}
