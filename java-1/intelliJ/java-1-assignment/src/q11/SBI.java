package q11;

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

