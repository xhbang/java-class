package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLoginServlet extends HttpServlet
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
		PreparedStatement pstm = null;
		ResultSet rs = null;
		RequestDispatcher dispatcher = null;
		try
		{
			// 得到输入参数
			String userName = req.getParameter("userName");
			String userPWD = req.getParameter("userPWD");

			// 检查输入参数的合法性
			if (userName == null || userName.trim().equals(""))
			{
				throw new Exception("用户名输入为空！");
			}
			if (userPWD == null || userPWD.trim().equals(""))
			{
				throw new Exception("密码输入为空！");
			}
			
			userName = new String(userName.getBytes("8859_1"),"GBK"); // 转换字符编码
			userPWD = new String(userPWD.getBytes("8859_1"),"GBK");

			// 加载JDBC驱动程序
			Class.forName(JDriver);
			// 连接数据库URL
			con = DriverManager.getConnection(conURL);

			// 检查是否是注册用户
			pstm = con
					.prepareStatement("select * from users where name=? and pwd=?");
			pstm.setString(1, userName);
			pstm.setString(2, userPWD);
			rs = pstm.executeQuery();
			if (rs.next())
			{
				// 登录成功
				dispatcher = getServletContext().getRequestDispatcher(
						"/showUserList");
				dispatcher.forward(req, resp);
			}
			else
			{
				// 登录失败
				throw new Exception("用户名或者密码错误，请重新输入！");
			}
		}
		catch (Exception e)
		{
			req.setAttribute("errorInfo", e.getMessage());
			dispatcher = getServletContext().getRequestDispatcher(
					"/userLogin.jsp");
			dispatcher.forward(req, resp);
		}
		finally
		{
			try
			{
				if (pstm != null)
				{
					pstm.close();
					pstm = null;
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
