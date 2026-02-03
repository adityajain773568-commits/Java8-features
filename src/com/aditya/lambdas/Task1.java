package com.aditya.lambdas;

//Declare names in an array and print names which are starting with 'A' using lambda expression.

import java.util.function.Predicate;

interface MyInterface {
    void printNamesStartsWithA(String name);
}

public class Task1 {

    public static void main(String[] args) {
        String[] names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny", "Aradhya", "Aishwarya"};
        MyInterface myInterface = (name)->{
            if (name.startsWith("A"))
                System.out.println(name);
        };
        for (String name : names){
            myInterface.printNamesStartsWithA(name);
        }
        System.out.println("***********************************");
        Predicate<String> predicate = name->name.startsWith("A");
        for (String name:names){
            if (predicate.test(name))
                System.out.println(name);
        }
    }

}
