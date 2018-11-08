<%-- 
    Document   : showGroups
    Created on : Nov 7, 2018, 8:49:52 PM
    Author     : edson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of groups</h1>
        <c:forEach var="group" items="${groupsList}">
            ${group.groupName} <br>
        </c:forEach>
    </body>
</html>
