package main.java.com.learning.day4_collections.q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Q. Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

//Main driver class that containing main() method
public class Driver {
    public static void main(String[] args) {

        //Defining a list.
        List<Float> list = new ArrayList<Float>();

        //Adding 5 floating point numbers to the list
        list.add(1.2f);
        list.add(4.3f);
        list.add(54.7f);
        list.add(69.54f);
        list.add(5.5f);

        //Declaring an Iterator
        Iterator<Float> it = list.iterator();

        //Variable to hold the sum of list items
        float listSum = 0;

        //Iterating over  list using iterator and adding each element pointed by iterator to listSum.
        while (it.hasNext())
            listSum += it.next();

        //Printing out the final sum
        System.out.println(listSum);

    }
}
