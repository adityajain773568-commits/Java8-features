package com.aditya.Utils;

import java.util.List;

public class GenerateEmployeeList {

    public static List<Employee> generateEmployeeList(List<Employee> employeeList) {

        employeeList.add(new Employee(1L, "Aditya", 120000.0, "Pune", "Devops"));
        employeeList.add(new Employee(2L, "Bhaskaran", 120000.0, "Pune", "Frontend"));
        employeeList.add(new Employee(3L, "Darpan", 120000.0, "Pune", "AIML"));
        employeeList.add(new Employee(4L, "Shubh", 120000.0, "Pune", "Backend"));
        employeeList.add(new Employee(5L, "Tanay", 35000.0, "Banglore", "Cyber Security"));
        employeeList.add(new Employee(6L, "Akshat", 25000.0, "Hyderabad", "Designer"));
        employeeList.add(new Employee(7L, "Abhay", 55000.0, "Mumbai", "Developer"));
        employeeList.add(new Employee(8L, "Himanshu", 65000.0, "Pune", "Business Analyst"));
        employeeList.add(new Employee(9L, "Ayush", 65000.0, "Pune", "Data Analyst"));

        return employeeList;
    }
}
