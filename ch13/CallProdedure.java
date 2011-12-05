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
		// 声明JDBC驱动程序类型
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		// 定义JDBC的url对象
		String conURL = "jdbc:sqlserver://localhost;databaseName=TestDB;user=dbuser;password=dbuser";
		try
		{
			// 加载JDBC驱动程序
			Class.forName(JDriver);
		}
		catch (java.lang.ClassNotFoundException e)
		{
			System.out.println("无法加载JDBC驱动程序。" + e.getMessage());
		}
		Connection con = null;
		CallableStatement cstm = null;
		try
		{
			// 连接数据库URL
			con = DriverManager.getConnection(conURL);

			// 调用存储过程
			String[] id = { "00002", "00003" };
			int i;
			cstm = con.prepareCall("{call sp_totalmoney(?,?)}");
			for (i = 0; i < id.length; i++)
			{
				cstm.setString(1, id[i]);
				cstm.registerOutParameter(2, java.sql.Types.FLOAT);
				cstm.execute();
				System.out.println(id[i] + "的消费总金额：" + cstm.getFloat(2));
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
					con.close(); // 关闭与数据库的连接
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
