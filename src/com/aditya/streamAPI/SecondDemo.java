package com.aditya.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class User{
    int id;
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SecondDemo {
    public static void main(String[] args) {
        //find nos greater than 20
        List<Integer> list = Arrays.asList(66, 32, 45, 12, 20);
        //Approach-1
//        for (Integer num : list){
//            if (num>20){
//                System.out.println(num);
//            }
//        }
        System.out.println("********************************************");
        //Approach-2
//        list.stream().filter(num->num>20).forEach(System.out::println);

//        ArrayList<String> names = new ArrayList<>();
//        names.add("Aditya");
//        names.add("Bhaskaran");
//        names.add("Akshat");
//        names.add("Tanay");
//        names.add("Abhay");
//        names.stream().filter(name->name.startsWith("A")).forEach(System.out::println);

        User u1 = new User("Aditya", 21);
        User u2 = new User("Akshat" , 7);
        Stream<User> userStream = Stream.of(u1, u2, new User("Bhaskaran", 35), new User("Abhay", 21), new User("Tanay", 68));
        userStream.filter(user -> user.age>=18 && user.name.startsWith("A")).forEach(System.out::println);


    }
}
