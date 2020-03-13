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
int id=Integer.parseInt(request.getParameter("id"));
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
Statement st=con.createStatement();
String sql="select * from employee where id="+id;
ResultSet rs=st.executeQuery(sql);
int flag=0;
while(rs.next()){
	if(rs.getInt(2)==id){
		flag=1;
		break;
	}
	else
		out.println("not found");
}
if(flag==1){%>
 <form action="http://localhost:8081/jspExamples/UpdateValue.jsp">
	<table>
	<tr><td>Name</td><td><input type="text" name="name" value=<%=rs.getString(1) %>></td></tr>
	<tr><td>Id</td><td><input type="text" name="id"  value=<%=rs.getInt(2) %>></td></tr>
	<tr><td>Department</td><td><input type="text" name="dept"  value=<%=rs.getString(3) %>></td></tr>
	<tr><td>Company</td><td><input type="text" name="company"  value=<%=rs.getString(4) %>></td></tr>
	<tr><td>E-mail</td><td><input type="text" name="email"  value=<%=rs.getString(5) %>></td></tr>
	<tr><td><input type="submit" value="Update"></td></tr>
	</table>
	</form>
 <%
}
else
	out.println("not found");
}
catch(Exception e){
}

%>

</body>
</html>