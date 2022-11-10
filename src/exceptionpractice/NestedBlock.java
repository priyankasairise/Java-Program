package exceptionpractice;

public class NestedBlock {
    public static void main(String[] args) {
        try{
            try{
                int b=39/0;
            }
            catch(Exception e){
                System.out.println(e);
            }
            try{
                int a[]=new int[5];
                a[5]=4;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("Other Statement");
            }
        catch (Exception e){
            System.out.println("handled");
        }
        System.out.println("Normal Flow..");
        }
    }

