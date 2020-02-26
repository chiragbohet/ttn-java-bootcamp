//Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks
package main.java.com.learning.day1_java1.q11;

public class Driver {
  public static void main(String[] args) {

    System.out.println("Bank : Interest Rate");
    SBI sbi = new SBI();
    BOI boi = new BOI();
    ICICI icici = new ICICI();
  }
}
