package q3;

import java.util.Scanner;

public class countOccurance {

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
    int table[] = new int[255];
    countFreq(str, 0, table);

    System.out.println("Character : Count");

    for (int i = 0; i < 255; i++) {
      if (table[i] > 0) {
        System.out.println((char) i + " : " + table[i]);
      }
    }
  }

  public static void main(String[] args) {

    System.out.println("Enter a string : ");
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    countFrequency(s);
  }
}
