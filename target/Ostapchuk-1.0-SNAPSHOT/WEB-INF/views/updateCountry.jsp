<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ab
  Date: 14.05.18
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update country</title>
</head>
<body>
        ${country.name}

    <form action="/updateCountry/${country.id}" method="post">
        <input type="text" name="name" value="${country.name}">
        <input type="submit">
    </form>


</body>
</html>
