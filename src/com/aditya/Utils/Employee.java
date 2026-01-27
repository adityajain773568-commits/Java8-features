package com.aditya.Predicate;

public class Employee {
    String name;
    Double salary;
    String location;
    String department;

    public Employee(String name, Double salary, String location, String department) {
        this.name = name;
        this.salary = salary;
        this.location = location;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
