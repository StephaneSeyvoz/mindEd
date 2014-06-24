package org.ow2.mindEd.adl.textual.ui.refactoring;

import static com.google.common.collect.Iterables.toArray;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newArrayListWithCapacity;
import static com.google.common.collect.Sets.newHashSet;
import static org.eclipse.ltk.core.refactoring.RefactoringStatus.ERROR;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;
import org.eclipse.ltk.core.refactoring.participants.RenameProcessor;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.IGlobalServiceProvider;
import org.eclipse.xtext.ui.refactoring.IRenameRefactoringProvider;
import org.eclipse.xtext.ui.refactoring.impl.ProjectUtil;
import org.eclipse.xtext.ui.refactoring.impl.StatusWrapper;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.eclipse.xtext.ui.refactoring.ui.RefactoringPreferences;
import org.eclipse.xtext.ui.refactoring.ui.SyncUtil;
import org.eclipse.xtext.ui.resource.XtextLiveScopeResourceSetProvider;
import org.ow2.mindEd.adl.textual.ui.internal.FractalActivator;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Inspired by Xtext's {@link AbstractProcessorBasedMoveParticipant}.
 * This class is intended to be triggered as a classic MoveParticipant,
 * but to Rename the internal definition element (EMF + Xtext model) as
 * a TextEditChange created by Xtext's RenameElementProcessor and DefaultRenameStrategy,
 * before really moving the file with the automatically created MoveResourceChange. 
 * 
 * @author Stephane Seyvoz
 *
 */

@SuppressWarnings("restriction")
public abstract class AbstractProcessorBasedMoveParticipant extends MoveParticipant {

	private static final Logger LOG = Logger.getLogger(AbstractProcessorBasedMoveParticipant.class);

	@Inject
	private IGlobalServiceProvider globalServiceProvider;
	
	@Inject
	private XtextLiveScopeResourceSetProvider resourceSetProvider;

	@Inject
	private ProjectUtil projectUtil;

	@Inject
	@Named(Constants.LANGUAGE_NAME)
	private String languageName;

	@Inject
	protected StatusWrapper status;
	
	@Inject 
	protected SyncUtil syncUtil;
	
	@Inject
	protected RefactoringPreferences preferences;

	protected List<RenameProcessor> wrappedProcessors;

	protected Set<Object> disabledTargets = newHashSet();
	
	@Override
	protected boolean initialize(Object originalTargetElement) {
		try {
			wrappedProcessors = getRenameProcessors(originalTargetElement);
			if(wrappedProcessors != null) {
				syncUtil.totalSync(preferences.isSaveAllBeforeRefactoring());
				return true;
			}	
		} catch (Exception exc) {
			status.add(ERROR, "Error initializing refactoring participant.", exc, LOG);
		}
		return false;
	}
	
	protected List<RenameProcessor> getRenameProcessors(Object originalTargetElement) {
		List<? extends IRenameElementContext> participantContexts = createRenameElementContexts(originalTargetElement);
		if (participantContexts != null) {
			List<RenameProcessor> processors = newArrayList();
			for (IRenameElementContext participantContext : participantContexts) {
				RenameProcessor RenameProcessor = getRenameProcessor(participantContext);
				if (RenameProcessor != null) {
					processors.add(RenameProcessor);
				}
			}
			return processors;
		}
		return null;
	}

	protected RenameProcessor getRenameProcessor(IRenameElementContext participantContext) {
		IRenameRefactoringProvider RenameRefactoringProvider = getRenameRefactoringProvider(participantContext);
		if (RenameRefactoringProvider != null)
			return RenameRefactoringProvider.getRenameProcessor(participantContext);
		else
			return null;
	}

	protected IRenameRefactoringProvider getRenameRefactoringProvider(IRenameElementContext RenameElementContext) {
		return globalServiceProvider.findService(RenameElementContext.getTargetElementURI(),
				IRenameRefactoringProvider.class);
	}
	
	@Override
	public String getName() {
		return languageName;
	}

	public Object[] getElements() {
		List<Object> elements = newArrayList();
		for (RenameProcessor wrappedProcessor : wrappedProcessors) {
			elements.addAll(Arrays.asList(wrappedProcessor.getElements()));
		}
		return toArray(elements, Object.class);
	}

	public void disableFor(Object... elements) {
		disabledTargets.addAll(Arrays.asList(elements));
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		CompositeChange compositeChange = null;
		try {
			for (RenameProcessor wrappedProcessor : wrappedProcessors) {
				if (!disabledTargets.containsAll(Arrays.asList(wrappedProcessor.getElements()))) {
					Change processorChange = wrappedProcessor.createChange(pm);
					if (processorChange != null) {
						if (compositeChange == null)
							compositeChange = new CompositeChange("Changes from participant: " + getName());
						compositeChange.add(processorChange);
					}
				}
			}
		} catch (Exception e) {
			throw new CoreException(new Status(IStatus.ERROR, FractalActivator.getInstance().getBundle().getSymbolicName(), "Error creating change", e));
		} finally {
			dispose();
		}
		return compositeChange;
	}
	
	/**
	 * 
	 */
	protected void dispose() {
		status = null;
		wrappedProcessors = null;
		disabledTargets.clear();
	}

	protected List<? extends IRenameElementContext> createRenameElementContexts(Object element) {
		if (element instanceof IRenameElementContext) {
			IRenameElementContext triggeringContext = (IRenameElementContext) element;
			IProject project = projectUtil.getProject(triggeringContext.getTargetElementURI());
			if (project != null) {
				ResourceSet resourceSet = resourceSetProvider.get(project);
				EObject originalTarget = resourceSet.getEObject(triggeringContext.getTargetElementURI(), true);
				List<EObject> MovedElements = getRenamedElementsOrProxies(originalTarget);
				if (MovedElements == null || MovedElements.isEmpty())
					return null;
				List<IRenameElementContext> contexts = newArrayListWithCapacity(MovedElements.size());
				for (EObject MovedElement : MovedElements)
					contexts.add(new IRenameElementContext.Impl(EcoreUtil.getURI(MovedElement), MovedElement
							.eClass(), triggeringContext.getTriggeringEditor(), triggeringContext
							.getTriggeringEditorSelection(), triggeringContext.getContextResourceURI()));
				return contexts;
			}
		}
		return null;
	}

	protected abstract List<EObject> getRenamedElementsOrProxies(EObject originalTarget);

	protected IContainer getDestination() {
		return (IContainer) getArguments().getDestination();
	}

	protected StatusWrapper getStatus() {
		return status;
	}

	protected IGlobalServiceProvider getGlobalServiceProvider() {
		return globalServiceProvider;
	}

}
