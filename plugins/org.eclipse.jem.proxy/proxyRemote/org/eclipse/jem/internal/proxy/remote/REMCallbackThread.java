/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jem.internal.proxy.remote;
/*
 *  $RCSfile: REMCallbackThread.java,v $
 *  $Revision: 1.6.2.1 $  $Date: 2004/06/24 18:19:03 $ 
 */

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.eclipse.jem.internal.proxy.common.CommandException;
import org.eclipse.jem.internal.proxy.common.remote.Commands;
import org.eclipse.jem.internal.proxy.common.remote.TransmitableArray;
import org.eclipse.jem.internal.proxy.core.*;

/**
 * This thread handles the actual callback.
 * It is package protected because no one else should access it.
 */
class REMCallbackThread extends Thread {
	final REMConnection fConnection;	// A connection to use
	final REMCallbackRegistry fServer;
	final REMStandardBeanProxyFactory fFactory;
	final REMStandardBeanTypeProxyFactory fTypeFactory;
	

	
	// Kludge: Bug in Linux 1.3.xxx of JVM. Closing a socket while the socket is being read/accept will not interrupt the
	// wait. Need to timeout to the socket read/accept before the socket close will be noticed. This has been fixed
	// in Linux 1.4. So on Linux 1.3 need to put timeouts in on those sockets that can be separately closed while reading/accepting.
	static boolean LINUX_1_3 = "linux".equalsIgnoreCase(System.getProperty("os.name")) && System.getProperty("java.version","").startsWith("1.3");	 //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
	
	public REMCallbackThread(Socket socket, REMCallbackRegistry server, String name, REMProxyFactoryRegistry registry, boolean noTimeouts) {
		super(name);
		
		fConnection = new REMConnection(socket, true);	// No timeouts since this is a server thread.
		fServer = server;
		fFactory = (REMStandardBeanProxyFactory) registry.getBeanProxyFactory();
		fTypeFactory = (REMStandardBeanTypeProxyFactory) registry.getBeanTypeProxyFactory();		
	}
	
	/**
	 * Request the thread to close down.
	 */
	public void close() {
		try {
			fConnection.fSocket.close();
		} catch (Exception e) {
		}
	}
	
	
	/*
	 * Return the IREMConnection associated with this callback. Used by
	 * the connection server to return this connection for any requests 
	 * made on this thread.
	 * <package-protected> so that only remote proxy can access.
	 */
	IREMConnection getConnection() {
		return fConnection;
	}
	
