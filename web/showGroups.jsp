<%-- 
    Document   : showGroups
    Created on : Nov 7, 2018, 8:49:52 PM
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
        <h1>Group List</h1>


        <html:form action="GroupChoiceAction.do" method="POST">

                       
            <html:select property="groupId">
                <c:forEach var="group" items="${groupsList}">
                    <html:option value="${group.groupId}">${group.groupName}</html:option>
                </c:forEach>  
            </html:select>



            <br>
            <html:submit value="Envoyer" />  
        </html:form>


    </body>
</html>
