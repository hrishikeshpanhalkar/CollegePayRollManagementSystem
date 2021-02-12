/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayRoll_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Hrishi
 */
class PayRollDoa {

    static boolean Login(String name, String password) {
        boolean status=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
            PreparedStatement ps=con.prepareStatement("select usrname,password from facultydetails ");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                String sname=rs.getString("usrname");
                String spassword=rs.getString("password");
                
                if(sname.equals(name) && spassword.equals(password) ){
                    status=true;
                }                
            }        
            rs.close();
        }catch(Exception e){
            System.out.println("Error:" +e.getMessage());
        }        
        return status;
    
    }
}
