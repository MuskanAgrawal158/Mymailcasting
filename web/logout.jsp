<%-- 
    Document   : logout
    Created on : 23 Apr, 2020, 12:58:21 AM
    Author     : Muskan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

      


     
       <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Home Page</title>

</head>
<body>
      
  <%
       session.invalidate();
       response.sendRedirect("index.html");
        %>




    </body>
    
</html>

       