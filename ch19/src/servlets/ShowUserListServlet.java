package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowUserListServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String conURL = "jdbc:sqlserver://localhost;databaseName=TestDB;user=dbuser;password=dbuser";
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		RequestDispatcher dispatcher = null;
		try
		{
			Class.forName(JDriver); // 加载JDBC驱动程序
			con = DriverManager.getConnection(conURL); // 连接数据库URL

			// 从数据库得到注册用户列表
			ArrayList<Object[]> userList = new ArrayList<Object[]>();
			stm = con.createStatement();
			rs = stm.executeQuery("select * from users");
			while (rs.next())
			{
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String address = rs.getString("address");
				userList.add(new Object[] { name, tel, address });
			}
			req.setAttribute("userList", userList);

			dispatcher = getServletContext().getRequestDispatcher(
					"/loginSuccess.jsp");
			dispatcher.forward(req, resp);
		}
		catch (Exception e)
		{
			req.setAttribute("errorInfo", "获取注册用户列表失败：" + e.getMessage());
			dispatcher = getServletContext().getRequestDispatcher(
					"/loginSuccess.jsp");
			dispatcher.forward(req, resp);
		}
		finally
		{
			try
			{
				if (stm != null)
				{
					stm.close();
					stm = null;
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
