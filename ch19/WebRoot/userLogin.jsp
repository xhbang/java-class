<%@ page language="java" pageEncoding="GBK"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>用户登录</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>
	<body bgcolor="#ffffff">
		<h1>
			用户登录
		</h1>
		<hr />
		<h3>
			<font color="#ff0000">
				<%
					if (request.getAttribute("errorInfo") != null)
					{
						out.println(request.getAttribute("errorInfo"));
					}
				%>
			</font>
		</h3>
		<form action="userLogin" method="post">
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
					<td colspan="2">
						&nbsp;
						<input type="submit" value="登录">
						<input type="reset" value="重置">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
