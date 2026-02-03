package com.aditya.streamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;
//How to create streams
public class FirstDemo {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        ArrayList<String> names = new ArrayList<>();
        names.add("Aditya");
        names.add("Bhaskaran");
        names.add("Akshat");
        names.add("Tanay");
        names.add("Abhay");
        Stream<String> stream2 = names.stream();

    }
}
