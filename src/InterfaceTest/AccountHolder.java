package InterfaceTest;
/*interface Bank{
void provideLoanInfo();
}
class Axis {

    @Override
    public void provideLoanInfo() {
    System.out.println("Axis bank Provides loan @15.00 ROI");
    }
}
class SBI {

    @Override
    public void provideLoanInfo() {
System.out.println("SBI Bank provides loan @20.00 ROI");
    }
}


public class AccountHolder {
    private Axis applyloan;

    public void applyloan(Bank bank){
        bank.provideLoanInfo();
    }
    public static void main(String[] args) {
        AccountHolder ah = new AccountHolder();
        ah.applyloan= new Axis();  //calling method
        ah.applyloan=new SBI();

        //Annonymous inner class
        ah.applyloan(new Bank() {
            @Override
            public void provideLoanInfo() {
                System.out.println("BOI provides loan @25.00 ROI");
            }
        });

        //Lambda Expression
        ah.applyloan(() -> {
                    System.out.println("ICICI Bank provides loan @10.00 ROI");
                }
        );
        Bank HDFC = new Bank() {
            @Override
            public void provideLoanInfo() {
                System.out.println("HDFC bank provides loan @19.00 ROI");
            }
        };
        HDFC.provideLoanInfo();

        Bank hsbc=()-> {
            System.out.println("HSBC bank provides loan @30.00 ROI");
        };
        hsbc.provideLoanInfo();
}
    }*/



