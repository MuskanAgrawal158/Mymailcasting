/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muskan
 */
@WebServlet(name = "RegistrationChecker", urlPatterns = {"/RegistrationChecker"})
public class RegistrationChecker extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       response.sendRedirect("register.html");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    { 
    PrintWriter out=response.getWriter();
    String email=request.getParameter("email");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		
		String num=request.getParameter("mname");
		double mname=Double.parseDouble(num);
		String country=request.getParameter("country");
   
    try
    {
        Statement st=DBConnector.getStatement();
                    if(password!=null)
            {
                String query="INSERT INTO MAILCASTINGUSER VALUES('"+email+"','"+password+"','"+name+"','"+gender+"','"+mname+"','"+country+"')";
                  int i= st.executeUpdate(query);
            if(i>0)
            {
                response.sendRedirect("index.html");
            }
            else
            {
                response.sendRedirect("register.html");
            }
            }
        
    }
    catch(SQLException e)
    {
        System.out.println(e);
    }
        
    }
}
