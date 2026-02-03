package com.aditya.Predicate;

//Take a list of person and print persons whose age is >=18 using lambda


import com.aditya.Consumer.ConsumerDemo;
import com.aditya.Utils.CreatePersonList;
import com.aditya.Utils.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1 {

    public static void main(String[] args) {
        List<Person> people = CreatePersonList.populatePerson();

        Predicate<Integer> predicate =(age)->age>=18;
        for (Person person : people){
            if (predicate.test(person.getAge())){
                System.out.println(person.getName());
            }
        }
    }


}
