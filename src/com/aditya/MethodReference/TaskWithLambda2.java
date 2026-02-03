package com.aditya.MethodReference;

//Approach-3
public class TaskWithLambda2 {

    public  void printNumber(){
        for (int i = 1 ; i<=5 ; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TaskWithLambda2 task = new TaskWithLambda2();
        Runnable runnable = task::printNumber;
        Thread t1 = new Thread(runnable);
        t1.start();
    }

}
