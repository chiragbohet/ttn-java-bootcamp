package main.java.com.learning.day5_java8.q6;

// Q6) Override the default method of the interface

interface TestInterface{
    default void defaultMethod(){
        System.out.println("The default implementation!");
    }
}

public class Driver implements TestInterface {

    //Overriding the default implementation
    @Override
    public void defaultMethod() {
        System.out.println("The overridden implementation!");
    }

    public static void main(String[] args) {

        Driver d = new Driver();
        d.defaultMethod();  //will use the overridden implementation

    }
}
