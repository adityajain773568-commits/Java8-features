package com.aditya.MethodReference;

import java.util.function.Consumer;

@FunctionalInterface
interface MethodRefInterface{
     void m1();

}

public class MethodReferenceDemo {

    public static void m2(){
        System.out.println("This is m2() method");
    }
    public  void m3(){
        System.out.println("This is m3() method");
    }

    public static void main(String[] args) {
        Consumer<String> consumer = (msg)-> System.out.println(msg);
        consumer.accept("hi");
//        MethodReferenceDemo.m2();
        MethodRefInterface methodRefInterface = MethodReferenceDemo::m2;
        methodRefInterface.m1();
//        MethodRefInterface methodRefInterface = MethodReferenceDemo::m3;
//        methodRefInterface.m1();
    }
}
