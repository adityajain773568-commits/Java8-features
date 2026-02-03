package com.aditya.Utils;

import java.util.ArrayList;
import java.util.List;

public class CreatePersonList {

    public static List<Person> populatePerson() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Aditya", 21));
        personList.add(new Person("Bhaskaran", 31));
        personList.add(new Person("Akshat", 7));
        personList.add(new Person("Ayush", 13));
        personList.add(new Person("Abhay", 15));
        return personList;
    }
}
