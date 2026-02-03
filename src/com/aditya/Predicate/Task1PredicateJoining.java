package com.aditya.Predicate;

import com.aditya.Utils.Employee;
import com.aditya.Utils.GenerateEmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1PredicateJoining {


    public static void main(String[] args) {

        List<Employee> employeeList = GenerateEmployeeList.generateEmployeeList(new ArrayList<>());
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
