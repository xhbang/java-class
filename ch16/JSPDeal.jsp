<%@ page contentType="text/html; charset=gb2312" %>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
 <title>Your Info</title>
 </head>
 <body>
 <h3>Data You Posted</h3>
 <%
  String name = request.getParameter("Name");
  String sex = request.getParameter("Sex");
 %>
 <table>
 <tr>
 <td>你的姓名：</td>
 <td><%=name%></td>
 </tr>
 <tr>
 <td>你的性别：</td>
 <td><% if(sex.equals("1")) out.print("男");
  else out.print("女");%></td>
 </tr>
 </table>
 </body>
 </html>
