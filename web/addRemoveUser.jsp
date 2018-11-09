<%-- 
    Document   : addRemoveUser
    Created on : Nov 8, 2018, 10:58:02 AM
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
        <h1>Add or Remove users from groups</h1>
        <form name="addRemoveUserGroup" action="ConfirmGroup">


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
                        Select group:  
                <select name="selectGroup">
                    <option>1</option>
                    <option>2</option>
                </select>    
                        <br><br>
                    </tr>
                    
                    <tr>
                        <td>      

                            <select name="usersOutside" size="4" multiple cols="20">
                                <option value="volvo">Volvo</option>
                                <option value="saab">Saab</option>
                                <option value="fiat">Fiat</option>
                                <option value="audi">Audi</option>
                            </select>

                        </td>
                        <td>
                            <input type="button" value="Add >>" name="addUser" /> <br><br>
                            <input type="button" value="<< Remove" name="removeUser" />
                        </td>
                        <td>               

                            <select name="usersInside" size="4" multiple cols="20">

                            </select>

                        </td>
                    </tr>
                </tbody>
            </table>
            <br><br>
            <input type="submit" value="Confirm" name="confirmMod" />

        </form>
    </body>
</html>
