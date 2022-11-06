package array_prpgrams;
import java.util.Scanner;
public class OddEvenTest {
    public static void main(String[] args){
        System.out.println("Enter any number:");
        int num = new Scanner(System.in).nextInt();
//        if(num%2==0)
//            System.out.println("Even number");
//        else {
//            System.out.println("Odd number");
//        }
        //System.out.println((num%2==0)?"Even":"Odd");
        System.out.println(((num&1)==0)?"even number":"odd number");

    }
    }

