package main.java.com.learning.day2_java2.q11;

/*

11. Convert the following code so that it uses nested while statements instead of for statements:
        int s = 0;
        int t = 1;
        for (int i = 0; i < 10; i++)
        {
        s = s + i;
        for (int j = i; j > 0; j−−)
        {
        t = t * (j - i);
        }
        s = s * t;
        System.out.println("T is " + t);
        }
        System.out.println("S is " + s);

*/

public class Driver {

  static void original() {
    int s = 0;
    int t = 1;
    for (int i = 0; i < 10; i++) {
      s = s + i;
      for (int j = i; j > 0; j--) {
        t = t * (j - i);
      }
      s = s * t;
      System.out.println("T is " + t);
    }
    System.out.println("S is " + s);
  }

  static void converted() {

    int s = 0;
    int t = 1;

    int i = 0; // for 1 initialization

    while (i < 10) // for 1 condition check
    {
      s = s + i;

      int j = i; // for 2 initialization

      while (j > 0) // for 2 condition check
      {
        t = t * (j - i);
        j--; // for 2 decrement
      }

      s = s * t;

      System.out.println("T is " + t);

      i++; // for 1 increment
    }

    System.out.println("S is " + s);
  }

  public static void main(String[] args) {
    //Driver.original();
    Driver.converted();
  }
}
