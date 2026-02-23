/*
 * Application Name : Palindrome Checker App
 * Use Case         : UC5 - Stack Based Palindrome Check
 * Version          : 1.0
 */

import java.util.Stack;

public class UseCase5{

    // Main Method - Entry Point
    public static void main(String[] args) {

        String word = "madam";   // Hardcoded string

        System.out.println("===================================");
        System.out.println("Palindrome Checker - UC5");
        System.out.println("===================================");
        System.out.println("Original String : " + word);

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print Result
        if (isPalindrome) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

        System.out.println("===================================");
        System.out.println("Program executed successfully.");
    }
}
