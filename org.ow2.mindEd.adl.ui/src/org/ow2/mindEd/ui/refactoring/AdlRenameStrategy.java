package org.ow2.mindEd.ui.refactoring;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategy;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.ow2.mindEd.adl.ArchitectureDefinition;

/**
 * This class is used to complete {@link AdlArchDefRenameParticipant} to validate the new name:
 * When the "RenameElement" action is used we have to prevent package and short name renaming
 * at the same time, since it would imply chaining RenameResourceChange and MoveResourceChange,
 * and those do not combine well.
 * 
 * The class is bound to the IRenameStrategy interface thanks to Guice in the {@link FractalUiModule}.
 * 
 * This class and the according binding should be removed when a solution is found.
 *  
 * @author Stephane Seyvoz
 *
 */
@SuppressWarnings("restriction")
public class AdlRenameStrategy extends DefaultRenameStrategy {

	private EObject targetElement;

	/**
	 * Since the strategy applies to any element, and we only want to refine the ArchitectureDefinition
	 * case, we need to save the targetElement for our check in the "validateNewName" method, for adequate
	 * filtering.
	 * 
	 * @param targetElement
	 * @param context
	 * @return
	 */
	@Override
	public boolean initialize(EObject targetElement, IRenameElementContext context) {
		this.targetElement = targetElement;
		return super.initialize(targetElement, context);
	}

	/**
	 * Prevent package and short name renaming at the same time.
	 */
	@Override
	public RefactoringStatus validateNewName(String newName) {

		String oldPackageName = null;
		String newPackageName = null;
		
		RefactoringStatus status = super.validateNewName(newName);

		if (targetElement instanceof ArchitectureDefinition) {
			
			String originalName = getOriginalName();

			int lastIndexOfDotInOld = originalName.lastIndexOf('.');
			int lastIndexOfDotInNew = newName.lastIndexOf('.');

			
			if (lastIndexOfDotInOld < 0)
				oldPackageName = "";
			else
				oldPackageName 	= originalName.substring(0, lastIndexOfDotInOld);
			
			if (lastIndexOfDotInNew < 0)
				newPackageName = "";
			else
				newPackageName 	= newName.substring(0, lastIndexOfDotInNew);
			
			// No < 0 here since if it's -1 we won't have any problem anyway...
			String oldSimpleName 	= originalName.substring(lastIndexOfDotInOld + 1);
			String newSimpleName 	= newName.substring(lastIndexOfDotInNew + 1);

			// Have both changed ?
			if (!oldPackageName.equals(newPackageName) && !oldSimpleName.equals(newSimpleName))
				status.addError("Unsupported renaming: Renaming both package and short name at the same time isn't supported yet. Consider renaming one and then the other instead.");
		}

		return status;
	}

}
