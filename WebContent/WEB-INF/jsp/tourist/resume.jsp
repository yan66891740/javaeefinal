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
	<form action="${pageContext.request.contextPath}/resume/updateResume">
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
						<option value="中专">中专</option>
						<option value="高中">高中</option>
						<option value="本科" selected="selected">本科</option>
						<option value="硕士">硕士</option>
						<option value="博士">博士</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>联系方式</td>
				<td><input type="number" name="tel" replaceholder="请输入联系方式"></td>
				<td>email</td>
				<td><input type="email" name="email" replaceholder="请输入邮箱"></td>
			</tr>
			<tr>
				<td>应聘职位</td>
				<td>
					<select name="dept">
						<c:forEach items="${requestScope.depts}" var="dept">
							<option value="${dept.dId}">${dept.dName}</option>
						</c:forEach>
					</select>
					<select name="post">
						<option value="1" >--职位--</option>
					</select>
				</td>
				<td>政治面貌</td>
				<td>
					<select name="politicalStatus">
						<option value="普通群众" selected="selected">普通群众</option>
						<option value="团员">团员</option>
						<option value="中共党员">中共党员</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>上份工作</td>
				<td><input type="text" name="lastWork" placeholder="请输入工作名称"></td>
				<td>工作经验</td>
				<td><input type="text" name="workYears" placeholder="请输入几年工作经验"></td>
			</tr>
			<tr>
				<td>期望薪资</td>
				<td>
					<select name="salary">
						<option value="3000-4000">3000-4000</option>
						<option value="4000-5000">4000-5000</option>
						<option value="5000-6000">5000-6000</option>
						<option value="6000-7000">6000-7000</option>
						<option value="7000-8000">7000-8000</option>
						<option value="8000-9000">8000-9000</option>
						<option value="9000-10000">9000-10000</option>
						<option value="10000+">10000+</option>
					</select>
				</td>
				<td>兴趣爱好</td>
				<td><input type="text" name="hobby" placeholder="请输入兴趣爱好"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存" name="sub"></td>
				<!-- TODO 返回超链接 -->
				<td colspan="2"><input type="button" value="返回" ></td>
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
				<td>
					<select name="edu">
						<option value="${requestScope.resume.edu}" selected="selected">${requestScope.resume.edu}</option>
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
				<td><input type="number" name="tel" value="${requestScope.resume.tel}"></td>
				<td>email</td>
				<td><input type="email" name="email" value="${requestScope.resume.email}"></td>
			</tr>
			<tr>
				<td>应聘职位</td>
				<td>
				<!-- 部门回显 -->
					<select name="dept">
						<option value="${requestScope.resume.dept.dId}" selected="selected">${requestScope.resume.dept.dName}</option>
						<c:forEach items="${requestScope.depts}" var="dept">
							<c:if test="${dept.dId != requestScope.resume.dept.dId && dept.dId != 1}">
								<option value="${dept.dId}">${dept.dName}</option>
							</c:if>
						</c:forEach>
					</select>
				<!-- 职位回显 -->
					<select name="post">
						<option value="${requestScope.resume.post.pId}" selected="selected">${requestScope.resume.post.pName}</option>
						<c:forEach items="${requestScope.posts}" var="post">
							<c:if test="${post.pId != requestScope.resume.post.pId && post.pId != 1}">
								<option value="${post.pId}">${post.pName}</option>
							</c:if>
						</c:forEach>
					</select>
				</td>
				<td>政治面貌</td>
				<td>
					<select name="politicalStatus">
						<option value="${requestScope.resume.politicalStatus}" selected="selected">${requestScope.resume.politicalStatus}</option>
						<option value="普通群众" selected="selected">普通群众</option>
						<option value="团员">团员</option>
						<option value="中共党员">中共党员</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>上份工作</td>
				<td><input type="text" name="lastWork" value="${requestScope.resume.lastWork}"></td>
				<td>工作经验</td>
				<td><input type="text" name="workYears" value="${requestScope.resume.workYears}"></td>
			</tr>
			<tr>
				<td>期望薪资</td>
				<td>
					<select name="salary">
						<option value="${requestScope.resume.salary}">${requestScope.resume.salary}</option>
						<option value="3000-4000">3000-4000</option>
						<option value="4000-5000">4000-5000</option>
						<option value="5000-6000">5000-6000</option>
						<option value="6000-7000">6000-7000</option>
						<option value="7000-8000">7000-8000</option>
						<option value="8000-9000">8000-9000</option>
						<option value="9000-10000">9000-10000</option>
						<option value="10000+">10000+</option>
					</select>
				</td>
				<td>兴趣爱好</td>
				<td><input type="text" name="hobby" value="${requestScope.resume.hobby}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存"></td>
				<!-- TODO 返回按钮超链接 -->
				<td colspan="2"><input type="button" value="返回" ></td>
			</tr>
		</table>
	</c:if>
	</form>
</body>
</html>