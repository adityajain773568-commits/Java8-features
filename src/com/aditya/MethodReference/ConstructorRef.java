package com.aditya.MethodReference;

import java.util.function.Supplier;

class Doctor{

    public Doctor(){
        System.out.println("Doctor Constructor");
    }

}

public class ConstructorRef {

    public static void main(String[] args) {
//        Doctor doctor = new Doctor();
        Supplier<Doctor> supplier = Doctor::new;
        System.out.println(supplier.get().hashCode());
    }

}
