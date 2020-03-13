<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="Example.EmployeeJsp"></jsp:useBean>
<jsp:setProperty property="username" name="emp"/>
<jsp:setProperty property="pswd" name="emp"/>

<!-- * is used set all properties into bean 
<jsp:setProperty property="*" name="emp"/> -->
Your details:<br>
<jsp:getProperty property="username" name="emp"/><br>
<jsp:getProperty property="pswd" name="emp"/>

</body>
</html>