package com.aditya.Consumer;

import com.aditya.Utils.CreatePersonList;
import com.aditya.Utils.Person;

import java.util.List;

public class ConsumerDemo {


    public static void main(String[] args) {

        List<Person> personList = CreatePersonList.populatePerson();
        personList.forEach(person -> System.out.println(person.getName()));
    }



}
