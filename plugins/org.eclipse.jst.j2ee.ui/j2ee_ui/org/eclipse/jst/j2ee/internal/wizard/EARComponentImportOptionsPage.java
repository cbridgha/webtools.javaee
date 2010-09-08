/*******************************************************************************
 * Copyright (c) 2003, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 * Created on Dec 8, 2003
 * 
 * To change the template for this generated file go to Window>Preferences>Java>Code Generation>Code and Comments
 */
package org.eclipse.jst.j2ee.internal.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jst.j2ee.datamodel.properties.IEARComponentImportDataModelProperties;
import org.eclipse.jst.j2ee.datamodel.properties.IJ2EEComponentImportDataModelProperties;
import org.eclipse.jst.j2ee.internal.actions.IJ2EEUIContextIds;
import org.eclipse.jst.j2ee.internal.archive.ArchiveWrapper;
import org.eclipse.jst.j2ee.internal.plugin.J2EEUIMessages;
import org.eclipse.jst.j2ee.internal.plugin.J2EEUIPlugin;
import org.eclipse.jst.j2ee.internal.plugin.J2EEUIPluginIcons;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wst.common.frameworks.datamodel.DataModelEvent;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelListener;
import org.eclipse.wst.common.frameworks.internal.datamodel.ui.DataModelWizardPage;

/**
 * @author cbridgha
 * 
 * To change the template for this generated type comment go to Window>Preferences>Java>Code
 * Generation>Code and Comments
 */
public class EARComponentImportOptionsPage extends DataModelWizardPage {
	private Button deselectAllButton;
	private Button selectAllButton;
	private Label moduleProjectLocationLabel;
	protected Button browseButton;
	protected Button useAlternateRootBtn;
	protected Text systemDefaultText;
	protected ArchiveWrapper aWrapper;
	public CheckboxTableViewer availableJARsViewer;
	public boolean utilJarSelectionChanged = false;

	/**
	 * @param model
	 * @param pageName
	 */
	public EARComponentImportOptionsPage(IDataModel model, String pageName) {
		super(model, pageName);
		setTitle(J2EEUIMessages.getResourceString(J2EEUIMessages.EAR_IMPORT_MAIN_PG_TITLE));
		setDescription(J2EEUIMessages.getResourceString(J2EEUIMessages.EAR_IMPORT_MAIN_PG_DESC));
		setImageDescriptor(J2EEUIPlugin.getDefault().getImageDescriptor(J2EEUIPluginIcons.EAR_IMPORT_WIZARD_BANNER));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.common.frameworks.internal.ui.wizard.WTPWizardPage#createTopLevelComposite(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Composite createTopLevelComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		setInfopopID(IJ2EEUIContextIds.IMPORT_EAR_WIZARD_P2);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		createJARsComposite(composite);
		createProjectRootComposite(composite);

		return composite;
	}

	/*
	 * Updates the enable state of the all buttons
	 */
	protected void updateButtonEnablements() {
		utilJarSelectionChanged = true;
	}

