/*******************************************************************************
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jem.internal.beaninfo.ui;

import java.util.List;

import org.eclipse.core.runtime.*;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.ui.dialogs.StatusInfo;
import org.eclipse.jdt.internal.ui.dialogs.StatusUtil;
import org.eclipse.jdt.internal.ui.util.PixelConverter;
import org.eclipse.jdt.internal.ui.wizards.IStatusChangeListener;
import org.eclipse.jdt.internal.ui.wizards.buildpaths.ArchiveFileFilter;
import org.eclipse.jdt.internal.ui.wizards.buildpaths.VariablePathDialogField.ChooseVariableDialog;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.*;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.PlatformUI;
/*
 *  $RCSfile: VariableSelectionBlock.java,v $
 *  $Revision: 1.1.4.1 $  $Date: 2004/06/24 18:17:14 $ 
 */

public class VariableSelectionBlock {
	
	
	private List fExistingPaths;
	
	private StringButtonDialogField fVariableField;
	private StringButtonDialogField fExtensionField;
	
	private CLabel fFullPath;
	
	private IStatus fVariableStatus;
	private IStatus fExistsStatus;
	private IStatus fExtensionStatus;
	
	private String fVariable;
	private IStatusChangeListener fContext;
	
	private boolean fIsEmptyAllowed;
	
	/**
	 * Constructor for VariableSelectionBlock
	 */
	public VariableSelectionBlock(IStatusChangeListener context, List existingPaths, IPath varPath, String lastVarSelection, boolean emptyAllowed) {	
		fContext= context;
		fExistingPaths= existingPaths;
		fIsEmptyAllowed= emptyAllowed;
		fVariableStatus= new StatusInfo();
		fExistsStatus= new StatusInfo();
		
		VariableSelectionAdapter adapter= new VariableSelectionAdapter();
		fVariableField= new StringButtonDialogField(adapter);
		fVariableField.setDialogFieldListener(adapter);
		fVariableField.setLabelText(BeanInfoUIMessages.getString("VariableSelectionBlock.variable.label")); //$NON-NLS-1$
		fVariableField.setButtonLabel(BeanInfoUIMessages.getString("VariableSelectionBlock.variable.button")); //$NON-NLS-1$

		fExtensionField= new StringButtonDialogField(adapter);
		fExtensionField.setDialogFieldListener(adapter);
		fExtensionField.setLabelText(BeanInfoUIMessages.getString("VariableSelectionBlock.extension.label")); //$NON-NLS-1$
		fExtensionField.setButtonLabel(BeanInfoUIMessages.getString("VariableSelectionBlock.extension.button")); //$NON-NLS-1$

		if (varPath != null) {
			fVariableField.setText(varPath.segment(0));
			fExtensionField.setText(varPath.removeFirstSegments(1).toString());
		} else {
			fVariableField.setText(""); //$NON-NLS-1$
			fExtensionField.setText(""); //$NON-NLS-1$
		}
		updateFullTextField();
	}
	
	public IPath getVariablePath() {
		if (fVariable != null) {
			return new Path(fVariable).append(fExtensionField.getText());
		}
		return null;
	}
	
	public IPath getResolvedPath() {
		if (fVariable != null) {
			IPath entryPath= JavaCore.getClasspathVariable(fVariable);
			if (entryPath != null) {
				return entryPath.append(fExtensionField.getText());
			}
		}
		return null;
	}	
			
	public void setFocus(Display display) {
		fVariableField.postSetFocusOnDialogField(display);
	}

	
	public Control createControl(Composite parent) {
		PixelConverter converter= new PixelConverter(parent);
		
		int nColumns= 3;
		
		Composite inner= new Composite(parent, SWT.NONE);
		GridLayout layout= new GridLayout();
		layout.marginHeight= 0;
		layout.marginWidth= 0;
		layout.numColumns= nColumns;
		inner.setLayout(layout);
		
		int fieldWidthHint= converter.convertWidthInCharsToPixels(50);
		
		fVariableField.doFillIntoGrid(inner, nColumns);
		LayoutUtil.setWidthHint(fVariableField.getTextControl(null), fieldWidthHint);
		LayoutUtil.setHorizontalGrabbing(fVariableField.getTextControl(null));
		
		fExtensionField.doFillIntoGrid(inner, nColumns);
		LayoutUtil.setWidthHint(fExtensionField.getTextControl(null), fieldWidthHint);
		
		Label label= new Label(inner, SWT.LEFT);
		label.setLayoutData(new GridData());
		label.setText(BeanInfoUIMessages.getString("VariableSelectionBlock.fullpath.label")); //$NON-NLS-1$
		
		fFullPath= new CLabel(inner, SWT.NONE);
		fFullPath.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		DialogField.createEmptySpace(inner, nColumns - 2);
		updateFullTextField();
		
		setFocus(parent.getDisplay());
		
		return inner;
	}
	
	// -------- VariableSelectionAdapter --------

	private class VariableSelectionAdapter implements IDialogFieldListener, IStringButtonAdapter {
		
	
		// -------- IDialogFieldListener
		public void dialogFieldChanged(DialogField field) {
			doFieldUpdated(field);
		}
		
