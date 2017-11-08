<%-- 
    Document   : contactusdb
    Created on : Sep 30, 2017, 10:19:43 PM
    Author     : sandeep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="contb" scope="session" class="load.ContactUs" />
        <jsp:setProperty name="contb" property="name" />
        <jsp:setProperty name="contb" property="contact" />
        <jsp:setProperty name="contb" property="email" />
        <jsp:setProperty name="contb" property="message" />
        
        <script>
            var a=contb.store();
            if(a === 1){
            alert("Cantact us data saved Successfully");
        }else {
            alert("Failed to save contact us data");
        }
            
        </script>
        <%        
        int a=contb.store();
        if(a==1){
            //out.print("Value Stored");
        }else {
            //out.print("Value not Stored");
        }
        %>
        
        <%
            response.sendRedirect("contact_us.jsp");
            
            %>

    </body>
</html>