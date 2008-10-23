/***********************************************************************
 * Copyright (c) 2008 by SAP AG, Walldorf. 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP AG - initial API and implementation
 ***********************************************************************/
package org.eclipse.jst.jee.model.internal.mergers;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jst.j2ee.webapplication.WelcomeFile;
import org.eclipse.jst.javaee.core.Description;
import org.eclipse.jst.javaee.core.JavaEEObject;
import org.eclipse.jst.javaee.core.Listener;
import org.eclipse.jst.javaee.core.RunAs;
import org.eclipse.jst.javaee.core.SecurityRole;
import org.eclipse.jst.javaee.web.Filter;
import org.eclipse.jst.javaee.web.Servlet;
import org.eclipse.jst.javaee.web.WebApp;
import org.eclipse.jst.jee.model.internal.mergers.JNDIRefsMerger;
import org.eclipse.jst.jee.model.internal.mergers.ModelElementMerger;
import org.eclipse.jst.jee.model.internal.mergers.ModelException;

/**
 * WebApp merger merges the WebApp artifact. 
 * 
 * @author Dimitar Giormov
 */
public class WebAppMerger  extends ModelElementMerger {

  /**
   * Constructor which gets the base and to merge WebApp element.
   * 
   * @param _base - is the base element, into which the values will be merged.
   * @param merge - is the conflicting element, which will be merged into base.
   * @param kind
   */
  public WebAppMerger(JavaEEObject _base, JavaEEObject merge, int kind) {
    super(_base, merge, kind);
  }

  /**
   * Returns the base element, into which the values will be merged.
   * 
   * @return base element, into which the values will be merged.
   */
  WebApp getBaseWebApp(){
    return (WebApp) getBase();
  }

  /**
   * Returns the conflicting element, which will be merged into base.
   * 
   * @return the conflicting element, which will be merged into base.
   */
  WebApp getToMergeWebApp(){
    return (WebApp) getToMerge();
  }


  /* (non-Javadoc)
   * @see org.eclipse.jst.javaee.ejb.model.mergers.ModelElementMerger#process()
   */
  @Override
  public List process() throws ModelException {
    List warnings = new ArrayList();
    if(getToMergeWebApp() == null || getBaseWebApp() == null){
      return warnings;
    }
    try {
      mergeServlets(warnings);
      mergeFilters(warnings);
      mergeListeners(warnings);

      copyGeneralData(warnings);

      mergeRunAs(warnings);
      mergeJNDIRefs(warnings);
      mergeSecurityRoles(warnings);
    } catch (Exception e) {
      throw new ModelException(e);
    }
    return warnings;
  }

  private void mergeFilters(List warnings) {
    if (getToMergeWebApp().getFilters() != null){
      copyMissingContentInBase(getToMergeWebApp().getFilters(), getBaseWebApp().getFilters());
    }
    if (getToMergeWebApp().getFilterMappings() != null){
      copyAllContentInBase(getToMergeWebApp().getFilterMappings(), getBaseWebApp().getFilterMappings());
    }
  }

  private void mergeListeners(List warnings) {
    if (getToMergeWebApp().getListeners() != null){
      copyMissingContentInBase(getToMergeWebApp().getListeners(), getBaseWebApp().getListeners());
    }
  }

  private void mergeServlets(List warnings) {

    if (getToMergeWebApp().getServlets() != null){
      copyMissingContentInBase(getToMergeWebApp().getServlets(), getBaseWebApp().getServlets());
    }

    if (getToMergeWebApp().getServletMappings() != null){
      copyAllContentInBase(getToMergeWebApp().getServletMappings(), getBaseWebApp().getServletMappings());
    }

  }


  private void mergeJNDIRefs(List warnings) throws ModelException {
    JNDIRefsMerger jndiRefsMerger = new JNDIRefsMerger(getBaseWebApp(), getToMergeWebApp(), getKind());
    warnings.addAll(jndiRefsMerger.process());
  } 


  private void mergeRunAs(List warnings) throws ModelException {
    List baseServlets = getBaseWebApp().getServlets();
    List toMergeServlets = getToMergeWebApp().getServlets();
    for (Object object : toMergeServlets) {
      Servlet servlet = (Servlet) object;
      Servlet servletInBase = findServletInBase(servlet.getServletName(), baseServlets);
      if(servletInBase != null){
        RunAs baseSecId = servletInBase.getRunAs();
        RunAs toMergeSecId = servlet.getRunAs();
        if(baseSecId == null && toMergeSecId != null){
          servletInBase.setRunAs((RunAs) EcoreUtil.copy((EObject)toMergeSecId));              
        }
      }
    }

  }

  private Servlet findServletInBase(String servletName, List baseServlets) {
    for (Object object : baseServlets) {
      Servlet servlet = (Servlet) object;
			if(servlet.getServletName() != null && servlet.getServletName().equals(servletName)){
        return servlet;
      }
    }
    return null;
  }

  private void mergeSecurityRoles(List warnings) {
    List securityRolesBase = getBaseWebApp().getSecurityRoles();
    List securityRolesToMerge = getToMergeWebApp().getSecurityRoles();
    if (securityRolesToMerge == null){
      return;
    }
    for (Object sRoles : securityRolesToMerge) {
      if(!containsSecRole((SecurityRole) sRoles, securityRolesBase)){
        securityRolesBase.add(EcoreUtil.copy((EObject) sRoles));
      }
    }
  }

