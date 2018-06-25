<%--
  Created by IntelliJ IDEA.
  User: ab
  Date: 21.06.18
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <title>Author</title>
</head>
<body>
<div id="author">
    <input type="text" id="fname" class="fClass" placeholder="author name">
    <input type="text" id="lname" placeholder="author last name">
    <input type="text" id="email" placeholder="email">
    <input type="text" id="accountNumber" placeholder="account number">
    <button id="saveAuthor">save author</button>
</div>


<table>
    <thead>
    <tr>
        <th>name</th>
        <th>update</th>
        <th>delete</th>
    </tr>
    </thead>
    <tbody id="result">

    </tbody>
</table>

        <script src="/js/author.js"></script>

<a href="/">home</a>
</body>
</html>
