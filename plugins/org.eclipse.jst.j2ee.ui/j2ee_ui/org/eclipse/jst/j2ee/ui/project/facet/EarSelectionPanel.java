/******************************************************************************
 * Copyright (c) 2005, 2006 BEA Systems, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Konstantin Komissarchik - initial API and implementation
 *    David Schneider, david.schneider@unisys.com - [142500] WTP properties pages fonts don't follow Eclipse preferences
 ******************************************************************************/

package org.eclipse.jst.j2ee.ui.project.facet;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jst.j2ee.web.project.facet.IWebFacetInstallDataModelProperties;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.internal.datamodel.ui.DataModelSynchHelper;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;

/**
 * @author <a href="mailto:kosta@bea.com">Konstantin Komissarchik</a>
 */

public final class EarSelectionPanel implements IWebFacetInstallDataModelProperties
    
{
    private final Button addToEar;
    private final Combo combo;
    private final Button newButton;
    private final Label label;
   
    private final IDataModel model;
    private DataModelSynchHelper synchhelper;
    
    public EarSelectionPanel( final IDataModel model, final Composite parent) 
    {
        this.model = model;
        this.synchhelper = new DataModelSynchHelper(model);
        
        final Group group = new Group( parent, SWT.NONE );
        group.setLayoutData( gdhfill() );
        group.setLayout( new GridLayout( 3, false ) );
        group.setText( Resources.earMemberShip );
        
        this.addToEar = new Button( group, SWT.CHECK );
        this.addToEar.setText( Resources.addToEarLabel );
        this.addToEar.setLayoutData( gdhspan( new GridData(), 3 ) );
        synchhelper.synchCheckbox(addToEar, ADD_TO_EAR, null);

        label = new Label(group, SWT.NULL);
        label.setText(Resources.earProjectLabel);
        this.combo = new Combo(group, SWT.NONE);
        this.combo.setLayoutData( gdhfill() );
        
        this.newButton = new Button( group, SWT.PUSH );
        this.newButton.setText( Resources.newButtonLabel );
        
        this.newButton.addSelectionListener( new SelectionAdapter()
        {
            public void widgetSelected( final SelectionEvent event )
            {
                handleAddButton();
            }
        } );
        
        synchhelper.synchCombo(combo, EAR_PROJECT_NAME, new Control[]{label, newButton});
        Dialog.applyDialogFont(parent);
    }

    private void handleAddButton()
    {
        final EarProjectWizard wizard = new EarProjectWizard();
        
        final WizardDialog dialog 
            = new WizardDialog( newButton.getShell(), wizard );
        
        IRuntime runtime = (IRuntime)model.getProperty(FACET_RUNTIME);
    	wizard.setRuntimeInDataModel(runtime);

    	if( dialog.open() != SWT.CANCEL )
        {
            model.notifyPropertyChange(EAR_PROJECT_NAME, IDataModel.VALID_VALUES_CHG);
            final String earproj = wizard.getProjectName();
            model.setProperty(EAR_PROJECT_NAME, earproj);
        }
    }
    
    private static GridData gdhfill()
    {
        return new GridData( GridData.FILL_HORIZONTAL );
    }

    public static final GridData gdhspan( final GridData gd,
                                          final int span )
    {
        gd.horizontalSpan = span;
        return gd;
    }
    
    private static final class Resources
    
        extends NLS
        
    {
        public static String addToEarLabel;
        public static String newButtonLabel;
        public static String earProjectLabel;
        public static String earMemberShip;
        
        static
        {
            initializeMessages( EarSelectionPanel.class.getName(), 
                                Resources.class );
        }
    }
    
    public void dispose() {
    	if(synchhelper != null){
    		synchhelper.dispose();
    		synchhelper = null;
    	}
    }
    
    public String getComboText(){
    	return combo.getText();
    }    
}
