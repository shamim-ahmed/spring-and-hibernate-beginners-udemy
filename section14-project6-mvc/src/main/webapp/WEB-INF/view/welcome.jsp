<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head>
  <title>Home page</title>
</head>
<body>
  <header>
    <img src="${pageContext.request.contextPath}/static/images/spring-logo.png" 
       alt="Spring Logo" width="200px" height="50px"/>
    <h1>Home page</h1>
  </header>
  <p>Click <a href="${pageContext.request.contextPath}/student/showForm" >here</a> for the form</p>
</body>
</html>