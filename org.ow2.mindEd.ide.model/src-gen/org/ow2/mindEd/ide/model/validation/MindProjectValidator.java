/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model.validation;

import org.eclipse.core.resources.IProject;

import org.eclipse.emf.common.util.EList;

import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindRepo;
import org.ow2.mindEd.ide.model.MindRootSrc;

/**
 * A sample validator interface for {@link org.ow2.mindEd.ide.model.MindProject}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MindProjectValidator {
	boolean validate();

	boolean validateRootsrcs(EList<MindRootSrc> value);
	boolean validateRepo(MindRepo value);
	boolean validateUses(EList<MindProject> value);
	boolean validateMindpathentries(EList<MindPathEntry> value);
	boolean validateProject(IProject value);
	boolean validateAllsrc(EList<MindRootSrc> value);
}