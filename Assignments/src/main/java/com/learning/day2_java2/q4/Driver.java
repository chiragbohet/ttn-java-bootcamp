package main.java.com.learning.day2_java2.q4;

enum Singleton {
    INSTANCE;

    int var = 100;

    void printVar() {
        System.out.println(var);
    }
}

public class Driver {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.INSTANCE;
        obj1.printVar();  // 100

        Singleton obj2 = Singleton.INSTANCE;
        obj2.var = 200; // changes will be reflected in obj1 too

        obj1.printVar();  // 200

    }
}
