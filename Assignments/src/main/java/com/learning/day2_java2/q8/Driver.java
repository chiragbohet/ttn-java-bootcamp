package main.java.com.learning.day2_java2.q8;

import java.util.Scanner;

// Q8. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal to  its last character. For the required loop, use a
// a)while statement
// b)do-while statement

public class Driver {

    public static void usingWhile()
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        while(!word.equalsIgnoreCase("done"))
        {
            if(word.charAt(0) == word.charAt(word.length()-1))
                System.out.println("First character IS EQUAL to the last character!");
            else
                System.out.println("First character IS NOT EQUAL to the last character!");

            word = scanner.nextLine();
        }

    }

    public static void usingDoWhile()
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if(word.equalsIgnoreCase("done"))
            return;

        do
            {
                if(word.charAt(0) == word.charAt(word.length()-1))
                    System.out.println("First character IS EQUAL to the last character!");
                else
                    System.out.println("First character IS NOT EQUAL to the last character!");

                word = scanner.nextLine();
            }
        while (!word.equalsIgnoreCase("done"));

    }

    public static void main(String[] args) {
        //usingWhile();
        usingDoWhile();
    }
}
