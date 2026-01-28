package com.aditya.OptionalClass;

import javax.xml.namespace.QName;
import java.util.Optional;
import java.util.Scanner;

public class MsgService {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter user id : ");
        int userId = scn.nextInt();

//        String name = User.getUserNameById(userId);
//        if (name!=null) System.out.println("Hello " + name.toUpperCase());
//        else System.out.println("Invalid user Id ");

//        User.getUserName(userId).ifPresent(userName-> System.out.println("Hello " +userName));

        Optional<String> userName = User.getUserName(userId);
        if (userName.isPresent()){
            System.out.println("Hello " + userName.get().toUpperCase());
        }else {
            System.out.println("No Data Found!!");
        }

    }
}
