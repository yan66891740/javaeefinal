<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/JS/jquery-1.7.2.js"></script>
<script type="text/javascript">
	var time = "1000";
	setInterval(changeTime,time);
	
	$(function changeTime(){
		if($("#span").text() > 0){
			$("#span").text($("#span").text() - 1);
		}else{
			javascript:location.href="${pageContext.request.contextPath}/${requestScope.address}";
		}
	});
</script>
</head>
<body>
	<div align="center">
		${requestScope.msg1}&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/${requestScope.address}">${requestScope.msg2}</a><br/>
		<span id="span">5</span>秒后自动跳转……
	</div>
</body>
</html>