	public void run() {

		DataInputStream in = fConnection.in;
		DataOutputStream out = fConnection.out;	
		InputStream ins = null;	
		boolean shutdown = false;
		Commands.ValueObject valueObject = new Commands.ValueObject();	// Working value object so not continually recreated.
		BeanProxyValueSender valueSender = new BeanProxyValueSender();	// Working valuesender so not continually recreated. 
		try {
			boolean doLoop = true;

			/**
			 * Note: In the cases below you will see a lot of finally clauses that null variables out.
			 * This is because this is a long running loop, and variables declared within blocks are not
			 * garbage collected until the method is terminated, so these variables once set would never
			 * be GC'd. The nulling at the end of the case makes sure that any of those objects set are
			 * now available for garbage collection when necessary.
			 */		
			while(doLoop) {
				byte cmd = 0;
				try {
					if (LINUX_1_3)
						fConnection.fSocket.setSoTimeout(1000);	// Linux 1.3 bug, see static LINUX_1_3 above
					cmd = in.readByte();
					if (LINUX_1_3)
						fConnection.fSocket.setSoTimeout(0);	// Linux 1.3 bug, see static LINUX_1_3 above
				} catch (InterruptedIOException e) {
					continue;	// Timed out, try again
				}
					
				switch (cmd) {
					case Commands.QUIT_CONNECTION:				
						doLoop = false;	
						break;	// Close this connection
						
					case Commands.TERMINATE_SERVER:
						doLoop = false;		
						shutdown = true;	// Shutdown everything
						break;
						
					case Commands.CALLBACK:
						int callID = in.readInt();	// The id of the registered callback to call.
						int msgID = in.readInt();	// The id of the message to call.
						Object parm = null;
						Object result = null;
						ICallback cb = null;
						try {
							// The register callback handler will know how to handle the parm,
							// it will know if it is an array of proxies, or an object of some kind.
							fFactory.startTransaction();	// Start a transaction.
							boolean isProxies = true;							
							try {
								Commands.readValue(in, valueObject);
								if (valueObject.type == Commands.ARRAY_IDS) {
									// It is an array containing IDs, as it normally would be.
									// However it will become IBeanProxy[]. That is because if ID's
									// they must be proxies over here.
									valueSender.initialize(valueObject);
									Commands.readArray(in, valueObject.anInt, valueSender, valueObject);
									parm = valueSender.getArray();
								} else {
									// It is object or null. It could be an array of objects, or one object.
									isProxies = false;
									parm = valueObject.getAsObject();
								}
							} finally {
								fFactory.stopTransaction();
							}
							// Now perform the callback.
							cb = fServer.getRegisteredCallback(callID);
							if (cb != null) {
								// Callback still registered. If proxies, then if first entry is just a proxy,
								// then we are sending only one. A convienence factor for callbacks.
								// If not a single entry of IBeanProxy, then send whole array.
								try {
									if (isProxies)
										if (((Object[]) parm).length == 1 && (((Object[]) parm)[0] == null || ((Object[]) parm)[0] instanceof IBeanProxy))
											result = cb.calledBack(msgID, (IBeanProxy) ((Object[]) parm)[0]);
										else
											result = cb.calledBack(msgID, (Object[]) parm);
									else
										result = cb.calledBack(msgID, parm);
									// We only accept null, IREMBeanProxies, and Object[], where
									// contents of Object[] are bean proxies.
									valueObject.set();
									if (result instanceof IREMBeanProxy)
										 ((IREMBeanProxy) result).renderBean(valueObject);
									else if (result instanceof Object[]) {
										class Retriever implements Commands.ValueRetrieve {
											int index = 0;
											Object[] array;
											Commands.ValueObject worker = new Commands.ValueObject();

											public Retriever(Object[] anArray) {
												array = anArray;
											}

											public Commands.ValueObject nextValue() {
												if (index < array.length) {
													Object retParm = array[index++];
													if (retParm != null)
														if (retParm instanceof IREMBeanProxy)
															 ((IREMBeanProxy) retParm).renderBean(worker);
														else if (retParm instanceof TransmitableArray) {
															// It is another array, create a new
															// retriever.
															worker.setArrayIDS(
																new Retriever(((TransmitableArray) retParm).array),
																((TransmitableArray) retParm).array.length,
																((TransmitableArray) retParm).componentTypeID);
														} else {
															// It's an object. Need to get bean
															// type so that we can send it.
															IREMBeanProxy type =
																(IREMBeanProxy) fTypeFactory.getBeanTypeProxy(retParm.getClass().getName());
															if (type == null)
																throw new IllegalArgumentException();
															int classID = type.getID().intValue();
															worker.setAsObject(retParm, classID);
														}
													else
														worker.set();
													return worker;
												} else
													return null;
											}
										};

										valueObject.setArrayIDS(
											new Retriever((Object[]) result),
											((Object[]) result).length,
											Commands.OBJECT_CLASS);
									}
									
									Commands.sendCallbackDoneCommand(out, valueObject, Commands.NO_ERROR);
								} catch (RuntimeException e) {
									// Something happened, turn it into an error object
									// to send back.
									valueObject.set(e.getLocalizedMessage());
									Commands.sendCallbackDoneCommand(out, valueObject, Commands.CALLBACK_RUNTIME_EXCEPTION);
									ProxyPlugin.getPlugin().getLogger().log(e, Level.INFO);	// Just log it, but assume safe enough to just go back and wait for next callback request.
								}
							} else {
								valueObject.set();
								Commands.sendCallbackDoneCommand(out, valueObject, Commands.CALLBACK_NOT_REGISTERED);	// Send error msg back to indicate we weren't registered.								
							}
						} finally {
							parm = null;	// Clear out for GC to work
							result = null;
							cb = null;
							valueObject.set();
							valueSender.clear();
						}
						break;
						
					case Commands.CALLBACK_STREAM:
						// A request for a stream
						callID = in.readInt();	// The id of the registered callback to call.
						msgID = in.readInt();	// The id of the message to call.
						cb = null;
						try {
							// Now perform the callback.
							cb = fServer.getRegisteredCallback(callID);
							if (cb != null) {
								// Callback still registered
								valueObject.set();								
								Commands.sendCallbackDoneCommand(out, valueObject, Commands.NO_ERROR);	// Send null to let it know we've accepted the stream
								ins = new REMCallbackInputStream(in, out);
								try {
									cb.calledBackStream(msgID, ins);
								} finally {
									try {
										ins.close();	// Make sure it's closed.
									} catch (IOException e) {
										// Exception while closing, just log it and then mark to end the loop so we close connection too.
										doLoop = false;
										ProxyPlugin.getPlugin().getLogger().log(new Status(IStatus.ERROR, ProxyPlugin.getPlugin().getBundle().getSymbolicName(), 0, "In REMCallbackThread", e)); //$NON-NLS-1$										
									}
								}
							} else {
								valueObject.set();
								Commands.sendCallbackDoneCommand(out, valueObject, Commands.CALLBACK_NOT_REGISTERED);	// Send error msg back to indicate we weren't registered.								
							}
						} finally {
							cb = null;	// Clear out for GC to work
							ins = null;
							valueObject.set();							
						}
						break;																	
						
					default:
						// Unknown command. We don't know how long the command is, so we need to close the connection.
						ProxyPlugin.getPlugin().getLogger().log(new Status(IStatus.ERROR, ProxyPlugin.getPlugin().getBundle().getSymbolicName(), 0, "REMCallback: Invalid cmd sent="+cmd, null)); //$NON-NLS-1$
						doLoop = false;						
						break;
				}
			}
		} catch (EOFException e) {
			// This is ok. It means that the connection on the other side was terminated.
			// So just accept this and go down.
		} catch (Throwable e) {
			ProxyPlugin.getPlugin().getLogger().log(new Status(IStatus.ERROR, ProxyPlugin.getPlugin().getBundle().getSymbolicName(), 0, "In REMCallbackThread", e)); //$NON-NLS-1$
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (Exception e) {
				}
			if (out != null)
				try {
					out.close();
				} catch (Exception e) {
				}
			close();
		}		
		fServer.removeCallbackThread(this);
		if (shutdown)
			fServer.requestShutdown();
	}
	
