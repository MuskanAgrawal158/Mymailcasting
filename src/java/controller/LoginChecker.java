/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;


/**
 *
 * @author Muskan
 */
@WebServlet(name = "LoginChecker", urlPatterns = {"/LoginChecker"})
public class LoginChecker extends HttpServlet
{
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
     {
         response.sendRedirect("index.html");
     
     }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username=  request.getParameter("username");
             String password=request.getParameter("password");
             LoginAuthenticator authenticator=new LoginAuthenticator();
            boolean login= authenticator.isLogin(username,password);
             if(login==true){
            
                 HttpSession session= request.getSession(true);
                 UserDTO user=new UserDTO();
              String name=user.getName();
              String gender=user.getGender();
              String country=user.getCountry();
                              
             
                 session.setAttribute("username",username);
                 session.setAttribute("name",name);
                 session.setAttribute("gender",gender);
                 session.setAttribute("country", country);
                  
                 response.sendRedirect("home.jsp");
             }
            else 
             {
               response.sendRedirect("index.html");      
             }
    }

}