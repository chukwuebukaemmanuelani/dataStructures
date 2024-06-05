package dataStructures;

import java.util.Scanner;

// Find out if a string is a palindrome
// with a method to check if the string is palindrome
public class Palindrome {
    public static void main(String args[]) {
        String original, reverse = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        original = input.nextLine().toLowerCase();

        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("Entered string is a palindrome.");
            System.out.println(reverse);
        } else {
            System.out.println("Entered string is not a palindrome.");
            System.out.println(reverse);
        }
        /*
         * Algorithm to check if a word is a palindrome.
         * A palindrome is a word that reads the same backwords as forwards
         * 
         * Step 1 : Declare and Initialize a variables to store the string.
         * Step 1 : Import scanner and use the Scanner keyword to collect input
         * Step 2 : Create the method that reverses the string and checks if it a
         * palindrome
         * Step 3 : Print the result. That is whether it is a palindrome or not
         * Step 4
         * Step 5
         */
    }
}
