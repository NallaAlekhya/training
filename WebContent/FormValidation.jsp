<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String a=request.getParameter("login");
String b=request.getParameter("pass");
if(b.equals("admin"))
	
{
	%>
	
	<h1>AUTHORIZED USER</h1>
	<%}else{%>
	<h1>UNAUTHORIZED</h1>
<%}
%>
<!-- following is one way -->
<!-- <% b="admin";
out.println("WELCOME  " + a);%> -->
</body>
</html>