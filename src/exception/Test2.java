package exception;

public class Test2 {
    public static void main(String[] args) throws InterruptedException{
        for(int i=0;i<=10;i++)
        {
            Thread.sleep(500);
            System.out.println(i);
        }
    }
}
