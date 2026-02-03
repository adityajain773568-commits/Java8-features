package com.aditya.MethodReference;

//Approach-2
public class TaskWithLambda {


    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                }
            }
        };

//        TaskWithLambda2 task = new TaskWithLambda2();
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
