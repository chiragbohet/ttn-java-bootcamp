//Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
package main.java.com.learning.day1_java1.q8;

public class StringBufferExample {

    public static String reverseAndReplace(String s) {

        StringBuffer sBuff = new StringBuffer(s);

        sBuff.reverse();
        sBuff.delete(4, 9 + 1);
        return sBuff.toString();
    }

    ;

    public static void main(String[] args) {

        String input = "9876543210";
        input = reverseAndReplace(input);
        System.out.println("Reversed and replaced : " + input);
    }
}

