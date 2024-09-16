package org.example;
import java.sql.*;
public class Main {
    public static void main(String[] args) throws SQLException {
       String url = "jdbc:mysql://localhost:3306/payroll_service";
       String username = "root";
       String password = "root";

       Connection connection = null;

       try{
           connection = DriverManager.getConnection(url , username ,password);
           System.out.println(connection);
       }
       catch(SQLException e){
           e.printStackTrace();
       }
    }
}