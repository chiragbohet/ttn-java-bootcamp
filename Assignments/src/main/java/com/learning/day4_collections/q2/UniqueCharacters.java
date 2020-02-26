package main.java.com.learning.day4_collections.q2;

import java.util.HashSet;
import java.util.Set;

//Q4. Write a method that takes a string and returns the number of unique characters in the string.

public class UniqueCharacters {

    /*
     * Method to count number of unique characters in the string
     * @params text a input string
     * @return int the number of unique characters in the string
     * */
    public static int countUniqueCharacters(String text) {

        //creating a new HashSet, since a set only contains unique elements. This DS solves our purpose.
        Set<Character> uniqueChars = new HashSet<Character>();

        //Adding elements to the set
        for (int i = 0; i < text.length(); i++)
            uniqueChars.add(text.charAt(i));

        //Returning size of the set
        return uniqueChars.size();
    }

    public static void main(String[] args) {
        System.out.println(countUniqueCharacters("aaaabbbcccc"));
    }
}
