// HelloWorld.java
package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {
  private String greeting;

  public void init()
    throws ServletException
  {
    greeting = getInitParameter("greeting");
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException
      //doGet()�����Servlet�ĺ��ģ�������������ĵط�

  {
    PrintWriter out = response.getWriter();
//��HttpServletResponse�õ������
        out.println("<html>");
out.println("<head>");
    out.println("<title>" + greeting + "</title>");
out.println("</head>");
out.println("<body body bgcolor=#cc99dd >");
    out.println("<h1>" + greeting + "</h1>");
//�������䶼����ͻ��˴�ӡHTML�ı�
     out.println("</body>");
     out.println("</html>");
     out.close();
   }
    public void destroy()
  {
    // nothing to do
  }
}
