package lizhx.test;

import lizhx.test.base.BasePerson;



public class Person extends BasePerson {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Person () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Person (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Person (
		java.lang.Integer id,
		java.lang.String name) {

		super (
			id,
			name);
	}

/*[CONSTRUCTOR MARKER END]*/


}