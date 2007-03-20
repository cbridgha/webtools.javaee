/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityBeanImpl.java,v 1.1 2007/03/20 18:04:37 jsholl Exp $
 */
package org.eclipse.jst.javaee.ejb.internal.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jst.javaee.core.Description;
import org.eclipse.jst.javaee.core.DisplayName;
import org.eclipse.jst.javaee.core.EjbLocalRef;
import org.eclipse.jst.javaee.core.EjbRef;
import org.eclipse.jst.javaee.core.EnvEntry;
import org.eclipse.jst.javaee.core.Icon;
import org.eclipse.jst.javaee.core.LifecycleCallback;
import org.eclipse.jst.javaee.core.MessageDestinationRef;
import org.eclipse.jst.javaee.core.PersistenceContextRef;
import org.eclipse.jst.javaee.core.PersistenceUnitRef;
import org.eclipse.jst.javaee.core.ResourceEnvRef;
import org.eclipse.jst.javaee.core.ResourceRef;
import org.eclipse.jst.javaee.core.SecurityRoleRef;
import org.eclipse.jst.javaee.core.ServiceRef;

import org.eclipse.jst.javaee.ejb.CMPField;
import org.eclipse.jst.javaee.ejb.CmpVersionType;
import org.eclipse.jst.javaee.ejb.EntityBean;
import org.eclipse.jst.javaee.ejb.PersistenceType;
import org.eclipse.jst.javaee.ejb.Query;
import org.eclipse.jst.javaee.ejb.SecurityIdentityType;

