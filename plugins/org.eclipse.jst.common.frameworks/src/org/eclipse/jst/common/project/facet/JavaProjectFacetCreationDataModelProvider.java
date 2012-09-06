/*******************************************************************************
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.common.project.facet;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jst.common.project.facet.core.JavaFacet;
import org.eclipse.wst.common.componentcore.datamodel.FacetProjectCreationDataModelProvider;

public class JavaProjectFacetCreationDataModelProvider extends FacetProjectCreationDataModelProvider {

	public JavaProjectFacetCreationDataModelProvider() {
		super();
	}

	@Override
	public void init() {
		super.init();

        Collection requiredFacets = new ArrayList();
        requiredFacets.add(JavaFacet.FACET);
        setProperty(REQUIRED_FACETS_COLLECTION, requiredFacets);
	}

}
