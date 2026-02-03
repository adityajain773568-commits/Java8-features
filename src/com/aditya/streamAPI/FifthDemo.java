package com.aditya.streamAPI;

import java.util.Arrays;
import java.util.List;

//Slicing Operations
public class FifthDemo {

    public static void main(String[] args) {
        List<String> javaCourses = Arrays.asList("Core Java" , "Adv Java" , "SpringBoot "  , "RestApi" , "microservices");
        javaCourses.stream().limit(3).forEach(System.out::println);
        System.out.println("**************");
        javaCourses.stream().skip(3).forEach(System.out::println);
        System.out.println("**************");
        List<String> names = Arrays.asList("raja" , "rani" , "raja" , "guru" , "rani");
        names.stream().distinct().forEach(System.out::println);
        
    }

}
