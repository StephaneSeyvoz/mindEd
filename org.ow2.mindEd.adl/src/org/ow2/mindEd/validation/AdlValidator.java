package org.ow2.mindEd.validation;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.validation.Check;
import org.ow2.mindEd.adl.AdlFile;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.CompositeDefinition;
import org.ow2.mindEd.adl.CompositeElement;
import org.ow2.mindEd.adl.HostedInterfaceDefinition;
import org.ow2.mindEd.adl.ImplementationDefinition;
import org.ow2.mindEd.adl.PrimitiveDefinition;
import org.ow2.mindEd.adl.PrimitiveElement;
import org.ow2.mindEd.adl.SubComponentDefinition;
import org.ow2.mindEd.adl.TypeDefinition;
import org.ow2.mindEd.adl.impl.AdlFileImpl;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindPathKind;
import org.ow2.mindEd.ide.model.MindProject;

import com.google.inject.Inject;


public class AdlValidator extends AbstractAdlValidator {

	// Quick fix codes
	public static final String UNKNOWN_IMPORT = "org.ow2.fractal.mind.xtext.validation.unknown_import";
	public static final String UNKNOWN_TEMPLATE_SPECIFIER_TYPE = "org.ow2.fractal.mind.xtext.validation.unknown_template_specifier_type";
	public static final String DUPLICATE_DEFINITION_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_definition_name";
	public static final String DUPLICATE_FORMAL_ARGUMENT_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_formal_argument_name";
	public static final String DUPLICATE_TEMPLATE_SPECIFIER_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_template_specifier_name";
	public static final String DUPLICATE_INTERFACE_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_interface_name";
	public static final String UNKNOWN_INTERFACE = "org.ow2.fractal.mind.xtext.validation.unknown_interface";
	public static final String UNKNOWN_RELATIVE_SOURCE_FILE = "org.ow2.fractal.mind.xtext.validation.unknown_relative_source";
	public static final String UNKNOWN_ABSOLUTE_SOURCE_FILE = "org.ow2.fractal.mind.xtext.validation.unknown_absolute_source";

	public final static String WRONG_NAME = "org.ow2.mindEd.adl.editor.textual.validation.wrong_name";
	public final static String NOT_IN_SRC_PATH = "org.ow2.mindEd.adl.editor.textual.validation.not_in_src_path";

	@Inject
	IContainer.Manager containerManager;

	@Inject
	ResourceDescriptionsProvider resourceDescriptionsProvider;

	@Check
	public void checkAdlSimpleName(ArchitectureDefinition archDef) {

		// Protect method
		if (archDef instanceof SubComponentDefinition)
			return;

		String simpleName = archDef.getName();

		// anonymous component
		if (simpleName == null)
			return;

		String expectedName = AdlValidator.getExpectedComponentName(archDef); 

		if (expectedName == null) {
			warning("definition not in source path",
					AdlPackage.Literals.TYPE_REFERENCE__NAME,
					AdlPackage.ARCHITECTURE_DEFINITION,
					AdlValidator.NOT_IN_SRC_PATH);
			return;
		} else if (! simpleName.equals(expectedName)) {
			warning("definition should be named : " + expectedName,
					AdlPackage.Literals.TYPE_REFERENCE__NAME,
					AdlPackage.ARCHITECTURE_DEFINITION,
					AdlValidator.WRONG_NAME);
			return;
		}

	}	

	// Utils
	public static String getExpectedComponentName(ArchitectureDefinition archDef){

		if (!(archDef.eContainer() instanceof AdlFile))
			return null;

		AdlFileImpl adlFile = (AdlFileImpl) archDef.eContainer();
		URI uri = adlFile.eDirectResource().getURI();

		String expectedName = null;

		// TODO: Clean this ; to do this, we must disable Xtext's parsing/handling of the files that AREN'T in our path entries !
		try {
			expectedName = ModelToProjectUtil.INSTANCE.getCurrentFQN(uri);
		} catch (IllegalArgumentException e) {
			expectedName = null;  
		}
		return expectedName;
	}

