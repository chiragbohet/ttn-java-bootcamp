package main.java.com.learning.day2_java2.q3;

public class Driver {
    public static void main(String[] args) throws Exception {
        //ThrowsClassNotFoundException.start();
        ThrowsNoClassDefFoundError.start();

    }
}

class ThrowsNoClassDefFoundError{
    static void start()
    {

    }
}

class A{}

class ThrowsClassNotFoundException{
    A a = new A();
    static void start () throws Exception
    {
        Class.forName("dasdasd");
    }
}