package main.java.com.learning.day5_java8.q11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

// Q11) Find the first even number in the integer list which is greater than 3.

public class Driver {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        Optional<Integer> result;

        result = integerList
                .stream()
                .filter((num) -> {
                    return (num % 2 == 0 && num > 3);
                })
                .findFirst();

        if (result.isPresent())
            System.out.println(result.get());

        else
            System.out.println("No value found!");


    }


}
