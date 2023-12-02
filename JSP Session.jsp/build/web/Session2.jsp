<%-- 
    Document   : Session2
    Created on : Oct 28, 2023, 9:53:26 PM
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
        <%
            String name = String.valueOf(session.getAttribute("name"));
        %>
        <%=name%>
    </body>
</html>
