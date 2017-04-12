<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%
	       String path = request.getContextPath(); 
	  %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>注册成功</title>
</head>
<body>
    <%  session.removeAttribute("Email"); %>  
	注销成功，3秒之后跳转到主页面
	<meta http-equiv="Refresh" content="3; url=<%=path %>/index.jsp" />
</body>
</html>