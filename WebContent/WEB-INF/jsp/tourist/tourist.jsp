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
	$(function(){
		$("input[name='newpassword2']").change(function(){
			var np2 = $(this).val();
			var np1 = $("input[name='newpassword']").val();
			if(np2 != np1){
				$("input[name='sub1']").disabled(true);
				alert("两次密码不匹配")
			}else{
				$("input[name='sub1']").disabled(false);
			}
		});
		
		$("input[name='password']").blur(function(){
			 $.ajax({
				type:"POST",
				url:"${pageContext.request.contextPath}/user/checkPassword",
				data:{password:password},
				datatype:"text",
				success:function(msg){
					if(msg == "error"){
						$("input[name='sub1']").disabled(true);
						alert("密码有误");
					}else{
						$("input[name='sub1']").disabled(false);
					}
				}
			});
		});
		
	});
</script>
</head>
<body>
	&nbsp;&nbsp;&nbsp;当前用户：${sessionScope.user.username}
	<div>
		<a href="${pageContext.request.contextPath}/">反馈</a>
		<a href="${pageContext.request.contextPath}/resume/queryResume">查看简历</a>
		<a href="${pageContext.request.contextPath}/">修改密码</a>
		<a href="${pageContext.request.contextPath}/">其他</a>
		<a href="${pageContext.request.contextPath}/user/exit">退出</a>
	</div>
	
	<div>
		<form action="${pageContext.request.contextPath}/user/updateUser" method="get">
			<table>
				<tr>
					<th colspan="2">修改密码</th>
				</tr>
				<tr>
					<td>原密码：</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>新密码：</td>
					<td><input type="password" name="newpassword"></td>
				</tr>
				<tr>
					<td>密码确认：</td>
					<td><input type="password" name="newpassword2"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="sub1" value="去人修改"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>