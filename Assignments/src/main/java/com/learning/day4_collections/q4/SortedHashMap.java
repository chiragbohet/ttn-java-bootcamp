package main.java.com.learning.day4_collections.q4;

import java.util.*;


public class SortedHashMap {

    /*
    * A simple method which takes as input a HashMap and returns a LinkedHashMap sorted on based of key values
    * @params hashMap a HashMap with <String,Integer> pairs
    * @return sortedLinkedHashMap a LinkedHashMap with <String,Integer> pairs sorted on Integer values.
    * */

    public static LinkedHashMap<String, Integer> hashMapToValueSortedLinkedHashMap(HashMap<String, Integer> hashMap)
    {

        List<Map.Entry<String,Integer>> entryList= new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());

        //Sorting these values, result would be a List of entries sorted on values
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                if(e1.getValue() > e2.getValue())
                    return 1;
                else if(e1.getValue() < e2.getValue())
                    return -1;
                else
                    return 0;
            }
        });

        //Creating a new LinkedHashMap to store these entries
        LinkedHashMap<String,Integer> sortedLinkedHashMap = new LinkedHashMap<String,Integer>();

        //Adding these entries in the LinkedHashMap, since the Array was sorted, they will be inserted in the sorted order and the LinkedHashMap will maintain that order.
        for(Map.Entry<String,Integer> entry : entryList)
            sortedLinkedHashMap.put(entry.getKey(),entry.getValue());

        return sortedLinkedHashMap;
    }

}
