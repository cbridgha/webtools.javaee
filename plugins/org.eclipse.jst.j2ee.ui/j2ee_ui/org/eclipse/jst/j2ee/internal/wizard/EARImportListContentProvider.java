/*******************************************************************************
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.internal.wizard;

import java.util.Arrays;
import java.util.Comparator;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jst.j2ee.commonarchivecore.internal.Archive;
import org.eclipse.jst.j2ee.commonarchivecore.internal.WARFile;
import org.eclipse.jst.j2ee.commonarchivecore.internal.helpers.ArchiveConstants;
import org.eclipse.jst.j2ee.datamodel.properties.IJ2EEComponentImportDataModelProperties;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;



/**
 * Insert the type's description here. Creation date: (5/7/2001 11:39:11 AM)
 * 
 * @author: Administrator
 */
public class EARImportListContentProvider extends LabelProvider implements IStructuredContentProvider, ITableLabelProvider {
	/**
	 * EARImportListContentProvider constructor comment.
	 */
	public EARImportListContentProvider() {
		super();
	}

	/**
	 * Returns the elements to display in the viewer when its input is set to the given element.
	 * These elements can be presented as rows in a table, items in a list, etc. The result is not
	 * modified by the viewer.
	 * 
	 * @param inputElement
	 *            the input element
	 * @return the array of elements to display in the viewer
	 */
	public java.lang.Object[] getElements(Object inputElement) {
		if (inputElement instanceof TableObjects) {
			Object[] array = ((TableObjects) inputElement).getTableObjects().toArray();
			Arrays.sort(array, new Comparator() {
				public int compare(Object o1, Object o2) {
					return getColumnText(o1, 0).compareTo(getColumnText(o2, 0));
				}
			});
			return array;
		}
		return new Object[0]; // should throw exception instead
	}

	/**
	 * Returns the label image for the given column of the given element.
	 * 
	 * @param element
	 *            the object representing the entire row, or <code>null</code> indicating that no
	 *            input object is set in the viewer
	 * @param columnIndex
	 *            the zero-based index of the column in which the label appears
	 */
	public org.eclipse.swt.graphics.Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	/**
	 * Returns the label text for the given column of the given element.
	 * 
	 * @param element
	 *            the object representing the entire row, or <code>null</code> indicating that no
	 *            input object is set in the viewer
	 * @param columnIndex
	 *            the zero-based index of the column in which the label appears
	 */
	public String getColumnText(Object element, int columnIndex) {
		IDataModel dataModel = (IDataModel) element;
		if (columnIndex == 0) {
			Archive archive = (Archive) dataModel.getProperty(IJ2EEComponentImportDataModelProperties.FILE);
			if (archive.getURI().startsWith(ArchiveConstants.WEBAPP_LIB_URI)) {
				String parentWarFileName = ((WARFile) archive.eContainer()).getName();
				return parentWarFileName + "#" + archive.getURI(); //$NON-NLS-1$
			}
			return archive.getURI();
		} else if (columnIndex == 1) {
			return dataModel.getStringProperty(IFacetProjectCreationDataModelProperties.FACET_PROJECT_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// do nothing
	}

	public void dispose() {
		// dispose
	}
}
