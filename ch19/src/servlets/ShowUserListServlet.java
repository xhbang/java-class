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
			Class.forName(JDriver); // ����JDBC��������
			con = DriverManager.getConnection(conURL); // �������ݿ�URL

			// �����ݿ�õ�ע���û��б�
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
			req.setAttribute("errorInfo", "��ȡע���û��б�ʧ�ܣ�" + e.getMessage());
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
