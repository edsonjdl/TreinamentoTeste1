<%-- 
    Document   : showSingleGroup
    Created on : Nov 8, 2018, 4:44:02 PM
    Author     : edson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Group Details</h1>
        
        Name: ${group.groupName}
        
        <table border="1">
            <thead>
                <tr>
                    <th>User Id</th>
                    <th> Login</th>
                </tr>
            </thead>
            <tbody>
                
        <c:forEach var="user" items="${usersList}">
                <tr>
                    <td>${user.userId}</td>
                    <td>${user.login}</td>
                </tr>
        </c:forEach>

            </tbody>
        </table>
        
        <br><br>
        
        <html:form action="AddRemoveUserAction.do">            
            <html:hidden value="${group.groupId}" property="groupId" />
            <html:submit value="Add/Remove users from ${group.groupName}" />
        </html:form>

        

    </body>
</html>
