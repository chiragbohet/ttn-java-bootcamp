package q11;

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
