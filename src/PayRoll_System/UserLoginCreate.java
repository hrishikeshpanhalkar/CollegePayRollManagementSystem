/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayRoll_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class UserLoginCreate {
    public static void main(String args[])
    {
        Connection con=null;
        Statement st=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
            System.out.println("Connection to database successfully!");
            System.out.println("Creating table in database.....");
            st=con.createStatement();
            String sql="Create table User"+
                    "(id Integer AUTO_INCREMENT,"+
                    "faculty_id Integer,"+                   
                    "Date date,"+  
                    "Time time,"+
                    "Status varchar(50),"+
                    "Primary key(id))";           
            st.executeUpdate(sql);
            System.out.println("successfully created table!");
            con.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        };
    }
}


