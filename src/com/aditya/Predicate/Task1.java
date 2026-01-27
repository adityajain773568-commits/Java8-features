package com.aditya.predefinedfunctionalinterfaces;

//Take a list of person and print persons whose age is >=18 using lambda


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Aditya", 21));
        people.add(new Person("Bhaskaran" , 31));
        people.add(new Person("Akshat" , 7));
        people.add(new Person("Ayush",  13));
        people.add(new Person("Abhay" , 15));

        Predicate<Integer> predicate =(age)->age>=18;
        for (Person person : people){
            if (predicate.test(person.getAge())){
                System.out.println(person.getName());
            }
        }
    }


}
