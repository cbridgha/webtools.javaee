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
package org.eclipse.jst.j2ee.project.facet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jem.util.UIContextDetermination;
import org.eclipse.jem.util.emf.workbench.ProjectUtilities;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.jst.common.frameworks.CommonFrameworksPlugin;
import org.eclipse.jst.j2ee.application.internal.operations.AddComponentToEnterpriseApplicationDataModelProvider;
import org.eclipse.jst.j2ee.application.internal.operations.IAddComponentToEnterpriseApplicationDataModelProperties;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.j2ee.internal.project.ManifestFileCreationAction;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.datamodel.properties.ICreateReferenceComponentsDataModelProperties;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.frameworks.datamodel.DataModelFactory;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.internal.emf.resource.RendererFactory;
import org.eclipse.wst.common.project.facet.core.FacetedProjectFramework;
import org.eclipse.wst.common.project.facet.core.IFacetedProjectWorkingCopy;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntimeComponent;
import org.eclipse.wst.project.facet.ProductManager;
import org.eclipse.wst.web.internal.facet.RuntimePresetMappingRegistry;

public abstract class J2EEFacetInstallDelegate {

	protected static void addToClasspath(final IJavaProject jproj, final IClasspathEntry entry) throws CoreException {
		final IClasspathEntry[] existingEntries = jproj.getRawClasspath();
		for(IClasspathEntry existingEntry : existingEntries){
			if(existingEntry.equals(entry)){
				return;
			}
		}
		final IClasspathEntry[] updated = new IClasspathEntry[existingEntries.length + 1];
		System.arraycopy(existingEntries, 0, updated, 0, existingEntries.length);
		updated[existingEntries.length] = entry;
		jproj.setRawClasspath(updated, null);
	}

    protected void installEARFacet( final String j2eeVersionText, 
                                    final String earProjectName, 
                                    final IRuntime runtime, 
                                    final IProgressMonitor monitor )
    {
		IProject project = ProjectUtilities.getProject(earProjectName); 
		if( project.exists())
			return;
		
		final IFacetedProjectWorkingCopy fpjwc = FacetedProjectFramework.createNewProject();
		
		fpjwc.setProjectName( earProjectName );
		
		if( runtime != null )
		{
		    fpjwc.setTargetedRuntimes( Collections.singleton( runtime ) );
		}
		
		fpjwc.setFixedProjectFacets( Collections.singleton( EARFacetUtils.EAR_FACET ) );
		fpjwc.setSelectedPreset( FacetedProjectFramework.DEFAULT_CONFIGURATION_PRESET_ID );
		
		if( j2eeVersionText != null )
		{
		    final IProjectFacetVersion defaultEarFacetVersion
		        = fpjwc.getProjectFacetVersion( EARFacetUtils.EAR_FACET );
		    
		    if( ! defaultEarFacetVersion.getVersionString().equals( j2eeVersionText ) )
		    {
		        String presetId = null;
		        
		        if( runtime != null )
		        {
    		        for( IRuntimeComponent rc : runtime.getRuntimeComponents() )
    		        {
    		            presetId = RuntimePresetMappingRegistry.INSTANCE.getPresetID
    		            ( 
    		                rc.getRuntimeComponentType().getId(),
    		                rc.getRuntimeComponentVersion().getVersionString(), 
    		                EARFacetUtils.EAR_FACET.getId(), 
    		                j2eeVersionText 
    		            );
    		            
    		            if( presetId != null )
    		            {
    		                break;
    		            }
    		        }
		        }
		        
                final IProjectFacetVersion earFacetVersion
                    = EARFacetUtils.EAR_FACET.getVersion( j2eeVersionText );
            
                // Note that the next call is necessary even if a preset is going to be selected 
                // later since it allows the dynamic preset to adjust for the ear facet version.
                
                fpjwc.setProjectFacets( Collections.singleton( earFacetVersion ) );
                
		        if( presetId != null )
		        {
		            fpjwc.setSelectedPreset( presetId );
		        }
		    }
		}
		
		try
		{
		    fpjwc.commitChanges( null );
		}
		catch( CoreException e )
		{
		    Logger.getLogger().logError( e );
		}
	}
	
