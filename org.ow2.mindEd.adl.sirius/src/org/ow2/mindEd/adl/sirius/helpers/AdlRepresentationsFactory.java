package org.ow2.mindEd.adl.sirius.helpers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class AdlRepresentationsFactory {

	public static String adlRepresentationsFileName = "adlRepresentations.aird";
	
	/**
	 * Get session / representations (semantically identical with Sirius) instance per project.
	 * The session is created empty, and MUST be completed with semantical information afterwards.
	 * 
	 * @param project the project to create an adlRepresentations.aird file into
	 * @param monitor 
	 * @return the empty session (to be completed with semantical information)
	 */
	public static Session getInstance(IProject project, IProgressMonitor monitor) {
		
		IFile representationsFile = project.getFile(AdlRepresentationsFactory.adlRepresentationsFileName);
		URI sessionModelURI = URI.createPlatformResourceURI(representationsFile.getFullPath().toOSString(), true);
		
		Session session = SessionManager.INSTANCE.getExistingSession(sessionModelURI);
		if (session != null)
			return session;

		// create it otherwise
		final SimpleSessionCreationOperation simpleSessionCreationOperation = new SimpleSessionCreationOperation(sessionModelURI);


		try {
			simpleSessionCreationOperation.run(new SubProgressMonitor(monitor, 1));
			session = simpleSessionCreationOperation.getSession();
		} catch (InvocationTargetException e) {
			return null;
		} catch (InterruptedException e) {
			return null;
		}
		
		return session;
		
	}

	/**
	 * Inspired from Sirius' SessionCreationOperation, except that we do not add the semantic resources here.
	 *
	 */
	protected static final class SimpleSessionCreationOperation extends WorkspaceModifyOperation {

		private URI sessionModelURI;

		private Session session;

		public SimpleSessionCreationOperation(URI sessionModelURI) {
			super();
			this.sessionModelURI = sessionModelURI;
		}

		public Session getSession() {
			return session;
		}

		@Override
		protected void execute(final IProgressMonitor monitor) throws CoreException, InterruptedException {
			try {
				monitor.beginTask("Adl representations file creation", 1);

				// Create a Session from the session model URI
				org.eclipse.sirius.business.api.session.SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(sessionModelURI, new SubProgressMonitor(
						monitor, 1));
				sessionCreationOperation.execute();
				session = sessionCreationOperation.getCreatedSession();
			} finally {
				monitor.done();
			}
		}

	}

}
