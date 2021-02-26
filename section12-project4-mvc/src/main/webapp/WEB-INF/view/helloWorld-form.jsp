<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>

<html>
<head>
  <title>Input form</title>
</head>
<body>
  <img src="${pageContext.request.contextPath}/static/images/spring-logo.png" alt="Spring Logo" /><br/>

  <form action="processForm" method="GET">
    <input type="text" name="studentName" placeholder="What's your name?"/>
    <input type="submit" />
  </form>
</body>
</html>