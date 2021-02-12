
package PayRoll_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FacultyCreate {
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
            String sql="Create table facultydetails"+
                    "(faculty_id Integer AUTO_INCREMENT,"+
                    "photo longblob,"+
                    "faculty_name varchar(200),"+
                    "Qualification varchar(50),"+
                    "Destination varchar(50),"+
                    "usrname varchar(50),"+
                    "password varchar(50),"+
                    "Department varchar(50),"+
                    "Salary_Type varchar(50),"+
                    "Date1 varchar(50),"+  
                    "Date2 varchar(50),"+  
                    "Sal Integer,"+  
                    "nOfleaves Integer,"+
                    "Primary key(faculty_id))";
            
            st.executeUpdate(sql);
            System.out.println("successfully created table!");
            con.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        };
    }
}

