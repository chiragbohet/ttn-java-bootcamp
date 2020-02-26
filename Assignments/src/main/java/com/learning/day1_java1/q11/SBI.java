package main.java.com.learning.day1_java1.q11;

public class SBI extends Bank {

    double interestRate = 10;
    String name = "State Bank of India";


    public void getDetails(){
        System.out.println(name+" : "+interestRate+"%");
    }

    SBI(){
        getDetails();
    }
}

