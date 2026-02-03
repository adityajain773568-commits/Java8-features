package com.aditya.Predicate;

import java.util.function.Predicate;

public class PredicateWithoutLambda implements Predicate<Integer> {

@Override
    public boolean test(Integer o) {
        if (o >10){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        PredicateWithoutLambda predicateWithoutLambda = new
                PredicateWithoutLambda();
        boolean test = predicateWithoutLambda.test(15);
        System.out.println(test);
    }


}
