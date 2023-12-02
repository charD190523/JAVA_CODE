<%-- 
    Document   : login
    Created on : Nov 4, 2023, 3:10:23 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Form</h1>
        <%
            if (request.getAttribute("error") != null) {
                String er = (String)request.getAttribute ("error");
        %>
        <h3 style="color: red"><%=er%></h3>
        <%
            }
        %>
        <form action="login" method = "post">
            enter username : <input type ="text" name ="user"/><br/>
            enter password : <input type ="password" name ="pass"/><br/>
            <input type ="submit" value ="LOGIN"/><br/> 
        </form>
    </body>
</html>
