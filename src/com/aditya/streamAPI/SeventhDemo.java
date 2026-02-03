package com.aditya.streamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//Collectors Operations
public class SeventhDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Aditya" , "India");
        Person p2 = new Person("Akshat","Uganda");
        Person p3 = new Person("Bhaskaran","Bangladesh");
        Person p4 = new Person("Tanay","Pakistan");
        Person p5 = new Person("Anuj" , "India");

        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);
        Optional<Person> optionalPerson = personList.stream().filter(person -> person.country.equals("India")).findFirst();
        System.out.println(optionalPerson.get());
        Optional<Person> optionalPerson1 = personList.stream().filter(person -> person.country.equals("India")).findAny();
        System.out.println(optionalPerson1.get());
        List<Person> indianPersons = personList.stream().filter(person -> person.country.equals("India")).toList();
        System.out.println(indianPersons);
        Set<Person> indianPersonSet = personList.stream().filter(person -> person.country.equals("India")).collect(Collectors.toSet());
        System.out.println(indianPersonSet);
        List<String> indianNamesList = personList.stream().filter(person -> person.country.equals("India")).map(person -> person.name).collect(Collectors.toList());
        System.out.println(indianNamesList);
    }
}
