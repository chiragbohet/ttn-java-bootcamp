package main.java.com.learning.day4_collections.q4;

import java.util.*;

public class Driver {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("Chirag", 5);
        hashMap.put("Ajay", 3);
        hashMap.put("Ravi", 1);
        hashMap.put("Ishrat", 2);

        LinkedHashMap<String, Integer> linkedHashMap = SortedHashMap.hashMapToValueSortedLinkedHashMap(hashMap);

        for (Map.Entry entry : linkedHashMap.entrySet())
            System.out.println(entry);


    }

}



