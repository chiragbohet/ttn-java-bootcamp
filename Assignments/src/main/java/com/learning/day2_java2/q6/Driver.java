package main.java.com.learning.day2_java2.q6;
// 6. WAP showing try, multi-catch and finally blocks.
public class Driver {

  static void demonstrate() {
    int a = 5;
    int b = 0;

    try {
      a = a / b;
    } catch (ArithmeticException e) {
      System.out.println("Don't divide by zero!");
    } catch (Exception e) {
      System.out.println("Some other exception occured, details : " + e.getMessage());
    }
    finally{
      System.out.println("Finishing work/cleanup is done here.");
    }
  }

  public static void main(String[] args) {
    Driver.demonstrate();
  }
}
