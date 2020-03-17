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
<% 

try{
int id=Integer.parseInt(request.getParameter("eid"));
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
Statement statement=c.createStatement();
String query="select * from employee where id="+id;
ResultSet rs=statement.executeQuery(query);
while(rs.next()){
	if(rs.getInt(2)==id){%>
	<form action="update.jsp">
		<table>
		<tr><td>NAME:</td><td><input type="text" name="name" value=<%=rs.getString(1) %>></td></tr>
		<tr><td>ID:</td><td><input type="text" name="id" value=<%=rs.getString(2) %>></td></tr>
		<tr><td>DEPARTMENT:</td><td><input type="text" name="dept" value=<%=rs.getString(3)%>></td></tr>
		<tr><td>DESIGNATION:</td><td><input type="text" name="desig" value=<%=rs.getString(4)%>></td></tr>
		<tr><td>COMPANY:</td><td><input type="text" name="com" value=<%=rs.getString(5)%>></td></tr>
		<tr><td>EMAIL:</td><td><input type="text" name="mail" value=<%=rs.getString(6)%>></td></tr>



		</table>
		<input type="submit" value="UPDATE">
		</form>
			
	<% }
	else{
		out.println("no");
	}}
out.println(rs);
}
catch (Exception e){
	out.println(e);
} %>
</body>
</html>