package org.eclipse.jst.j2ee.jca.internal.module.util;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jst.j2ee.common.XMLResource;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.j2ee.internal.modulecore.util.EnterpriseArtifactEdit;
import org.eclipse.jst.j2ee.jca.Connector;
import org.eclipse.jst.j2ee.jca.ConnectorResource;
import org.eclipse.jst.j2ee.jca.JcaFactory;
import org.eclipse.wst.common.modulecore.ArtifactEditModel;
import org.eclipse.wst.common.modulecore.ModuleCore;
import org.eclipse.wst.common.modulecore.ModuleCoreNature;
import org.eclipse.wst.common.modulecore.UnresolveableURIException;
import org.eclipse.wst.common.modulecore.WorkbenchModule;

public class ConnectorArtifactEdit extends EnterpriseArtifactEdit {
	
	/**
	 * <p>
	 * Identifier used to link ConnectorArtifactEdit to a ConnectorEditAdapterFactory {@see
	 * ConnectorEditAdapterFactory} stored in an AdapterManger (@see AdapterManager)
	 * </p>
	 */

	public static final Class ADAPTER_TYPE = ConnectorArtifactEdit.class;

	/**
	 * <p>
	 * Identifier used to group and query common artifact edits.
	 * </p>
	 */

	public static String TYPE_ID = "jst.jca"; //$NON-NLS-1$
	
	/**
	 * <p>
	 * Creates an instance facade for the given {@see ArtifactEditModel}.
	 * </p>
	 * 
	 * @param anArtifactEditModel
	 */

	public ConnectorArtifactEdit(ArtifactEditModel anArtifactEditModel) {
		super(anArtifactEditModel);
	}
	
	/**
	 * <p>
	 * Creates an instance facade for the given {@see ArtifactEditModel}
	 * </p>
	 * 
	 * @param aNature
	 *            A non-null {@see ModuleCoreNature}for an accessible project
	 * @param aModule
	 *            A non-null {@see WorkbenchModule}pointing to a module from the given
	 *            {@see ModuleCoreNature}
	 */

	public ConnectorArtifactEdit(ModuleCoreNature aNature, WorkbenchModule aModule, boolean toAccessAsReadOnly) {
		super(aNature, aModule, toAccessAsReadOnly);
	}
	
	/**
	 * 
	 * @return ConnectorResource from (@link getDeploymentDescriptorResource())
	 *  
	 */

	public ConnectorResource getConnectorXmiResource() {
		return (ConnectorResource) getDeploymentDescriptorResource();
	}
	
	/**
	 * <p>
	 * Retrieves the underlying resource from the ArtifactEditModel using defined URI.
	 * </p>
	 * 
	 * @return Resource
	 *  
	 */

	public Resource getDeploymentDescriptorResource() {
		return getArtifactEditModel().getResource(J2EEConstants.RAR_DD_URI_OBJ);
	}
	
	/**
	 * <p>
	 * Obtains the Connector (@see Connector) root object from the ConnectorResource. If the root object does
	 * not exist, then one is created (@link addConnectorIfNecessary(getConnectorXmiResource())).
	 * The root object contains all other resource defined objects.
	 * </p>
	 * 
	 * @return EObject
	 *  
	 */
	public EObject getDeploymentDescriptorRoot() {
		List contents = getDeploymentDescriptorResource().getContents();
		if (contents.size() > 0)
			return (EObject) contents.get(0);
		addConnectorIfNecessary(getConnectorXmiResource());
		return (EObject) contents.get(0);
	}
	
	/**
	 * <p>
	 * Creates a deployment descriptor root object (Connector) and populates with data. Adds the root
	 * object to the deployment descriptor resource.
	 * </p>
	 * 
	 * <p>
	 * 
	 * @param aModule
	 *            A non-null pointing to a {@see XMLResource}
	 * 
	 * Note: This method is typically used for JUNIT - move?
	 * </p>
	 */
	protected void addConnectorIfNecessary(XMLResource aResource) {

		if (aResource != null && aResource.getContents().isEmpty()) {
			Connector connector = JcaFactory.eINSTANCE.createConnector();
			aResource.getContents().add(connector);
			URI moduleURI = getArtifactEditModel().getModuleURI();
			try {
				connector.setDisplayName(ModuleCore.getDeployedName(moduleURI));
			} catch (UnresolveableURIException e) {
			}
			aResource.setID(connector, J2EEConstants.CONNECTOR_ID);
			//TODO add more mandatory elements
		}
	}
	
