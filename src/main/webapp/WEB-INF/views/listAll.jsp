<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List all</title>
</head>
<body>
<h1>List all</h1>
<div class="container">
    <c:forEach var="article" items="${articles}" varStatus="loop">
        <h3><c:out value="${article.id}"/></h3>
        <h1><c:out value="${article.name}"/></h1>
        <h4><c:out value="${article.description}"/></h4>
    </c:forEach>
</div>
</body>
</html>
