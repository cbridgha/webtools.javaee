/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee;

import org.eclipse.jst.j2ee.internal.xml.J2EEXMLResourceHandler;




public class WrappedRuntimeException extends RuntimeException implements IWrappedException {
	/** The exception which necessitated this runtime exception, if one exists */
	protected Exception nestedException;
public WrappedRuntimeException() {
	super();
}
public WrappedRuntimeException(Exception e) {
	super();
	setNestedException(e);
}
public WrappedRuntimeException(String s) {
	super(s);
}
public WrappedRuntimeException(String s, Exception e) {
	super(s);
	setNestedException(e);
}
/**
 * Return the messages from this and all nested exceptions, in order from outermost to innermost
 */
public java.lang.String[] getAllMessages() {
	return ExceptionHelper.getAllMessages(this);
}
/**
 * Return the messages from this and all nested exceptions, in order from outermost to innermost,
 * concatenated as one
 */
public java.lang.String getConcatenatedMessages() {
	return ExceptionHelper.getConcatenatedMessages(this);
}
/**
 * @return java.lang.Exception
 */
public java.lang.Exception getNestedException() {
	return nestedException;
}
/**
 * Print out a stack trace to the system err.
 */
public void printStackTrace() {
	printStackTrace(System.err);
}
/**
* Prints the exception to System.err.
* If we have a nested exception, print its stack.
*/
public void printStackTrace(java.io.PrintStream s) {
	if (nestedException != null) {
		s.println(this);
		s.println(J2EEXMLResourceHandler.getString("Stack_trace_of_nested_exce")); //$NON-NLS-1$ = "Stack trace of nested exception:"
		nestedException.printStackTrace(s);
	} else {
		super.printStackTrace(s);
	}
}
/**
* Prints the exception to System.err.
* If we have a nested exception, print its stack.
*/
public void printStackTrace(java.io.PrintWriter s) {
	if (nestedException != null) {
		s.println(this);
		s.println(J2EEXMLResourceHandler.getString("Stack_trace_of_nested_exce")); //$NON-NLS-1$ = "Stack trace of nested exception:"
		nestedException.printStackTrace(s);
	} else {
		super.printStackTrace(s);
	}
}
/**
 * @param newNestedException java.lang.Exception
 */
public void setNestedException(java.lang.Exception newNestedException) {
	nestedException = newNestedException;
}
}


