<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>��½�ɹ�</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>
	<body bgcolor="#ffffff">
		<h1>
			��¼�ɹ�
		</h1>
		<hr />
		<h3>
			��ע���û��б�
		</h3>
		<table width="100%" border="1">
			<tr>
				<td>
					�û���
				</td>
				<td>
					�绰
				</td>
				<td>
					סַ
				</td>
			</tr>
			<%
				ArrayList<Object[]> userList = (ArrayList<Object[]>) request
						.getAttribute("userList");
				if (userList == null && userList.size() == 0)
				{
			%>
			<tr>
				<td colspan="3">
					��ʱû��ע���û�
				</td>
			</tr>
			<%
				}
				for (Object[] user : userList)
				{
			%>
			<tr>
				<td>
					<%=user[0]%>
				</td>
				<td>
					<%=user[1]%>
				</td>
				<td>
					<%=user[2]%>
				</td>
			</tr>
			<%
				}
			%>
		</table>
	</body>
</html>
