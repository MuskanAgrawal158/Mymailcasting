/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import db.DBConnector;
import dto.UserDTO;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Muskan
 */
public class LoginAuthenticator 
{
    public boolean isLogin(String username,String password)
    {
        
        String TablePassword="";
        String name="";
    String gender="";
    String country="";
  
        
        try
        {
            Statement st=DBConnector.getStatement();
            String query="select * from MAILCASTINGUSER where email='"+username+"'";
      
            ResultSet rs=st.executeQuery(query);
           while(rs.next())
            {
                  name= (rs.getString(3));
             gender= (rs.getString(4) );
               country=(rs.getString(6) );
                TablePassword=rs.getString(2);
            }
           
           
        } catch (SQLException e) {
            System.out.println(e);
        }
         if(username!=null && password!=null && !username.trim().equals("") && password.equals(TablePassword))
             {

              UserDTO user=new UserDTO();
              user.setName(name);
              user.setGender(gender);
              user.setCountry(country);
              
                return true;
             }
             else
             {
             return false;
             }
    }
    
    
}