		// -------- IStringButtonAdapter
		public void changeControlPressed(DialogField field) {
			doChangeControlPressed(field);
		}
		
	}
	
	private void doChangeControlPressed(DialogField field) {
		if (field == fVariableField) {
			String variable= chooseVariable();
			if (variable != null) {
				fVariableField.setText(variable);
			}
		} else if (field == fExtensionField) {
			IPath filePath= chooseExtJar();
			if (filePath != null) {
				fExtensionField.setText(filePath.toString());
			}
		}
	}
	
	private void doFieldUpdated(DialogField field) {
		if (field == fVariableField) {
			fVariableStatus= variableUpdated();
		} else if (field == fExtensionField) {
			fExtensionStatus= extensionUpdated();
		}
		fExistsStatus= getExistsStatus();
		updateFullTextField();
		
		fContext.statusChanged(StatusUtil.getMostSevere(new IStatus[] { fVariableStatus, fExtensionStatus, fExistsStatus }));
	}		
	
	private IStatus variableUpdated() {
		fVariable= null;
		
		StatusInfo status= new StatusInfo();
		String name= fVariableField.getText();
		if (name.length() == 0) {
			if (!fIsEmptyAllowed) {
				status.setError(BeanInfoUIMessages.getString("VariableSelectionBlock.error.entername_ERROR_")); //$NON-NLS-1$
			} else {
				fVariable= ""; //$NON-NLS-1$
			}
		} else if (JavaCore.getClasspathVariable(name) == null) {
			status.setError(BeanInfoUIMessages.getString("VariableSelectionBlock.error.namenotexists_ERROR_")); //$NON-NLS-1$
		} else {
			fVariable= name;
		}
		fExtensionField.enableButton(fVariable != null);
		return status;
	}
	
	private IStatus extensionUpdated() {
		StatusInfo status= new StatusInfo();
		String extension= fExtensionField.getText();
		if (extension.length() > 0 && !Path.ROOT.isValidPath(extension)) {
			status.setError(BeanInfoUIMessages.getString("VariableSelectionBlock.error.invalidextension_ERROR_")); //$NON-NLS-1$
		}
		return status;
	}
		
	private IStatus getExistsStatus() {
		StatusInfo status= new StatusInfo();
		IPath path= getResolvedPath();
		if (path != null) {
			if (findPath(path)) {
				status.setError(BeanInfoUIMessages.getString("VariableSelectionBlock.error.pathexists_ERROR_")); //$NON-NLS-1$
			} else if (!path.toFile().isFile()) {
				status.setWarning(BeanInfoUIMessages.getString("VariableSelectionBlock.warning.pathnotexists_WARN_")); //$NON-NLS-1$
			}
		} else {
			status.setWarning(BeanInfoUIMessages.getString("VariableSelectionBlock.warning.pathnotexists_WARN_")); //$NON-NLS-1$
		}
		return status;
	}
	
	private boolean findPath(IPath path) {
		for (int i= fExistingPaths.size() -1; i >=0; i--) {
			IPath curr= (IPath) fExistingPaths.get(i);
			if (curr.equals(path)) {
				return true;
			}
		}
		return false;
	}	

	private void updateFullTextField() {
		if (fFullPath != null && !fFullPath.isDisposed()) {
			IPath resolvedPath= getResolvedPath();
			if (resolvedPath != null) {
				fFullPath.setText(resolvedPath.toOSString());
			} else {
				fFullPath.setText(""); //$NON-NLS-1$
			}
		}
	}
	
	private Shell getShell() {
		if (fFullPath != null) {
			return fFullPath.getShell();
		}
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}	
	
	private IPath chooseExtJar() {
		String lastUsedPath= ""; //$NON-NLS-1$
		IPath entryPath= getResolvedPath();
		if (entryPath != null) {
			if (ArchiveFileFilter.isArchivePath(entryPath)) {
				lastUsedPath= entryPath.removeLastSegments(1).toOSString();
			} else {
				lastUsedPath= entryPath.toOSString();
			}
		}
		
		FileDialog dialog= new FileDialog(getShell(), SWT.SINGLE);
		dialog.setFilterExtensions(new String[] {"*.jar;*.zip"}); //$NON-NLS-1$
		dialog.setFilterPath(lastUsedPath);
		dialog.setText(BeanInfoUIMessages.getString("VariableSelectionBlock.ExtJarDialog.title")); //$NON-NLS-1$
		String res= dialog.open();
		if (res == null) {
			return null;
		}
		IPath resPath= new Path(res).makeAbsolute();
		IPath varPath= JavaCore.getClasspathVariable(fVariable);
		
		if (!varPath.isPrefixOf(resPath)) {
			return new Path(resPath.lastSegment());
		} else {
			return resPath.removeFirstSegments(varPath.segmentCount()).setDevice(null);
		}
	}

	private String chooseVariable() {
		ChooseVariableDialog dialog= new ChooseVariableDialog(getShell(), fVariable);
		if (dialog.open() == Window.OK) {
			return dialog.getSelectedVariable();
		}
		
		return null;
	}
		

}
