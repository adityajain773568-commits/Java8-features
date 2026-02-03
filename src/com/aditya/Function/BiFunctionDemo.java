package com.aditya.Function;

//Take 2 inputs and perform sum of two  and return output

import java.util.Scanner;
import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number a = : ");
        int a  = scn.nextInt();
        System.out.println("Enter second number b = : ");
        int b = scn.nextInt();
        System.out.println("Sum of a and b is : ");
        BiFunction<Integer , Integer  , Integer> biFunction = (i , j)->i+j;
        System.out.println(biFunction.apply(a,b));
    }

}

