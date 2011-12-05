// FormDeal.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FormDeal extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws IOException, ServletException //处理GET请求的方法
{
response.setContentType("text/html");
//先设置Header，在这里只设置ContentType一项
PrintWriter out = response.getWriter();
//得到文本输出Writer
String name = request.getParameter("Name");
//得到表单值Name
String sex = request.getParameter("Sex");
//得到表单值Sex
name = new String(name.getBytes(),"ISO-8859-1");
//转换到正确的编码
//打印得到的表单值
out.println("<html>");
out.println("<head>");
out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">");
out.println("<title>Your Infomation</title>");
out.println("</head>");
out.println("<body>");
out.println("<h3>Data You Posted</h3>");
out.println("<table>");
out.println("<tr>");
out.println(new String(new String("<td>你的姓名：</td>").getBytes(),"ISO-8859-1"));
out.println("<td>"+name+"</td>");
out.println("</tr>");
out.println("<tr>");
out.println(new String(new String("<td>你的性别：</td>").getBytes(),"ISO-8859-1"));
out.print("<td>");
if(sex.equals("1")) out.println(new String(new String("男</td>").getBytes(),"ISO-8859-1"));
else out.println(new String(new String("女</td>").getBytes(),"ISO-8859-1"));
out.println("</tr>");
out.println("</table>");
out.println("</body>");
out.println("</html>");
out.close(); //关闭Writer
}
}

