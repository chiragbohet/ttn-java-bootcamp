package main.java.com.learning.day1_java1.q11;

public class BOI extends Bank {
    double interestRate = 12;
    String name = "Bank of India";


    public void getDetails(){
        System.out.println(name+" : "+interestRate+"%");
    }


    BOI(){
        getDetails();
    }
}
