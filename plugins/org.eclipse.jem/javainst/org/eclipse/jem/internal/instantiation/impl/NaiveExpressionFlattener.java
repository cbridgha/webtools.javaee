/*******************************************************************************
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 *  $RCSfile: NaiveExpressionFlattener.java,v $
 *  $Revision: 1.11 $  $Date: 2006/08/16 18:32:28 $ 
 */
package org.eclipse.jem.internal.instantiation.impl;

import java.text.MessageFormat;
import java.util.List;

import org.eclipse.jem.internal.instantiation.*;
 
/**
 * This naively flattens the ParseTree. It just works with what's there.
 * 
 * @since 1.0.0
 */
public class NaiveExpressionFlattener extends ParseVisitor {
	
	private StringBuffer buffer = new StringBuffer(100);
	
	protected final StringBuffer getStringBuffer() {
		return buffer;
	}
	
	/**
	 * Return the string result of the flattening.
	 * @return The flattened string.
	 * 
	 * @since 1.0.0
	 */
	public String getResult() {
		return buffer.toString();
	}
	
	/**
	 * Reset the result so that flattener can be used again.
	 * 
	 * @since 1.0.0
	 */
	public void reset() {
		buffer.setLength(0);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTAnonymousClassDeclaration)
	 */
	public boolean visit(PTAnonymousClassDeclaration node) {
		buffer.append(node.getDeclaration());
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTArrayAccess)
	 */
	public boolean visit(PTArrayAccess node) {
		node.getArray().accept(this);
		if (!node.getIndexes().isEmpty()) {
			List indexes = node.getIndexes();
			for (int i = 0; i < indexes.size(); i++) {
				buffer.append('[');
				((PTExpression) indexes.get(i)).accept(this);
				buffer.append(']');
			}
		}
		return false;
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTArrayCreation)
	 */
	public boolean visit(PTArrayCreation node) {
        String arrayType = node.getType();
        int ob = arrayType.indexOf('[');
        String type = handleQualifiedName(arrayType.substring(0, ob));
        buffer.append("new "); //$NON-NLS-1$
        buffer.append(type);
        int realdims = 0;
        while (ob != -1) {
                realdims++;
                ob = arrayType.indexOf('[',ob+1);
        }
        List dims = node.getDimensions();
        for (int i = 0; i < dims.size(); i++) {
                buffer.append('[');
                ((PTExpression) dims.get(i)).accept(this);
                buffer.append(']');
        }
        for (int i=dims.size(); i < realdims; i++) {
                buffer.append("[]"); //$NON-NLS-1$
        }

        if (node.getInitializer() != null) {
                buffer.append(' ');
                ((PTExpression) node.getInitializer()).accept(this);
        }

        return false;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTArrayInitializer)
	 */
	public boolean visit(PTArrayInitializer node) {
		buffer.append('{');
		List exp = node.getExpressions();
		for (int i = 0; i < exp.size(); i++) {
			if (i != 0)
				buffer.append(", "); //$NON-NLS-1$
			((PTExpression) exp.get(i)).accept(this);
		}
		buffer.append('}');
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTBooleanLiteral)
	 */
	public boolean visit(PTBooleanLiteral node) {
		buffer.append(node.isBooleanValue() ? "true" : "false"); //$NON-NLS-1$ //$NON-NLS-2$
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTCastExpression)
	 */
	public boolean visit(PTCastExpression node) {
		buffer.append('(');
		buffer.append(handleQualifiedName(node.getType()));
		buffer.append(") "); //$NON-NLS-1$
		node.getExpression().accept(this);
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTCharacterLiteral)
	 */
	public boolean visit(PTCharacterLiteral node) {
		buffer.append(node.getEscapedValue());
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTClassInstanceCreation)
	 */
	public boolean visit(PTClassInstanceCreation node) {
		buffer.append("new "); //$NON-NLS-1$
		buffer.append(handleQualifiedName(node.getType()));
		buffer.append('(');
		List args = node.getArguments();
		for (int i = 0; i < args.size(); i++) {
			if (i != 0)
				buffer.append(", "); //$NON-NLS-1$
			((PTExpression) args.get(i)).accept(this);
		}
		buffer.append(')');
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTConditionalExpression)
	 */
	public boolean visit(PTConditionalExpression node) {
		node.getCondition().accept(this);
		buffer.append(" ? "); //$NON-NLS-1$
		node.getTrue().accept(this);
		buffer.append(" : "); //$NON-NLS-1$
		node.getFalse().accept(this);
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTFieldAccess)
	 */
	public boolean visit(PTFieldAccess node) {
		node.getReceiver().accept(this);
		buffer.append('.');
		buffer.append(node.getField());
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTInfixExpression)
	 */
	public boolean visit(PTInfixExpression node) {
		node.getLeftOperand().accept(this);
		buffer.append(' ');
		String oper = node.getOperator().getOperator();
		buffer.append(oper);
		buffer.append(' ');
		node.getRightOperand().accept(this);
		List ext = node.getExtendedOperands();
		for (int i = 0; i < ext.size(); i++) {
			buffer.append(' ');
			buffer.append(oper);
			buffer.append(' ');
			((PTExpression) ext.get(i)).accept(this);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTInstanceof)
	 */
	public boolean visit(PTInstanceof node) {
		node.getOperand().accept(this);
		buffer.append(" instanceof "); //$NON-NLS-1$
		buffer.append(handleQualifiedName(node.getType()));
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTInvalidExpression)
	 */
	public boolean visit(PTInvalidExpression node) {
		buffer.append(MessageFormat.format(InstantiationImplMessages.NaiveExpressionFlattener_InvalidExpression, new Object[]{node.getMessage()})); 
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTMethodInvocation)
	 */
	public boolean visit(PTMethodInvocation node) {
		if (node.getReceiver() != null) {
			node.getReceiver().accept(this);
			buffer.append('.');
		}
		
		buffer.append(node.getName());
		buffer.append('(');
		List args = node.getArguments();
		for (int i = 0; i < args.size(); i++) {
			if (i != 0)
				buffer.append(", "); //$NON-NLS-1$
			((PTExpression) args.get(i)).accept(this);
		}
		buffer.append(')');
		return false;	
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTName)
	 */
	public boolean visit(PTName node) {
		buffer.append(handleQualifiedName(node.getName()));
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTNullLiteral)
	 */
	public boolean visit(PTNullLiteral node) {
		buffer.append("null"); //$NON-NLS-1$
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTNumberLiteral)
	 */
	public boolean visit(PTNumberLiteral node) {
		buffer.append(node.getToken());
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTParenthesizedExpression)
	 */
	public boolean visit(PTParenthesizedExpression node) {
		buffer.append('(');
		node.getExpression().accept(this);
		buffer.append(')');
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTPrefixExpression)
	 */
	public boolean visit(PTPrefixExpression node) {
		buffer.append(node.getOperator().getOperator());
		node.getExpression().accept(this);
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTStringLiteral)
	 */
	public boolean visit(PTStringLiteral node) {
		buffer.append(node.getEscapedValue());
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTThisLiteral)
	 */
	public boolean visit(PTThisLiteral node) {
		buffer.append("this"); //$NON-NLS-1$
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jem.internal.instantiation.ParseVisitor#visit(org.eclipse.jem.internal.instantiation.PTTypeLiteral)
	 */
	public boolean visit(PTTypeLiteral node) {
		buffer.append(handleQualifiedName(node.getType()));
		buffer.append(".class"); //$NON-NLS-1$
		return false;
	}
	
	/**
	 * This method enables one to overide the handling of qualified names.
	 * The default operation is to do nothing.
	 * 
	 * Overriders may choose to use short names, relying on import statement handling.
	 * 
	 * @param qName  
	 * @return Name to use for the flattened result
	 */
	protected String handleQualifiedName(String qName) {
		return qName;
	}

}
