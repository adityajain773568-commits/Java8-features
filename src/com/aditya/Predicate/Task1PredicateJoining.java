package com.aditya.predefinedfunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1PredicateJoining {


    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aditya" ,120000.0, "Pune" , "Devops"));
        employeeList.add(new Employee("Bhaskaran" ,120000.0, "Pune" , "Frontend"));
        employeeList.add(new Employee("Darpan" ,120000.0, "Pune" , "AIML"));
        employeeList.add(new Employee("Shubh" ,120000.0, "Pune" , "Backend"));

        Predicate<Employee> predicate1 = employee ->employee.department.equals("Devops");
        Predicate<Employee> predicate2 = employee -> employee.location.equals("Pune");

        for (Employee employee : employeeList){
            if (predicate1.test(employee) && predicate2.test(employee)){
                System.out.println(employee.name);
            }
        }

        System.out.println("********************************");
        Predicate<Employee> andPredicate = predicate1.and(predicate2);
        for (Employee employee : employeeList){
            if (andPredicate.test(employee) ){
                System.out.println(employee.name);
            }
        }
        System.out.println("********************************");
        Predicate<Employee> orPredicate = predicate1.or(predicate2);
        for (Employee employee : employeeList){
            if (orPredicate.test(employee) ){
                System.out.println(employee.name);
            }
        }
    }
}
