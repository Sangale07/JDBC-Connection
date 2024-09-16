package org.example;

public class EmployeePayroll {
    private int id;
    private String name;
    private char gender;
    private double salary;
    private String startDate;
    private String employeeNo;
    private String employeeAdd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public String getEmployeeAdd() {
        return employeeAdd;
    }

    public void setEmployeeAdd(String employeeAdd) {
        this.employeeAdd = employeeAdd;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
