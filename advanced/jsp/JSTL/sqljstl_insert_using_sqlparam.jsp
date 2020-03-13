<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- connecting to database -->
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
url="jdbc:mysql://localhost/cts" user="root" password="root"/>

<c:set var="acc_no" value="<%=request.getParameter(\"accno\") %>"></c:set>
<c:set var="pswd" value="<%=request.getParameter(\"pswd\") %>"></c:set>
<sql:update dataSource="${db }" var="count">
insert into account_user values(?,?);
<sql:param value="${acc_no }"></sql:param>
<sql:param value="${pswd }"></sql:param>
</sql:update>


<!-- Executiong select query -->
<sql:query dataSource="${db}" var="resultset">
select * from account_user;
</sql:query>
<!-- display table on webpage -->
<table border="1">
<tr><th>account_no</th><th>pswd</th></tr>
<c:forEach var="table_row" items="${resultset.rows}">
<tr>
<td><c:out value="${table_row.account_no}"/></td>
<td><c:out value="${table_row.pswd}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>