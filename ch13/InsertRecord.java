package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord
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
			// ʹ��SQL����insert���������˿ͼ�¼������
			String r1 = "insert into consumer values('00001','����',360)";
			String r2 = "insert into consumer values('00002','��ǿ',728)";
			String r3 = "insert into consumer values('00003','����',1182)";
			s.executeUpdate(r1);
			s.executeUpdate(r2);
			s.executeUpdate(r3);
			
			System.out.println("�������ݳɹ���");

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
