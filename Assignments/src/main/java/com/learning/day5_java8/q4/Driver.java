package main.java.com.learning.day5_java8.q4;

import java.util.Random;
import java.util.function.*;

// Q4) Implement following functional interfaces from java.util.function using lambdas:
//        (1) Consumer
//        (2) Supplier
//        (3) Predicate
//        (4) Function

public class Driver {


    public static void main(String[] args) {

        Consumer printer = (T) -> {
            System.out.println(T);
        };
        printer.accept("some string");


        Supplier randomInteger = () -> {
            Random random = new Random();
            return random.nextInt(101);
        };
        System.out.println("A random Integer between 0-100: " + randomInteger.get());


        Predicate<String> isEvenLengthString = (S) -> {
            return (S.length() % 2 == 0);
        };
        String testString = "some text";
        System.out.println("checking if \""+testString+"\" is a Even length String : " + isEvenLengthString.test(testString));

        Function<Integer,Integer> square = (number)->{return (number*number);};
        System.out.println("Square of 5 is " + square.apply(5));

    }
}
