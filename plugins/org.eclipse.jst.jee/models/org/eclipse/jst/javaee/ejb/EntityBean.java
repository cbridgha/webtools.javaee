/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityBean.java,v 1.1 2007/03/20 18:04:36 jsholl Exp $
 */
package org.eclipse.jst.javaee.ejb;

import java.util.List;

import org.eclipse.jst.javaee.core.JavaEEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The entity-beanType declares an entity bean. The declaration
 * 	consists of:
 * 
 * 	    - an optional description
 * 	    - an optional display name
 * 	    - an optional icon element that contains a small and a large
 * 	      icon file name
 * 	    - a unique name assigned to the enterprise bean
 * 	      in the deployment descriptor
 *             - an optional mapped-name element that can be used to provide
 *               vendor-specific deployment information such as the physical
 *               jndi-name of the entity bean's remote home interface. This
 *               element is not required to be supported by all implementations.
 *               Any use of this element is non-portable.
 * 	    - the names of the entity bean's remote home
 * 	      and remote interfaces, if any
 * 	    - the names of the entity bean's local home and local
 * 	      interfaces, if any
 * 	    - the entity bean's implementation class
 * 	    - the optional entity bean's persistence management type. If
 *               this element is not specified it is defaulted to Container.
 * 	    - the entity bean's primary key class name
 * 	    - an indication of the entity bean's reentrancy
 * 	    - an optional specification of the
 * 	      entity bean's cmp-version
 * 	    - an optional specification of the entity bean's
 * 	      abstract schema name
 * 	    - an optional list of container-managed fields
 * 	    - an optional specification of the primary key
 * 	      field
 * 	    - an optional declaration of the bean's environment
 * 	      entries
 * 	    - an optional declaration of the bean's EJB
 * 	      references
 * 	    - an optional declaration of the bean's local
 * 	      EJB references
 * 	    - an optional declaration of the bean's web
 * 	      service references
 * 	    - an optional declaration of the security role
 * 	      references
 * 	    - an optional declaration of the security identity
 * 	      to be used for the execution of the bean's methods
 * 	    - an optional declaration of the bean's
 * 	      resource manager connection factory references
 * 	    - an optional declaration of the bean's
 * 	      resource environment references
 * 	    - an optional declaration of the bean's message
 * 	      destination references
 * 	    - an optional set of query declarations
 * 	      for finder and select methods for an entity
 * 	      bean with cmp-version 2.x.
 * 
 * 	The optional abstract-schema-name element must be specified
 * 	for an entity bean with container-managed persistence and
 * 	cmp-version 2.x.
 * 
 * 	The optional primkey-field may be present in the descriptor
 * 	if the entity's persistence-type is Container.
 * 
 * 	The optional cmp-version element may be present in the
 * 	descriptor if the entity's persistence-type is Container. If
 * 	the persistence-type is Container and the cmp-version
 * 	element is not specified, its value defaults to 2.x.
 * 
 * 	The optional home and remote elements must be specified if
 * 	the entity bean cmp-version is 1.x.
 * 
 * 	The optional home and remote elements must be specified if
 * 	the entity bean has a remote home and remote interface.
 * 
 * 	The optional local-home and local elements must be specified
 * 	if the entity bean has a local home and local interface.
 * 
 * 	Either both the local-home and the local elements or both
 * 	the home and the remote elements must be specified.
 * 
 * 	The optional query elements must be present if the
 * 	persistence-type is Container and the cmp-version is 2.x and
 * 	query methods other than findByPrimaryKey have been defined
 * 	for the entity bean.
 * 
 * 	The other elements that are optional are "optional" in the
 * 	sense that they are omitted if the lists represented by them
 * 	are empty.
 * 
 * 	At least one cmp-field element must be present in the
 * 	descriptor if the entity's persistence-type is Container and
 * 	the cmp-version is 1.x, and none must not be present if the
 * 	entity's persistence-type is Bean.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getDisplayNames <em>Display Names</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getIcons <em>Icons</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getPrimKeyClass <em>Prim Key Class</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#isReentrant <em>Reentrant</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getCmpVersion <em>Cmp Version</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getAbstractSchemaName <em>Abstract Schema Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getCmpFields <em>Cmp Fields</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getPrimkeyField <em>Primkey Field</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getEnvEntries <em>Env Entries</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getEjbRefs <em>Ejb Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getEjbLocalRefs <em>Ejb Local Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getServiceRefs <em>Service Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getResourceRefs <em>Resource Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getResourceEnvRefs <em>Resource Env Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getMessageDestinationRefs <em>Message Destination Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceContextRefs <em>Persistence Context Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceUnitRefs <em>Persistence Unit Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getPostConstructs <em>Post Constructs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getPreDestroys <em>Pre Destroys</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getSecurityRoleRefs <em>Security Role Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getQueries <em>Queries</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EntityBean#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean()
 * @extends JavaEEObject
 * @generated
 */
