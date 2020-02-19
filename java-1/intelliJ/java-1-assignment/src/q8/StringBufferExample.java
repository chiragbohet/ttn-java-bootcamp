package q8;

import utilities.CommonUtilities;

public class StringBufferExample {

  public static String reverseAndReplace(String s) {

    StringBuffer sBuff = new StringBuffer(s);

    sBuff.reverse();
    sBuff.delete(4, 9+1);
    return sBuff.toString();
  };

  public static void main(String[] args) {

    String input = CommonUtilities.getStringFromUser();
    input = reverseAndReplace(input);
    System.out.println("Reversed and replaced : " + input);
  }
}
