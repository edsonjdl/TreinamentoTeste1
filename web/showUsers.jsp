<%-- 
    Document   : showUsers
    Created on : Nov 7, 2018, 8:19:43 PM
    Author     : edson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>usersList Page</title>
    </head>
    <body>
        <h1>List of users</h1>
        <c:forEach var="user" items="${usersList}">
            ${user.nome}&nbsp;&nbsp; ==> 
            ${user.login}<br>
        </c:forEach>
    </body>
</html>
