<%@ page language="java" pageEncoding="GBK"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>用户注册</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>
	<body bgcolor="#ffffff">
		<h1>
			新用户注册
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
						用户名：
					</td>
					<td>
						&nbsp;
						<input type="text" name="userName">
					</td>
				</tr>
				<tr>
					<td>
						密码：
					</td>
					<td>
						&nbsp;
						<input type="password" name="userPWD">
					</td>
				</tr>
				<tr>
					<td>
						电话：
					</td>
					<td>
						&nbsp;
						<input type="text" name="tel">
					</td>
				</tr>
				<tr>
					<td>
						住址：
					</td>
					<td>
						&nbsp;
						<input type="text" name="address">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						&nbsp;
						<input type="submit" value="注册">
						<input type="submit" value="重置">
					</td>
				</tr>
			</table>
		</form>
		<a href="index.jsp">返回</a>
	</body>
</html>
