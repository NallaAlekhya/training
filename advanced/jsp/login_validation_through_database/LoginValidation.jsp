<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
String uis=request.getParameter("login");
String pswd=request.getParameter("pswd");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
Statement st=con.createStatement();
String query="select * from users";
int flag=0;
ResultSet resultset=st.executeQuery(query);
 while(resultset.next()) {
	 if(pswd.equals(resultset.getString(2)) && uis.equals(resultset.getString(1))){
		 flag=1;
		 break;
	 }
	 
 }
if(flag==1){%>
	<p style="color:green;font-size:50px">Authorized user</p>
<%}
else{%>
		<p style="color:red;font-size:50px">Unauthorized user</p>
	<% }
}
catch(Exception e){
	
}
%>
</body>
</html>