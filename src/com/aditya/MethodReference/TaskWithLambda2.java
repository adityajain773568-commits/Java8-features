package com.aditya.MethodReference;

public class TaskWithLambda {

    public static void printNumber(){
        for (int i = 1 ; i<=5 ; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Runnable runnable = TaskWithLambda::printNumber;
        Thread t1 = new Thread(runnable);
        t1.start();
    }

}
