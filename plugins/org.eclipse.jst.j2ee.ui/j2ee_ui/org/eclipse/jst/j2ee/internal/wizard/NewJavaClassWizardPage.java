/*******************************************************************************
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.jst.j2ee.internal.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.dialogs.TypeSelectionDialog;
import org.eclipse.jdt.internal.ui.viewsupport.IViewPartInputProvider;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jem.util.emf.workbench.ProjectUtilities;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.jst.j2ee.internal.common.operations.NewJavaClassDataModel;
import org.eclipse.jst.j2ee.internal.dialogs.TypeSearchEngine;
import org.eclipse.jst.j2ee.internal.plugin.J2EEUIMessages;
import org.eclipse.jst.j2ee.internal.plugin.J2EEUIPlugin;
import org.eclipse.jst.j2ee.internal.servertarget.ServerTargetHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.wst.common.componentcore.StructureEdit;
import org.eclipse.wst.common.componentcore.internal.ComponentResource;
import org.eclipse.wst.common.componentcore.internal.WorkbenchComponent;
import org.eclipse.wst.common.componentcore.internal.operation.ArtifactEditOperationDataModel;
import org.eclipse.wst.common.componentcore.internal.util.IModuleConstants;
import org.eclipse.wst.common.frameworks.internal.plugin.WTPCommonPlugin;
import org.eclipse.wst.common.frameworks.internal.ui.WTPWizardPage;

/**
 *
 */
public class NewJavaClassWizardPage extends WTPWizardPage {
	
	private Text folderText;
	private Button folderButton;
	private Text packageText;
	private Button packageButton;
	protected Text classText;
	private Text superText;
	private Button superButton;
	private Combo projectNameCombo;
	private Combo componentNameCombo;
	private String moduleType;
	private AnnotationsStandaloneGroup annotationsGroup = null;

	/**
	 * @param model
	 * @param pageName
	 */
	public NewJavaClassWizardPage(ArtifactEditOperationDataModel model, String pageName, String pageDesc, String pageTitle, String moduleType) {
		super(model, pageName);
		setDescription(pageDesc);
		this.setTitle(pageTitle);
		setPageComplete(false);
		this.moduleType = moduleType;
	}

	/**
	 * 
	 */
	protected String[] getValidationPropertyNames() {
		return new String[]{ArtifactEditOperationDataModel.PROJECT_NAME, 
					 		ArtifactEditOperationDataModel.MODULE_NAME, 
					 		NewJavaClassDataModel.SOURCE_FOLDER, 
					 		NewJavaClassDataModel.JAVA_PACKAGE, 
					 		NewJavaClassDataModel.CLASS_NAME, 
					 		NewJavaClassDataModel.SUPERCLASS};
	}

	/**
	 * 
	 */
	protected Composite createTopLevelComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		composite.setLayout(layout);
		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		data.widthHint = 300;
		composite.setLayoutData(data);

		addProjectNameGroup(composite);
		addComponentGroup(composite);
		addFolderGroup(composite);
		addSeperator(composite,3);
		addPackageGroup(composite);
		addClassnameGroup(composite);
		addSuperclassGroup(composite);
		
