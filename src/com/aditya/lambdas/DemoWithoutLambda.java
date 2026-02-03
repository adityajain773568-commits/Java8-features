package com.aditya.lambdas;

interface MyInterface1{
    public void m1();
}

public class DemoWithoutLambda implements MyInterface1 {
    @Override
    public void m1() {
        System.out.println("m1 method called...");
    }

    public static void main(String[] args) {
        DemoWithoutLambda demoWithoutLambda = new DemoWithoutLambda();
        demoWithoutLambda.m1();
    }
}
