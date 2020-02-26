package main.java.com.learning.day4_collections.q3;

import java.util.Map;
import java.util.TreeMap;

//Q3. Write a method that takes a string and print the number of occurrence of each character characters in the string.

public class Count {

    /*
    * Method to count frequency of characters occurring in a string.
    * Prints a character : frequency table
    * @params text a input string
    * */
    public static void countCharacterOccurance(String text) {

        //Creating a TreeMap which will store Character as keys and Integers as values
        Map<Character, Integer> treeMap = new TreeMap<Character, Integer>();

        //A variable to hold the current character in the input string being processed
        char currentCharacter;

        //Iterating over each character in the input string
        for (int i = 0; i < text.length(); i++) {

            //currentCharacter = current character being processed
            currentCharacter = text.charAt(i);

            //if the character already exists in the map, increment its current value by 1
            if (treeMap.containsKey(currentCharacter)) {
                treeMap.replace(currentCharacter, treeMap.get(currentCharacter) + 1);
            }
            //if the character is not present in the map, add a new entry with initial value as 1
            else {
                treeMap.put(currentCharacter, 1);
            }
        }

        //printing out the final character, frequency table
        System.out.println("Character : Frequency");
        for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        //calling the method with some test string
        countCharacterOccurance("aaabbbccc$%@ 7546");
    }
}
