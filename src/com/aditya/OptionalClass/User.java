package com.aditya.OptionalClass;

import java.util.Optional;

public class User {

    public static String getUserNameById(int userId){
        if (userId==100){
            return "Aditya";
        } else if (userId==101) {
            return "Akshat";
        } else if (userId==102) {
            return "Bhaskaran";
        } else if (userId==103) {
            return "Tanay";
        }else {
            return null;
        }

    }
    public static Optional<String> getUserName(int userId){
        if (userId==100){
            return Optional.of("Aditya");
        } else if (userId==101) {
            return Optional.of("Akshat");
        } else if (userId==102) {
            return Optional.of("Bhaskaran");
        } else if (userId==103) {
            return Optional.of("Tanay");
        }else {
            return Optional.empty();
        }

    }
}
