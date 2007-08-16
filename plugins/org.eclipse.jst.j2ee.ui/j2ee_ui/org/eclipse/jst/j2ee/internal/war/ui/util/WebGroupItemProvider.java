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
/*
 * Created on Aug 11, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.jst.j2ee.internal.war.ui.util;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jem.util.emf.workbench.WorkbenchResourceHelperBase;
import org.eclipse.jst.j2ee.common.Listener;
import org.eclipse.jst.j2ee.internal.provider.J2EEItemProvider;
import org.eclipse.jst.j2ee.webapplication.Filter;
import org.eclipse.jst.j2ee.webapplication.Servlet;
import org.eclipse.jst.j2ee.webapplication.WebApp;

/**
 * @author jlanuti
 * 
 * TODO To change the template for this generated type comment go to Window - Preferences - Java -
 * Code Style - Code Templates
 */
public abstract class WebGroupItemProvider extends J2EEItemProvider {

	class WebGroupComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Servlet) {
                Servlet s1 = (Servlet)o1;
                Servlet s2 = (Servlet)o2;
                if (s1.getServletName() != null && s2.getServletName() != null)
                	return s1.getServletName().compareTo(s2.getServletName());
                return -1;
            }
            else if (o1 instanceof Filter) {
                Filter f1 = (Filter) o1;
                Filter f2 = (Filter) o2;
                if (f1.getName() != null && f2.getName() != null)
                	return f1.getName().compareTo(f2.getName());
                return -1;
            }
            else if (o1 instanceof Listener) {
                Listener l1 = (Listener) o1;
                Listener l2 = (Listener) o2;
                if (l1.getListenerClassName() != null && l2.getListenerClassName() !=null)
                	return l1.getListenerClassName().compareTo(l2.getListenerClassName());
                return -1;
            }
            else return -1;
        }
	}
    
    protected WeakReference weakWebApp;
    
    public WebGroupItemProvider(AdapterFactory adapterFactory, WeakReference weakWebApp) {
		super(adapterFactory);
		this.weakWebApp = weakWebApp;
	}
    
    public Collection getSortedChildren(List theChildren) {
		Collections.sort(theChildren, new WebGroupComparator());
		return theChildren;
    }

	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
		weakWebApp = null;
	}
	

	public IFile getAssociatedFile() {

		try { 
			WebApp webapp = (WebApp) weakWebApp.get();
			if(webapp != null && webapp.eResource() != null) {
				return WorkbenchResourceHelperBase.getIFile(webapp.eResource().getURI());
			}
		} catch (Throwable t) {
			
		}
		return null;		
	}
}
