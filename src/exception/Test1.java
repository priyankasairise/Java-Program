package exception;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();

            System.out.println("Enter second number:");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Division of two numbers are:" + result);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException ne){
            System.out.println("infinity");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("From Finally block");
        }
        System.out.println("imp code 1000 lines");
    }
}

