package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord
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
		PreparedStatement ps = null;
		Statement s = null;
		try
		{
			// �������ݿ�URL
			con = DriverManager.getConnection(conURL);			

			// ɾ���ڶ�����¼
			ps = con.prepareStatement("delete from consumer where id=?");
			ps.setString(1, "00002");
			ps.executeUpdate();

			// ��ѯ���ݿⲢ�����ݱ�������������Ļ��
			s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from consumer");
			System.out.println("id \t\tname \t\ttotalmoney");
			while (rs.next())
			{
				System.out.println(rs.getString("id") + "\t"
						+ rs.getString("name") + "\t" + rs.getInt("totalmoney"));
			}

		}
		catch (SQLException e)
		{
			System.out.println("SQLException:" + e.getMessage());
		}
		finally
		{
			try
			{
				if (ps != null)
				{
					ps.close();
					ps = null;
				}
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
