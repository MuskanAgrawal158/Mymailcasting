/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "ComposeMail", urlPatterns = {"/ComposeMail"})
public class ComposeMail extends HttpServlet
{
static int d=1;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
                PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);
                String sender=(String)session.getAttribute("username");
                String reciever=request.getParameter("reciever_id");
		String msg=request.getParameter("message");
                java.util.Date sqdate=Calendar.getInstance().getTime();
	java.sql.Date dat =new java.sql.Date(sqdate.getTime());
        int i=0;
                try
                {
                    Connection con=DBConnector.getConnection();
                    PreparedStatement st=con.prepareStatement("Insert into INBOX6 values(?,?,?,?,?)");                   
            
                st.setString(3,sender);  
		st.setString(2,reciever);
		st.setString(4,msg);
		st.setDate(5,dat);
		st.setInt(1,d);
                 i =st.executeUpdate();
	 
                }
                catch(SQLException e)
                {
                    System.out.println(e);
                }
                if(i>0)
                {
                    out.print("Message Sucessfully Sent");
			response.sendRedirect("home.jsp");
                }
                else
                {
                    out.print("Sorry,Message was not sent");
			 response.sendRedirect("compose.jsp");
                }
    }
    
   
    
    }
        
    

    

