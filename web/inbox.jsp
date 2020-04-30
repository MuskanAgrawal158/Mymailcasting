<%-- 
    Document   : compose
    Created on : 28 Apr, 2020, 1:56:42 AM
    Author     : Muskan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Home Page</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="css/styles.css" rel="stylesheet" type="text/css" />
</head>
<body>
      <%
       String username=(String)session.getAttribute("username");
        if(username==null || username.trim().equals(""))
        {
            response.sendRedirect("index.html");
        }
        %>

<div id="main"><!-- start header -->
<div id="header">
 <div id="logo">
	<h1><a href="#">Global Mailing System</a></h1>
	<h2>An Initiative for Easy Mailing Services...</a></h2>
	</div>
	<div id="menu">
		<ul>
			<li><a href="home.jsp">Home</a></li>
			<li><a href="compose.jsp">Compose Mail</a></li>
			<li><a href="inbox.jsp">Inbox</a></li>
			<li><a href="logout.jsp">Log out</a></li>
			<li><a href="contacts.jsp">Contact</a></li>
		</ul>
	</div>	
<!-- end header -->
</div>
<hr />
<!-- start page -->
<div id="page">
	<!-- start content -->
	<div id="content">
		<div class="post">
                    <h1 class="title"><a href="#">Message</a></h1><br><br>
			<div class="entry">
                            <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/myschema" user="root" password="root" var="ds"></sql:setDataSource>
                <sql:query dataSource="${ds}" var="rs">select* from inbox6 where reciever='<%=username%>' ;</sql:query>
                <table cellspacing="10" border="4">
                    <tr>
                       
                        <th>Sender</th>
                        <th>Message</th>
                         <th>Date of Receiving</th>
                    </tr>
                    <c:forEach items="${rs.rows}" var="row">
                        <tr style="  color:black; 
    font-weight: bold;
    background-color:#AAB8E8;
    font-size:2em;">
                          
                            <td><c:out value="${row.sender}"></c:out></td>
                            <td><c:out value="${row.message}"></c:out></td>
                            <td><c:out value="${row.date_of_receiving}"></c:out></td>
                        </tr>
                    </c:forEach>
                </table>
			</div>
			</div>
	</div>
	<!-- end content -->
	<!-- start sidebar two -->
	<div id="sidebar2" class="sidebar">
		<ul>
			<li>
                            <h2>User Details</h2><br>
                                <img src="css/images/uface.png" height="100px" weight="100px" alt="no"></img><br>
                                    <h3><%="  "+ username%></</h3><br>
                                   
				
			</li>
			
			
		</ul>
	</div>
	<!-- end sidebar two -->
	<div style="clear: both;">&nbsp;</div>
</div>
<!-- end page -->
<hr />
<!-- start footer -->
<div id="footer">
	<p>Copyright &copy; 2008. <a href="#">Privacy Policy</a> | <a href="#">Terms of Use</a> |
		</p>
</div>
</div>
<!-- end footer -->

    </body>
    
</html>

 