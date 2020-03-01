package main.java.com.learning.day5_java8.q1;

/*
Q1) Write the following a functional interface and implement it using lambda:
    (1.1) First number is greater than second number or not - Parameter (int ,int ) Return boolean
    (1.2) Increment the number by 1 and return incremented value - Parameter (int) Return int
    (1.3) Concatenation of 2 string - Parameter (String , String ) Return (String)
    (1.4) Convert a string to uppercase and return  - Parameter (String) Return (String)
*/

// (1.1) First number is greater than second number or not - Parameter (int ,int ) Return boolean
@FunctionalInterface
interface Greater{
    boolean isGreater(int a, int b);
}

// (1.2) Increment the number by 1 and return incremented value - Parameter (int) Return int
@FunctionalInterface
interface Increments {
    int increment(int a);
}

// (1.3) Concatenation of 2 string - Parameter (String , String ) Return (String)
@FunctionalInterface
interface Concatenates{
    String concatenate(String s1, String s2);
}

// (1.4) Convert a string to uppercase and return  - Parameter (String) Return (String)
@FunctionalInterface
interface Capitalize{
   String capitalize(String s);
}

public class Driver {
    public static void main(String[] args) {

        // Implementing 1.1
        Greater g = (int a,int b)->{return (a>b);};
        System.out.println(g.isGreater(6, 7));

        // Implementing 1.2
        Increments i = (int a) -> {return a+1;};
        System.out.println(i.increment(6));

        // Implemeint 1.3
        Concatenates c = (s1,s2)->{return s1+s2;};
        System.out.println(c.concatenate("Chi","rag"));

        // Implements 1.4
        Capitalize cp = (s)->{return s.toUpperCase();};
        System.out.println(cp.capitalize("chirag"));

    }
}
