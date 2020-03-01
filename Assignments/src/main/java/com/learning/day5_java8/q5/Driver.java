package main.java.com.learning.day5_java8.q5;

// Q5) Create and access default and static method of an interface.

@FunctionalInterface
interface RandomInterface {
    void overrideThis();

    default void defaultMethod(){
        System.out.println("This is the default method!");
    }

    static void staticInterfaceMethod(){
        System.out.println("This is static method of an interface!");
    }
}

public class Driver {

    public static void main(String[] args) {
        RandomInterface r = ()->{
            System.out.println("Overriden!");
        };

        r.overrideThis();   //Invoking the overridden method
        r.defaultMethod();  //Invoking the default method
        RandomInterface.staticInterfaceMethod();    //Invoking the static method
    }
}
