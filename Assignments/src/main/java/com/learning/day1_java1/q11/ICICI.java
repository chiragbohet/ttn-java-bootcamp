package main.java.com.learning.day1_java1.q11;

public class ICICI extends Bank {
    double interestRate = 14;
    String name = "ICICI Bank";


    public void getDetails(){
        System.out.println(name+" : "+interestRate+"%");
    }


    ICICI(){
        getDetails();
    }
}
