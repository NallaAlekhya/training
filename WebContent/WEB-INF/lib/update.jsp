<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
     import="java.sql.Connection" 
import="java.sql.DriverManager"
import ="java.sql.PreparedStatement"
import ="java.sql.ResultSet"
import ="java.util.Scanner"
import ="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>UPDATED</h4>
<%
try {
	String name=request.getParameter("name");
	String id=request.getParameter("id");
	String dept=request.getParameter("dept");
	String desig=request.getParameter("desig");
	String comp=request.getParameter("com");
	String mail=request.getParameter("mail");
	DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
	// database available outside machines then instead of localhost we need to pass IPaddress of that machine
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
String query="UPDATE employee set name=?,department=?,designation=?,company=?,email=? where id=?";
	PreparedStatement pst=connection.prepareStatement(query);
	
	
	pst.setString(1,name);
	pst.setString(2,dept);
	pst.setString(3,desig);
	pst.setString(4,comp);
	pst.setString(5,mail);
	pst.setString(6,id);
	
	int c=pst.executeUpdate();
	System.out.println(c+"records inserted");
	
}
catch(Exception e) {}

%>
</body>
</html>