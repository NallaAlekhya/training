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
String name=request.getParameter("name");
int id=Integer.parseInt(request.getParameter("id"));
String dept=request.getParameter("dept");
String company=request.getParameter("company");
String email=request.getParameter("email");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
String sql="update employee set name=?,dept=?,company=?,email=? where id=?";
PreparedStatement pst=con.prepareStatement(sql);
pst.setString(1,name);
pst.setString(2,dept);
pst.setString(3,company);
pst.setString(4,email);
pst.setInt(5,id);
int c=pst.executeUpdate();
if(c!=0)
	out.println("record updated successfully");
else
	out.println("fail to update the record");

}
catch(Exception e){}
%>

</body>
</html>