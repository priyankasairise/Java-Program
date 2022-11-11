package Inheritance;

public class BankSingleIn extends RBI {
    float roi= 10.5F;
    int min_balance=500;
    public void rejectOldCurrency(){
        System.out.println("Old notes 500 & 1000 are not acceptable");
        BankSingleIn b=new BankSingleIn();
       System.out.println(b.min_balance);


    }
}
