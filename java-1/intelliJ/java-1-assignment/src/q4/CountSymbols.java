package q4;
import utilities.CommonUtilities;

public class CountSymbols {

  static void getCount(String s) {

    int lowerCount = 0, upperCount = 0, digitCount = 0, specialCharCount = 0;
    char c;

    for (int i = 0; i < s.length(); i++) {
      c = s.charAt(i);

      if (isLower(c)) lowerCount++;
      else if (isUpper(c)) upperCount++;
      else if (isDigit(c)) digitCount++;
      else specialCharCount++;
    }

    System.out.println("Type : Count : %age");
    System.out.println("Lower : " + lowerCount);
    System.out.println("Upper : " + upperCount);
    System.out.println("Digit : " + digitCount);
    System.out.println("Others/Special : " + specialCharCount);
  }

  public static void main(String[] args) {

    String input = CommonUtilities.getStringFromUser(); //I made this function
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
