package main.java.com.learning.day1_java1.q3;

public class CountOccurance {


    public static void countFreq(String s, int currentIndex, int[] frequencyTable) {
        if (currentIndex == s.length()) // Base Case
            return;
        else {

            int ASCII = s.charAt(currentIndex);
            frequencyTable[ASCII] += 1;
            countFreq(s, currentIndex + 1, frequencyTable); // Recursive call
        }
    }

    public static void countFrequency(String str) {

        // Wrapper function for countFreq()
        int table[] = new int[256];
        countFreq(str, 0, table);

        System.out.println("Character : Count");

        for (int i = 0; i < 255; i++) {
            if (table[i] > 0) {
                System.out.println((char) i + " : " + table[i]);
            }
        }
    }

    public static void main(String[] args) {

        String s = "This is a sample string!";
        countFrequency(s);
    }
}