	/**
	 * <p>
	 * Returns an instance facade to manage the underlying edit model for the given
	 * {@see WorkbenchModule}. Instances of ConnectorArtifactEdit that are returned through this method
	 * must be {@see #dispose()}ed of when no longer in use.
	 * </p>
	 * <p>
	 * Use to acquire an ConnectorArtifactEdit facade for a specific {@see WorkbenchModule}&nbsp;that will not
	 * be used for editing. Invocations of any save*() API on an instance returned from this method
	 * will throw exceptions.
	 * </p>
	 * <p>
	 * <b>This method may return null. </b>
	 * </p>
	 * 
	 * @param aModule
	 *            A valid {@see WorkbenchModule}&nbsp;with a handle that resolves to an accessible
	 *            project in the workspace
	 * @return An instance of ConnectorArtifactEdit that may only be used to read the underlying content
	 *         model
	 * @throws UnresolveableURIException
	 *             could not resolve uri.
	 */
	public static ConnectorArtifactEdit getConnectorArtifactEditForRead(WorkbenchModule aModule) {
		try {
			if (isValidConnectorModule(aModule)) {
				IProject project = ModuleCore.getContainingProject(aModule.getHandle());
				ModuleCoreNature nature = ModuleCoreNature.getModuleCoreNature(project);
				return new ConnectorArtifactEdit(nature, aModule, true);
			}
		} catch (UnresolveableURIException uue) {
		}
		return null;
	}
	
	/**
	 * <p>
	 * Returns an instance facade to manage the underlying edit model for the given
	 * {@see WorkbenchModule}. Instances of ConnectorArtifactEdit that are returned through this method
	 * must be {@see #dispose()}ed of when no longer in use.
	 * </p>
	 * <p>
	 * Use to acquire an ConnectorArtifactEdit facade for a specific {@see WorkbenchModule}&nbsp;that
	 * will be used for editing.
	 * </p>
	 * <p>
	 * <b>This method may return null. </b>
	 * </p>
	 * 
	 * @param aModule
	 *            A valid {@see WorkbenchModule}&nbsp;with a handle that resolves to an accessible
	 *            project in the workspace
	 * @return An instance of ConnectorArtifactEdit that may be used to modify and persist changes to the
	 *         underlying content model
	 */
	public static ConnectorArtifactEdit getConnectorArtifactEditForWrite(WorkbenchModule aModule) {
		try {
			if (isValidConnectorModule(aModule)) {
				IProject project = ModuleCore.getContainingProject(aModule.getHandle());
				ModuleCoreNature nature = ModuleCoreNature.getModuleCoreNature(project);
				return new ConnectorArtifactEdit(nature, aModule, false);
			}
		} catch (UnresolveableURIException uue) {
		}
		return null;
	}
	
	/**
	 * @param module
	 *            A {@see WorkbenchModule}
	 * @return True if the supplied module
	 *         {@see ArtifactEdit#isValidEditableModule(WorkbenchModule)}and the moduleTypeId is a
	 *         JST module
	 */
	public static boolean isValidConnectorModule(WorkbenchModule aModule) throws UnresolveableURIException {
		if (!isValidEditableModule(aModule))
			return false;
		/* and match the JST_Connector_MODULE type */
		if (!TYPE_ID.equals(aModule.getModuleType().getModuleTypeId()))
			return false;
		return true;
	}
	
	/**
	 * <p>
	 * Retrieves J2EE version information from ConnectorResource.
	 * </p>
	 * 
	 * @return an integer representation of a J2EE Spec version
	 *  
	 */

	public int getJ2EEVersion() {
		return getConnectorXmiResource().getJ2EEVersionID();
	}
	
	/**
	 * 
	 * @return Connector from (@link getDeploymentDescriptorRoot())
	 *  
	 */
	public Connector getConnector() {
		return (Connector) getDeploymentDescriptorRoot();
	}

}
