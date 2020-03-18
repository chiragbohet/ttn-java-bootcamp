package main.java.com.learning.day2_java2.q3;
//Q3 WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
public class Driver {
    public static void main(String[] args) throws Exception {
        ThrowsClassNotFoundException.start();
        //ThrowsNoClassDefFoundError.start();

    }
}


class ThrowsClassNotFoundException{

    static void start () throws Exception
    {
        Class.forName("dasdasd");
    }
}