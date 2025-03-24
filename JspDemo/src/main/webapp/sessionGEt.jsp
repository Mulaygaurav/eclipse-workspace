<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="sessionRedirect.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%    String paramValue = request.getParameter("param");
//int number = Integer.parseInt(paramValue);

	pageContext.setAttribute("key ","name",PageContext.APPLICATION_SCOPE);

%> 

</body>
</html>