<%@ page language="java" pageEncoding="GBK"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�û�ע��</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>
	<body bgcolor="#ffffff">
		<h1>
			���û�ע��
		</h1>
		<hr />
		<font color="#ff0000">
			<%
				if (request.getAttribute("errorInfo") != null)
				{
					out.println(request.getAttribute("errorInfo"));
				}
			%>
		</font>
		<font color="#0000ff">
			<%
				if (request.getAttribute("successInfo") != null)
				{
					out.println(request.getAttribute("successInfo"));
				}
			%>
		</font>
		<form method="post" action="userRegister">
			<table width="100%" border="1">
				<tr>
					<td>
						�û�����
					</td>
					<td>
						&nbsp;
						<input type="text" name="userName">
					</td>
				</tr>
				<tr>
					<td>
						���룺
					</td>
					<td>
						&nbsp;
						<input type="password" name="userPWD">
					</td>
				</tr>
				<tr>
					<td>
						�绰��
					</td>
					<td>
						&nbsp;
						<input type="text" name="tel">
					</td>
				</tr>
				<tr>
					<td>
						סַ��
					</td>
					<td>
						&nbsp;
						<input type="text" name="address">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						&nbsp;
						<input type="submit" value="ע��">
						<input type="submit" value="����">
					</td>
				</tr>
			</table>
		</form>
		<a href="index.jsp">����</a>
	</body>
</html>
