// FormDeal.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FormDeal extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws IOException, ServletException //����GET����ķ���
{
response.setContentType("text/html");
//������Header��������ֻ����ContentTypeһ��
PrintWriter out = response.getWriter();
//�õ��ı����Writer
String name = request.getParameter("Name");
//�õ���ֵName
String sex = request.getParameter("Sex");
//�õ���ֵSex
name = new String(name.getBytes(),"ISO-8859-1");
//ת������ȷ�ı���
//��ӡ�õ��ı�ֵ
out.println("<html>");
out.println("<head>");
out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">");
out.println("<title>Your Infomation</title>");
out.println("</head>");
out.println("<body>");
out.println("<h3>Data You Posted</h3>");
out.println("<table>");
out.println("<tr>");
out.println(new String(new String("<td>���������</td>").getBytes(),"ISO-8859-1"));
out.println("<td>"+name+"</td>");
out.println("</tr>");
out.println("<tr>");
out.println(new String(new String("<td>����Ա�</td>").getBytes(),"ISO-8859-1"));
out.print("<td>");
if(sex.equals("1")) out.println(new String(new String("��</td>").getBytes(),"ISO-8859-1"));
else out.println(new String(new String("Ů</td>").getBytes(),"ISO-8859-1"));
out.println("</tr>");
out.println("</table>");
out.println("</body>");
out.println("</html>");
out.close(); //�ر�Writer
}
}

