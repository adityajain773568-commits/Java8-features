package com.aditya.DateTimeAPI;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class NewDateDemo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        LocalDate date = LocalDate.now();
        System.out.println(date);

         date = date.plusDays(3);
        System.out.println(date);
        date = date.plusMonths(2);
        System.out.println(date);

        date = date.plusYears(2);
        System.out.println(date);

        boolean leapYear = LocalDate.parse("2021-12-22").isLeapYear();
        System.out.println(leapYear);

        boolean before = LocalDate.parse("2021-12-11").isBefore(LocalDate.now());
        System.out.println(before);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        Period period = Period.ofDays(5);
        System.out.println(period.getDays());

        Period age = Period.between(LocalDate.parse("2004-11-23"), LocalDate.now());
        System.out.println("years : " + age.getYears() + " months : " + age.getMonths() + " days : " + age.getDays());

        Duration duration = Duration.between(LocalTime.parse("17:00"), LocalTime.now());
        System.out.println(duration.toMinutes());


    }
}
