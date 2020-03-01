package main.java.com.learning.day5_java8.q7;
// Q7) Implement multiple inheritance with default method inside  interface.

interface A {
    default void echo(){
        System.out.println("Inside A!");
    }
}

interface B{
    default void echo(){
        System.out.println("Inside B");
    }
}

class SampleClass implements A,B
{
    public void echo(){
        A.super.echo(); // Resolving multiple inheritance conflict
    }
}
public class Driver  {

    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.echo();
    }
}
