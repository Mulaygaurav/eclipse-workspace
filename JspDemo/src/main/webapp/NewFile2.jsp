<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${param.age>18 }">

<p>Adult </p>
</c:if>

<c:set var="score" value="95" scope="session"/>
<c:choose>
<c:when test="${score>90}">
<p>A</p>
</c:when>
<c:when test="${score>70}">
<p>B</p>
</c:when>
<c:otherwise>
<p> </p>
</c:otherwise>
</c:choose>


<c:forEach var ="num" begin="0" end ="10" step="2">
<p>${num }</p>
</c:forEach>






</body>
</html>