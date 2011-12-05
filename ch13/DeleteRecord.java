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
		PreparedStatement ps = null;
		Statement s = null;
		try
		{
			// 连接数据库URL
			con = DriverManager.getConnection(conURL);			

			// 删除第二条记录
			ps = con.prepareStatement("delete from consumer where id=?");
			ps.setString(1, "00002");
			ps.executeUpdate();

			// 查询数据库并把数据表的内容输出到屏幕上
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
