/*******************************************************************************
 * Copyright (c) 2008 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Kaloyan Raev, kaloyan.raev@sap.com - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.internal.common.operations;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

import org.eclipse.jdt.core.Signature;

public class ImportsCollection implements Collection<String> {
	
	private Collection<String> collection;
	private CreateJavaEEArtifactTemplateModel model;
	
	public ImportsCollection(CreateJavaEEArtifactTemplateModel model) {
		collection = new TreeSet<String>();
		this.model = model;
	}

	public boolean add(String o) {
		if (!isImportInJavaLang(o) && !isImportInSamePackage(o))
			return collection.add(o);

		return false;
	}

	public boolean addAll(Collection<? extends String> c) {
		boolean result = false;
		
		for (String o : c)
			result = result | this.add(o);
		
		return result;
	}

	public void clear() {
		collection.clear();
	}

	public boolean contains(Object o) {
		return collection.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		return collection.containsAll(c);
	}

	public boolean isEmpty() {
		return collection.isEmpty();
	}

	public Iterator<String> iterator() {
		return collection.iterator();
	}

	public boolean remove(Object o) {
		return collection.remove(o);
	}

	public boolean removeAll(Collection<?> c) {
		return collection.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return collection.retainAll(c);
	}

	public int size() {
		return collection.size();
	}

	public Object[] toArray() {
		return collection.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return collection.toArray(a);
	}
	
    private boolean isImportInJavaLang(String quilifiedName) {
    	String qualifier = Signature.getQualifier(quilifiedName);
    	return quilifiedName.startsWith("java.lang."); //$NON-NLS-1$
    }
    
    private boolean isImportInSamePackage(String quilifiedName) {
    	String qualifier = Signature.getQualifier(quilifiedName);
    	return qualifier.equals(model.getJavaPackageName());
    }

}
