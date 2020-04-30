/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Muskan
 */
@WebServlet(name = "InboxServlet", urlPatterns = {"/InboxServlet"})
public class InboxServlet extends HttpServlet 
{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        		HttpSession session=request.getSession(false);
		String username=(String)session.getAttribute("username");
                PrintWriter out=response.getWriter();
		try 
                {
                    Statement st=DBConnector.getStatement();
                    String query="Select * from INBOX6 where RECIEVER='"+username+"'";
                            ResultSet rs=st.executeQuery(query);
                            out.print("<div>");
                            	out.print("<table align='left' width='50%' border='4' bgcolor='###FFF'>");
			out.print("<tr><th>SENDER</th><th>MESSAGE</th><th>DATE OF RECIEVING</th><th>Delete</th></tr>");
			while(rs.next()){
				
				out.print("<tr>");
				out.print("<td>" + rs.getString(3) + "</td>");
				out.print("<td>" + rs.getString(4) + "</td>");
				out.print("<td>" + rs.getString(5) + "</td>");
                                out.print("</tr>");
			
			}
			out.print("</table>");
                        out.print("</div>");
                         }
                
                catch(SQLException e)
                {
                    System.out.println(e);
                }
    }
    


}
