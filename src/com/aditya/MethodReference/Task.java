package com.aditya.MethodReference;

// Write a java program to print numbers from 1 to 5 using Thread with the help of
//Runnable interface

//Approach-1
public class Task implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Task task  = new Task();
//        task.start();
        Thread t1 = new Thread(task);
        t1.start();
    }
}
