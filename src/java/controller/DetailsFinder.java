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
@WebServlet(name = "DetailsFinder", urlPatterns = {"/DetailsFinder"})
public class DetailsFinder extends HttpServlet
{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    { String name="";
    String gender="";
    String country="";
          
        try
        {   HttpSession session= request.getSession(true);
            String username=(String)session.getAttribute("username");
            Statement st=DBConnector.getStatement();
            String query="select * from MAILCASTINGUSER where email='"+username+"'";
      
            ResultSet rs=st.executeQuery(query);
             while (rs.next()) 
            {
               name= (rs.getString(3) + "\t");
             gender= (rs.getString(4) + "\t");
               country=(rs.getString(6) + "\t");
               
            }
             
             session.setAttribute("name",name);
             session.setAttribute("gender",gender);
             session.setAttribute("country", country);
             
             
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    


}