	/**
	 * Behavior inspired by 
	 * http://www.eclipse.org/forums/index.php/mv/msg/261440/754503/#msg_754503
	 * and
	 * http://www.eclipse.org/forums/index.php/mv/msg/267004/766678/
	 * 
	 * TODO: FIXME !!!!! DOESNT WORK WELL
	 * RE-DO THE SAME AS THE SECOND LINK !
	 */
	@Check
	public void checkDefinitionNameIsUnique(ArchitectureDefinition archDef) {

		//System.out.println("[SSZ Dirty Debug] FractalJavaValidator#checkDefinitionNameIsUnique - Base archDef: " + archDef.getName());

		IResourceDescriptions resourceDescriptions = resourceDescriptionsProvider.getResourceDescriptions(archDef.eResource());
		IResourceDescription resourceDescription = resourceDescriptions.getResourceDescription(archDef.eResource().getURI());
		for (IContainer c : containerManager.getVisibleContainers(resourceDescription, resourceDescriptions)) {
			for (IEObjectDescription od : c.getExportedObjectsByType(AdlPackage.Literals.ARCHITECTURE_DEFINITION)) {
				//System.out.println("[SSZ Dirty Debug] FractalJavaValidator#checkDefinitionNameIsUnique - Current EODesc QN: " + od.getQualifiedName());
				if (od.getQualifiedName().toString().equals(archDef.getName())) {
					if (!od.getEObjectURI().trimFragment().equals(archDef.eResource().getURI()))
						error("duplicate definition in file " + od.getEObjectURI().trimFragment().toPlatformString(true), AdlPackage.Literals.TYPE_REFERENCE__NAME, AdlValidator.DUPLICATE_DEFINITION_NAME);
				}
			}
		}
	}

	@Check
	public void checkSubComponentNameIsUnique(SubComponentDefinition subCompDef) {
		CompositeDefinition parentCompositeDef = (CompositeDefinition) subCompDef.eContainer();

		// TODO: handle super types and inheritance !
		EList<CompositeElement> elements = parentCompositeDef.getElements();
		for(CompositeElement element: elements) {
			if ((element != subCompDef) && (element instanceof SubComponentDefinition))
				if (subCompDef.getName().equals(((SubComponentDefinition) element).getName())) {
					error("Sub-component names have to be unique",
							AdlPackage.Literals.SUB_COMPONENT_DEFINITION__NAME);
					return;
				}
		}
	}

	@Check
	public void checkHostedInterfaceIsUnique(HostedInterfaceDefinition itfDef) {

		EObject container = itfDef.eContainer();

		if (container instanceof PrimitiveDefinition)
			checkHostedInterfaceIsUniqueInPrimitive((PrimitiveDefinition) container, itfDef);
		else if (container instanceof CompositeDefinition)
			checkHostedInterfaceIsUniqueInComposite((CompositeDefinition) container, itfDef);
		else if (container instanceof TypeDefinition)
			checkHostedInterfaceIsUniqueInType((TypeDefinition) container, itfDef);
		// else... nothing
	}

// Disabled temporarily according to latest grammar evolutions
// TODO: FIXME: RESTORE
//	/**
//	 * Checks if the specified source file exists at the indicated place.
//	 * Inspired from navigation class @see FractalHyperlink.
//	 * 
//	 * @param fileC The Xtext FileC element following the "source" keyword.
//	 */
//	@Check
//	public void checkSourceFileExists(ImplementationDefinition implDef) {
//
//		String cFile = implDef.getCFile();
//		int lastSlashIndex = cFile.lastIndexOf("/");
//		
//
//		// File info
//		String fileName = cFile.substring(lastSlashIndex + 1);
//		String directory = cFile.substring(0, lastSlashIndex);
//		IFile file = null;
//
//		// No directory
//		if (directory == null || directory.equals("")){
//			// Find the file according to the host component package
//			// Here the resource is the ADL from where the link was called
//			MindPackage pack = ModelToProjectUtil.INSTANCE.getCurrentPackage(resource.getURI());
//			if (pack != null) {
//				IFolder f = MindIdeCore.getResource(pack);
//				file = f.getFile(fileName);
//			}
//		} else {
//			// Absolute: we need to search from the root of the source-path for every source-path entry
//			if (directory.startsWith("/")) {
//				//					uri = URI.createPlatformResourceURI(f.getPath(), true);
//				//					MindFile mf = ModelToProjectUtil.INSTANCE.getCurrentMindFile(uri);
//
//				ArchitectureDefinition parentAdl = null;
//				// parent adl is...?
//				while (!(eObject instanceof ArchitectureDefinition))
//					eObject = eObject.eContainer();
//				parentAdl = (ArchitectureDefinition) eObject;
//
//				MindProject adlHostProject = ModelToProjectUtil.INSTANCE.getMindProject(parentAdl.eResource().getURI());
//
//				String projectPath = adlHostProject.getProject().getFullPath().toString();
//
//				// for all path entries, try to locate the C file
//				EList<MindPathEntry> path = adlHostProject.getMindpathentries();
//				URI cFileURI = null;
//				for (MindPathEntry currentPath : path)
//					if (currentPath.getEntryKind() == MindPathKind.SOURCE) {
//
//						// let's use some defensive programming: it should always be false anyway, BUT... better check.
//						if (!currentPath.getName().startsWith("/" + adlHostProject.getName() + "/"))
//							continue;
//
//						// path entries names are in such format: /project_name/currentPath, so we remove the first substring "/project_name", and keep "/currPath"
//						String shortCurrPath = currentPath.getName().substring(adlHostProject.getName().length() + 1);
//						cFileURI = URI.createPlatformResourceURI(projectPath + shortCurrPath + directory + fileName, true);
//
//						// check file existence
//						file = ModelToProjectUtil.INSTANCE.getIFile(cFileURI);
//						if ((file != null) && file.exists()) // found !
//							break;
//					}
//			} else {
//				// Relative
//
//				// handle host definition path for resource resolution
//				File f = new File(directory, fileName);
//
//				// Find the file according to the host component package  
//				// Here the resource is the ADL from where the link was called
//				MindPackage hostComponentPackage = ModelToProjectUtil.INSTANCE.getCurrentPackage(resource.getURI());
//				if (hostComponentPackage != null) {
//					IFolder compFolder = MindIdeCore.getResource(hostComponentPackage);
//
//					// Don't forget we want to locate the complete folder "container" : add the "/"
//					URI compFolderURI = URI.createPlatformResourceURI(compFolder.getFullPath().toString() + "/", true);
//
//					URI currentRelativeURI = URI.createFileURI(f.getPath());
//					URI resolvedFinalURI = currentRelativeURI.resolve(compFolderURI);
//
//					file = ModelToProjectUtil.INSTANCE.getIFile(resolvedFinalURI);
//				}
//			}
//		}
//
//		if (directory != null && directory.startsWith("/")) {
//			// Get the file URI
//			// If file doesn't exist, raise an error with a code so we can attach a quickfix
//			if (file == null || !(file.exists())) {
//				error("Source file with absolute path does not exist",
//						AdlPackage.Literals.FILE_C__NAME,
//						AdlValidator.UNKNOWN_ABSOLUTE_SOURCE_FILE,
//						(fileC.getDirectory() == null ? "" : fileC.getDirectory()),
//						(fileC.getName() == null ? "" : fileC.getName()));
//				return;
//			}
//
//		} else {
//			if (file == null || !(file.exists())) {
//				error("Source file does not exist",
//						AdlPackage.Literals.FILE_C__NAME,
//						AdlValidator.UNKNOWN_RELATIVE_SOURCE_FILE,
//						(fileC.getDirectory() == null ? "" : fileC.getDirectory()),
//						(fileC.getName() == null ? "" : fileC.getName()));
//				return;
//			}
//		}
//
//
//	}

