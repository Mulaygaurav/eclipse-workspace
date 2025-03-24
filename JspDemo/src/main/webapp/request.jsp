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
        
        String paramValue = request.getParameter("param");
int number = Integer.parseInt(paramValue);
if(number>=18){
	response.sendRedirect("NewFile.jsp");
}else{
	response.sendRedirect("eroor.jsp");
	
}
           
    %>
</body>
</html>

