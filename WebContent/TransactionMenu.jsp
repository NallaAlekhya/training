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
	String uname=request.getParameter("login");
	String pass=request.getParameter("pass");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
	Statement statement=c.createStatement();
	String query="select * from user_jsp ";
	ResultSet rs=statement.executeQuery(query);
	int flag=0;
	while(rs.next()){
		if(uname.equals(rs.getString(1)) && pass.equals(rs.getString(2))){
			// String redirecURL = "http://localhost:8081/jsp/menu.jsp";
			   // response.sendRedirect(//redirecURL);
			   flag=1;
			   break;
			   }
			   }
			   if(flag==1){
			   out.println("WELCOME " + uname);
			   	session.setAttribute("UserId", uname);
				session.setAttribute("PASSWORD", pass);%>
			   <jsp:include page="menu.jsp"/>
			   
			  <% }
		else{
			out.println("LOGIN FAIL ..");
			 //String redirectURL = "http://localhost:8081/jsp/Banklogin.html";
			   // response.sendRedirect(redirectURL);%>
			   
			   <jsp:include page="banklogin.jsp"/>
	<%	}
		

}
catch(Exception e){
	out.println(e);
}
%>



</body>
</html>