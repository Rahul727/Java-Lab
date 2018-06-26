<%-- 
    Document   : welcome
    Created on : 6 Apr, 2015, 1:34:12 PM
    Author     : cgpit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="welcome" class="Bean.Usebean" scope="session">
</jsp:useBean>
<jsp:setProperty name="welcome" property="name" value="<%=request.getParameter("name")%>" />

                
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Welcome : <jsp:getProperty name="welcome" property="name" />
        
    <center>
       <%-- <% String n = request.getParameter("name");%>-->--%>
       <%-- <% out.println("Welcome");%>--%>
       
    </body>
</html>
