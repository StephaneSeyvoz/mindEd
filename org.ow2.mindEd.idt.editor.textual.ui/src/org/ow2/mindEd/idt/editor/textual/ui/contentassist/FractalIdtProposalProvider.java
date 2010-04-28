/*
* generated by Xtext
*/
package org.ow2.mindEd.idt.editor.textual.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class FractalIdtProposalProvider extends AbstractFractalIdtProposalProvider {
	/**
	 *	Content Assist for end definition
	 * 
	 * @see org.ow2.fractal.mind.idl.contentassist.AbstractFractalIdtProposalProvider#completeConstantDefinitionEnd_Id(org.eclipse.emf.ecore.EObject, org.eclipse.xtext.Assignment, org.eclipse.xtext.ui.core.editor.contentassist.ContentAssistContext, org.eclipse.xtext.ui.core.editor.contentassist.ICompletionProposalAcceptor)
	 */
	
	@Override
	public void completeConstantDefinitionEnd_Id(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		ICompletionProposal completionProposal = null;

		IdtFile idtFile = (IdtFile) model;

		String proposal = idtFile.getBegindef().getId();

		completionProposal = createCompletionProposal(proposal, proposal
				+ " - end definition", getImage(idtFile.getBegindef()), context);

		acceptor.accept(completionProposal);
	}

	@Override
	public void completeConstantDefinition_Id(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		ICompletionProposal completionProposal = null;

		IdtFile idtFile = (IdtFile) model;

		String proposal = idtFile.getBegindef().getId();

		completionProposal = createCompletionProposal(proposal, proposal
				+ " - definition", getImage(idtFile.getBegindef()), context);

		acceptor.accept(completionProposal);
	}
}