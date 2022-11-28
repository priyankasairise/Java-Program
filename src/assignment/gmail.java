package assignment;

import java.util.Scanner;

public class gmail {
    public static void main(String[] args) {
        String s1="priyankasairise@gamil.com";
        String s2="priyankasairise@yahoo.com";

       String substring1=s1.substring(21,30);
       System.out.println(substring1);

       String substring2=s2.substring(21,30);
        System.out.println(substring2);

        if(substring1.equals((substring2))){
            System.out.println("Domain of strings are same ");
        }
        else{
            System.out.println("Domain of both strings are not same");
        }
    }

}
