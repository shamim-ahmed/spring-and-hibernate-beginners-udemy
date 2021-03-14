<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
  <title>Student Form</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css"></link>
</head>
<body>
  <header>
    <img src="${pageContext.request.contextPath}/static/images/spring-logo.png" 
       alt="Spring Logo" width="200px" height="50px"/>
    <h1>Customer form</h1>
  </header>

  <form:form action="${pageContext.request.contextPath}/customer/processForm" modelAttribute="customer">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name(*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    Free passes: <form:input path="freePasses" />
    <form:errors path="freePasses" cssClass="error" />
    <br><br>
    Post Code: <form:input path="postCode" />
    <form:errors path="postCode" cssClass="error "/>
    <br><br>
    <input type="submit" value="Submit"/>
  </form:form>
</body>
</html>