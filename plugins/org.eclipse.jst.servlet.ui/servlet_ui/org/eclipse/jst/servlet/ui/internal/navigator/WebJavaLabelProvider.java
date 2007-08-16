/*******************************************************************************
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/ 
package org.eclipse.jst.servlet.ui.internal.navigator;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.ui.ProblemsLabelDecorator;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class WebJavaLabelProvider implements ILabelProvider {
	
	private ILabelDecorator decorator = new ProblemsLabelDecorator();

	public Image getImage(Object element) {
		Image image = null;
		if(element instanceof ICompressedNode)
			image = ((ICompressedNode)element).getImage(); 
		
		IJavaElement javaElement = null;
		if(image != null && ( javaElement = ((ICompressedNode)element).getJavaElement()) != null ) {			
			image = decorator.decorateImage(image, javaElement);
		}
		return image;
	}

	public String getText(Object element) {
		String text = null;
		if(element instanceof ICompressedNode)
			text = ((ICompressedNode)element).getLabel(); 

		IJavaElement javaElement = null;
		if(text != null && ( javaElement = ((ICompressedNode)element).getJavaElement()) != null ) {
			text = decorator.decorateText(text, javaElement);
		}
		return text;
	}

	public void addListener(ILabelProviderListener listener) { 

	}

	public void dispose() { 
		decorator.dispose();
	}

	public boolean isLabelProperty(Object element, String property) { 
		return false;
	}

	public void removeListener(ILabelProviderListener listener) { 

	}

}
