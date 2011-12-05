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
			// �õ��������
			String userName = req.getParameter("userName");
			String userPWD = req.getParameter("userPWD");

			// �����������ĺϷ���
			if (userName == null || userName.trim().equals(""))
			{
				throw new Exception("�û�������Ϊ�գ�");
			}
			if (userPWD == null || userPWD.trim().equals(""))
			{
				throw new Exception("��������Ϊ�գ�");
			}
			
			userName = new String(userName.getBytes("8859_1"),"GBK"); // ת���ַ�����
			userPWD = new String(userPWD.getBytes("8859_1"),"GBK");

			// ����JDBC��������
			Class.forName(JDriver);
			// �������ݿ�URL
			con = DriverManager.getConnection(conURL);

			// ����Ƿ���ע���û�
			pstm = con
					.prepareStatement("select * from users where name=? and pwd=?");
			pstm.setString(1, userName);
			pstm.setString(2, userPWD);
			rs = pstm.executeQuery();
			if (rs.next())
			{
				// ��¼�ɹ�
				dispatcher = getServletContext().getRequestDispatcher(
						"/showUserList");
				dispatcher.forward(req, resp);
			}
			else
			{
				// ��¼ʧ��
				throw new Exception("�û�����������������������룡");
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
