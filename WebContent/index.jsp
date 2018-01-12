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
		$("input[name='username']").blur(function(){
			var username = $(this).val();
			$.ajax({
				type:"POST",
				url:"${pageContext.request.contextPath}/user/checkName",
				data:{username:username},
				datatype:"text",
				success:function(msg){
					if(msg == "error"){
						$("input[name='sub1']").attr(disabled,true);
						alert("密码有误");
					}else{
						$("input[name='sub1']").attr(disabled,false);
					}
				}
			});
		});
	})
</script>
</head>
<body>
	<c:if test="${requestScope.msg != null}">
		alert(${requestScope.msg})
	</c:if>
	<div>
		<form action="${pageContext.request.contextPath}/user/login" method="get">
			<table>
				<tr>
					<td>
						用户名：
					</td>
					<td>
						<input type="text" name="name" placeholder="请输入用户名" required="required">
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
					<td colspan="2">
						<input type="submit" value="登录">
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	<div>
		<form action="${pageContext.request.contextPath}/user/register" method="post">
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
					<td colspan="2">
						<input type="button" value="注册" name="sub1">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>