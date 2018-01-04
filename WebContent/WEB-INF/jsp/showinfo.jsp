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
	<form action="${pageContext.request.contextPath}/user/addUser">
		<table>
			<tr>
				<th colspan="4">个人信息</th>
			</tr>
			<tr>
				<td>真实姓名</td>
				<td><input type="text" name="eName" value="${requestScope.user.eName}"></td>
				<td>性别</td>
				<td>
					<c:if test="${requestScope.user.gender == male}">
						<input type="radio" name="gender" value="male" checked="checked">男
						<input type="radio" name="gender" value="female">女
					</c:if>
					<c:if test="${requestScope.user.gender != male}">
						<input type="radio" name="gender" value="male">男
						<input type="radio" name="gender" value="female" checked="checked">女
					</c:if>
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input type="number" name="age" value="${requestScope.user.age}"></td>
				<td>学历</td>
				<td><input type="text" name="edu" value="${requestScope.user.edu}"></td>
			</tr>
			<tr>
				<td>联系方式</td>
				<td><input type="number" name="tel" value="${requestScope.user.tel}"></td>
				<td>email</td>
				<td><input type="text" name="email" value="${requestScope.user.email}"></td>
			</tr>
			<tr>
				<td>应聘职位</td>
				<td>
					<input type="text" name="dept" value="${requestScope.user.dept.dName}" readonly="readonly">
					<input type="text" name="post" value="${requestScope.user.post.pName}" readonly="readonly">
				</td>
				<td>政治面貌</td>
				<td><input type="text" name="politicalStatus" value="${requestScope.user.politicalStatus}"></td>
			</tr>
			<tr>
				<td>入职时间</td>
				<td><input type="text" name="hiredate" value="${requestScope.user.hiredate}" readonly="readonly"></td>
				<td>爱好</td>
				<td><input type="text" name="hobby" value="${requestScope.user.hobby}"></td>
			</tr>
		</table>
	</form>
</body>
</html>