package com.aditya.Utils;

public class Employee {
    public Long id;
    public String name;
    private final Double salary;
    public String location;
    public String department;

    public Employee(Long id , String name, Double salary, String location, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.location = location;
        this.department = department;
    }

    public Double getSalary() {
        return salary;
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
