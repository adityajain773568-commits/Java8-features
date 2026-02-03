package com.aditya.MethodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbers2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 15, 9, 2, 8, 13, 29, 5, 1, 23);
        //Approach-2
//        integerList.sort((a,b)->b-a);
//        integerList.forEach(System.out::print);
        //Approach-3
        Comparator<Integer> comparator = (a,b)->b-a;
        integerList.sort(Integer::compareTo);
        integerList.forEach(System.out::println);

    }
}
