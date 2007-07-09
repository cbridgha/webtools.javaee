package org.eclipse.jst.jee.servlet.ui.project.facet;

/***************************************************************************************************
 * Copyright (c) 2007 IBM Corporation and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: IBM Corporation - initial API and implementation
 **************************************************************************************************/

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class WebJavaEEFacetInstallPage extends org.eclipse.jst.servlet.ui.project.facet.WebFacetInstallPage {

	protected Button addDD;

	public WebJavaEEFacetInstallPage() {
		super();
	}

	protected Composite createTopLevelComposite(Composite parent) {
		Composite composite = super.createTopLevelComposite(parent);
		createDDSection(composite);
		return composite;
	}
	
	private void createDDSection(Composite parent) {
		new Label(parent, SWT.NONE);
		addDD = new Button(parent, SWT.CHECK);
		addDD.setText(Messages.WebJavaEEFacetInstallPage_0);
		synchHelper.synchCheckbox(addDD, GENERATE_DD, null);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		addDD.setLayoutData(gd);
    }
}