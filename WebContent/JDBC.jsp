<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.Connection" 
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
<%
try{
String name=request.getParameter("login");
String pass=request.getParameter("pass");
//DriverManager.registerDriver( new com.mysql.jdbc.Driver());

// database available outside machines then instead of localhost we need to pass IPaddress of that machine
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");

Statement statement=c.createStatement();
		String query="select * from users";
		 ResultSet rs=statement.executeQuery(query);
		int flag=0;
	while(rs.next()){
	if((name.equals(rs.getString(1))) && (pass.equals(rs.getString(2)))){     
		flag=1;
		break;
	}
	}
	if(flag==1)
		out.println("AUTHORISED");		
	
	else
	out.println("UNAUTHORISED");
	
}

	catch (Exception e){
		out.println(e);
		}%>

</body>
</html>