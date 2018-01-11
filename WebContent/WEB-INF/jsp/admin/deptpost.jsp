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
		$("a").click(function(){
			 $.ajax({
				type:"POST",
				url:"${pageContext.request.contextPath}/adminc/queryPost",
				data:{id:id},
				datatype:"json",
				success:function(msg){
					if(msg == "error"){
						$("input['sub1']").attr("disabled",true);
						alert("部门已存在");
					}else{
						$("input['sub1']").attr("disabled",false);
					}
				}
			});
		});
		
		$("input[name='dName']").change(function(){
			var $name = $(this).val();
			$.ajax({
				type:"POST",
				url:"${pageContext.request.contextPath}/adminc/checkDeptName",
				data:{name:$name},
				datatype:"text",
				success:function(msg){
					if(msg == "error"){
						$("input[name='sub1']").attr("disabled",true);
						alert("部门已存在");
					}else{
						$("input[name='sub1']").attr("disabled",false);
					}
				}
			});
		})
	});
</script>
</head>
<body>
	<div name="department">
		<c:forEach items="${requestScope.depts}" var="dept">
			<a href="#" id="${dept.dId}">${dept.dName}</a>
			<a href="#">修改</a>
			<a href="#">删除</a>
		</c:forEach>
		<input type="button" value="添加" onclick="showadd">
		<form action="${pageContext.request.contextPath}/adminc/addDept" method="post">
			<input type="text" name="dName">
			<input type="submit" value="确认添加" name="sub1">
		</form>
	</div>
	<div name="position">
		
	</div>
</body>
</html>