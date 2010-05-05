package org.ow2.mindEd.ide.ui.test;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.junit.Test;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.test.TestMindProject;

import fr.imag.adele.graphictests.gtmenu.*;
import fr.imag.adele.graphictests.gtmenu.GTMenu;
import fr.imag.adele.graphictests.gttree.GTTreePath;
import fr.imag.adele.graphictests.gtworkbench_part.*;
import fr.imag.adele.graphictests.test.*;

/**
 * Test Fractal Mind Wizard
 */
public class TestCreateMindproject extends GTTestCase {
	
	
	private static final String MIND_ADL_COMPONENT_MENU = "Mind ADL Component";
	public static final String MIND_PROJECT_NODE = "Mind Project ";
	public static final String FRACTAL_MIND_PROJECT = "Fractal MIND Project";
	public static final String MIND_NAVIGATOR = "Mind Navigator";
	public static final String MIND_REPO_WS = "Mind Repo ws";
	static private String projectName;

	/**
	 * Selects CADSEg in the launcher, and closes useless views. 
	 * 
	 * @throws Exception the exception
	 */
	@Test
	public void test_closewelomeview() throws Exception {
		//welcomeView.close();
	}
	
	/**
	 * Test Fractal Mind Wizard in the default location.
	 * @throws Exception
	 */
	
	@Test
	public void testCreateMindProject() throws Exception {
		String name = "Test" ; //call a generator which compute a new name
		GTMenu.clickItem("File", "New", "Other...");
		GTShell shell = new GTShell("New");
		shell.findTree().selectNode("Mind",FRACTAL_MIND_PROJECT);
		shell.findButton("Next >").click();
		shell.findTextWithLabel("Project name:").typeText(name);
		shell.close();
		
		TestMindProject.assertMindProject(name);		
	}

	
	
	/**
	 * Select mind navigator.
	 * @throws Exception
	 */
	
	@Test
	public void testSelectMindNavigatorAndCreateProject() throws Exception {
		GTView mindView = new GTView(MIND_NAVIGATOR);
		mindView.show();
		
		projectName = "Test2_"+System.currentTimeMillis() ; //call a generator which compute a new name
		mindView.contextMenu(new GTTreePath(MIND_REPO_WS), FRACTAL_MIND_PROJECT).click();
		GTShell shell = new GTShell("New "+FRACTAL_MIND_PROJECT);
		shell.findTextWithLabel("Project name:").typeText(projectName);
		shell.close();
		
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName);
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "Mind path");
		
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		assertTrue(p.exists());
		IFolder srcFolder = p.getFolder("src");
		assertTrue(srcFolder.exists());
		
		// create a package
		GTTreePath node = new GTTreePath(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.contextMenu(node, "Mind package").click();
		shell = new GTShell("New "+"MIND Package");
		final String packageName = "toto";
		shell.findTextWithLabel("Package:").typeText(packageName);
		shell.close();
		
		IFolder totoPackageFolder = srcFolder.getFolder(packageName);
		assertTrue(totoPackageFolder.exists());
		
		node = node.concat(packageName);
		mindView.contextMenu(node, MIND_ADL_COMPONENT_MENU).click();
		
		
		// create a component
		shell = new GTShell("New "+"Fractal MIND Component");
	//	shell.findComboBoxWithLabel("Component kind:").setText("COMPOSITE");
		shell.bot().ccomboBoxWithLabel("Component kind:").setSelection("COMPOSITE");
		shell.findTextWithLabel("Component name:").typeText("CompA");
		shell.close();
		
		IFile compAFile = totoPackageFolder.getFile("CompA.adl");
		assertTrue(compAFile.exists());
		IFile compAFile_Diagram = totoPackageFolder.getFile("CompA.adl"+MindIdeCore.DIAGRAM_EXT);
		assertTrue(compAFile_Diagram.exists());
		
		
		
	}
	
	/**
	 * Select mind navigator.
	 * @throws Exception
	 */
	
	@Test
	public void testSelectMindNavigatorAndCreateProject2() throws Exception {
		GTView mindView = new GTView(MIND_NAVIGATOR);
		mindView.show();
		
		GTTreePath rootNode = new GTTreePath(MIND_REPO_WS);
		
		projectName = "Test2_"+System.currentTimeMillis() ; //call a generator which compute a new name
		mindView.contextMenu(rootNode, FRACTAL_MIND_PROJECT).click();
		GTShell shell = new GTShell("New "+FRACTAL_MIND_PROJECT);
		shell.findTextWithLabel("Project name:").typeText(projectName);
		shell.close();
		
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName);
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.findTree().selectNode(MIND_REPO_WS, MIND_PROJECT_NODE+projectName, "Mind path");
		
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		assertTrue(p.exists());
		IFolder srcFolder = p.getFolder("src");
		assertTrue(srcFolder.exists());
		
		// create a package 
		GTTreePath rootSrcNode = rootNode.concat(MIND_PROJECT_NODE+projectName, "/"+projectName+"/src");
		mindView.contextMenu(rootSrcNode, "Mind package").click();
		shell = new GTShell("New "+"MIND Package");
		final String packageName = "toto";
		shell.findTextWithLabel("Package:").typeText(packageName);
		shell.close();
		
		IFolder totoPackageFolder = srcFolder.getFolder(packageName);
		assertTrue(totoPackageFolder.exists());
		
		GTTreePath packageNode = rootSrcNode.concat(packageName);
		mindView.contextMenu(packageNode, MIND_ADL_COMPONENT_MENU).click();
		
		
		// create a component
		shell = new GTShell("New "+"Fractal MIND Component");
		shell.bot().ccomboBoxWithLabel("Component kind:").setSelection("PRIMITIF");
		shell.findTextWithLabel("Component name:").typeText("CompA");
		shell.close();
		
		IFile compAFile = totoPackageFolder.getFile("CompA.adl");
		assertTrue(compAFile.exists());
		IFile compAFile_Diagram = totoPackageFolder.getFile("CompA.adl"+MindIdeCore.DIAGRAM_EXT);
		assertTrue(compAFile_Diagram.exists());
	}
	
	
	
	
	
}
