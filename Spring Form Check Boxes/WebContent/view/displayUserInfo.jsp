<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Userinfo</title>
</head>
<body>
Name: ${user.name}<p/>
Gender: ${user.gender}<p/>
Country: ${user.country}<p/>
Introduction : ${user.introduction} <p/>
Visited Countries: 
<ul>
<c:forEach items="${user.visitedCountries}" var="item">
<li>${item}</li>
</c:forEach>
</ul>
</body>
</html>