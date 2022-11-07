package string_programs;
import java.util.Scanner;
public class TrimTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:\n");
        String username= sc.nextLine();

        System.out.println("Enter Password:");
        String password=sc.nextLine();

        System.out.println("Length of Username:"+username.length());
        System.out.println("Length b of Password:"+password.length());

        if(username.trim().equalsIgnoreCase("Priya")&&password.trim().equals("abc123")) {
            System.out.println("Welcome");
        }
        else
            {
                System.out.println("Invalid User!!!Try Again");
            }
            System.out.println("Length of Username:" + username.trim().length());
            System.out.println("Length of Password:" + password.trim().length());

    }
    }



