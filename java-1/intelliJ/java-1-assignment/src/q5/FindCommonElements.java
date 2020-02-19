//Q5. Find common elements between two arrays.
package q5;

public class FindCommonElements {

  static void getCommonElements(String s1, String s2) {

    boolean exists[] = new boolean[256];
    boolean commonElements[] = new boolean[256];

    int ASCII;

    for (int i = 0; i < s1.length(); i++) {

      ASCII = (int) s1.charAt(i);

      if (!exists[ASCII]) {
        exists[ASCII] = true;
      }
    }

    for (int i = 0; i < s2.length(); i++) {
      ASCII = (int) s2.charAt(i);
      if (exists[ASCII]) {
        commonElements[ASCII] = true;
      }
    }

    System.out.println("Common Elements : ");

    for (int i = 0; i < 255; i++) {
      if (commonElements[i]) {
        System.out.println((char) i);
      }
    }
  }

  public static void main(String[] args) {
    getCommonElements("ab1c", "cd12");
  }
}
