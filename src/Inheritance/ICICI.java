package Inheritance;

public class ICICI extends BankSingleIn
{
    public static void main(String[] args) {
        ICICI i=new ICICI();
        System.out.println(i.roi);
        System.out.println(i.min_balance);
        i.rejectOldCurrency();

        System.out.println(Service_tax);
        System.out.println(Max_tax);


    }
}
