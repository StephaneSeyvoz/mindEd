package org.ow2.mindEd.adl.textual.ui.refactoring;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.refactoring.impl.AbstractProcessorBasedRenameParticipant;
import org.eclipse.xtext.ui.refactoring.ui.IRenameContextFactory;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.ow2.mindEd.adl.textual.fractal.AdlDefinition;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class FractalRenameParticipant extends
		AbstractProcessorBasedRenameParticipant {

	@Inject
	private IResourceSetProvider resourceSetProvider;

	@Inject
	private IRenameContextFactory renameContextFactory;

	@Override
	protected List<? extends IRenameElementContext> createRenameElementContexts(Object element) {
		String newName = super.getNewName();
		if(newName.endsWith(".adl") && element instanceof IFile) {
			IFile file = (IFile) element;
			String path = file.getFullPath().toString();
			URI uri = URI.createPlatformResourceURI(path, true);
			Resource xtextResource = new XtextResourceSet().getResource(uri, true);
			EList<EObject> xtextContents = xtextResource.getContents();
			
			// TODO: THE FOLLOWING ISNT OK SINCE WE MUST NOT DO THE CHANGE HERE
			// BUT LATER IN ANOTHER METHOD (see createRenameElementContexts caller in super class)
			
			// It should since we have only ONE ADLDefinition per file
			if (xtextContents.size() == 1 && xtextContents.get(0) instanceof AdlDefinition) {
				AdlDefinition adlDef = (AdlDefinition) xtextContents.get(0);
				ArchitectureDefinition archDef = adlDef.getArchitectureDefinition();
				
				String shortNewName = newName.substring(0, newName.length() - 4 /* '.adl' length */);
				
				String oldFullyQualifiedName = archDef.getName();
				
				String archDefNewName = oldFullyQualifiedName.substring(0, oldFullyQualifiedName.lastIndexOf('.') + 1) + shortNewName;
				
				archDef.setName(archDefNewName);
			}
			
			return null;
		}
		System.out.println("SSZ DIRTY DEBUG - ADL Xtext UI - FractalRenameParticipant#createRenameElementContexts - doesn't end with .adl");
		return null;
	}
	
	
	@Override
	protected List<EObject> getRenamedElementsOrProxies(EObject originalTarget) {
		System.out.println("SSZ DIRTY DEBUG - ADL Xtext UI - FractalRenameParticipant#getRenamedElementsOrProxies");
		return null;
	}

}
