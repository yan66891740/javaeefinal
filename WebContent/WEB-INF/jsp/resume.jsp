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
	<form action="${pageContext.request.contextPath}/resume/addUser">
	<c:if test="${requestScope.resume == null}">
		<table>
			<tr>
				<th colspan="4">简历</th>
			</tr>
			<tr>
				<td>真实姓名</td>
				<td><input type="text" name="rName" placeholder="请输入真实姓名"></td>
				<td>性别</td>
				<td>
					<input type="radio" name="gender" value="male" checked="checked">男
					<input type="radio" name="gender" value="female">女
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input type="number" name="age" replaceholder="请输入年龄"></td>
				<td>学历</td>
				<td>
					<select name="edu">
						<option value="0" selected="selected">学历</option>
						<option value="中专">中专</option>
						<option value="高中">高中</option>
						<option value="本科">本科</option>
						<option value="硕士">硕士</option>
						<option value="博士">博士</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>联系方式</td>
				<td><input type="number" name="tel" replaceholder="请输入联系方式"></td>
				<td>email</td>
				<td><input type="text" name="email" replaceholder="请输入邮箱"></td>
			</tr>
			<tr>
				<td>应聘职位</td>
				<td>
					<input type="text" name="dept" value="${requestScope.resume.dept.dName}" readonly="readonly">
					<input type="text" name="post" value="${requestScope.resume.post.pName}" readonly="readonly">
				</td>
				<td>政治面貌</td>
				<td><input type="text" name="politicalStatus" value="${requestScope.resume.politicalStatus}"></td>
			</tr>
			<tr>
				<td>上份工作</td>
				<td><input type="text" name="lastWork" value="${requestScope.resume.lastWork}"></td>
				<td>工作经验</td>
				<td><input type="text" name="workYears" value="${requestScope.resume.workYears}"></td>
			</tr>
			<tr>
				<td>期望薪资</td>
				<td><input type="text" name="salary" value="${requestScope.resume.salary}"></td>
				<td>兴趣爱好</td>
				<td><input type="text" name="hobby" value="${requestScope.resume.hobby}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存"></td>
				<td colspan="2"><input type="button" value="返回"></td>
			</tr>
		</table>
	</c:if>
	<c:if test="${requestScope.resume != null}">
		<table>
			<tr>
				<th colspan="4">简历</th>
			</tr>
			<tr>
				<td>真实姓名</td>
				<td><input type="text" name="eName" value="${requestScope.resume.eName}"></td>
				<td>性别</td>
				<td>
					<c:if test="${requestScope.resume.gender == male}">
						<input type="radio" name="gender" value="male" checked="checked">男
						<input type="radio" name="gender" value="female">女
					</c:if>
					<c:if test="${requestScope.resume.gender != male}">
						<input type="radio" name="gender" value="male">男
						<input type="radio" name="gender" value="female" checked="checked">女
					</c:if>
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input type="number" name="age" value="${requestScope.resume.age}"></td>
				<td>学历</td>
				<td><input type="text" name="edu" value="${requestScope.resume.edu}"></td>
			</tr>
			<tr>
				<td>联系方式</td>
				<td><input type="number" name="tel" value="${requestScope.resume.tel}"></td>
				<td>email</td>
				<td><input type="text" name="email" value="${requestScope.resume.email}"></td>
			</tr>
			<tr>
				<td>应聘职位</td>
				<td>
					<input type="text" name="dept" value="${requestScope.resume.dept.dName}" readonly="readonly">
					<input type="text" name="post" value="${requestScope.resume.post.pName}" readonly="readonly">
				</td>
				<td>政治面貌</td>
				<td><input type="text" name="politicalStatus" value="${requestScope.resume.politicalStatus}"></td>
			</tr>
			<tr>
				<td>上份工作</td>
				<td><input type="text" name="lastWork" value="${requestScope.resume.lastWork}"></td>
				<td>工作经验</td>
				<td><input type="text" name="workYears" value="${requestScope.resume.workYears}"></td>
			</tr>
			<tr>
				<td>期望薪资</td>
				<td><input type="text" name="salary" value="${requestScope.resume.salary}"></td>
				<td>兴趣爱好</td>
				<td><input type="text" name="hobby" value="${requestScope.resume.hobby}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存"></td>
				<td colspan="2"><input type="button" value="返回"></td>
			</tr>
		</table>
	</c:if>
	</form>
</body>
</html>