package q11;

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
