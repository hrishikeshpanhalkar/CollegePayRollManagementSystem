

package PayRoll_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CYBCreate {
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
            String sql="Create table CHB"+
                    "(faculty_id Integer,"+
                    "faculty_name varchar(200),"+
                    "monthYear varchar(50),"+                   
                    "Destination varchar(50),"+                   
                    "Department varchar(50),"+
                    "LeaveRemaining Integer,"+
                    "Leaves varchar(50),"+  
                    "totalDays Integer,"+
                    "totalLeave Integer,"+ 
                    "Salary Integer,"+ 
                    "Primary key(faculty_id,monthYear))";
            
            st.executeUpdate(sql);
            System.out.println("successfully created table!");
            con.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        };
    }
}


