package org.ow2.mindEd.adl.textual.ui.refactoring;

import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategy;

/**
 * This class is used to complete {@link FractalArchDefRenameParticipant} to validate the new name:
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
public class FractalRenameStrategy extends DefaultRenameStrategy {

	/**
	 * Prevent package and short name renaming at the same time.
	 */
	@Override
	public RefactoringStatus validateNewName(String newName) {
		
		
		RefactoringStatus status = super.validateNewName(newName);
		
		String originalName = getOriginalName();
		
		int lastIndexOfDotInOld = originalName.lastIndexOf('.');
		int lastIndexOfDotInNew = newName.lastIndexOf('.');
		
		String oldPackageName 	= originalName.substring(0, lastIndexOfDotInOld);
		String newPackageName 	= newName.substring(0, lastIndexOfDotInNew);

		String oldSimpleName 	= originalName.substring(lastIndexOfDotInOld + 1);
		String newSimpleName 	= newName.substring(lastIndexOfDotInNew + 1);
		
		// Have both changed ?
		if (!oldPackageName.equals(newPackageName) && !oldSimpleName.equals(newSimpleName))
			status.addError("Unsupported renaming: Renaming both package and short name at the same time isn't supported yet. Consider renaming one and then the other instead.");
		
		return status;
	}
	
}
