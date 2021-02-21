<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
  <h1>Hello world</h1>
  <p>The name of your favorite books are:</p>
  
  <ul>
    <c:forEach var="book" items="${bookList}">
      <li><c:out value="${book.title}"/> by <c:out value="${book.author}" /></li>
    </c:forEach>
  </ul>
</body>
</html>