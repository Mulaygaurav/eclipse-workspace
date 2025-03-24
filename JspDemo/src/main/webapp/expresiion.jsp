<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%pageContext.getAttribute("Name", PageContext.APPLICATION_SCOPE); 
pageContext.getAttribute("Name", PageContext.SESSION_SCOPE); 
pageContext.getAttribute("Name", PageContext.PAGE_SCOPE); 
pageContext.getAttribute("Name", PageContext.REQUEST_SCOPE); 
%>
${param.a}



</body>
</html>