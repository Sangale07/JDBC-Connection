package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void TestUpdateSalary() throws CustomException , SQLException{
        Main.updateSalary("Rushi" , 300000.0);


        List<EmployeePayroll> list =  Main.getemployeeData();
        EmployeePayroll rsEmp = null;

        for(EmployeePayroll emp :list){
            if(emp.getName().equals("Rushi")){
                rsEmp = emp;
                break;
            }
        }

        assertEquals(300000.0,rsEmp.getSalary());

    }


}