// CallProdedure.java
package ch13;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallProdedure
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
		CallableStatement cstm = null;
		try
		{
			// �������ݿ�URL
			con = DriverManager.getConnection(conURL);

			// ���ô洢����
			String[] id = { "00002", "00003" };
			int i;
			cstm = con.prepareCall("{call sp_totalmoney(?,?)}");
			for (i = 0; i < id.length; i++)
			{
				cstm.setString(1, id[i]);
				cstm.registerOutParameter(2, java.sql.Types.FLOAT);
				cstm.execute();
				System.out.println(id[i] + "�������ܽ�" + cstm.getFloat(2));
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
				if (cstm != null)
				{
					cstm.close();
					cstm = null;
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
