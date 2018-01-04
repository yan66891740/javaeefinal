<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/JS/jquery-1.7.2.js"></script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/user/login" method="get">
		<table>
			<tr>
				<td>
					用户名：
				</td>
				<td>
					<input type="text" name="username" placeholder="请输入用户名" required="required">
				</td>
			</tr>
			<tr>
				<td>
					密码：
				</td>
				<td>
					<input type="password" name="password" placeholder="请输入密码" required="required">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="登录">
				</td>
				<td>
					<input type="button" value="注册" >
				</td>
			</tr>
		</table>
	</form>
</body>
</html>