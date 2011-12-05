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
			// 创建一个含有三个字段的顾客表conumser
			String query = "create table consumer(" + "id char(10) not null,"
					+ "name char(15)," + "totalmoney float"
					+ ")";
			s.executeUpdate(query); // 执行SQL语句
			
			System.out.println("创建表成功！");

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
