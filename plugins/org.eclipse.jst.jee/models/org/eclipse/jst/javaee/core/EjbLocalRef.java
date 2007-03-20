/**
 * <copyright>
 * </copyright>
 *
 * $Id: EjbLocalRef.java,v 1.1 2007/03/20 18:04:35 jsholl Exp $
 */
package org.eclipse.jst.javaee.core;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ejb Local Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The ejb-local-refType is used by ejb-local-ref elements for
 * 	the declaration of a reference to an enterprise bean's local
 * 	home or to the local business interface of a 3.0 bean.
 *         The declaration consists of:
 * 
 * 	    - an optional description
 * 	    - the EJB reference name used in the code of the Deployment
 * 	      Component that's referencing the enterprise bean.
 * 	    - the optional expected type of the referenced enterprise bean
 * 	    - the optional expected local interface of the referenced
 *               enterprise bean or the local business interface of the
 *               referenced enterprise bean.
 * 	    - the optional expected local home interface of the referenced
 *               enterprise bean. Not applicable if this ejb-local-ref refers
 *               to the local business interface of a 3.0 bean.
 * 	    - optional ejb-link information, used to specify the
 * 	      referenced enterprise bean
 *             - optional elements to define injection of the named enterprise
 *               bean into a component field or property.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.javaee.core.EjbLocalRef#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.EjbLocalRef#getEjbRefName <em>Ejb Ref Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.EjbLocalRef#getEjbRefType <em>Ejb Ref Type</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.EjbLocalRef#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.EjbLocalRef#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.EjbLocalRef#getEjbLink <em>Ejb Link</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.EjbLocalRef#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.EjbLocalRef#getInjectionTargets <em>Injection Targets</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.EjbLocalRef#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getEjbLocalRef()
 * @extends JavaEEObject
 * @generated
 */
public interface EjbLocalRef extends JavaEEObject {
	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.Description}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getEjbLocalRef_Descriptions()
	 * @generated
	 */
	List getDescriptions();

	/**
	 * Returns the value of the '<em><b>Ejb Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ref Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ref Name</em>' attribute.
	 * @see #setEjbRefName(String)
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getEjbLocalRef_EjbRefName()
	 * @generated
	 */
	String getEjbRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getEjbRefName <em>Ejb Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Ref Name</em>' attribute.
	 * @see #getEjbRefName()
	 * @generated
	 */
	void setEjbRefName(String value);

	/**
	 * Returns the value of the '<em><b>Ejb Ref Type</b></em>' attribute.
	 * The default value is <code>"Entity"</code>.
	 * The literals are from the enumeration {@link org.eclipse.jst.javaee.core.EjbRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ref Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ref Type</em>' attribute.
	 * @see org.eclipse.jst.javaee.core.EjbRefType
	 * @see #isSetEjbRefType()
	 * @see #unsetEjbRefType()
	 * @see #setEjbRefType(EjbRefType)
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getEjbLocalRef_EjbRefType()
	 * @generated
	 */
	EjbRefType getEjbRefType();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getEjbRefType <em>Ejb Ref Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Ref Type</em>' attribute.
	 * @see org.eclipse.jst.javaee.core.EjbRefType
	 * @see #isSetEjbRefType()
	 * @see #unsetEjbRefType()
	 * @see #getEjbRefType()
	 * @generated
	 */
	void setEjbRefType(EjbRefType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getEjbRefType <em>Ejb Ref Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEjbRefType()
	 * @see #getEjbRefType()
	 * @see #setEjbRefType(EjbRefType)
	 * @generated
	 */
	void unsetEjbRefType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getEjbRefType <em>Ejb Ref Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ejb Ref Type</em>' attribute is set.
	 * @see #unsetEjbRefType()
	 * @see #getEjbRefType()
	 * @see #setEjbRefType(EjbRefType)
	 * @generated
	 */
	boolean isSetEjbRefType();

	/**
	 * Returns the value of the '<em><b>Local Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Home</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Home</em>' attribute.
	 * @see #setLocalHome(String)
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getEjbLocalRef_LocalHome()
	 * @generated
	 */
	String getLocalHome();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getLocalHome <em>Local Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Home</em>' attribute.
	 * @see #getLocalHome()
	 * @generated
	 */
	void setLocalHome(String value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(String)
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getEjbLocalRef_Local()
	 * @generated
	 */
	String getLocal();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(String value);

	/**
	 * Returns the value of the '<em><b>Ejb Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Link</em>' attribute.
	 * @see #setEjbLink(String)
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getEjbLocalRef_EjbLink()
	 * @generated
	 */
	String getEjbLink();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getEjbLink <em>Ejb Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Link</em>' attribute.
	 * @see #getEjbLink()
	 * @generated
	 */
	void setEjbLink(String value);

	/**
	 * Returns the value of the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 	    
	 * 
	 * 	      A product specific name that this resource should be
	 * 	      mapped to.  The name of this resource, as defined by the
	 * 	      resource's name element or defaulted, is a name that is
	 * 	      local to the application component using the resource.
	 * 	      (It's a name in the JNDI java:comp/env namespace.)  Many
	 * 	      application servers provide a way to map these local
	 * 	      names to names of resources known to the application
	 * 	      server.  This mapped name is often a global JNDI name,
	 * 	      but may be a name of any form.
	 * 
	 * 	      Application servers are not required to support any
	 * 	      particular form or type of mapped name, nor the ability
	 * 	      to use mapped names.  The mapped name is
	 * 	      product-dependent and often installation-dependent.  No
	 * 	      use of a mapped name is portable.
	 * 
	 * 	      
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapped Name</em>' attribute.
	 * @see #setMappedName(String)
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getEjbLocalRef_MappedName()
	 * @generated
	 */
	String getMappedName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getMappedName <em>Mapped Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Name</em>' attribute.
	 * @see #getMappedName()
	 * @generated
	 */
	void setMappedName(String value);

	/**
	 * Returns the value of the '<em><b>Injection Targets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.InjectionTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injection Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injection Targets</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getEjbLocalRef_InjectionTargets()
	 * @generated
	 */
	List getInjectionTargets();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getEjbLocalRef_Id()
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EjbLocalRef