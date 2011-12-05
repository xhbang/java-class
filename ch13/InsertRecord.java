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
		Statement s = null;
		try
		{
			// 连接数据库URL
			con = DriverManager.getConnection(conURL);
			// 建立Statement类对象
			s = con.createStatement();
			// 使用SQL命令insert插入三条顾客纪录到表中
			String r1 = "insert into consumer values('00001','王明',360)";
			String r2 = "insert into consumer values('00002','高强',728)";
			String r3 = "insert into consumer values('00003','李丽',1182)";
			s.executeUpdate(r1);
			s.executeUpdate(r2);
			s.executeUpdate(r3);
			
			System.out.println("插入数据成功！");

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
