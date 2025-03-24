<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
HttpSession s1= request.getSession();
String name=(String)s1.getAttribute("Gaurav");

pageContext.setAttribute("key1", "value1", PageContext.APPLICATION_SCOPE);
pageContext.setAttribute("key1", "value2", PageContext.APPLICATION_SCOPE);
pageContext.setAttribute("key1", "value3", PageContext.APPLICATION_SCOPE);
pageContext.setAttribute("key1", "value4", PageContext.APPLICATION_SCOPE);

%>
</body>
</html>