
package org.ow2.mindEd.ui.quickfix;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.FileC;
import org.ow2.mindEd.adl.FormalArgument;
import org.ow2.mindEd.adl.HostedInterfaceDefinition;
import org.ow2.mindEd.adl.ImportDefinition;
import org.ow2.mindEd.adl.TemplateSpecifier;
import org.ow2.mindEd.adl.impl.ArchitectureDefinitionImpl;
/*
	import org.eclipse.xtext.parsetree.AbstractNode;
	import org.eclipse.xtext.parsetree.CompositeNode;
	import org.eclipse.xtext.parsetree.NodeUtil;
 */
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.core.impl.CDTUtil;
import org.ow2.mindEd.ide.model.MindLibOrProject;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.validation.AdlValidator;

public class AdlQuickfixProvider extends DefaultQuickfixProvider {

	/*
	 * Renaming quickfixes
	 */

	@Fix(AdlValidator.DUPLICATE_INTERFACE_NAME)
	public void renameInterface(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Rename",
				"Rename this interface", null,
				new ISemanticModification() {
			public void apply(EObject element,
					IModificationContext context) throws Exception {

				if (element instanceof HostedInterfaceDefinition) {
					HostedInterfaceDefinition interfaceDefinition = (HostedInterfaceDefinition) element;
					String name = interfaceDefinition.getName();

					interfaceDefinition.setName(rename(name));
				}

			}
		});
	}

	@Fix(AdlValidator.WRONG_NAME)
	public void renameDefinition(final Issue issue,
			IssueResolutionAcceptor acceptor) {

		acceptor.accept(
				issue, 
				"Rename", 
				"Change definition name", 
				null, 
				new ISemanticModification() {
					public void apply(EObject element,
							IModificationContext context) throws Exception {

						if (element instanceof ArchitectureDefinitionImpl) {

							ArchitectureDefinitionImpl archDefImpl = (ArchitectureDefinitionImpl) element;							
							String expectedName = AdlValidator.getExpectedComponentName(archDefImpl);							
							archDefImpl.setName(expectedName);
						}

					}
				});
	}

	//	@Fix(MyJavaValidator.INVALID_NAME)
	//	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
	//		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
	//			public void apply(IModificationContext context) throws BadLocationException {
	//				IXtextDocument xtextDocument = context.getXtextDocument();
	//				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
	//				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
	//			}
	//		});
	//	}

	@Fix(AdlValidator.DUPLICATE_FORMAL_ARGUMENT_NAME)
	public void renameArgument(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Rename",
				"Rename this duplicate argument.", null,
				new ISemanticModification() {

			public void apply(EObject element,
					IModificationContext context) throws Exception {

				if (element instanceof FormalArgument) {
					FormalArgument formalDefinition = (FormalArgument) element;
					String newName = rename(formalDefinition.getName());

					formalDefinition.setName(newName);
				}
			}
		});
	}

	@Fix(AdlValidator.DUPLICATE_TEMPLATE_SPECIFIER_NAME)
	public void renameTemplateSpecifierName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Rename",
				"Rename duplicate template specifier name.", null,
				new ISemanticModification() {

			public void apply(EObject element,
					IModificationContext context) throws Exception {

				if (element instanceof TemplateSpecifier) {
					TemplateSpecifier templateSpecifier= (TemplateSpecifier) element;
					String newName = rename(templateSpecifier.getName());

					templateSpecifier.setName(newName);
				}
			}
		});
	}

	/**
	 * Rename, for example : 
	 * 		toto -> toto1
	 * 		toto1 -> toto2
	 * @param name to refactor
	 * @return
	 */
	public static String rename(String name){

		String newName;

		if (Character.isDigit(name
				.charAt(name.length()-1))) {
			newName = name.substring(0, name.length() - 1);
			int nbr = Integer.parseInt(((name.substring(name.length()-1)))) + 1;
			newName = newName + nbr ;

		} else {
			newName = name + 1;
		}

		return newName;
	}

	/*
	 * Unknown element quickfixes 
	 */

	@Fix(AdlValidator.UNKNOWN_IMPORT)
	public void fixUnkownImport(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove unknown import",
				"Remove this unavailable package.", null,
				new ISemanticModification() {

			public void apply(EObject element,
					IModificationContext context) throws Exception {
				if (element instanceof ImportDefinition)
					EcoreUtil.delete(element);
			}
		});
	}

	@Fix(AdlValidator.UNKNOWN_TEMPLATE_SPECIFIER_TYPE)
	public void fixUnknownTemplateSpecifierType(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove",
				"Remove unknown template specifier type", null,
				new ISemanticModification() {

			public void apply(EObject element,
					IModificationContext context) throws Exception {
				if (element instanceof TemplateSpecifier)
					EcoreUtil.delete(element);
			}
		});
	}	


	//	@Fix(FractalJavaValidator.UNKNOWN_INTERFACE)
	//	public void createInterface(final Issue issue, IssueResolutionAcceptor acceptor) {
	//		acceptor.accept(issue, 
	//				"Create interface " + issue.getData()[0],
	//				"Create a new interface definition file " 
	//						+ issue.getData()[0]
	//								+ " in package " 
	//								+ issue.getData()[1] 
	//										+ ".",
	//										null,
	//										new ISemanticModification() {
	//			@Override
	//			public void apply(EObject element,
	//					IModificationContext context) throws Exception {
	//
	//				if (element instanceof HostedInterfaceDefinition){
	//
	//					HostedInterfaceDefinition itf = (HostedInterfaceDefinition) element;
	//					AdlFileImpl adlDefinition = (AdlFileImpl) FractalUtil.getArchitecureDefinitionFromChild(itf).eContainer();
	//
	//					URI uri = adlDefinition.eDirectResource().getURI();
	//					MindPackage pack = ModelToProjectUtil.INSTANCE.getCurrentPackage(uri);
	//
	//					MindIdeCore.createITFTemplate(
	//							pack,
	//							itf.getSignature().getName,
	//							adlDefinition.getName(),
	//							null);
	//				}
	//			}
	//		});
	//	}


	// SSZ: Quick dirty fix migrating from 1.0 to 2.0 ; TODO: check what should be done !
	/*
		@Fix(MindcErrorCodes.CODE_KEY_ADL_3)
		public void removeTemplateParameter(final Issue issue, IssueResolutionAcceptor acceptor) {

				final int offset = issue.getOffset();
				final int length = issue.getLength();

				acceptor.accept(issue, "Mon quick fix xtext pour erreur mindc Invalid Template Parameter",
					"corriger erreur mindc en enlevant le parametre de template",null,
					new ISemanticModification() {

						public void apply(EObject adlDefinition,
								IModificationContext context) throws Exception {

						CompositeNode astRoot = NodeUtil.getRootNode(adlDefinition);

						AbstractNode astNode = NodeUtil.findLeafNodeAtOffset(astRoot, offset);
						EObject eObject = NodeUtil.getNearestSemanticObject(astNode);

						if (eObject != null && eObject instanceof ComponentReference) {
							ComponentReference reference = (ComponentReference) eObject;
							reference.unsetTemplatesList();
							//reference.setReferenceName("fixed");
						}

					}
				});


				acceptor.accept(issue, "Replace text",
						"replace text",null,
						new IModification() {

						public void apply(IModificationContext context) throws Exception {

							IXtextDocument document = context.getXtextDocument();
							document.replace(offset, length, "fixed text");					}
					});

		}*/

	@Fix(AdlValidator.UNKNOWN_RELATIVE_SOURCE_FILE)
	public void createSourceOrDataRelativeFile(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
				"Create source " + issue.getData()[0] + issue.getData()[1],
				"Create the associated source file " + issue.getData()[0] + issue.getData()[1],
						null,
						new ISemanticModification() {
			public void apply(EObject element,
					IModificationContext context) throws Exception {
				
				if (element instanceof FileC){

					FileC fileC = (FileC) element;

					// used to find parent ArchitectureDefinition
					EObject eObject = fileC;

					// Find host ArchitectureDefinition
					ArchitectureDefinition parentAdl = null;
					// parent adl is...?
					while (!(eObject instanceof ArchitectureDefinition))
						eObject = eObject.eContainer();
					parentAdl = (ArchitectureDefinition) eObject;

					// We need the package C template serialization (top comment)
					URI uri = parentAdl.eResource().getURI();
					MindPackage pack = ModelToProjectUtil.INSTANCE.getCurrentPackage(uri);

					// We need the IProject to know if we should use the C or C++ template
					MindLibOrProject libOrProj = pack.getRootsrc().getProject();
					IProject currProj = null;
					if (libOrProj instanceof MindProject)
						currProj = ((MindProject) libOrProj).getProject(); 

					// we remove the .c extension to be compliant with the MindIdeCore C template creator
					String sourceFileName = issue.getData()[1];
					int i = sourceFileName.lastIndexOf(".");
					
					String extension = sourceFileName.substring(i, sourceFileName.length());
					
					String sourceFileNameNoExt = sourceFileName.substring(0, i);

					if (CDTUtil.getCCNature(currProj))
						MindIdeCore.createCCTemplate(
								pack,
								parentAdl.getName(),
								sourceFileNameNoExt,
								extension,
								null);
					else
						MindIdeCore.createCTemplate(
								pack,
								parentAdl.getName(),
								sourceFileNameNoExt,
								extension,
								null);
					
					// Make the framework believe we made a modification so it updates the ADL editor
					IXtextDocument xtextDocument = context.getXtextDocument();
					xtextDocument.replace(issue.getOffset(), issue.getLength(), sourceFileName);
				}
			}
		});
	}
	
	@Fix(AdlValidator.UNKNOWN_ABSOLUTE_SOURCE_FILE)
	public void createSourceOrDataAbsoluteFile(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
				"Create source " + issue.getData()[0] + issue.getData()[1] + " in current source path",
				"Create the associated source file " + issue.getData()[0] + issue.getData()[1] + " in current source path",
						null,
						new ISemanticModification() {
			public void apply(EObject element,
					IModificationContext context) throws Exception {
				
				if (element instanceof FileC){

					FileC fileC = (FileC) element;

					// used to find parent ArchitectureDefinition
					EObject eObject = fileC;

					// Find host ArchitectureDefinition
					ArchitectureDefinition parentAdl = null;
					// parent adl is...?
					while (!(eObject instanceof ArchitectureDefinition))
						eObject = eObject.eContainer();
					parentAdl = (ArchitectureDefinition) eObject;

					// We need the package C template serialization (top comment)
					URI adlURI = parentAdl.eResource().getURI();
					MindPackage pack = ModelToProjectUtil.INSTANCE.getCurrentPackage(adlURI);

					// We need the IProject to know if we should use the C or C++ template
					MindLibOrProject libOrProj = pack.getRootsrc().getProject();
					IProject currProj = null;
					if (libOrProj instanceof MindProject)
						currProj = ((MindProject) libOrProj).getProject(); 

					// Create a IFile object from current source path with our absolute source/data fileC
					IFolder srcPathFolder = MindIdeCore.getResource(pack.getRootsrc());
					
					IFolder subFolder = srcPathFolder.getFolder(issue.getData()[0]);
					if (!subFolder.exists())
						subFolder.create(true, false, new NullProgressMonitor());
					
					// we remove the .c extension to be compliant with the MindIdeCore C template creator
					String sourceFileName = issue.getData()[1];
					int i = sourceFileName.lastIndexOf(".");
					
					String extension = sourceFileName.substring(i, sourceFileName.length());
					
					String sourceFileNameNoExt = sourceFileName.substring(0, i);

					if (CDTUtil.getCCNature(currProj))
						MindIdeCore.createCCTemplate(
								subFolder,
								sourceFileNameNoExt,
								parentAdl.getName(),
								extension,
								null);
					else
						MindIdeCore.createCTemplate(
								subFolder,
								sourceFileNameNoExt,
								parentAdl.getName(),
								extension,
								null);
					
					// Make the framework believe we made a modification so it updates the ADL editor
					IXtextDocument xtextDocument = context.getXtextDocument();
					xtextDocument.replace(issue.getOffset(), issue.getLength(), sourceFileName);
				}
			}
		});
	}
}
