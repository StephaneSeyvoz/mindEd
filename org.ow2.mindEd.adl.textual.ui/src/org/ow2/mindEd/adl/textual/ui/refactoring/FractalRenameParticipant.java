package org.ow2.mindEd.adl.textual.ui.refactoring;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.refactoring.impl.AbstractProcessorBasedRenameParticipant;
import org.eclipse.xtext.ui.refactoring.ui.IRenameContextFactory;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;

public class FractalRenameParticipant extends
		AbstractProcessorBasedRenameParticipant {

	@Inject
	private IResourceSetProvider resourceSetProvider;

	@Inject
	private IRenameContextFactory renameContextFactory;

	@Override
	protected List<? extends IRenameElementContext> createRenameElementContexts(Object element) {
		if(super.getNewName().endsWith(".adl")) {
			System.out.println("SSZ DIRTY DEBUG - ADL Xtext UI - FractalRenameParticipant#createRenameElementContexts - ends with .adl");
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