	// Helper class for getting an array. All of the values in the array will either
	// be an array or an IBeanProxy.
	private class BeanProxyValueSender implements Commands.ValueSender {
		int index = 0;
		Object[] array;

		public BeanProxyValueSender() {
		}
				
		public BeanProxyValueSender(Commands.ValueObject arrayHeader) {
			initialize(arrayHeader);
		}
		
		public void initialize(Commands.ValueObject arrayHeader) {
			index = 0;
			// The array type doesn't matter, it will be an array of objects.
			// The values will either be IBeanProxies or an array, or constants.
			array = new Object[arrayHeader.anInt];
		}
		
		public void clear() {
			array = null;
			index = 0;
		}
		
		public Object getArray() {
			return array;
		}
					
		// A new value is being sent to the array
		// NOTE: It is important that this has been called within a transaction.
		public void sendValue(Commands.ValueObject value) {
			try {
				array[index++] = fFactory.getBeanProxy(value);	// Add it to the array
			} catch (ThrowableProxy e) {
				// We can't stop it right away because we can't send exception on, however,
				// we can log it and close the socket so next request to the socket will fail.
				ProxyPlugin.getPlugin().getLogger().log(new Status(IStatus.ERROR, ProxyPlugin.getPlugin().getBundle().getSymbolicName(), 0, "", e)); //$NON-NLS-1$
				close();				
			} catch (CommandException e) {
				// We can't stop it right away because we can't send exception on, however,
				// we can log it and close the socket so next request to the socket will fail.
				ProxyPlugin.getPlugin().getLogger().log(new Status(IStatus.ERROR, ProxyPlugin.getPlugin().getBundle().getSymbolicName(), 0, "", e)); //$NON-NLS-1$
				close();
			}
		}
					
		// The next entry is an array too!
		public Commands.ValueSender nestedArray(Commands.ValueObject arrayHeader) {
			BeanProxyValueSender sender = new BeanProxyValueSender(arrayHeader);
			// Take the newly created array and put it into the current array.
			array[index++] = sender.getArray();
			return sender;
		}
	}	
}
