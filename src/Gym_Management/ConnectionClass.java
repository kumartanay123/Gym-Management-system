package Gym_Management;

import java.sql.*;
public class ConnectionClass 
{
    Connection con;
    Statement stm;
    ConnectionClass()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Gym_Management","root","tanay@123");
            stm=con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }
    public static void main(String s[])
    {
        new ConnectionClass();
    }
}
