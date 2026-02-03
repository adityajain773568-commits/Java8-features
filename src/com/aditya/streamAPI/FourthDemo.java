package com.aditya.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


//forEach Method
public class FourthDemo {


    public static void main(String[] args) {
        List<String> javaCourses = Arrays.asList("Core javaCourses" , "Advanced Java" , "Spring boot");
        List<String> uiCourses = Arrays.asList("HTML" , "CSS" , "Bootstrap" , "JavaScript");

        List<List<String>> courses = Arrays.asList(javaCourses, uiCourses);

        courses.stream().forEach(System.out::println);

        Stream<String> stringStream = courses.stream().flatMap(s -> s.stream());

        stringStream.forEach(System.out::println);

    }



}
