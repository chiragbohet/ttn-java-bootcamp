package main.java.com.learning.day5_java8.q9;

import java.util.Arrays;
import java.util.List;

// Q9) Sum all the numbers greater than 5 in the integer list.

public class Driver {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        int summation;

        summation = integerList
                .stream()
                .filter(num -> num > 5)
                .mapToInt(num -> num)
                .sum();

        System.out.println(summation);


    }
}
