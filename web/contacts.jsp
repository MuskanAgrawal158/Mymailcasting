<%-- 
    Document   : contacts
    Created on : 28 Apr, 2020, 1:15:01 PM
    Author     : Muskan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
			<h1 class="title"><a href="#">Contact Us</a></h1>
			<div class="entry">
                            			<p>Hi! This is <strong>Mail Services</strong>provided by Global Mailing system</a>.
			You can perform all email operation like 
                        <ul>
                            <li> sending</li>
                            <li>receiving</li>
                            <li> deleting</li></ul><br>Currently it stores the information in database
                                it's free of cost.</p>
			  <br><br><br><br><br><br> 
                           
                                	
                            
			</div>
			</div>
	</div>
	<!-- end content -->
	<!-- start sidebar two -->
	<div id="sidebar2" class="sidebar">
		<ul>
                    <li><h2>Contact Details</h2><br><img src="css/images/uface.png" height="100" width="100">
                           <table>
									<tr><td><font style="color: navy;">Contact us:</font></td></tr>
									<tr><td><br/> </td></tr>
                                                                        <tr><td>Cont. Person: </td><td><b>Muskan Agrawal</b></td></tr>
                                                                        <tr><td>Contact No: </td><td><b>9403321127</b></td></tr>
                                                                        <tr><td>Email id: </td><td><b>muskan5@gmail.com</b></td></tr>
                                                                        <tr><td>Organization: </td><td><b>Global Mailing System</b></td></tr>
						
										<tr><td><br/> </td></tr>
											<tr><td><br/> </td></tr>
												<tr><td><br/> </td></tr>
												
									</table>
				
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
    <p>Copyright &copy; 2008. <a href="#">Privacy Policy</a> | <a href="#">Terms of Use</a> | </p>
</div>
</div>
<!-- end footer -->

    </body>
    
</html>

