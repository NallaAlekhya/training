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
String amount=request.getParameter("amnt");
String name=(String)session.getAttribute("UserId");

Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
Statement statement=c.createStatement();
String query="SELECT amount from account_jsp where account_number=?";
PreparedStatement pst=c.prepareStatement(query);
pst.setString(1,name);
ResultSet rs=pst.executeQuery();
if(rs.next()){
	   String o=rs.getString(1);
		out.println("BALANCE IS:"+o);
	}

}
catch(Exception e) {
	out.println(e);
}
%>


</body>
</html>