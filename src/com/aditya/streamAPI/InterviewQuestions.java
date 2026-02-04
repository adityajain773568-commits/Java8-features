package com.aditya.streamAPI;

import com.aditya.Utils.Employee;
import com.aditya.Utils.GenerateEmployeeList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class InterviewQuestions {
    public static void main(String[] args) {
        List<Employee> employeeList = GenerateEmployeeList.generateEmployeeList(new ArrayList<>());

//        Que-1:- How many male and female employees are there in organization?
        long maleEmployee = employeeList.stream().filter(employee -> Objects.equals(employee.gender, "M")).count();

        long femaleEmployee = employeeList.stream().filter(employee -> Objects.equals(employee.gender, "F")).count();
        System.out.println("Male employees are : " + maleEmployee + " female employees are : " + femaleEmployee);

//        Que-2:-Print name of all the departments in organization.
        employeeList.stream().map(employee -> employee.department).distinct().forEach(System.out::println);

//        Que-3:-What is average age of male and female employees
        Double avgMaleAge = employeeList.stream().filter(employee -> employee.gender.equals("M")).collect(Collectors.averagingInt((employee) -> employee.age));
        Double avgFemaleAge = employeeList.stream().filter(employee -> employee.gender.equals("F")).collect(Collectors.averagingInt((employee) -> employee.age));
        System.out.println("avg male age : " + avgMaleAge + " , avg female age : " + avgFemaleAge);

//        Que-4 :- Get Details of highest paid employee in organization
        Employee highestSalaryEmp = employeeList.stream().max(Comparator.comparingInt(e -> e.getSalary().intValue())).get();
        System.out.println(highestSalaryEmp);

//        Que-5 :- Get the names of all the employees who joined after 2015
        List<String> list = employeeList.stream().filter(employee -> employee.yearOfJoining > 2015).map(employee -> employee.name).toList();
        System.out.println(list);

//        Que-6 :- Count the number of employees in each department
        Map<String, List<Employee>> empDepartmentWise = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.department));
        System.out.println(empDepartmentWise);

//        Que-7:- What is the average salary of each department?

//        Que-8:- Get the details of youngest male employee in the product development department?
        Employee youngestEmp = employeeList.stream().filter(employee -> employee.department.equals("Development") && employee.gender.equals("M")).min(Comparator.comparingInt(emp -> emp.age)).get();
        System.out.println(youngestEmp);

//        Que-9:- who has the most working experience in the organization?
        Employee mostExpEmp = employeeList.stream().min(Comparator.comparingInt(emp -> emp.yearOfJoining)).get();
        System.out.println(mostExpEmp);

//        Que-10 :- How many male and female employees are there in the sales and marketing team?
        long salesTeam = employeeList.stream().filter(employee -> employee.department.equals("Sales")).count();
        System.out.println(salesTeam);

//        Que-11 :- What is average salary of male and female employees?
        Double avgSalaryMale = employeeList.stream().filter(employee -> employee.gender.equals("M")).collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avgSalaryMale);
        Double avgSalaryFemale = employeeList.stream().filter(employee -> employee.gender.equals("F")).collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avgSalaryFemale);

//        Que-12:- List Down the names of all employees in each department?
        Map<String, List<Employee>> empInEachDepartment = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.department));
        empInEachDepartment.forEach((key,val)->{
            System.out.println(key);
            val.forEach((employee -> System.out.println(employee.name)));
            System.out.println("*************************");
        });

//        Que-13:- What is the average and total salary of whole organization?
        Double avgSalOrg = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        double totalSalOrg = employeeList.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Avg org salary : " + avgSalOrg + " Total Org salary :- " + totalSalOrg);

//        Que-14 :-

//        Que-15:- Who is the oldest employee in the organization ? what is his age and which department he belongs to ?
        Employee employee = employeeList.stream().max((Comparator.comparingInt(o -> o.age))).get();
        System.out.println(employee);


    }
}
