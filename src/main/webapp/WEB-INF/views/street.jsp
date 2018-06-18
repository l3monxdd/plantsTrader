<%--
  Created by IntelliJ IDEA.
  User: ab
  Date: 08.06.18
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>street</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<div id="street">
    <input type="text" id="streetName" placeholder="street name">
    <button id="saveStreet">save street</button>
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

<script src="/js/street.js"></script>


<br>
<a href="/">home</a>
</body>
</html>
