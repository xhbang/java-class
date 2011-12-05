package lizhx.test.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the person table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="person"
 */

public abstract class BasePerson  implements Serializable {

	public static String REF = "Person";
	public static String PROP_SEX = "Sex";
	public static String PROP_ADDRESS = "Address";
	public static String PROP_NAME = "Name";
	public static String PROP_ID = "Id";


	// constructors
	public BasePerson () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePerson (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BasePerson (
		java.lang.Integer id,
		java.lang.String name) {

		this.setId(id);
		this.setName(name);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String address;
	private java.lang.String name;
	private java.lang.String sex;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="ID"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: Address
	 */
	public java.lang.String getAddress () {
		return address;
	}

	/**
	 * Set the value related to the column: Address
	 * @param address the Address value
	 */
	public void setAddress (java.lang.String address) {
		this.address = address;
	}



	/**
	 * Return the value associated with the column: Name
	 */
	public java.lang.String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: Name
	 * @param name the Name value
	 */
	public void setName (java.lang.String name) {
		this.name = name;
	}



	/**
	 * Return the value associated with the column: Sex
	 */
	public java.lang.String getSex () {
		return sex;
	}

	/**
	 * Set the value related to the column: Sex
	 * @param sex the Sex value
	 */
	public void setSex (java.lang.String sex) {
		this.sex = sex;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof lizhx.test.Person)) return false;
		else {
			lizhx.test.Person person = (lizhx.test.Person) obj;
			if (null == this.getId() || null == person.getId()) return false;
			else return (this.getId().equals(person.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}