<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="js/addUser.js"></script>
<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
</head>
<body>
	<%-- <a href="${pageContext.request.contextPath}/HelloServlet">Spring容器的获得</a> --%>
	
	<form id="user_form"  method="post">
		姓名:<input id='userName' type="text" name="name"/>
		<input type='button' value="提交" onclick="addUser()"/>
	</form> 
	<!-- 文件上传组件 -->
	<br>
	<input type="file" />
	<a href="#" onclick="upload_file()">上传</a>
</body>
</html>