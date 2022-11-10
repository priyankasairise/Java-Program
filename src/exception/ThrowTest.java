package exception;

import java.util.Scanner;

public class ThrowTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username:");
        String username=sc.nextLine();

        System.out.println("Enter Password:");
        String password=sc.nextLine();

        if(username.trim().equalsIgnoreCase("java") && password.trim().equals("abc123"))
        {
            System.out.println("Welcome");
        }
        else{
            try{
                throw new InvalidCredentialsException();
            }
            catch (InvalidCredentialsException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
