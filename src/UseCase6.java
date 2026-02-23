/*
 * Application Name : Palindrome Checker App
 * Use Case         : UC6 - Queue + Stack Based Palindrome Check
 * Version          : 1.0
 */

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase6 {

    // Main Method - Entry Point
    public static void main(String[] args) {

        String word = "racecar";   // Hardcoded string

        System.out.println("===================================");
        System.out.println("Palindrome Checker - UC6");
        System.out.println("===================================");
        System.out.println("Original String : " + word);

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Enqueue and Push characters
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));      // LIFO
            queue.add(word.charAt(i));      // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) and pop (stack)
        for (int i = 0; i < word.length(); i++) {

            char fromQueue = queue.remove();   // FIFO removal
            char fromStack = stack.pop();      // LIFO removal

            if (fromQueue != fromStack) {
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
