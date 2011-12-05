package lizhx.test.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import lizhx.test.dao.iface.PersonDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BasePersonDAO extends lizhx.test.dao._RootDAO {

	public BasePersonDAO () {}
	
	public BasePersonDAO (Session session) {
		super(session);
	}

	// query name references


	public static PersonDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static PersonDAO getInstance () {
		if (null == instance) instance = new lizhx.test.dao.PersonDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return lizhx.test.Person.class;
	}

    public Order getDefaultOrder () {
		return Order.asc("Name");
    }

	/**
	 * Cast the object as a lizhx.test.Person
	 */
	public lizhx.test.Person cast (Object object) {
		return (lizhx.test.Person) object;
	}

	public lizhx.test.Person get(java.lang.Integer key)
	{
		return (lizhx.test.Person) get(getReferenceClass(), key);
	}

	public lizhx.test.Person get(java.lang.Integer key, Session s)
	{
		return (lizhx.test.Person) get(getReferenceClass(), key, s);
	}

	public lizhx.test.Person load(java.lang.Integer key)
	{
		return (lizhx.test.Person) load(getReferenceClass(), key);
	}

	public lizhx.test.Person load(java.lang.Integer key, Session s)
	{
		return (lizhx.test.Person) load(getReferenceClass(), key, s);
	}

	public lizhx.test.Person loadInitialize(java.lang.Integer key, Session s) 
	{ 
		lizhx.test.Person obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<lizhx.test.Person> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<lizhx.test.Person> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<lizhx.test.Person> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param person a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Integer save(lizhx.test.Person person)
	{
		return (java.lang.Integer) super.save(person);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param person a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Integer save(lizhx.test.Person person, Session s)
	{
		return (java.lang.Integer) save((Object) person, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param person a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(lizhx.test.Person person)
	{
		saveOrUpdate((Object) person);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param person a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(lizhx.test.Person person, Session s)
	{
		saveOrUpdate((Object) person, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param person a transient instance containing updated state
	 */
	public void update(lizhx.test.Person person) 
	{
		update((Object) person);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param person a transient instance containing updated state
	 * @param the Session
	 */
	public void update(lizhx.test.Person person, Session s)
	{
		update((Object) person, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Integer id)
	{
		delete((Object) load(id));
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param id the instance ID to be removed
	 * @param s the Session
	 */
	public void delete(java.lang.Integer id, Session s)
	{
		delete((Object) load(id, s), s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param person the instance to be removed
	 */
	public void delete(lizhx.test.Person person)
	{
		delete((Object) person);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param person the instance to be removed
	 * @param s the Session
	 */
	public void delete(lizhx.test.Person person, Session s)
	{
		delete((Object) person, s);
	}
	
	/**
	 * Re-read the state of the given instance from the underlying database. It is inadvisable to use this to implement
	 * long-running sessions that span many business tasks. This method is, however, useful in certain special circumstances.
	 * For example 
	 * <ul> 
	 * <li>where a database trigger alters the object state upon insert or update</li>
	 * <li>after executing direct SQL (eg. a mass update) in the same session</li>
	 * <li>after inserting a Blob or Clob</li>
	 * </ul>
	 */
	public void refresh (lizhx.test.Person person, Session s)
	{
		refresh((Object) person, s);
	}


}