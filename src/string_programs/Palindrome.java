package string_programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String name = sc.nextLine();

        String rev = "";
        for (int i = name.length() - 1; i>=0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Name after reversing:" + rev);

        if (rev.equalsIgnoreCase(name)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not Palindrome String");
        }
    }
}
