//RequestInfo.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RequestInfo extends HttpServlet {
public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws IOException, ServletException {
response.setContentType("text/html");
//������Header��������ֻ����ContentTypeһ��
 PrintWriter out = response.getWriter();
 //�õ��ı����Writer
 //�����ӡ��ص�HTML
 out.println("<html>");
 out.println("<head>");
 out.println("<title>Request Information Example</title>");
 out.println("</head>");
 out.println("<body>");
 out.println("<h3>Request Information Example</h3>");
 out.println("Request URI: " + request.getRequestURI()+"<br>");
 //��ӡ�����·��
 out.println("Protocol: " + request.getProtocol()+"<br>");
 //��ӡЭ������
 out.println("PathInfo: " + request.getPathInfo()+"<br>");
 //��ӡ�����·����Ϣ
 out.println("Remote Address: " + request.getRemoteAddr());
 //��ӡ�ͻ����ĵ�ַ�����û�д�ӡIP��ַ
 out.println("</body>");
 out.println("</html>");
 out.close(); //�ر�Writer
 }
 public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws IOException, ServletException
 {
 //�����POST�������ͣ�ͬ������GET���͵���Ӧ����
   doGet(request, response);
   }
   }
