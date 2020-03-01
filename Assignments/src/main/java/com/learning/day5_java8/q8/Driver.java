package main.java.com.learning.day5_java8.q8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//8) Collect all the even numbers from an integer list.

public class Driver {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> evenIntegersList;

        evenIntegersList = integerList
                .stream()
                .filter(num->num%2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenIntegersList);
    }
}
