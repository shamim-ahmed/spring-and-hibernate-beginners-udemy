<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
  <title>Confirmation of Student data</title>
</head>
<body>
  <header>
    <img src="${pageContext.request.contextPath}/static/images/spring-logo.png" 
       alt="Spring Logo" width="200px" height="50px"/>
    <h1>Confirmation of Student data</h1>
  </header>
  
  <p>Name of student: <c:out value="${student.firstName} ${student.lastName}" /></p>
  <p>Country: <c:out value="${student.country}" /></p>
  <p>Favorite Language: <c:out value="${student.favoriteLanguage}" /></p>
</body>
</html>