		createAnnotationsGroup(composite);
		folderText.setFocus();
		PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, getInfopopID());
		return composite;
	}
	
	/**
	 * Add component group to composite
	 */
	private void addComponentGroup(Composite composite) {
		Label componentLabel = new Label(composite, SWT.LEFT);
		componentLabel.setText(J2EEUIMessages.getResourceString(J2EEUIMessages.MODULE_NAME));
		componentLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		
		componentNameCombo = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = 300;
		data.horizontalSpan=1;
		componentNameCombo.setLayoutData(data);
		initializeComponentList();
		synchHelper.synchCombo(componentNameCombo, ArtifactEditOperationDataModel.MODULE_NAME, new Control[]{});
		new Label(composite, SWT.NONE);
	}
	
	private void initializeComponentList() {
		List componentList = new ArrayList();
		StructureEdit moduleCore = null;
		if (projectNameCombo.getText().length()==0)
			return;
		IProject project = ProjectUtilities.getProject(projectNameCombo.getText());
		try {
			moduleCore = StructureEdit.getStructureEditForRead(project);
			WorkbenchComponent[] components = moduleCore.findComponentsByType(moduleType);
			for (int j=0; j<components.length; j++) {
				if (!componentList.contains(components[j].getName()))
					componentList.add(components[j].getName());
			}
		} finally {
			if (moduleCore!=null)
				moduleCore.dispose();
		}
		String[] componentNames = new String[componentList.size()];
		for (int i=0; i<componentList.size(); i++) {
			componentNames[i] = (String) componentList.get(i);
		}
		model.setIgnorePropertyChanges(true);
		componentNameCombo.setItems(componentNames);
		model.setIgnorePropertyChanges(false);
		if (componentNames.length>0) {
			componentNameCombo.setText(componentNames[0]);
			model.setProperty(ArtifactEditOperationDataModel.MODULE_NAME,componentNameCombo.getText());
		}
	}
	
	/**
	 * Add project group
	 */
	private void addProjectNameGroup(Composite parent) {
		// set up project name label
		Label projectNameLabel = new Label(parent, SWT.NONE);
		projectNameLabel.setText(J2EEUIMessages.getResourceString(J2EEUIMessages.MODULES_DEPENDENCY_PAGE_TABLE_PROJECT)+ ":"); //$NON-NLS-1$
		GridData data = new GridData();
		projectNameLabel.setLayoutData(data);
		// set up project name entry field
		projectNameCombo = new Combo(parent, SWT.BORDER | SWT.READ_ONLY);
		data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = 300;
		data.horizontalSpan=1;
		projectNameCombo.setLayoutData(data);
		projectNameCombo.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				initializeComponentList();
			}
		});
		synchHelper.synchCombo(projectNameCombo, ArtifactEditOperationDataModel.PROJECT_NAME, new Control[]{});
		initializeProjectList();
		new Label(parent, SWT.NONE);
	}
	

	/**
	 * 
	 */
	private void initializeProjectList() {
		IProject[] workspaceProjects = ProjectUtilities.getAllProjects();
		List items = new ArrayList();
		for (int i=0; i<workspaceProjects.length; i++) {
			IProject project = workspaceProjects[i];
			try {
				if (project.isAccessible() && project.hasNature(IModuleConstants.MODULE_NATURE_ID)) {
					items.add(project.getName());
				}
			} catch (CoreException ce) {
				//Ignore
			}
		}
		String[] names = new String[items.size()];
		for (int i=0; i<items.size(); i++) {
			names[i]= (String) items.get(i);
		}
		
		projectNameCombo.setItems(names);
		try {
			IProject selectedProject = getSelectedProject();
			if (selectedProject!=null && selectedProject.isAccessible() && selectedProject.hasNature(IModuleConstants.MODULE_NATURE_ID)) {
				projectNameCombo.setText(selectedProject.getName());
				model.setProperty(ArtifactEditOperationDataModel.PROJECT_NAME,selectedProject.getName());
			}
		} catch (CoreException ce) {
			//Ignore
		}
		if ((projectNameCombo.getText()==null || projectNameCombo.getText().length()==0) && names.length>0) {
			projectNameCombo.setText(names[0]);
			model.setProperty(ArtifactEditOperationDataModel.PROJECT_NAME,names[0]);
		}	
		
	}
	
	/**
	 * Add folder group to composite
	 */
	private void addFolderGroup(Composite composite) {
		// folder
		Label folderLabel = new Label(composite, SWT.LEFT);
		folderLabel.setText(J2EEUIMessages.FOLDER_LABEL);
		folderLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		folderText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		folderText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		synchHelper.synchText(folderText, NewJavaClassDataModel.SOURCE_FOLDER, null);

		folderButton = new Button(composite, SWT.PUSH);
		folderButton.setText(J2EEUIMessages.BROWSE_BUTTON_LABEL);
		folderButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		folderButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				handleFolderButtonPressed();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				// Do nothing
			}
		});
	}
	
	/**
	 * Add package group to composite
	 */
	private void addPackageGroup(Composite composite) {
		// package
		Label packageLabel = new Label(composite, SWT.LEFT);
		packageLabel.setText(J2EEUIMessages.JAVA_PACKAGE_LABEL);
		packageLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		packageText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		packageText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		IPackageFragment packageFragment = getSelectedPackageFragment();
		if (packageFragment!=null && packageFragment.exists() ) {
			projectNameCombo.setText(packageFragment.getElementName());
			model.setProperty(NewJavaClassDataModel.JAVA_PACKAGE,packageFragment.getElementName());
		}
			
		synchHelper.synchText(packageText, NewJavaClassDataModel.JAVA_PACKAGE, null);

		packageButton = new Button(composite, SWT.PUSH);
		packageButton.setText(J2EEUIMessages.BROWSE_BUTTON_LABEL);
		packageButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		packageButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				handlePackageButtonPressed();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				// Do nothing
			}
		});
	}
	
	/**
	 * Add classname group to composite
	 */
	private void addClassnameGroup(Composite composite) {
		// class name
		Label classLabel = new Label(composite, SWT.LEFT);
		classLabel.setText(J2EEUIMessages.CLASS_NAME_LABEL);
		classLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		classText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		classText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		synchHelper.synchText(classText, NewJavaClassDataModel.CLASS_NAME, null);

		new Label(composite, SWT.LEFT);
	}
	
	/**
	 * Add seperator to composite
	 */
	protected void addSeperator(Composite composite, int horSpan) {
		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		data.widthHint = 300;
		// Separator label
		Label seperator = new Label(composite, SWT.HORIZONTAL | SWT.SEPARATOR);
		data = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		data.horizontalSpan = horSpan;
		seperator.setLayoutData(data);
	}
	
	/**
	 * Add superclass group to the composite
	 */
	private void addSuperclassGroup(Composite composite) {
		// superclass
		Label superLabel = new Label(composite, SWT.LEFT);
		superLabel.setText(J2EEUIMessages.SUPERCLASS_LABEL);
		superLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		superText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		superText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		synchHelper.synchText(superText, NewJavaClassDataModel.SUPERCLASS, null);

		superButton = new Button(composite, SWT.PUSH);
		superButton.setText(J2EEUIMessages.BROWSE_BUTTON_LABEL);
		superButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		superButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				handleSuperButtonPressed();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				// Do nothing
			}
		});
	}
	
	/**
	 * Browse for a new Destination Folder
	 */
	protected void handleFolderButtonPressed() {
		ISelectionStatusValidator validator = getContainerDialogSelectionValidator();
		ViewerFilter filter = getContainerDialogViewerFilter();
		ITreeContentProvider contentProvider = new WorkbenchContentProvider();
		ILabelProvider labelProvider = new DecoratingLabelProvider(new WorkbenchLabelProvider(), PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator());
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), labelProvider, contentProvider);
		dialog.setValidator(validator);
		dialog.setTitle(J2EEUIMessages.CONTAINER_SELECTION_DIALOG_TITLE);
		dialog.setMessage(J2EEUIMessages.CONTAINER_SELECTION_DIALOG_DESC);
		dialog.addFilter(filter);
		IProject project = ((NewJavaClassDataModel)model).getTargetProject();
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		
		if (project != null)
			dialog.setInitialSelection(project);
		if (dialog.open() == Window.OK) {
			Object element = dialog.getFirstResult();
			try {
				if (element instanceof IContainer) {
					IContainer container = (IContainer) element;
					folderText.setText(container.getFullPath().toString());
					// dealWithSelectedContainerResource(container);
				}
			} catch (Exception ex) {
				// Do nothing
			}

		}
	}

	protected void handlePackageButtonPressed() {
		IPackageFragmentRoot packRoot = ((NewJavaClassDataModel) model).getJavaPackageFragmentRoot();
		if (packRoot == null)
			return;
		IJavaElement[] packages = null;
		try {
			packages = packRoot.getChildren();
		} catch (JavaModelException e) {
			// Do nothing
		}
		if (packages == null)
			packages = new IJavaElement[0];

		ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT));
		dialog.setTitle(J2EEUIMessages.PACKAGE_SELECTION_DIALOG_TITLE);
		dialog.setMessage(J2EEUIMessages.PACKAGE_SELECTION_DIALOG_DESC);
		dialog.setEmptyListMessage(J2EEUIMessages.PACKAGE_SELECTION_DIALOG_MSG_NONE);
		dialog.setElements(packages);
		if (dialog.open() == Window.OK) {
			IPackageFragment fragment = (IPackageFragment) dialog.getFirstResult();
			if (fragment != null) {
				packageText.setText(fragment.getElementName());
			} else {
				packageText.setText(J2EEUIMessages.EMPTY_STRING);
			}
		}
	}

	protected void handleSuperButtonPressed() {
		getControl().setCursor(new Cursor(getShell().getDisplay(), SWT.CURSOR_WAIT));
		IPackageFragmentRoot packRoot = ((NewJavaClassDataModel) model).getJavaPackageFragmentRoot();
		if (packRoot == null)
			return;

		// this eliminates the non-exported classpath entries
		final IJavaSearchScope scope = TypeSearchEngine.createJavaSearchScopeForAProject(packRoot.getJavaProject(), true, true);

		// This includes all entries on the classpath. This behavior is identical
		// to the Super Class Browse Button on the Create new Java Class Wizard
		// final IJavaSearchScope scope = SearchEngine.createJavaSearchScope(new IJavaElement[] {root.getJavaProject()} );
		TypeSelectionDialog dialog = new TypeSelectionDialog(getShell(), getWizard().getContainer(), IJavaSearchConstants.CLASS, scope);
		dialog.setTitle(J2EEUIMessages.SUPERCLASS_SELECTION_DIALOG_TITLE);
		dialog.setMessage(J2EEUIMessages.SUPERCLASS_SELECTION_DIALOG_DESC);

		if (dialog.open() == Window.OK) {
			IType type = (IType) dialog.getFirstResult();
			String superclassFullPath = J2EEUIMessages.EMPTY_STRING;
			if (type != null) {
				superclassFullPath = type.getFullyQualifiedName();
			}
			superText.setText(superclassFullPath);
			getControl().setCursor(null);
			return;
		}
		getControl().setCursor(null);
	}

	/**
	 * Returns a new instance of the Selection validator for the Container
	 * Selection Dialog This method can be extended by subclasses, as it does
	 * some basic validation.
	 */
	protected ISelectionStatusValidator getContainerDialogSelectionValidator() {
		return new ISelectionStatusValidator() {
			public IStatus validate(Object[] selection) {
				if (selection !=null && selection[0] != null && !(selection[0] instanceof IProject))
					return WTPCommonPlugin.OK_STATUS;
				return WTPCommonPlugin.createErrorStatus(J2EEUIMessages.CONTAINER_SELECTION_DIALOG_VALIDATOR_MESG);
			}
		};
	}
	
	/**
	 * Returns a new instance of the Selection Listner for the Container
	 * Selection Dialog
	 */
	protected ViewerFilter getContainerDialogViewerFilter() {
		return new ViewerFilter() {
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (element instanceof IProject) {
					IProject project = (IProject) element;
					return ServerTargetHelper.hasJavaNature(project) && project.getName().equals(model.getProperty(ArtifactEditOperationDataModel.PROJECT_NAME));
				} else if (element instanceof IFolder) {
					IFolder folder = (IFolder) element;
					// only show source folders
					ArtifactEditOperationDataModel dataModel = ((ArtifactEditOperationDataModel)model);
					StructureEdit moduleCore = null;
					try {
						moduleCore = StructureEdit.getStructureEditForRead(dataModel.getTargetProject());
						ComponentResource[] sourceContainers = moduleCore.getSourceContainers(dataModel.getWorkbenchModule());
						//TODO this api does not work yet
						if (sourceContainers==null)
							return true;
						for (int i=0; i<sourceContainers.length; i++) {
							if (sourceContainers[i].getSourcePath().toString().equals(folder.getFullPath().toString()))
								return true;
						}
					} finally {
						if (moduleCore!=null)
							moduleCore.dispose();
					}
				}
				return false;
			}
		};
	}
	
	/**
	 * Create annotations group and set default enablement
	 */
	private void createAnnotationsGroup(Composite parent) {
		annotationsGroup = new AnnotationsStandaloneGroup(parent, model, IModuleConstants.JST_EJB_MODULE.equals(moduleType), IModuleConstants.JST_WEB_MODULE.equals(moduleType));
		IProject project = null;
		project = ((NewJavaClassDataModel)model).getTargetProject();
		annotationsGroup.setEnablement(project);
		//annotationsGroup.setUseAnnotations(true);
	}
	
	/**
	 * @return
	 */
	private IProject getSelectedProject() {
		IWorkbenchWindow window = Workbench.getInstance().getActiveWorkbenchWindow();
		if (window == null)
			return null;
		ISelection selection = window.getSelectionService().getSelection();
		if (selection == null)
			return null;
		//StructuredSelection stucturedSelection = (StructuredSelection) selection;
		IJavaElement element = getInitialJavaElement(selection);
		if (element != null)
			return (IProject) element.getJavaProject().getProject();
		return null;
	}
	/**
	 * @return
	 */
	private IPackageFragment getSelectedPackageFragment() {
		IWorkbenchWindow window = Workbench.getInstance().getActiveWorkbenchWindow();
		if (window == null)
			return null;
		ISelection selection = window.getSelectionService().getSelection();
		if (selection == null)
			return null;
		//StructuredSelection stucturedSelection = (StructuredSelection) selection;
		IJavaElement element = getInitialJavaElement(selection);
		if (element != null){
			if( element.getElementType() == IJavaElement.PACKAGE_FRAGMENT)
				return (IPackageFragment) element;
			else if( element.getElementType() == IJavaElement.TYPE ){
				return ((IType)element).getPackageFragment();
			}
		}
		return null;
	}
	
	/**
	 * Utility method to inspect a selection to find a Java element. 
	 * 
	 * @param selection the selection to be inspected
	 * @return a Java element to be used as the initial selection, or <code>null</code>,
	 * if no Java element exists in the given selection
	 */
	protected IJavaElement getInitialJavaElement(ISelection selection) {
		IJavaElement jelem= null;
		if (selection != null && !selection.isEmpty()  && selection instanceof IStructuredSelection ) {
			Object selectedElement= ((IStructuredSelection)selection).getFirstElement();
			if (selectedElement instanceof IAdaptable) {
				IAdaptable adaptable= (IAdaptable) selectedElement;			
				
				jelem= (IJavaElement) adaptable.getAdapter(IJavaElement.class);
				if (jelem == null) {
					IResource resource= (IResource) adaptable.getAdapter(IResource.class);
					if (resource != null && resource.getType() != IResource.ROOT) {
						while (jelem == null && resource.getType() != IResource.PROJECT) {
							resource= resource.getParent();
							jelem= (IJavaElement) resource.getAdapter(IJavaElement.class);
						}
						if (jelem == null) {
							jelem= JavaCore.create(resource); // java project
						}
					}
				}
			}
		}
		if (jelem == null) {
			IWorkbenchPart part= JavaPlugin.getActivePage().getActivePart();
			if (part instanceof ContentOutline) {
				part= JavaPlugin.getActivePage().getActiveEditor();
			}
			
			if (part instanceof IViewPartInputProvider) {
				Object elem= ((IViewPartInputProvider)part).getViewPartInput();
				if (elem instanceof IJavaElement) {
					jelem= (IJavaElement) elem;
				}
			}
		}

		if (jelem == null || jelem.getElementType() == IJavaElement.JAVA_MODEL) {
			try {
				IJavaProject[] projects= JavaCore.create(getWorkspaceRoot()).getJavaProjects();
				if (projects.length == 1) {
					jelem= projects[0];
				}
			} catch (JavaModelException e) {
				JavaPlugin.log(e);
			}
		}
		return jelem;
	}
	
	protected IWorkspaceRoot getWorkspaceRoot() {
	        return ResourcesPlugin.getWorkspace().getRoot();
	}
	 
	private IWorkbenchPage internalGetActivePage() {
		IWorkbenchWindow window= J2EEUIPlugin.getActiveWorkbenchWindow();
		if (window == null)
			return null;
		return J2EEUIPlugin.getActiveWorkbenchWindow().getActivePage();
	}
		
}