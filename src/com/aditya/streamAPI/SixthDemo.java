package com.aditya.streamAPI;

import java.util.Arrays;
import java.util.List;

class Person{
    String name;
    String country;

    public Person( String name,String country) {
        this.name = name;
        this.country = country;
    }
}

public class SixthDemo {
    public static void main(String[] args) {

        Person p1 = new Person("Aditya" , "India");
        Person p2 = new Person("Akshat","Uganda");
        Person p3 = new Person("Bhaskaran","Bangladesh");
        Person p4 = new Person("Tanay","Pakistan");

        List<Person> personList = Arrays.asList(p1,p2,p3,p4);
        boolean status = personList.stream().anyMatch(person -> person.country.equals("India"));
        System.out.println("Any Indian Available ? :: " + status);

        boolean allMatchStatus = personList.stream().allMatch(person -> person.country.equals("Pakistan"));
        System.out.println("All Person Belongs to Pakistan ?  :: " + allMatchStatus);

        boolean noneMatchStatus = personList.stream().noneMatch(person -> person.country.equals("Pakistan"));
        System.out.println("None of them Belongs to Pakistan ?  :: " + noneMatchStatus);


    }
}
