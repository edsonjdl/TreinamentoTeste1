<%-- 
    Document   : addRemoveUser
    Created on : Nov 8, 2018, 10:58:02 AM
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
        <h1>Add or Remove users from groups</h1>
        <html:form action="UpdateGroupAction.do">


            <table border="1">
                <thead>
                    <tr>
                        <th>Users outside the group</th>
                        <th>Select action</th>
                        <th>Users inside the group</th>
                    </tr>
                </thead>
                <tbody>


                    <tr>
                        <td>      
                            <html:select property="usersOutside"  >
                                <c:forEach var="user1" items="${usersOut}">
                                    <html:option value="${user1.userId}">${user1.login}</html:option>
                                        <br>
                                </c:forEach>
                            </html:select>


                        </td>
                        <td>
                            <html:button value="Add >>" property="addUser" /> <br><br>
                            <html:button value="<< Remove" property="removeUser" />
                        </td>
                        <td>               

                            <html:select property="usersInside" >
                                <c:forEach var="user2" items="${usersIn}">
                                    <html:option value="${user2.userId}">${user2.login}</html:option>
                                        <br>
                                </c:forEach>
                            </html:select>

                        </td>
                    </tr>
                </tbody>
            </table>
            <br><br>
            <html:submit value="Confirm" />

        </html:form>
    </body>
</html>