import org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getDisplayNames <em>Display Names</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getIcons <em>Icons</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getPrimKeyClass <em>Prim Key Class</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#isReentrant <em>Reentrant</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getCmpVersion <em>Cmp Version</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getAbstractSchemaName <em>Abstract Schema Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getCmpFields <em>Cmp Fields</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getPrimkeyField <em>Primkey Field</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getEnvEntries <em>Env Entries</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getEjbRefs <em>Ejb Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getEjbLocalRefs <em>Ejb Local Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getServiceRefs <em>Service Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getResourceRefs <em>Resource Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getResourceEnvRefs <em>Resource Env Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getMessageDestinationRefs <em>Message Destination Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getPersistenceContextRefs <em>Persistence Context Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getPersistenceUnitRefs <em>Persistence Unit Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getPostConstructs <em>Post Constructs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getPreDestroys <em>Pre Destroys</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getSecurityRoleRefs <em>Security Role Refs</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityBeanImpl extends EObjectImpl implements EntityBean {
	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList descriptions = null;

	/**
	 * The cached value of the '{@link #getDisplayNames() <em>Display Names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayNames()
	 * @generated
	 * @ordered
	 */
	protected EList displayNames = null;

	/**
	 * The cached value of the '{@link #getIcons() <em>Icons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcons()
	 * @generated
	 * @ordered
	 */
	protected EList icons = null;

	/**
	 * The default value of the '{@link #getEjbName() <em>Ejb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbName()
	 * @generated
	 * @ordered
	 */
	protected static final String EJB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEjbName() <em>Ejb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbName()
	 * @generated
	 * @ordered
	 */
	protected String ejbName = EJB_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMappedName() <em>Mapped Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappedName() <em>Mapped Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedName()
	 * @generated
	 * @ordered
	 */
	protected String mappedName = MAPPED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHome() <em>Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHome() <em>Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome()
	 * @generated
	 * @ordered
	 */
	protected String home = HOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote()
	 * @generated
	 * @ordered
	 */
	protected String remote = REMOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalHome() <em>Local Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalHome()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_HOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalHome() <em>Local Home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalHome()
	 * @generated
	 * @ordered
	 */
	protected String localHome = LOCAL_HOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected String local = LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEjbClass() <em>Ejb Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbClass()
	 * @generated
	 * @ordered
	 */
	protected static final String EJB_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEjbClass() <em>Ejb Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbClass()
	 * @generated
	 * @ordered
	 */
	protected String ejbClass = EJB_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected static final PersistenceType PERSISTENCE_TYPE_EDEFAULT = PersistenceType.BEAN_LITERAL;

	/**
	 * The cached value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected PersistenceType persistenceType = PERSISTENCE_TYPE_EDEFAULT;

	/**
	 * This is true if the Persistence Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean persistenceTypeESet = false;

	/**
	 * The default value of the '{@link #getPrimKeyClass() <em>Prim Key Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimKeyClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIM_KEY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimKeyClass() <em>Prim Key Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimKeyClass()
	 * @generated
	 * @ordered
	 */
	protected String primKeyClass = PRIM_KEY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isReentrant() <em>Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REENTRANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReentrant() <em>Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected boolean reentrant = REENTRANT_EDEFAULT;

	/**
	 * This is true if the Reentrant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reentrantESet = false;

	/**
	 * The default value of the '{@link #getCmpVersion() <em>Cmp Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmpVersion()
	 * @generated
	 * @ordered
	 */
	protected static final CmpVersionType CMP_VERSION_EDEFAULT = CmpVersionType._1X_LITERAL;

	/**
	 * The cached value of the '{@link #getCmpVersion() <em>Cmp Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmpVersion()
	 * @generated
	 * @ordered
	 */
	protected CmpVersionType cmpVersion = CMP_VERSION_EDEFAULT;

	/**
	 * This is true if the Cmp Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cmpVersionESet = false;

	/**
	 * The default value of the '{@link #getAbstractSchemaName() <em>Abstract Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractSchemaName() <em>Abstract Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String abstractSchemaName = ABSTRACT_SCHEMA_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCmpFields() <em>Cmp Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmpFields()
	 * @generated
	 * @ordered
	 */
	protected EList cmpFields = null;

	/**
	 * The default value of the '{@link #getPrimkeyField() <em>Primkey Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimkeyField()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMKEY_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimkeyField() <em>Primkey Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimkeyField()
	 * @generated
	 * @ordered
	 */
	protected String primkeyField = PRIMKEY_FIELD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnvEntries() <em>Env Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvEntries()
	 * @generated
	 * @ordered
	 */
	protected EList envEntries = null;

	/**
	 * The cached value of the '{@link #getEjbRefs() <em>Ejb Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbRefs()
	 * @generated
	 * @ordered
	 */
	protected EList ejbRefs = null;

	/**
	 * The cached value of the '{@link #getEjbLocalRefs() <em>Ejb Local Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbLocalRefs()
	 * @generated
	 * @ordered
	 */
	protected EList ejbLocalRefs = null;

	/**
	 * The cached value of the '{@link #getServiceRefs() <em>Service Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRefs()
	 * @generated
	 * @ordered
	 */
	protected EList serviceRefs = null;

	/**
	 * The cached value of the '{@link #getResourceRefs() <em>Resource Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRefs()
	 * @generated
	 * @ordered
	 */
	protected EList resourceRefs = null;

	/**
	 * The cached value of the '{@link #getResourceEnvRefs() <em>Resource Env Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvRefs()
	 * @generated
	 * @ordered
	 */
	protected EList resourceEnvRefs = null;

	/**
	 * The cached value of the '{@link #getMessageDestinationRefs() <em>Message Destination Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDestinationRefs()
	 * @generated
	 * @ordered
	 */
	protected EList messageDestinationRefs = null;

	/**
	 * The cached value of the '{@link #getPersistenceContextRefs() <em>Persistence Context Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceContextRefs()
	 * @generated
	 * @ordered
	 */
	protected EList persistenceContextRefs = null;

	/**
	 * The cached value of the '{@link #getPersistenceUnitRefs() <em>Persistence Unit Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnitRefs()
	 * @generated
	 * @ordered
	 */
	protected EList persistenceUnitRefs = null;

	/**
	 * The cached value of the '{@link #getPostConstructs() <em>Post Constructs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostConstructs()
	 * @generated
	 * @ordered
	 */
	protected EList postConstructs = null;

	/**
	 * The cached value of the '{@link #getPreDestroys() <em>Pre Destroys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreDestroys()
	 * @generated
	 * @ordered
	 */
	protected EList preDestroys = null;

	/**
	 * The cached value of the '{@link #getSecurityRoleRefs() <em>Security Role Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRoleRefs()
	 * @generated
	 * @ordered
	 */
	protected EList securityRoleRefs = null;

	/**
	 * The cached value of the '{@link #getSecurityIdentity() <em>Security Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityIdentity()
	 * @generated
	 * @ordered
	 */
	protected SecurityIdentityType securityIdentity = null;

	/**
	 * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueries()
	 * @generated
	 * @ordered
	 */
	protected EList queries = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EjbPackage.Literals.ENTITY_BEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getDescriptions() {
		if (descriptions == null) {
			descriptions = new EObjectContainmentEList(Description.class, this, EjbPackage.ENTITY_BEAN__DESCRIPTIONS);
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getDisplayNames() {
		if (displayNames == null) {
			displayNames = new EObjectContainmentEList(DisplayName.class, this, EjbPackage.ENTITY_BEAN__DISPLAY_NAMES);
		}
		return displayNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getIcons() {
		if (icons == null) {
			icons = new EObjectContainmentEList(Icon.class, this, EjbPackage.ENTITY_BEAN__ICONS);
		}
		return icons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEjbName() {
		return ejbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbName(String newEjbName) {
		String oldEjbName = ejbName;
		ejbName = newEjbName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__EJB_NAME, oldEjbName, ejbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappedName() {
		return mappedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedName(String newMappedName) {
		String oldMappedName = mappedName;
		mappedName = newMappedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__MAPPED_NAME, oldMappedName, mappedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHome() {
		return home;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome(String newHome) {
		String oldHome = home;
		home = newHome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__HOME, oldHome, home));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemote() {
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(String newRemote) {
		String oldRemote = remote;
		remote = newRemote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__REMOTE, oldRemote, remote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalHome() {
		return localHome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalHome(String newLocalHome) {
		String oldLocalHome = localHome;
		localHome = newLocalHome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__LOCAL_HOME, oldLocalHome, localHome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(String newLocal) {
		String oldLocal = local;
		local = newLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__LOCAL, oldLocal, local));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEjbClass() {
		return ejbClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbClass(String newEjbClass) {
		String oldEjbClass = ejbClass;
		ejbClass = newEjbClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__EJB_CLASS, oldEjbClass, ejbClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceType getPersistenceType() {
		return persistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceType(PersistenceType newPersistenceType) {
		PersistenceType oldPersistenceType = persistenceType;
		persistenceType = newPersistenceType == null ? PERSISTENCE_TYPE_EDEFAULT : newPersistenceType;
		boolean oldPersistenceTypeESet = persistenceTypeESet;
		persistenceTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__PERSISTENCE_TYPE, oldPersistenceType, persistenceType, !oldPersistenceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPersistenceType() {
		PersistenceType oldPersistenceType = persistenceType;
		boolean oldPersistenceTypeESet = persistenceTypeESet;
		persistenceType = PERSISTENCE_TYPE_EDEFAULT;
		persistenceTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EjbPackage.ENTITY_BEAN__PERSISTENCE_TYPE, oldPersistenceType, PERSISTENCE_TYPE_EDEFAULT, oldPersistenceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPersistenceType() {
		return persistenceTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimKeyClass() {
		return primKeyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimKeyClass(String newPrimKeyClass) {
		String oldPrimKeyClass = primKeyClass;
		primKeyClass = newPrimKeyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__PRIM_KEY_CLASS, oldPrimKeyClass, primKeyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReentrant() {
		return reentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReentrant(boolean newReentrant) {
		boolean oldReentrant = reentrant;
		reentrant = newReentrant;
		boolean oldReentrantESet = reentrantESet;
		reentrantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__REENTRANT, oldReentrant, reentrant, !oldReentrantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReentrant() {
		boolean oldReentrant = reentrant;
		boolean oldReentrantESet = reentrantESet;
		reentrant = REENTRANT_EDEFAULT;
		reentrantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EjbPackage.ENTITY_BEAN__REENTRANT, oldReentrant, REENTRANT_EDEFAULT, oldReentrantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReentrant() {
		return reentrantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmpVersionType getCmpVersion() {
		return cmpVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmpVersion(CmpVersionType newCmpVersion) {
		CmpVersionType oldCmpVersion = cmpVersion;
		cmpVersion = newCmpVersion == null ? CMP_VERSION_EDEFAULT : newCmpVersion;
		boolean oldCmpVersionESet = cmpVersionESet;
		cmpVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__CMP_VERSION, oldCmpVersion, cmpVersion, !oldCmpVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCmpVersion() {
		CmpVersionType oldCmpVersion = cmpVersion;
		boolean oldCmpVersionESet = cmpVersionESet;
		cmpVersion = CMP_VERSION_EDEFAULT;
		cmpVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EjbPackage.ENTITY_BEAN__CMP_VERSION, oldCmpVersion, CMP_VERSION_EDEFAULT, oldCmpVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCmpVersion() {
		return cmpVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstractSchemaName() {
		return abstractSchemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractSchemaName(String newAbstractSchemaName) {
		String oldAbstractSchemaName = abstractSchemaName;
		abstractSchemaName = newAbstractSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__ABSTRACT_SCHEMA_NAME, oldAbstractSchemaName, abstractSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getCmpFields() {
		if (cmpFields == null) {
			cmpFields = new EObjectContainmentEList(CMPField.class, this, EjbPackage.ENTITY_BEAN__CMP_FIELDS);
		}
		return cmpFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimkeyField() {
		return primkeyField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimkeyField(String newPrimkeyField) {
		String oldPrimkeyField = primkeyField;
		primkeyField = newPrimkeyField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__PRIMKEY_FIELD, oldPrimkeyField, primkeyField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getEnvEntries() {
		if (envEntries == null) {
			envEntries = new EObjectContainmentEList(EnvEntry.class, this, EjbPackage.ENTITY_BEAN__ENV_ENTRIES);
		}
		return envEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getEjbRefs() {
		if (ejbRefs == null) {
			ejbRefs = new EObjectContainmentEList(EjbRef.class, this, EjbPackage.ENTITY_BEAN__EJB_REFS);
		}
		return ejbRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getEjbLocalRefs() {
		if (ejbLocalRefs == null) {
			ejbLocalRefs = new EObjectContainmentEList(EjbLocalRef.class, this, EjbPackage.ENTITY_BEAN__EJB_LOCAL_REFS);
		}
		return ejbLocalRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getServiceRefs() {
		if (serviceRefs == null) {
			serviceRefs = new EObjectContainmentEList(ServiceRef.class, this, EjbPackage.ENTITY_BEAN__SERVICE_REFS);
		}
		return serviceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getResourceRefs() {
		if (resourceRefs == null) {
			resourceRefs = new EObjectContainmentEList(ResourceRef.class, this, EjbPackage.ENTITY_BEAN__RESOURCE_REFS);
		}
		return resourceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getResourceEnvRefs() {
		if (resourceEnvRefs == null) {
			resourceEnvRefs = new EObjectContainmentEList(ResourceEnvRef.class, this, EjbPackage.ENTITY_BEAN__RESOURCE_ENV_REFS);
		}
		return resourceEnvRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getMessageDestinationRefs() {
		if (messageDestinationRefs == null) {
			messageDestinationRefs = new EObjectContainmentEList(MessageDestinationRef.class, this, EjbPackage.ENTITY_BEAN__MESSAGE_DESTINATION_REFS);
		}
		return messageDestinationRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPersistenceContextRefs() {
		if (persistenceContextRefs == null) {
			persistenceContextRefs = new EObjectContainmentEList(PersistenceContextRef.class, this, EjbPackage.ENTITY_BEAN__PERSISTENCE_CONTEXT_REFS);
		}
		return persistenceContextRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPersistenceUnitRefs() {
		if (persistenceUnitRefs == null) {
			persistenceUnitRefs = new EObjectContainmentEList(PersistenceUnitRef.class, this, EjbPackage.ENTITY_BEAN__PERSISTENCE_UNIT_REFS);
		}
		return persistenceUnitRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPostConstructs() {
		if (postConstructs == null) {
			postConstructs = new EObjectContainmentEList(LifecycleCallback.class, this, EjbPackage.ENTITY_BEAN__POST_CONSTRUCTS);
		}
		return postConstructs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPreDestroys() {
		if (preDestroys == null) {
			preDestroys = new EObjectContainmentEList(LifecycleCallback.class, this, EjbPackage.ENTITY_BEAN__PRE_DESTROYS);
		}
		return preDestroys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSecurityRoleRefs() {
		if (securityRoleRefs == null) {
			securityRoleRefs = new EObjectContainmentEList(SecurityRoleRef.class, this, EjbPackage.ENTITY_BEAN__SECURITY_ROLE_REFS);
		}
		return securityRoleRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityIdentityType getSecurityIdentity() {
		return securityIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityIdentity(SecurityIdentityType newSecurityIdentity, NotificationChain msgs) {
		SecurityIdentityType oldSecurityIdentity = securityIdentity;
		securityIdentity = newSecurityIdentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__SECURITY_IDENTITY, oldSecurityIdentity, newSecurityIdentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityIdentity(SecurityIdentityType newSecurityIdentity) {
		if (newSecurityIdentity != securityIdentity) {
			NotificationChain msgs = null;
			if (securityIdentity != null)
				msgs = ((InternalEObject)securityIdentity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbPackage.ENTITY_BEAN__SECURITY_IDENTITY, null, msgs);
			if (newSecurityIdentity != null)
				msgs = ((InternalEObject)newSecurityIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbPackage.ENTITY_BEAN__SECURITY_IDENTITY, null, msgs);
			msgs = basicSetSecurityIdentity(newSecurityIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__SECURITY_IDENTITY, newSecurityIdentity, newSecurityIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getQueries() {
		if (queries == null) {
			queries = new EObjectContainmentEList(Query.class, this, EjbPackage.ENTITY_BEAN__QUERIES);
		}
		return queries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbPackage.ENTITY_BEAN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbPackage.ENTITY_BEAN__DESCRIPTIONS:
				return ((InternalEList)getDescriptions()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__DISPLAY_NAMES:
				return ((InternalEList)getDisplayNames()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__ICONS:
				return ((InternalEList)getIcons()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__CMP_FIELDS:
				return ((InternalEList)getCmpFields()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__ENV_ENTRIES:
				return ((InternalEList)getEnvEntries()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__EJB_REFS:
				return ((InternalEList)getEjbRefs()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__EJB_LOCAL_REFS:
				return ((InternalEList)getEjbLocalRefs()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__SERVICE_REFS:
				return ((InternalEList)getServiceRefs()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__RESOURCE_REFS:
				return ((InternalEList)getResourceRefs()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__RESOURCE_ENV_REFS:
				return ((InternalEList)getResourceEnvRefs()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__MESSAGE_DESTINATION_REFS:
				return ((InternalEList)getMessageDestinationRefs()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_CONTEXT_REFS:
				return ((InternalEList)getPersistenceContextRefs()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_UNIT_REFS:
				return ((InternalEList)getPersistenceUnitRefs()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__POST_CONSTRUCTS:
				return ((InternalEList)getPostConstructs()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__PRE_DESTROYS:
				return ((InternalEList)getPreDestroys()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__SECURITY_ROLE_REFS:
				return ((InternalEList)getSecurityRoleRefs()).basicRemove(otherEnd, msgs);
			case EjbPackage.ENTITY_BEAN__SECURITY_IDENTITY:
				return basicSetSecurityIdentity(null, msgs);
			case EjbPackage.ENTITY_BEAN__QUERIES:
				return ((InternalEList)getQueries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EjbPackage.ENTITY_BEAN__DESCRIPTIONS:
				return getDescriptions();
			case EjbPackage.ENTITY_BEAN__DISPLAY_NAMES:
				return getDisplayNames();
			case EjbPackage.ENTITY_BEAN__ICONS:
				return getIcons();
			case EjbPackage.ENTITY_BEAN__EJB_NAME:
				return getEjbName();
			case EjbPackage.ENTITY_BEAN__MAPPED_NAME:
				return getMappedName();
			case EjbPackage.ENTITY_BEAN__HOME:
				return getHome();
			case EjbPackage.ENTITY_BEAN__REMOTE:
				return getRemote();
			case EjbPackage.ENTITY_BEAN__LOCAL_HOME:
				return getLocalHome();
			case EjbPackage.ENTITY_BEAN__LOCAL:
				return getLocal();
			case EjbPackage.ENTITY_BEAN__EJB_CLASS:
				return getEjbClass();
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_TYPE:
				return getPersistenceType();
			case EjbPackage.ENTITY_BEAN__PRIM_KEY_CLASS:
				return getPrimKeyClass();
			case EjbPackage.ENTITY_BEAN__REENTRANT:
				return isReentrant() ? Boolean.TRUE : Boolean.FALSE;
			case EjbPackage.ENTITY_BEAN__CMP_VERSION:
				return getCmpVersion();
			case EjbPackage.ENTITY_BEAN__ABSTRACT_SCHEMA_NAME:
				return getAbstractSchemaName();
			case EjbPackage.ENTITY_BEAN__CMP_FIELDS:
				return getCmpFields();
			case EjbPackage.ENTITY_BEAN__PRIMKEY_FIELD:
				return getPrimkeyField();
			case EjbPackage.ENTITY_BEAN__ENV_ENTRIES:
				return getEnvEntries();
			case EjbPackage.ENTITY_BEAN__EJB_REFS:
				return getEjbRefs();
			case EjbPackage.ENTITY_BEAN__EJB_LOCAL_REFS:
				return getEjbLocalRefs();
			case EjbPackage.ENTITY_BEAN__SERVICE_REFS:
				return getServiceRefs();
			case EjbPackage.ENTITY_BEAN__RESOURCE_REFS:
				return getResourceRefs();
			case EjbPackage.ENTITY_BEAN__RESOURCE_ENV_REFS:
				return getResourceEnvRefs();
			case EjbPackage.ENTITY_BEAN__MESSAGE_DESTINATION_REFS:
				return getMessageDestinationRefs();
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_CONTEXT_REFS:
				return getPersistenceContextRefs();
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_UNIT_REFS:
				return getPersistenceUnitRefs();
			case EjbPackage.ENTITY_BEAN__POST_CONSTRUCTS:
				return getPostConstructs();
			case EjbPackage.ENTITY_BEAN__PRE_DESTROYS:
				return getPreDestroys();
			case EjbPackage.ENTITY_BEAN__SECURITY_ROLE_REFS:
				return getSecurityRoleRefs();
			case EjbPackage.ENTITY_BEAN__SECURITY_IDENTITY:
				return getSecurityIdentity();
			case EjbPackage.ENTITY_BEAN__QUERIES:
				return getQueries();
			case EjbPackage.ENTITY_BEAN__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EjbPackage.ENTITY_BEAN__DESCRIPTIONS:
				getDescriptions().clear();
				getDescriptions().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__DISPLAY_NAMES:
				getDisplayNames().clear();
				getDisplayNames().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__ICONS:
				getIcons().clear();
				getIcons().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__EJB_NAME:
				setEjbName((String)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__MAPPED_NAME:
				setMappedName((String)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__HOME:
				setHome((String)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__REMOTE:
				setRemote((String)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__LOCAL_HOME:
				setLocalHome((String)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__LOCAL:
				setLocal((String)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__EJB_CLASS:
				setEjbClass((String)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_TYPE:
				setPersistenceType((PersistenceType)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__PRIM_KEY_CLASS:
				setPrimKeyClass((String)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__REENTRANT:
				setReentrant(((Boolean)newValue).booleanValue());
				return;
			case EjbPackage.ENTITY_BEAN__CMP_VERSION:
				setCmpVersion((CmpVersionType)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__ABSTRACT_SCHEMA_NAME:
				setAbstractSchemaName((String)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__CMP_FIELDS:
				getCmpFields().clear();
				getCmpFields().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__PRIMKEY_FIELD:
				setPrimkeyField((String)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__ENV_ENTRIES:
				getEnvEntries().clear();
				getEnvEntries().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__EJB_REFS:
				getEjbRefs().clear();
				getEjbRefs().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__EJB_LOCAL_REFS:
				getEjbLocalRefs().clear();
				getEjbLocalRefs().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__SERVICE_REFS:
				getServiceRefs().clear();
				getServiceRefs().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__RESOURCE_REFS:
				getResourceRefs().clear();
				getResourceRefs().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__RESOURCE_ENV_REFS:
				getResourceEnvRefs().clear();
				getResourceEnvRefs().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__MESSAGE_DESTINATION_REFS:
				getMessageDestinationRefs().clear();
				getMessageDestinationRefs().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_CONTEXT_REFS:
				getPersistenceContextRefs().clear();
				getPersistenceContextRefs().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_UNIT_REFS:
				getPersistenceUnitRefs().clear();
				getPersistenceUnitRefs().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__POST_CONSTRUCTS:
				getPostConstructs().clear();
				getPostConstructs().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__PRE_DESTROYS:
				getPreDestroys().clear();
				getPreDestroys().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__SECURITY_ROLE_REFS:
				getSecurityRoleRefs().clear();
				getSecurityRoleRefs().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__QUERIES:
				getQueries().clear();
				getQueries().addAll((Collection)newValue);
				return;
			case EjbPackage.ENTITY_BEAN__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case EjbPackage.ENTITY_BEAN__DESCRIPTIONS:
				getDescriptions().clear();
				return;
			case EjbPackage.ENTITY_BEAN__DISPLAY_NAMES:
				getDisplayNames().clear();
				return;
			case EjbPackage.ENTITY_BEAN__ICONS:
				getIcons().clear();
				return;
			case EjbPackage.ENTITY_BEAN__EJB_NAME:
				setEjbName(EJB_NAME_EDEFAULT);
				return;
			case EjbPackage.ENTITY_BEAN__MAPPED_NAME:
				setMappedName(MAPPED_NAME_EDEFAULT);
				return;
			case EjbPackage.ENTITY_BEAN__HOME:
				setHome(HOME_EDEFAULT);
				return;
			case EjbPackage.ENTITY_BEAN__REMOTE:
				setRemote(REMOTE_EDEFAULT);
				return;
			case EjbPackage.ENTITY_BEAN__LOCAL_HOME:
				setLocalHome(LOCAL_HOME_EDEFAULT);
				return;
			case EjbPackage.ENTITY_BEAN__LOCAL:
				setLocal(LOCAL_EDEFAULT);
				return;
			case EjbPackage.ENTITY_BEAN__EJB_CLASS:
				setEjbClass(EJB_CLASS_EDEFAULT);
				return;
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_TYPE:
				unsetPersistenceType();
				return;
			case EjbPackage.ENTITY_BEAN__PRIM_KEY_CLASS:
				setPrimKeyClass(PRIM_KEY_CLASS_EDEFAULT);
				return;
			case EjbPackage.ENTITY_BEAN__REENTRANT:
				unsetReentrant();
				return;
			case EjbPackage.ENTITY_BEAN__CMP_VERSION:
				unsetCmpVersion();
				return;
			case EjbPackage.ENTITY_BEAN__ABSTRACT_SCHEMA_NAME:
				setAbstractSchemaName(ABSTRACT_SCHEMA_NAME_EDEFAULT);
				return;
			case EjbPackage.ENTITY_BEAN__CMP_FIELDS:
				getCmpFields().clear();
				return;
			case EjbPackage.ENTITY_BEAN__PRIMKEY_FIELD:
				setPrimkeyField(PRIMKEY_FIELD_EDEFAULT);
				return;
			case EjbPackage.ENTITY_BEAN__ENV_ENTRIES:
				getEnvEntries().clear();
				return;
			case EjbPackage.ENTITY_BEAN__EJB_REFS:
				getEjbRefs().clear();
				return;
			case EjbPackage.ENTITY_BEAN__EJB_LOCAL_REFS:
				getEjbLocalRefs().clear();
				return;
			case EjbPackage.ENTITY_BEAN__SERVICE_REFS:
				getServiceRefs().clear();
				return;
			case EjbPackage.ENTITY_BEAN__RESOURCE_REFS:
				getResourceRefs().clear();
				return;
			case EjbPackage.ENTITY_BEAN__RESOURCE_ENV_REFS:
				getResourceEnvRefs().clear();
				return;
			case EjbPackage.ENTITY_BEAN__MESSAGE_DESTINATION_REFS:
				getMessageDestinationRefs().clear();
				return;
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_CONTEXT_REFS:
				getPersistenceContextRefs().clear();
				return;
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_UNIT_REFS:
				getPersistenceUnitRefs().clear();
				return;
			case EjbPackage.ENTITY_BEAN__POST_CONSTRUCTS:
				getPostConstructs().clear();
				return;
			case EjbPackage.ENTITY_BEAN__PRE_DESTROYS:
				getPreDestroys().clear();
				return;
			case EjbPackage.ENTITY_BEAN__SECURITY_ROLE_REFS:
				getSecurityRoleRefs().clear();
				return;
			case EjbPackage.ENTITY_BEAN__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)null);
				return;
			case EjbPackage.ENTITY_BEAN__QUERIES:
				getQueries().clear();
				return;
			case EjbPackage.ENTITY_BEAN__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EjbPackage.ENTITY_BEAN__DESCRIPTIONS:
				return descriptions != null && !descriptions.isEmpty();
			case EjbPackage.ENTITY_BEAN__DISPLAY_NAMES:
				return displayNames != null && !displayNames.isEmpty();
			case EjbPackage.ENTITY_BEAN__ICONS:
				return icons != null && !icons.isEmpty();
			case EjbPackage.ENTITY_BEAN__EJB_NAME:
				return EJB_NAME_EDEFAULT == null ? ejbName != null : !EJB_NAME_EDEFAULT.equals(ejbName);
			case EjbPackage.ENTITY_BEAN__MAPPED_NAME:
				return MAPPED_NAME_EDEFAULT == null ? mappedName != null : !MAPPED_NAME_EDEFAULT.equals(mappedName);
			case EjbPackage.ENTITY_BEAN__HOME:
				return HOME_EDEFAULT == null ? home != null : !HOME_EDEFAULT.equals(home);
			case EjbPackage.ENTITY_BEAN__REMOTE:
				return REMOTE_EDEFAULT == null ? remote != null : !REMOTE_EDEFAULT.equals(remote);
			case EjbPackage.ENTITY_BEAN__LOCAL_HOME:
				return LOCAL_HOME_EDEFAULT == null ? localHome != null : !LOCAL_HOME_EDEFAULT.equals(localHome);
			case EjbPackage.ENTITY_BEAN__LOCAL:
				return LOCAL_EDEFAULT == null ? local != null : !LOCAL_EDEFAULT.equals(local);
			case EjbPackage.ENTITY_BEAN__EJB_CLASS:
				return EJB_CLASS_EDEFAULT == null ? ejbClass != null : !EJB_CLASS_EDEFAULT.equals(ejbClass);
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_TYPE:
				return isSetPersistenceType();
			case EjbPackage.ENTITY_BEAN__PRIM_KEY_CLASS:
				return PRIM_KEY_CLASS_EDEFAULT == null ? primKeyClass != null : !PRIM_KEY_CLASS_EDEFAULT.equals(primKeyClass);
			case EjbPackage.ENTITY_BEAN__REENTRANT:
				return isSetReentrant();
			case EjbPackage.ENTITY_BEAN__CMP_VERSION:
				return isSetCmpVersion();
			case EjbPackage.ENTITY_BEAN__ABSTRACT_SCHEMA_NAME:
				return ABSTRACT_SCHEMA_NAME_EDEFAULT == null ? abstractSchemaName != null : !ABSTRACT_SCHEMA_NAME_EDEFAULT.equals(abstractSchemaName);
			case EjbPackage.ENTITY_BEAN__CMP_FIELDS:
				return cmpFields != null && !cmpFields.isEmpty();
			case EjbPackage.ENTITY_BEAN__PRIMKEY_FIELD:
				return PRIMKEY_FIELD_EDEFAULT == null ? primkeyField != null : !PRIMKEY_FIELD_EDEFAULT.equals(primkeyField);
			case EjbPackage.ENTITY_BEAN__ENV_ENTRIES:
				return envEntries != null && !envEntries.isEmpty();
			case EjbPackage.ENTITY_BEAN__EJB_REFS:
				return ejbRefs != null && !ejbRefs.isEmpty();
			case EjbPackage.ENTITY_BEAN__EJB_LOCAL_REFS:
				return ejbLocalRefs != null && !ejbLocalRefs.isEmpty();
			case EjbPackage.ENTITY_BEAN__SERVICE_REFS:
				return serviceRefs != null && !serviceRefs.isEmpty();
			case EjbPackage.ENTITY_BEAN__RESOURCE_REFS:
				return resourceRefs != null && !resourceRefs.isEmpty();
			case EjbPackage.ENTITY_BEAN__RESOURCE_ENV_REFS:
				return resourceEnvRefs != null && !resourceEnvRefs.isEmpty();
			case EjbPackage.ENTITY_BEAN__MESSAGE_DESTINATION_REFS:
				return messageDestinationRefs != null && !messageDestinationRefs.isEmpty();
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_CONTEXT_REFS:
				return persistenceContextRefs != null && !persistenceContextRefs.isEmpty();
			case EjbPackage.ENTITY_BEAN__PERSISTENCE_UNIT_REFS:
				return persistenceUnitRefs != null && !persistenceUnitRefs.isEmpty();
			case EjbPackage.ENTITY_BEAN__POST_CONSTRUCTS:
				return postConstructs != null && !postConstructs.isEmpty();
			case EjbPackage.ENTITY_BEAN__PRE_DESTROYS:
				return preDestroys != null && !preDestroys.isEmpty();
			case EjbPackage.ENTITY_BEAN__SECURITY_ROLE_REFS:
				return securityRoleRefs != null && !securityRoleRefs.isEmpty();
			case EjbPackage.ENTITY_BEAN__SECURITY_IDENTITY:
				return securityIdentity != null;
			case EjbPackage.ENTITY_BEAN__QUERIES:
				return queries != null && !queries.isEmpty();
			case EjbPackage.ENTITY_BEAN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ejbName: "); //$NON-NLS-1$
		result.append(ejbName);
		result.append(", mappedName: "); //$NON-NLS-1$
		result.append(mappedName);
		result.append(", home: "); //$NON-NLS-1$
		result.append(home);
		result.append(", remote: "); //$NON-NLS-1$
		result.append(remote);
		result.append(", localHome: "); //$NON-NLS-1$
		result.append(localHome);
		result.append(", local: "); //$NON-NLS-1$
		result.append(local);
		result.append(", ejbClass: "); //$NON-NLS-1$
		result.append(ejbClass);
		result.append(", persistenceType: "); //$NON-NLS-1$
		if (persistenceTypeESet) result.append(persistenceType); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", primKeyClass: "); //$NON-NLS-1$
		result.append(primKeyClass);
		result.append(", reentrant: "); //$NON-NLS-1$
		if (reentrantESet) result.append(reentrant); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", cmpVersion: "); //$NON-NLS-1$
		if (cmpVersionESet) result.append(cmpVersion); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", abstractSchemaName: "); //$NON-NLS-1$
		result.append(abstractSchemaName);
		result.append(", primkeyField: "); //$NON-NLS-1$
		result.append(primkeyField);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EntityBeanImpl