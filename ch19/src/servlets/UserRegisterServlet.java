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

public class UserRegisterServlet extends HttpServlet
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
			String tel = req.getParameter("tel");
			String address = req.getParameter("address");

			// �����������ĺϷ���
			if (userName == null || userName.trim().equals(""))
				throw new Exception("�û�������Ϊ�գ�");
			if (userPWD == null || userPWD.trim().equals(""))
				throw new Exception("���벻��Ϊ�գ�");
			if (tel == null) tel = "";
			if (address == null) address = "";
			
			userName = new String(userName.getBytes("8859_1"),"GBK"); // ת���ַ�����
			userPWD = new String(userPWD.getBytes("8859_1"),"GBK");
			tel = new String(tel.getBytes("8859_1"),"GBK");
			address = new String(address.getBytes("8859_1"),"GBK");

			// ����JDBC��������
			Class.forName(JDriver);
			// �������ݿ�URL
			con = DriverManager.getConnection(conURL);

			// ����û����Ƿ��Ѿ�����
			pstm = con.prepareStatement("select * from users where name=?");
			pstm.setString(1, userName);
			rs = pstm.executeQuery();
			if (rs.next())
			{
				throw new Exception("�û����Ѿ����ڣ����������룡");
			}

			// �������û���Ϣ�����ݿ�
			pstm = con
					.prepareStatement("insert into users(name,pwd,tel,address) values(?,?,?,?)");
			pstm.setString(1, userName);
			pstm.setString(2, userPWD);
			pstm.setString(3, tel);
			pstm.setString(4, address);
			pstm.execute();

			req.setAttribute("successInfo", "���û�ע��ɹ���");
			dispatcher = getServletContext().getRequestDispatcher(
					"/userRegister.jsp");
			dispatcher.forward(req, resp);
		}
		catch (Exception e)
		{
			req.setAttribute("errorInfo", e.getMessage());
			dispatcher = getServletContext().getRequestDispatcher(
					"/userRegister.jsp");
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
