/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model.validation;

import org.eclipse.emf.common.util.EList;

import org.ow2.mindEd.ide.model.MindRepo;

/**
 * A sample validator interface for {@link org.ow2.mindEd.ide.model.MindAllRepo}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MindAllRepoValidator {
	boolean validate();

	boolean validateRepos(EList<MindRepo> value);
}
