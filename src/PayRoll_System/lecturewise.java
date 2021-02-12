
package PayRoll_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class lecturewise {
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
            String sql="Create table lecture"+
                    "(faculty_id Integer,"+
                    "Yearmonth varchar(50),"+
                    "lweek1 Integer,"+"ldweek1 varchar(50),"+"lweek2 Integer,"+"ldweek2 varchar(50),"+"lweek3 Integer,"+"ldweek3 varchar(50),"+
                    "lweek4 Integer,"+"ldweek4 varchar(50),"+"lweek5 Integer,"+"ldweek5 varchar(50),"+"pweek1 Integer,"+"pdweek1 varchar(50),"+
                    "pweek2 Integer,"+"pdweek2 varchar(50),"+"pweek3 Integer,"+"pdweek3 varchar(50),"+"pweek4 Integer,"+"pdweek4 varchar(50),"+"pweek5 Integer,"+"pdweek5 varchar(50),"+
                    "lhweek1 Float(6,2),"+"lhweek2 Float(6,2),"+"lhweek3 Float(6,2),"+"lhweek4 Float(6,2),"+"lhweek5 Float(6,2),"+
                    "phweek1 Float(6,2),"+"phweek2 Float(6,2),"+"phweek3 Float(6,2),"+"phweek4 Float(6,2),"+"phweek5 Float(6,2),"+
                    "lrweek1 Float(6,2),"+"lrweek2 Float(6,2),"+"lrweek3 Float(6,2),"+"lrweek4 Float(6,2),"+"lrweek5 Float(6,2),"+
                    "prweek1 Float(6,2),"+"prweek2 Float(6,2),"+"prweek3 Float(6,2),"+"prweek4 Float(6,2),"+"prweek5 Float(6,2),"+
                    "noOflect Float(6,2),"+"noOfPract Float(6,2),"+"noOfhlect Float(6,2),"+"noOfhpract Float(6,2),"+"totalRs Integer,"+"Primary key(faculty_id,Yearmonth))";
            st.executeUpdate(sql);
            System.out.println("successfully created table!");
            con.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        };
    }
}



