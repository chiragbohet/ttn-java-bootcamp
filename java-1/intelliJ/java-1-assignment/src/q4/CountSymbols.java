package q4;

import utilities.CommonUtilities;

public class CountSymbols {

  static void getCount(String s) {

    double lowerCount = 0, upperCount = 0, digitCount = 0, specialCharCount = 0;
    char c;

    int len = s.length();

    for (int i = 0; i < len; i++) {
      c = s.charAt(i);

      if (isLower(c)) lowerCount++;
      else if (isUpper(c)) upperCount++;
      else if (isDigit(c)) digitCount++;
      else specialCharCount++;
    }

    System.out.println("Type : Count : %age");
    System.out.println("Lower : " + (int)lowerCount + " : " + ((lowerCount / len) * 100));
    System.out.println("Upper : " + (int)upperCount + " : " + ((upperCount / len) * 100));
    System.out.println("Digit : " + (int)digitCount + " : " + ((digitCount / len) * 100));
    System.out.println(
        "Others/Special : " + (int)specialCharCount + " : " + ((specialCharCount / len) * 0.01));
  }

  public static void main(String[] args) {

    String input = CommonUtilities.getStringFromUser(); // I made this function
    getCount(input);
  }

  static boolean isLower(char c) {
    return (c >= 97 && c <= 122);
  }

  static boolean isUpper(char c) {
    return (c >= 65 && c <= 90);
  }

  static boolean isDigit(char c) {
    return (c >= 48 && c <= 57);
  }
}
