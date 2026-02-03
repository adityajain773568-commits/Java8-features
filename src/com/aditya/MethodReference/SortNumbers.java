package com.aditya.MethodReference;

import java.util.Arrays;
import java.util.List;
//Approach-1
public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 15, 9, 2, 8, 13, 29, 5, 1, 23);
        int n = integerList.size();
        for (int i = 0 ; i<n  ; i++){
            int max_ele = integerList.get(i);
            int max_ele_index = i;
            for (int j = i+1 ; j<n ; j++){
                if (integerList.get(j)>max_ele){
                    max_ele= integerList.get(j);
                    max_ele_index = j;

                }
            }
            int temp = integerList.get(i);
            integerList.set(i , max_ele);
            integerList.set(max_ele_index, temp);

        }
        integerList.forEach(System.out::println);
    }
}
