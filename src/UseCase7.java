/*
 * Application Name : Palindrome Checker App
 * Use Case         : UC7 - Deque Based Optimized Palindrome Checker
 * Version          : 1.0
 */

import java.util.Deque;
import java.util.LinkedList;

public class UseCase7 {

    // Main Method - Entry Point
    public static void main(String[] args) {

        String word = "noon";   // Hardcoded string

        System.out.println("===================================");
        System.out.println("Palindrome Checker - UC7");
        System.out.println("===================================");
        System.out.println("Original String : " + word);

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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
