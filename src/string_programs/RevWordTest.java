package string_programs;

import java.util.Scanner;

public class RevWordTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String rev = "";
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }
            rev = rev + " ";
        }
        System.out.println("reverse word by word: " + rev);
    }
}