public interface EntityBean extends JavaEEObject {
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
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_Descriptions()
	 * @generated
	 */
	List getDescriptions();

	/**
	 * Returns the value of the '<em><b>Display Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.DisplayName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Names</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_DisplayNames()
	 * @generated
	 */
	List getDisplayNames();

	/**
	 * Returns the value of the '<em><b>Icons</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.Icon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icons</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_Icons()
	 * @generated
	 */
	List getIcons();

	/**
	 * Returns the value of the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Name</em>' attribute.
	 * @see #setEjbName(String)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_EjbName()
	 * @generated
	 */
	String getEjbName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getEjbName <em>Ejb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Name</em>' attribute.
	 * @see #getEjbName()
	 * @generated
	 */
	void setEjbName(String value);

	/**
	 * Returns the value of the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Name</em>' attribute.
	 * @see #setMappedName(String)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_MappedName()
	 * @generated
	 */
	String getMappedName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getMappedName <em>Mapped Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Name</em>' attribute.
	 * @see #getMappedName()
	 * @generated
	 */
	void setMappedName(String value);

	/**
	 * Returns the value of the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' attribute.
	 * @see #setHome(String)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_Home()
	 * @generated
	 */
	String getHome();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getHome <em>Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' attribute.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(String value);

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' attribute.
	 * @see #setRemote(String)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_Remote()
	 * @generated
	 */
	String getRemote();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' attribute.
	 * @see #getRemote()
	 * @generated
	 */
	void setRemote(String value);

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
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_LocalHome()
	 * @generated
	 */
	String getLocalHome();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getLocalHome <em>Local Home</em>}' attribute.
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
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_Local()
	 * @generated
	 */
	String getLocal();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(String value);

	/**
	 * Returns the value of the '<em><b>Ejb Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Class</em>' attribute.
	 * @see #setEjbClass(String)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_EjbClass()
	 * @generated
	 */
	String getEjbClass();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getEjbClass <em>Ejb Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Class</em>' attribute.
	 * @see #getEjbClass()
	 * @generated
	 */
	void setEjbClass(String value);

	/**
	 * Returns the value of the '<em><b>Persistence Type</b></em>' attribute.
	 * The default value is <code>"Bean"</code>.
	 * The literals are from the enumeration {@link org.eclipse.jst.javaee.ejb.PersistenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Type</em>' attribute.
	 * @see org.eclipse.jst.javaee.ejb.PersistenceType
	 * @see #isSetPersistenceType()
	 * @see #unsetPersistenceType()
	 * @see #setPersistenceType(PersistenceType)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_PersistenceType()
	 * @generated
	 */
	PersistenceType getPersistenceType();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceType <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Type</em>' attribute.
	 * @see org.eclipse.jst.javaee.ejb.PersistenceType
	 * @see #isSetPersistenceType()
	 * @see #unsetPersistenceType()
	 * @see #getPersistenceType()
	 * @generated
	 */
	void setPersistenceType(PersistenceType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceType <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersistenceType()
	 * @see #getPersistenceType()
	 * @see #setPersistenceType(PersistenceType)
	 * @generated
	 */
	void unsetPersistenceType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceType <em>Persistence Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Persistence Type</em>' attribute is set.
	 * @see #unsetPersistenceType()
	 * @see #getPersistenceType()
	 * @see #setPersistenceType(PersistenceType)
	 * @generated
	 */
	boolean isSetPersistenceType();

	/**
	 * Returns the value of the '<em><b>Prim Key Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The prim-key-class element contains the
	 * 	    fully-qualified name of an
	 * 	    entity bean's primary key class.
	 * 
	 * 	    If the definition of the primary key class is
	 * 	    deferred to deployment time, the prim-key-class
	 * 	    element should specify java.lang.Object.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prim Key Class</em>' attribute.
	 * @see #setPrimKeyClass(String)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_PrimKeyClass()
	 * @generated
	 */
	String getPrimKeyClass();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPrimKeyClass <em>Prim Key Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prim Key Class</em>' attribute.
	 * @see #getPrimKeyClass()
	 * @generated
	 */
	void setPrimKeyClass(String value);

	/**
	 * Returns the value of the '<em><b>Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The reentrant element specifies whether an entity
	 * 	    bean is reentrant or not.
	 * 
	 * 	    The reentrant element must be one of the two
	 * 	    following: true or false
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reentrant</em>' attribute.
	 * @see #isSetReentrant()
	 * @see #unsetReentrant()
	 * @see #setReentrant(boolean)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_Reentrant()
	 * @generated
	 */
	boolean isReentrant();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#isReentrant <em>Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reentrant</em>' attribute.
	 * @see #isSetReentrant()
	 * @see #unsetReentrant()
	 * @see #isReentrant()
	 * @generated
	 */
	void setReentrant(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#isReentrant <em>Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReentrant()
	 * @see #isReentrant()
	 * @see #setReentrant(boolean)
	 * @generated
	 */
	void unsetReentrant();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#isReentrant <em>Reentrant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reentrant</em>' attribute is set.
	 * @see #unsetReentrant()
	 * @see #isReentrant()
	 * @see #setReentrant(boolean)
	 * @generated
	 */
	boolean isSetReentrant();

	/**
	 * Returns the value of the '<em><b>Cmp Version</b></em>' attribute.
	 * The default value is <code>"1.x"</code>.
	 * The literals are from the enumeration {@link org.eclipse.jst.javaee.ejb.CmpVersionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmp Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmp Version</em>' attribute.
	 * @see org.eclipse.jst.javaee.ejb.CmpVersionType
	 * @see #isSetCmpVersion()
	 * @see #unsetCmpVersion()
	 * @see #setCmpVersion(CmpVersionType)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_CmpVersion()
	 * @generated
	 */
	CmpVersionType getCmpVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getCmpVersion <em>Cmp Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmp Version</em>' attribute.
	 * @see org.eclipse.jst.javaee.ejb.CmpVersionType
	 * @see #isSetCmpVersion()
	 * @see #unsetCmpVersion()
	 * @see #getCmpVersion()
	 * @generated
	 */
	void setCmpVersion(CmpVersionType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getCmpVersion <em>Cmp Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCmpVersion()
	 * @see #getCmpVersion()
	 * @see #setCmpVersion(CmpVersionType)
	 * @generated
	 */
	void unsetCmpVersion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getCmpVersion <em>Cmp Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cmp Version</em>' attribute is set.
	 * @see #unsetCmpVersion()
	 * @see #getCmpVersion()
	 * @see #setCmpVersion(CmpVersionType)
	 * @generated
	 */
	boolean isSetCmpVersion();

	/**
	 * Returns the value of the '<em><b>Abstract Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The abstract-schema-name element specifies the name
	 * 	    of the abstract schema type of an entity bean with
	 * 	    cmp-version 2.x. It is used in EJB QL queries.
	 * 
	 * 	    For example, the abstract-schema-name for an entity
	 * 	    bean whose local interface is
	 * 	    com.acme.commerce.Order might be Order.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Schema Name</em>' attribute.
	 * @see #setAbstractSchemaName(String)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_AbstractSchemaName()
	 * @generated
	 */
	String getAbstractSchemaName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getAbstractSchemaName <em>Abstract Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Schema Name</em>' attribute.
	 * @see #getAbstractSchemaName()
	 * @generated
	 */
	void setAbstractSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Cmp Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.ejb.CMPField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmp Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmp Fields</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_CmpFields()
	 * @generated
	 */
	List getCmpFields();

	/**
	 * Returns the value of the '<em><b>Primkey Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The primkey-field element is used to specify the
	 * 	    name of the primary key field for an entity with
	 * 	    container-managed persistence.
	 * 
	 * 	    The primkey-field must be one of the fields declared
	 * 	    in the cmp-field element, and the type of the field
	 * 	    must be the same as the primary key type.
	 * 
	 * 	    The primkey-field element is not used if the primary
	 * 	    key maps to multiple container-managed fields
	 * 	    (i.e. the key is a compound key). In this case, the
	 * 	    fields of the primary key class must be public, and
	 * 	    their names must correspond to the field names of
	 * 	    the entity bean class that comprise the key.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primkey Field</em>' attribute.
	 * @see #setPrimkeyField(String)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_PrimkeyField()
	 * @generated
	 */
	String getPrimkeyField();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPrimkeyField <em>Primkey Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primkey Field</em>' attribute.
	 * @see #getPrimkeyField()
	 * @generated
	 */
	void setPrimkeyField(String value);

	/**
	 * Returns the value of the '<em><b>Env Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.EnvEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entries</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_EnvEntries()
	 * @generated
	 */
	List getEnvEntries();

	/**
	 * Returns the value of the '<em><b>Ejb Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.EjbRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Refs</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_EjbRefs()
	 * @generated
	 */
	List getEjbRefs();

	/**
	 * Returns the value of the '<em><b>Ejb Local Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.EjbLocalRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Local Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Local Refs</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_EjbLocalRefs()
	 * @generated
	 */
	List getEjbLocalRefs();

	/**
	 * Returns the value of the '<em><b>Service Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.ServiceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Refs</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_ServiceRefs()
	 * @generated
	 */
	List getServiceRefs();

	/**
	 * Returns the value of the '<em><b>Resource Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.ResourceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Refs</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_ResourceRefs()
	 * @generated
	 */
	List getResourceRefs();

	/**
	 * Returns the value of the '<em><b>Resource Env Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.ResourceEnvRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Env Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Env Refs</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_ResourceEnvRefs()
	 * @generated
	 */
	List getResourceEnvRefs();

	/**
	 * Returns the value of the '<em><b>Message Destination Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.MessageDestinationRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Destination Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Destination Refs</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_MessageDestinationRefs()
	 * @generated
	 */
	List getMessageDestinationRefs();

	/**
	 * Returns the value of the '<em><b>Persistence Context Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.PersistenceContextRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Context Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Context Refs</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_PersistenceContextRefs()
	 * @generated
	 */
	List getPersistenceContextRefs();

	/**
	 * Returns the value of the '<em><b>Persistence Unit Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.PersistenceUnitRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Unit Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Unit Refs</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_PersistenceUnitRefs()
	 * @generated
	 */
	List getPersistenceUnitRefs();

	/**
	 * Returns the value of the '<em><b>Post Constructs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.LifecycleCallback}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Constructs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Constructs</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_PostConstructs()
	 * @generated
	 */
	List getPostConstructs();

	/**
	 * Returns the value of the '<em><b>Pre Destroys</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.LifecycleCallback}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Destroys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Destroys</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_PreDestroys()
	 * @generated
	 */
	List getPreDestroys();

	/**
	 * Returns the value of the '<em><b>Security Role Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.SecurityRoleRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role Refs</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_SecurityRoleRefs()
	 * @generated
	 */
	List getSecurityRoleRefs();

	/**
	 * Returns the value of the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Identity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Identity</em>' containment reference.
	 * @see #setSecurityIdentity(SecurityIdentityType)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_SecurityIdentity()
	 * @generated
	 */
	SecurityIdentityType getSecurityIdentity();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getSecurityIdentity <em>Security Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Identity</em>' containment reference.
	 * @see #getSecurityIdentity()
	 * @generated
	 */
	void setSecurityIdentity(SecurityIdentityType value);

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.ejb.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_Queries()
	 * @generated
	 */
	List getQueries();

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
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEntityBean_Id()
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EntityBean#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EntityBean