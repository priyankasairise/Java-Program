package string_programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringRevTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any String:");
        String name=sc.nextLine();

        String rev="";

        for(int i=name.length()-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println("name after reversing:"+rev);
    }

}
