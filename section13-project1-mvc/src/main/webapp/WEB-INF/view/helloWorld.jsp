<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Result form</title>
</head>
<body>
  <img src="${pageContext.request.contextPath}/static/images/spring-logo.png" alt="Spring Logo" /><br/>

  <p>The message is <c:out value="${message}" /></p>
</body>