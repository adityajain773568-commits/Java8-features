package com.aditya.streamAPI;

import com.aditya.Utils.Employee;
import com.aditya.Utils.GenerateEmployeeList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Map Operation

public class ThirdDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aditya");
        names.add("Bhaskaran");
        names.add("Akshat");
        names.add("Tanay");
        names.add("Abhay");
        //Approach-1:-
//        for (String name: names){
//            System.out.println(name.toUpperCase());
//        }

        //Approach-2:-
//        names.stream().map(String::toUpperCase).forEach(System.out::println);
//        names.stream().mapToInt(String::length).forEach(System.out::println);

//        names.stream().filter(name -> name.startsWith("A")).forEach((name) -> System.out.println("Name : " + name + " , length : " + name.length()));

        List<Employee> employeeList = GenerateEmployeeList.generateEmployeeList(new ArrayList<>());

        employeeList.stream().filter(employee -> employee.getSalary()>=50000).map(employee -> "employee Name : " + employee.name + ", employee location : " + employee.location + ", employee Department : " + employee.department).forEach(System.out::println);

    }
}
