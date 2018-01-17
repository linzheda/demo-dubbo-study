<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path=request.getContextPath();
	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
</head>
<body>
	<input type="button" onclick="copyText()" value="test" />
	<a href="findAll.action">点击查看数据</a>
</body>
<script type="text/javascript">
function copyText(){
	console.log("进来了");
	$.ajax({
		url:"back/test.action",
		type:"POST",
		dataType:"text",
		success:function(data){
			alert(data);
		}	
	});
	
}




</script>



</html>