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
String name=request.getParameter("uname");
int age=Integer.parseInt(request.getParameter("age"));
float price=0;
if(age>62)
	price=7;
else if(age<10)
	price=5;
else
	price=9.50f;
	
out.println("name "+name+"  "+"age "+age+" and movie ticket price is "+price);
%>
</body>
</html>