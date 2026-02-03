package com.aditya.streamAPI;

import com.aditya.Utils.Employee;
import com.aditya.Utils.GenerateEmployeeList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
//min , max , avg , groupby operations
public class EighthDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = GenerateEmployeeList.generateEmployeeList(new ArrayList<>());
        Optional<Employee> max = employeeList.stream().max(Comparator.comparingInt(o -> o.getSalary().intValue()));
        System.out.println(max.get());
        Double maxSal = employeeList.stream().map(Employee::getSalary).min((sal1, sal2) -> sal2.intValue() - sal1.intValue()).get();
        System.out.println(maxSal);
        Optional<Employee> minSalaryEmployee = employeeList.stream().min((o1, o2) -> o1.getSalary().intValue() - o2.getSalary().intValue());
        System.out.println(minSalaryEmployee.get());
        Double minSal = employeeList.stream().map(Employee::getSalary).min(Comparator.comparingInt(Double::intValue)).get();
        System.out.println(minSal);
        double avgSal = employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println(avgSal);

        Map<String, List<Employee>> collected = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.location));
        System.out.println(collected);


    }

}
