<%--
  Created by IntelliJ IDEA.
  User: ab
  Date: 14.05.18
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Country</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>

    <form method="post" action="/country">
        <input type="text" name="name" placeholder="Country">
        <input type="submit">
    </form>

<ol>
    <c:forEach var="country" items="${countries}">
            <li> ${country.name}
                <a href="/deleteCountry/${country.id}">delete</a>
                <a href="/updateCountry/${country.id}">update</a>
            </li>
    </c:forEach>
</ol>

<a href="/" >home</a>




</body>
</html>
