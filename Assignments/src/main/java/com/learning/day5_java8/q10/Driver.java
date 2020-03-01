package main.java.com.learning.day5_java8.q10;

import java.util.*;

// Q10) Find average of the number inside integer list after doubling it.

public class Driver {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);

        OptionalDouble average;

        average = integerList
                .stream()
                .map(num -> num * 2)
                .mapToInt(num->num)
                .average();

        System.out.println(average);
    }
}
