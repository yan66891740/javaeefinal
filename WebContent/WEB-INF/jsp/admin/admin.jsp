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
	发布招聘
	应聘管理
	部门职位
	培训管理
	员工管理
	奖罚管理
	薪资管理
	工资异议
	退出
	
	<div>
		<c:if test="${requestScore.inters != null}">
			<table>
				<tr>
					<th>序号</th>
					<th>应聘者</th>
					<th>投递时间</th>
					<th>查看状态</th>
					<th>面试状态</th>
					<th colspan="2">操作</th>
				</tr>
				<c:forEach items="${requestScore.inters}" var="inter">
					<tr>
						<td>${inter.iId}</td>
						<td>${inter.name}</td>
						<td>${inter.createTime}</td>
						<td>${inter.check}</td>
						<td>${inter.audition}</td>
						<!-- TODO 页面跳转位置 -->
						<td><a href="${pageContext.request.contextPath}/adminc/queryResume?id=${inter.uId}">查看</a></td>
						<td><a href="${pageContext.request.contextPath}/adminc/delInterview?id=${inter.iId}">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<c:if test="${requestScore.inters == null}">
			<h1>暂时没有应聘信息</h1>
		</c:if>
	</div>
	
	<div>
		<table>
			<tr>
				<th colspan="4">简历详情</th>
			</tr>
			<tr>
				<td>姓名</td>
				<td>${requestScope.resume.eName}</td>
				<td>性别</td>
				<td>
					<c:if test="${requestScope.resume.gender == male}">
						男
					</c:if>
					<c:if test="${requestScope.resume.gender != male}">
						女
					</c:if>
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td>${requestScope.resume.age}</td>
				<td>学历</td>
				<td>${requestScope.resume.edu}</td>
			</tr>
			<tr>
				<td>联系方式</td>
				<td>${requestScope.resume.tel}</td>
				<td>email</td>
				<td>${requestScope.resume.email}</td>
			</tr>
			<tr>
				<td>应聘职位</td>
				<td>${requestScope.resume.dept.dName},${requestScope.resume.post.pName}</td>
				<td>政治面貌</td>
				<td>${requestScope.resume.politicalStatus}</td>
			</tr>
			<tr>
				<td>上份工作</td>
				<td>${requestScope.resume.lastWork}</td>
				<td>工作经验</td>
				<td>${requestScope.resume.workYears}</td>
			</tr>
			<tr>
				<td>期望薪资</td>
				<td>${requestScope.resume.salary}</td>
				<td>兴趣爱好</td>
				<td>${requestScope.resume.hobby}</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存"></td>
				<!-- TODO 返回按钮超链接 -->
				<td colspan="2"><input type="button" value="返回" ></td>
			</tr>
		</table>
		<input type="button" value="面试" name="addtime">&nbsp;&nbsp;&nbsp;
		<input type="button" value="返回" onclick="javascript:location='${pageContext.request.contextPath}/adminc/checkInter?id=${requestScope.resume.uId}'">
	</div>
	
	
</body>
</html>