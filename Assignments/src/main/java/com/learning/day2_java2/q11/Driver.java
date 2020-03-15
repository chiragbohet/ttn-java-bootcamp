package main.java.com.learning.day2_java2.q11;

import java.util.HashMap;

public class Driver {

   static void original() {

       int s = 0;
       int t = 1;

       for (int i = 0; i < 10; i++)
       {
           s = s + i;

           for (int j = i; j > 0; j--)
           {
               t = t * (j - i);
           }
           s = s * t;
           System.out.println("T is " + t);
       }
       System.out.println("S is " + s);

       //throw new Exception("some exception!");
    }

    public static void main (String[] args) {
        System.out.println("Hello World!");

    }
}
