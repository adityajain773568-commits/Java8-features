package com.aditya.Supplier;

import java.security.SecureRandom;
import java.util.function.Supplier;

public class OTPGenerator {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()->new SecureRandom().nextInt(1000,9999);
        System.out.println(supplier.get());
    }
}
