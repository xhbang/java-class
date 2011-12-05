package lizhx.app;
import lizhx.test.*;
import lizhx.test.dao.*;

public class Test {

	public static void main(String args[])
	{
	try
	{
	_RootDAO.initialize();
	PersonDAO persondao = new PersonDAO();
	Person person = new Person();
	person.setName("Lizhx");
	person.setSex("M");
	person.setAddress("http://Java.lizhx.net.cn");
	persondao.save(person);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}

}
