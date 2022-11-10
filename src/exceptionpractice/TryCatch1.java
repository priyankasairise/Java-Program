package exceptionpractice;

public class TryCatch1 {
    public static void main(String[] args) {
//        int data=50/0;   //May throw exception
//        System.out.println("rest of the code...");

        //By using try catch block
        try
        {
            int data=50/0;
        }
        catch (ArithmeticException e){
            System.out.println(e);}
        System.out.println("rest of the code....");
    }
}
