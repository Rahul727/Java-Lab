<%-- 
    Document   : hidden
    Created on : 6 Apr, 2015, 1:48:30 PM
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
       <% String n = request.getParameter("name");
           String p = request.getParameter("pwd");
           RequestDispatcher rd;
           
           if(n.equalsIgnoreCase("admin") && p.equalsIgnoreCase("admin")){%>
           <jsp:forward page="welcome.jsp"/>
           <% }
               
                else
                 {%>
                 <jsp:forward page="Error.jsp"/>
                     <%
                         
                         
                         }%>
    </body>
</html>