	protected void createAvailableJarsList(Composite listGroup) {
		availableJARsViewer = CheckboxTableViewer.newCheckList(listGroup, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gData = new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
		gData.widthHint = 200;
		gData.heightHint = 80;
		availableJARsViewer.getControl().setLayoutData(gData);
		AvailableUtilJarsAndWebLibProvider availableUtilJARsProvider = new AvailableUtilJarsAndWebLibProvider();
		availableJARsViewer.setContentProvider(availableUtilJARsProvider);
		availableJARsViewer.setLabelProvider(availableUtilJARsProvider);
		availableJARsViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				availableJARCheckStateChanged(event);
			}
		});
		availableJARsViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				updateButtonEnablements();
			}
		});
		TableLayout tableLayout = new TableLayout();
		availableJARsViewer.getTable().setLayout(tableLayout);
		availableJARsViewer.getTable().setHeaderVisible(false);
		availableJARsViewer.getTable().setLinesVisible(false);

		model.addListener(new IDataModelListener() {
			public void propertyChanged(DataModelEvent event) {
				if (event.getPropertyName().equals(IEARComponentImportDataModelProperties.UTILITY_LIST)) {
					availableJARsViewer.setCheckedElements(((List) model.getProperty(IEARComponentImportDataModelProperties.UTILITY_LIST)).toArray());
				}
			}
		});
	}

	private void handleDeselectAllButtonPressed() {
		ArrayList emptySelection = new ArrayList(2);
		model.setProperty(IEARComponentImportDataModelProperties.UTILITY_LIST, emptySelection);
		validatePage();
	}

	private void handleSelectAllButtonPressed() {
		ArrayList allSelection = new ArrayList(2);
		Object selection = null;
		for (int i = 0; (null != (selection = availableJARsViewer.getElementAt(i))); i++) {
			allSelection.add(selection);
		}
		model.setProperty(IEARComponentImportDataModelProperties.UTILITY_LIST, allSelection);
		validatePage();
	}

	/**
	 * Open an appropriate directory browser
	 */
	protected void handleBrowseButtonPressed() {
		DirectoryDialog dialog = new DirectoryDialog(browseButton.getShell());
		dialog.setMessage(J2EEUIMessages.getResourceString(J2EEUIMessages.SELECT_DIRECTORY_DLG));

		String dirName = getBrowseStartLocation();

		if (!isNullOrEmpty(dirName)) {
			File path = new File(dirName);
			if (path.exists())
				dialog.setFilterPath(dirName);
		}

		String selectedDirectory = dialog.open();
		if (selectedDirectory != null)
			systemDefaultText.setText(selectedDirectory);

	}

	protected String getBrowseStartLocation() {
		String text = systemDefaultText.getText();
		return text;
	}

	protected void createButtonsGroup(Composite parent) {
		Composite buttonGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		buttonGroup.setLayout(layout);
		buttonGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		selectAllButton = new Button(buttonGroup, SWT.PUSH);
		selectAllButton.setText(J2EEUIMessages.getResourceString(J2EEUIMessages.EAR_IMPORT_SELECT_ALL_UTIL_BUTTON));
		GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL);
		gd.widthHint = 160;
		selectAllButton.setLayoutData(gd);
		selectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleSelectAllButtonPressed();
			}
		});

		deselectAllButton = new Button(buttonGroup, SWT.PUSH);
		deselectAllButton.setText(J2EEUIMessages.getResourceString(J2EEUIMessages.EAR_IMPORT_DESELECT_ALL_UTIL_BUTTON));
		gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL);
		gd.widthHint = 160;
		deselectAllButton.setLayoutData(gd);
		deselectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleDeselectAllButtonPressed();
			}
		});
	}

	protected void createJARsComposite(Composite parent) {
		Group group = new Group(parent, SWT.NULL);
		group.setText(J2EEUIMessages.getResourceString(J2EEUIMessages.EAR_IMPORT_JARS_GROUP));
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_BOTH));

		Label description = new Label(group, SWT.NULL);
		description.setText(J2EEUIMessages.getResourceString(J2EEUIMessages.EAR_IMPORT_SELECT_UTIL_JARS_TO_BE_PROJECTS));
		GridData gd2 = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gd2.horizontalSpan = 3;
		description.setLayoutData(gd2);

		// create jars check box viewer
		createAvailableJarsList(group);
		createButtonsGroup(group);
	}

	protected void createProjectRootComposite(Composite parent) {
		Group group = new Group(parent, SWT.NULL);
		group.setText(J2EEUIMessages.getResourceString(J2EEUIMessages.PROJECT_LOCATIONS_GROUP));
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Label description = new Label(group, SWT.NULL);
		description.setText(J2EEUIMessages.getResourceString(J2EEUIMessages.NEW_PROJECT_GROUP_DESCRIPTION));
		GridData gd2 = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gd2.horizontalSpan = 3;
		description.setLayoutData(gd2);

		moduleProjectLocationLabel = new Label(group, SWT.NULL);
		moduleProjectLocationLabel.setText(J2EEUIMessages.getResourceString(J2EEUIMessages.USE_DEFAULT_ROOT_RADIO));
		moduleProjectLocationLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		systemDefaultText = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		systemDefaultText.setLayoutData(gd);
		synchHelper.synchText(systemDefaultText, IEARComponentImportDataModelProperties.NESTED_MODULE_ROOT, null);

		browseButton = new Button(group, SWT.PUSH);
		browseButton.setText(J2EEUIMessages.getResourceString(J2EEUIMessages.BROWSE_LABEL));
		gd = new GridData(GridData.HORIZONTAL_ALIGN_END);
		browseButton.setLayoutData(gd);
		browseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleBrowseButtonPressed();
			}
		});
	}

	private void refreshEARFileIfNecessary() {
		if (isEARFileChanged()) {
			aWrapper = (ArchiveWrapper) model.getProperty(IJ2EEComponentImportDataModelProperties.ARCHIVE_WRAPPER);
			refresh();
		}
	}

	protected void setJARsCompositeEnabled(boolean enabled) {
		availableJARsViewer.getTable().setEnabled(enabled);
		availableJARsViewer.setAllChecked(false);
		availableJARsViewer.setAllGrayed(!enabled);
		selectAllButton.setEnabled(enabled);
		deselectAllButton.setEnabled(enabled);
	}

	private void refresh() {
		availableJARsViewer.setInput(aWrapper);
	}

	public boolean isEARFileChanged() {
		return aWrapper != model.getProperty(IJ2EEComponentImportDataModelProperties.ARCHIVE_WRAPPER);
	}

	@Override
	protected void enter() {
		super.enter();
		refreshEARFileIfNecessary();
	}

	public void availableJARCheckStateChanged(CheckStateChangedEvent event) {
		model.setProperty(IEARComponentImportDataModelProperties.UTILITY_LIST, getJARsForProjects());
		validatePage();
	}

	public List getJARsForProjects() {
		refreshEARFileIfNecessary();
		List result = new ArrayList();
		result.addAll(Arrays.asList(availableJARsViewer.getCheckedElements()));
		return result;
	}

	protected boolean isNullOrEmpty(String aString) {
		return aString == null || aString.length() == 0;
	}

	@Override
	protected String[] getValidationPropertyNames() {
		return new String[]{};
	}

	protected void restoreWidgetValues() {
		// This page doesn't implement...
	}

	@Override
	public void storeDefaultSettings() {
		// This page doesn't implement...
	}



}
