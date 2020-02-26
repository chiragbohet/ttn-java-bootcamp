package main.java.com.learning.day4_collections.q7;

import java.util.*;

public class Printer {
    /*
     * Method takes as input a integer array and outputs the elements in decreasing frequency and is stable.
     * @params arr an int array
     * */
    public static void printInDecreasingFrequency(int arr[]) {

        //Using a LinkedHashMap to preserve input sequence
        LinkedHashMap<Integer, Integer> frequencyTable = new LinkedHashMap<Integer, Integer>();

        //Populating the Map with array elements and their frequency.
        for (int element : arr) {
            if (frequencyTable.containsKey(element))
                frequencyTable.replace(element, frequencyTable.get(element) + 1);
            else
                frequencyTable.put(element, 1);
        }

        //Creating a new list with Entry set of the Map
        List<Map.Entry<Integer, Integer>> valueList = new ArrayList<Map.Entry<Integer, Integer>>(frequencyTable.entrySet());

        // Sorting this list in non decreasing order of entry set values i.e. the frequency of array elements
        // Relative order of records with equal values is preserved
        Collections.sort(valueList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                if (e1.getValue() > e2.getValue())
                    return -1;
                else if (e1.getValue() < e2.getValue())
                    return 1;
                else
                    return 1;
            }
        });

        System.out.println("Array Element : Frequency");
        for (Map.Entry<Integer, Integer> entry : valueList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
