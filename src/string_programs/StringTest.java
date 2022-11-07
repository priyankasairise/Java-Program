package string_programs;

import javax.swing.*;

public class StringTest {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";

        String s3= new String("java");
        String s4= new String("java");

        if(s1==s2)
            System.out.println("Both Strings are Same");
        else
            System.out.println("Strings are not same");

        if(s3==s4)
            System.out.println("Both Strings are same");
        else
            System.out.println("Strings are not same");

        if(s3.equals(s4))
            System.out.println("Both Strings are same");
        else
            System.out.println("Strings are not same");

        if(s1==s3)
            System.out.println("Both Strings are same");
        else
            System.out.println("Strings are not same");

        if(s2==s4)
        System.out.println("Both Strings are same");
        else
            System.out.println("Strings are not same");

        if(s2.equals(s4))
            System.out.println("Both Strings are same");
        else
            System.out.println("Strings are not same");

        if(s2.equalsIgnoreCase(s4))
            System.out.println("Both Strings are same");
        else
            System.out.println("Strings are not same");


    }
}
