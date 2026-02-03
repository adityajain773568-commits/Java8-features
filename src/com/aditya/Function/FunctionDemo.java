package com.aditya.Function;

import com.aditya.Utils.Employee;
import com.aditya.Utils.GenerateEmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = GenerateEmployeeList.generateEmployeeList(new ArrayList<>());
        Function<Integer,Employee > function = id->{
            for (Employee employee:employeeList){
                if (employee.id==id.longValue()){
                    return employee;
                }
            }
            return new Employee(Long.MAX_VALUE,"Null" , Double.MAX_VALUE , "Null" , "Null");
        };
        System.out.println("Data is : " + function.apply(1));
    }

}
