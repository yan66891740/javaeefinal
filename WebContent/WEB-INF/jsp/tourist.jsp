<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/JS/jquery-1.7.2.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	&nbsp;&nbsp;&nbsp;当前用户：${sessionScope.user.username}
	<div>
		<a href="${pageContext.request.contextPath}/">反馈</a>
		<a href="${pageContext.request.contextPath}/">查看简历</a>
		<a href="${pageContext.request.contextPath}/">修改密码</a>
		<a href="${pageContext.request.contextPath}/">其他</a>
		<a href="${pageContext.request.contextPath}/">退出</a>
	</div>
</body>
</html>