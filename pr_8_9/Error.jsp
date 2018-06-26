<%-- 
    Document   : Error
    Created on : 6 Apr, 2015, 1:43:22 PM
    Author     : cgpit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <% out.println("Invalid Id or password");%>
        <%@include file="login.jsp" %>
    </body>
</html>
