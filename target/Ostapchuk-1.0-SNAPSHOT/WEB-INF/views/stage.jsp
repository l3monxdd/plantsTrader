<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ab
  Date: 16.06.18
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>stage</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>


</head>
<body>


<div id="stage">
    <input type="number" id="stageNumber" placeholder="stage number">
    <button id="saveStage">save street</button>
</div>


<table>
    <thead>
    <tr>
        <th>number</th>
    </tr>
    </thead>
    <tbody id="result">

    </tbody>
</table>

<script src="/js/stage.js"></script>



</body>
</html>
