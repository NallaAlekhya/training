<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="income" value="6000"></c:set>
<c:out value="${income*2}"></c:out>



<!-- functions -->
<c:set var="string" value="jstl programming"/>
<c:if test="${fn:contains(string,'jstl')}">
<p>found</p>
</c:if>

<c:if test="${fn:containsIgnoreCase(string,'Jstl')}">
<p>found Jstl</p>
</c:if>
<c:if test="${fn:endsWith(string,'programming')}">
<p>input string is ends with programming</p>
</c:if>
<c:if test="${fn:startsWith(string,'jstl')}">
<p>input string is starts with jstl</p>
</c:if>
<c:set var="input" value="this is jstl class"></c:set>
<p> index of programming is:${fn:indexOf(input,'class')}</p>
<p>length of input:${fn:length(input)}</p>
<p>after space is removed:${fn:trim(input)}</p>
</body>
</html>