  private boolean containsSecRole(SecurityRole secRole, List secRoles){
    for (Object sRoles : secRoles) {
      if(((SecurityRole)sRoles).getRoleName() == null || secRole.getRoleName() == null){
        return ((SecurityRole)sRoles).getRoleName() == secRole.getRoleName();
      }
      if (((SecurityRole)sRoles).getRoleName().equals(secRole.getRoleName())){
        return true;
      }
    }
    return false;
  }

  private void copyGeneralData(List warnings){
    copyJavaEEGroup();

    if (getToMergeWebApp().getContextParams() != null && getToMergeWebApp().getContextParams().size() > 0){
      copyMissingContentInBase(getToMergeWebApp().getContextParams(), getBaseWebApp().getContextParams());
    }

    if (getToMergeWebApp().getDistributables() != null){
      copyMissingContentInBase(getToMergeWebApp().getDistributables(), getBaseWebApp().getDistributables());
    }

    if (getToMergeWebApp().getErrorPages() != null){
      copyMissingContentInBase(getToMergeWebApp().getErrorPages(), getBaseWebApp().getErrorPages());
    }

    if (getToMergeWebApp().getJspConfigs() != null){
      copyMissingContentInBase(getToMergeWebApp().getJspConfigs(), getBaseWebApp().getJspConfigs());
    }

    if (getToMergeWebApp().getLocalEncodingMappingsLists() != null){
      copyMissingContentInBase(getToMergeWebApp().getLocalEncodingMappingsLists(), getBaseWebApp().getLocalEncodingMappingsLists());
    }


    if (getToMergeWebApp().getLoginConfigs() != null){
      copyMissingContentInBase(getToMergeWebApp().getLoginConfigs(), getBaseWebApp().getLoginConfigs());
    }


    if (getToMergeWebApp().getMessageDestinations() != null){
      copyMissingContentInBase(getToMergeWebApp().getMessageDestinations(), getBaseWebApp().getMessageDestinations());
    }


    if (getToMergeWebApp().getMimeMappings() != null){
      copyMissingContentInBase(getToMergeWebApp().getMimeMappings(), getBaseWebApp().getMimeMappings());
    }

    if (getToMergeWebApp().getSessionConfigs() != null){
      copyMissingContentInBase(getToMergeWebApp().getSessionConfigs(), getBaseWebApp().getSessionConfigs());
    }

    if (getToMergeWebApp().getWelcomeFileLists() != null){
      copyMissingContentInBase(getToMergeWebApp().getWelcomeFileLists(), getBaseWebApp().getWelcomeFileLists());
    }


  }

  private void copyAllContentInBase(List listSource, List target) {
    for (Object object : listSource) {
			if (artifactIsValid(object)){
      target.add(EcoreUtil.copy((EObject) object));
    }
		}

  }

  private void copyMissingContentInBase(List listSource, List target) {
    for (Object object : listSource) {
			if(artifactIsValid(object) && !artifactExists(object, target)){
        target.add(EcoreUtil.copy((EObject) object));        
      }
    }

  }

	private boolean artifactIsValid(Object javaEEObject) {
		if (javaEEObject instanceof Servlet){
			return ( (Servlet)javaEEObject).getServletName() != null;
		} else if (javaEEObject instanceof Listener){        
			return ((Listener)javaEEObject).getListenerClass() != null;
		} else if (javaEEObject instanceof Filter){
			return ((Filter)javaEEObject).getFilterName() != null;
		} 
		return true;
	}

  private boolean artifactExists(Object javaEEObject, List target) {
    for (Object targetArtifact : target) {
			if( !artifactIsValid(targetArtifact) ){
				continue;
			}
      if (javaEEObject instanceof Servlet){
				
        if(((Servlet) targetArtifact).getServletName().equals(((Servlet)javaEEObject).getServletName())){
          return true;
        }
      } else if (javaEEObject instanceof Listener){        
        if(((Listener) targetArtifact).getListenerClass().equals(((Listener)javaEEObject).getListenerClass())){
          return true;
        }
      } else if (javaEEObject instanceof Filter){
        if(((Filter) targetArtifact).getFilterName().equals(((Filter)javaEEObject).getFilterName())){
          return true;
        }
      } else if (javaEEObject instanceof Description){
        if(((Description) targetArtifact).getValue().equals(((Description)javaEEObject).getValue())){
          return true;
        }
      } else if (javaEEObject instanceof WelcomeFile){
        if(((WelcomeFile) targetArtifact).getWelcomeFile().equals(((WelcomeFile)javaEEObject).getWelcomeFile())){
          return true;
        }
      }
    }
    return false;
  }

  private void copyJavaEEGroup(){
    if (getToMergeWebApp().getDescriptions() != null){
      copyAllContentInBase(getToMergeWebApp().getDescriptions(), getBaseWebApp().getDescriptions());
    }

    if (getToMergeWebApp().getDisplayNames() != null){
      copyAllContentInBase(getToMergeWebApp().getDisplayNames(), getBaseWebApp().getDisplayNames());
    }

    if (getToMergeWebApp().getIcons() != null){
      copyAllContentInBase(getToMergeWebApp().getIcons(), getBaseWebApp().getIcons());
    }
    
    if (getToMergeWebApp().isSetVersion()){
      getBaseWebApp().setVersion(getToMergeWebApp().getVersion());
    }
  }


}