    protected void createManifest(IProject project, IContainer aFolder, IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
    	
        IFile file = aFolder.getFile(new Path(J2EEConstants.MANIFEST_URI));
        if (file.exists()) return;
        try {
            ManifestFileCreationAction.createManifestFile(file, project);
        } catch (CoreException e) {
            Logger.getLogger().log(e);
        } catch (IOException e) {
            Logger.getLogger().log(e);
        }
    }

    protected void addToEar(IVirtualComponent earComp, IVirtualComponent j2eeComp, String moduleURI ){
		final IDataModel dataModel = DataModelFactory.createDataModel(new AddComponentToEnterpriseApplicationDataModelProvider());
		Map map = (Map)dataModel.getProperty(IAddComponentToEnterpriseApplicationDataModelProperties.TARGET_COMPONENTS_TO_URI_MAP);
		map.put(j2eeComp, moduleURI);
		
		dataModel.setProperty(ICreateReferenceComponentsDataModelProperties.SOURCE_COMPONENT, earComp);
			
		List modList = (List) dataModel.getProperty(ICreateReferenceComponentsDataModelProperties.TARGET_COMPONENT_LIST);
		modList.add(j2eeComp);
		dataModel.setProperty(ICreateReferenceComponentsDataModelProperties.TARGET_COMPONENT_LIST, modList);
		try {
			dataModel.getDefaultOperation().execute(null, null);
		} catch (ExecutionException e) {
			Logger.getLogger().logError(e);
		}
    }
    
    protected void installAndAddModuletoEAR( String j2eeVersionText,
    			String				earProjectName,
    			IRuntime			runtime,
    			IProject			moduleProject,
    			String				moduleURI,
    			IProgressMonitor	monitor ){
    	
		installEARFacet(j2eeVersionText,
					earProjectName,
					runtime,
					monitor);
		
		final IVirtualComponent c = ComponentCore.createComponent( moduleProject );
		final IProject earProject = ProjectUtilities.getProject( earProjectName );
		final IVirtualComponent earComp = ComponentCore.createComponent( earProject );
		
		if( UIContextDetermination.getCurrentContext() == UIContextDetermination.HEADLESS_CONTEXT ){
			boolean isValidating = RendererFactory.getDefaultRendererFactory().isValidating();
			try{
				if( isValidating ){
					RendererFactory.getDefaultRendererFactory().setValidating(false);
				}
				addToEar( earComp, c, moduleURI );
			}finally{
				RendererFactory.getDefaultRendererFactory().setValidating(isValidating);
			}
		}
		else
		 addToEar( earComp, c, moduleURI );
    }
    
    /**
     * This method will set the output property on the model element for the given component.
     * If the single root structure is set for optimized use, the output folder will be the
     * content root.  Otherwise the default will be used.  This may be overrided by specific
     * J2EE modules to do more appropriate behaviour.
     * 
     * @param model
     * @param component
     */
    protected void setOutputFolder(IDataModel model, IVirtualComponent component) {
		String outputFolder = null;
		// If using single root structure, set output folder to be the content folder
		if (ProductManager.shouldUseSingleRootStructure())
			outputFolder = model.getStringProperty(IJ2EEModuleFacetInstallDataModelProperties.CONFIG_FOLDER);
		// Otherwise just use the product default for java output path
		else
			outputFolder = CommonFrameworksPlugin.getDefault().getPluginPreferences().getString(CommonFrameworksPlugin.OUTPUT_FOLDER);
		component.setMetaProperty("java-output-path", outputFolder ); //$NON-NLS-1$
	}
  
}
