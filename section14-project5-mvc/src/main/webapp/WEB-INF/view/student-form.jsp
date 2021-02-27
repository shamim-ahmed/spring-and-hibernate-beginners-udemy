<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
  <title>Student Form</title>
</head>
<body>
  <header>
    <img src="${pageContext.request.contextPath}/static/images/spring-logo.png" 
       alt="Spring Logo" width="200px" height="50px"/>
    <h1>Student form</h1>
  </header>

  <form:form action="${pageContext.request.contextPath}/student/processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>

    Country: 
    <form:select path="country">
      <form:options items="${countryMap}"/>
    </form:select>
    <br><br>
    
    Favorite Language:<br>
    <form:radiobutton path="favoriteLanguage" value="Java" />Java<br>
    <form:radiobutton path="favoriteLanguage" value="C#" />C#<br>
    <form:radiobutton path="favoriteLanguage" value="Python" />Python<br>
    <form:radiobutton path="favoriteLanguage" value="Ruby" />Ruby<br>
    <br><br>
    <input type="submit" value="Submit"/>
  </form:form>
</body>
</html>