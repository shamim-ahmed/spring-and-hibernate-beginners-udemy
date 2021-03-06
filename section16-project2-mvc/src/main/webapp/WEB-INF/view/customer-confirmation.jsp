<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
  <title>Confirmation of Customer data</title>
</head>
<body>
  <header>
    <img src="${pageContext.request.contextPath}/static/images/spring-logo.png" 
       alt="Spring Logo" width="200px" height="50px"/>
    <h1>Confirmation of Customer data</h1>
  </header>
  
  <p>Name of customer: <c:out value="${customer.firstName} ${customer.lastName}" /></p>
  <p>Number of free passes: <c:out value="${customer.freePasses}" /></p>
  <p>Post code: <c:out value="${customer.postCode}" /></p>
</body>
</html>