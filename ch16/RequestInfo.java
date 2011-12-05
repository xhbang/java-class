//RequestInfo.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RequestInfo extends HttpServlet {
public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws IOException, ServletException {
response.setContentType("text/html");
//先设置Header，在这里只设置ContentType一项
 PrintWriter out = response.getWriter();
 //得到文本输出Writer
 //下面打印相关的HTML
 out.println("<html>");
 out.println("<head>");
 out.println("<title>Request Information Example</title>");
 out.println("</head>");
 out.println("<body>");
 out.println("<h3>Request Information Example</h3>");
 out.println("Request URI: " + request.getRequestURI()+"<br>");
 //打印请求的路径
 out.println("Protocol: " + request.getProtocol()+"<br>");
 //打印协议名称
 out.println("PathInfo: " + request.getPathInfo()+"<br>");
 //打印额外的路径信息
 out.println("Remote Address: " + request.getRemoteAddr());
 //打印客户机的地址，如果没有打印IP地址
 out.println("</body>");
 out.println("</html>");
 out.close(); //关闭Writer
 }
 public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws IOException, ServletException
 {
 //如果是POST请求类型，同样调用GET类型的响应函数
   doGet(request, response);
   }
   }
