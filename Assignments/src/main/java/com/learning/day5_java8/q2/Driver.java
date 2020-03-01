package main.java.com.learning.day5_java8.q2;

//2) Create a functional interface whose method takes 2 integers and return one integer.
// Using (instance) Method reference create and
// apply add and subtract method
// and using (Static) Method reference create and apply multiplication method for the functional interface created.

@FunctionalInterface
interface BiIntOperation {
    int perform(int a, int b);
}

class IntegerOperations{
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    static int multiply(int a, int b){
        return a*b;
    }
}

public class Driver {

    public static void main(String[] args) {

        BiIntOperation addition = new IntegerOperations()::add;
        System.out.println(addition.perform(5, 10));

        BiIntOperation subtraction = new IntegerOperations()::subtract;
        System.out.println(subtraction.perform(10, 5));

        BiIntOperation multiply = IntegerOperations::multiply;
        System.out.println(multiply.perform(5, 10));
    }
}