	private void checkHostedInterfaceIsUniqueInPrimitive(PrimitiveDefinition compDef, HostedInterfaceDefinition itfDef) {
		// TODO: handle super types and inheritance !
		EList<PrimitiveElement> elements = compDef.getElements();
		for(PrimitiveElement element: elements) {
			if ((element != itfDef) && (element instanceof HostedInterfaceDefinition))
				if (itfDef.getName().equals(((HostedInterfaceDefinition) element).getName())) {
					error("Interface names have to be unique",
							AdlPackage.Literals.HOSTED_INTERFACE_DEFINITION__NAME);
					return;
				}
		}
	}

	private void checkHostedInterfaceIsUniqueInComposite(CompositeDefinition compDef, HostedInterfaceDefinition itfDef) {
		// TODO: handle super types and inheritance !
		EList<CompositeElement> elements = compDef.getElements();
		for(CompositeElement element: elements) {
			if ((element != itfDef) && (element instanceof HostedInterfaceDefinition))
				if (itfDef.getName().equals(((HostedInterfaceDefinition) element).getName())) {
					error("Interface names have to be unique",
							AdlPackage.Literals.HOSTED_INTERFACE_DEFINITION__NAME);
					return;
				}
		}
	}

	private void checkHostedInterfaceIsUniqueInType(TypeDefinition compDef, HostedInterfaceDefinition itfDef) {
		// TODO: handle super types and inheritance !
		EList<HostedInterfaceDefinition> elements = compDef.getElements();
		for(HostedInterfaceDefinition element: elements) {
			if (element != itfDef)
				if (itfDef.getName().equals(element.getName())) {
					error("Interface names have to be unique",
							AdlPackage.Literals.HOSTED_INTERFACE_DEFINITION__NAME);
					return;
				}
		}
	}

	/**
	 * Check Cycles in definition references
	 */
	@Check
	public void checkCyclesInDefinitionReferences(SubComponentDefinition subCompDef) {
		// Get the parent
		EObject container = subCompDef.eContainer();
		while (!(container instanceof CompositeDefinition))
			container = container.eContainer();
		if (subCompDef.getType() instanceof CompositeDefinition) {
			if (((CompositeDefinition) subCompDef.getType()).equals((CompositeDefinition) container))
				error("Cycle in definition references", AdlPackage.Literals.SUB_COMPONENT_DEFINITION__TYPE);
		}

	}

}
