package org.example;
import java.nio.channels.ScatteringByteChannel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

       static String url = "jdbc:mysql://localhost:3306/payroll_service";
       static String username = "root";
       static String password = "root";

      public static  List<EmployeePayroll> getemployeeData() throws SQLException{
          List<EmployeePayroll> list =  new ArrayList<>();

          try(Connection connection = DriverManager.getConnection(url,username,password);
              Statement  statement = connection.createStatement()) {
              String query = "Select * from employee";
              ResultSet resultSet = statement.executeQuery(query);

              while (resultSet.next()) {
                  EmployeePayroll emp = new EmployeePayroll();

                  emp.setId(resultSet.getInt("employee_id"));
                  emp.setName(resultSet.getString("name"));
                  emp.setGender(resultSet.getString("gender").charAt(0));
                  emp.setSalary(resultSet.getDouble("salary"));
                  emp.setStartDate(resultSet.getString("start"));
                  emp.setEmployeeNo(resultSet.getString("employee_phone"));
                  emp.setEmployeeAdd(resultSet.getString("employee_address"));

                  list.add(emp);
              }
          }
              catch(SQLException e){
                throw new SQLException("Error fetching data from local database " , e);
              }
          return list;
          }

    public static void main(String[] args) {
        try{
            List<EmployeePayroll> result = Main.getemployeeData();
            for(int i= 0 ; i < result.size() ; i++){
                EmployeePayroll emp = result.get(i);
                System.out.println(emp.getName() +"-->" +emp.getSalary());
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

}

