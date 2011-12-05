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
      //doGet()是这个Servlet的核心，真正处理请求的地方

  {
    PrintWriter out = response.getWriter();
//从HttpServletResponse得到输出流
        out.println("<html>");
out.println("<head>");
    out.println("<title>" + greeting + "</title>");
out.println("</head>");
out.println("<body body bgcolor=#cc99dd >");
    out.println("<h1>" + greeting + "</h1>");
//上面的语句都是向客户端打印HTML文本
     out.println("</body>");
     out.println("</html>");
     out.close();
   }
    public void destroy()
  {
    // nothing to do
  }
}
