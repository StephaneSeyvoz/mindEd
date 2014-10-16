package org.ow2.mindEd.ui.refactoring;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;

/**
 * This class is used in our FractalRenameStrategy to discriminate actions coming
 * from file renaming (LTK) or from definition renaming (Xtext editor).
 * 
 * @author Stephane Seyvoz
 *
 */
@SuppressWarnings("restriction")
public class ItfFileRenameElementContext extends IRenameElementContext.Impl {

	public ItfFileRenameElementContext(URI targetElementURI,
			EClass targetElementEClass) {
		super(targetElementURI, targetElementEClass);
	}

}
