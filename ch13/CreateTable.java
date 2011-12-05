// CreateTable.java
package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// ����JDBC������������
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		// ����JDBC��url����
		String conURL = "jdbc:sqlserver://localhost;databaseName=TestDB;user=dbuser;password=dbuser";
		try
		{
			// ����JDBC��������
			Class.forName(JDriver);
		}
		catch (java.lang.ClassNotFoundException e)
		{
			System.out.println("�޷�����JDBC��������" + e.getMessage());
		}
		Connection con = null;
		Statement s = null;
		try
		{
			// �������ݿ�URL
			con = DriverManager.getConnection(conURL);
			// ����Statement�����
			s = con.createStatement();
			// ����һ�����������ֶεĹ˿ͱ�conumser
			String query = "create table consumer(" + "id char(10) not null,"
					+ "name char(15)," + "totalmoney float"
					+ ")";
			s.executeUpdate(query); // ִ��SQL���
			
			System.out.println("������ɹ���");

		}
		catch (SQLException e)
		{
			System.out.println("SQLException:" + e.getMessage());
		}
		finally
		{
			try
			{
				if (s != null)
				{
					s.close();
					s = null;
				}
				if (con != null)
				{
					con.close(); // �ر������ݿ������
					con = null;
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

}
