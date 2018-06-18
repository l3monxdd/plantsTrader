<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ab
  Date: 14.05.18
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>city</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<div id="city">
    <input type="text" id="cityName" placeholder="city name">
    <button id="saveCity">save city</button>
</div>


<table>
    <thead>
    <tr>
        <th>name</th>
    </tr>
    </thead>
    <tbody id="result">

    </tbody>
</table>

<script src="/js/city.js"></script>


<br>
<a href="/">home</a>
</body>
</html>
