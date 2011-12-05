package lizhx.test.dao;

import org.hibernate.Session;

import lizhx.test.base.BasePersonDAO;


public class PersonDAO extends BasePersonDAO implements lizhx.test.dao.iface.PersonDAO {

	public PersonDAO () {}
	
	public PersonDAO (Session session) {
		super(session);
	}


}