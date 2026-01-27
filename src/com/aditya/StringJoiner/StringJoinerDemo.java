package com.aditya.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner("*");
        stringJoiner.add("aditya");
        stringJoiner.add("jain");
        System.out.println(stringJoiner);
        StringJoiner stringJoiner1 = new StringJoiner(" +*+ " , "Aditya " , " Bhaskara");
        stringJoiner1.add("Akshat");
        stringJoiner1.add("tanay");
        System.out.println(stringJoiner1);

    }
}
