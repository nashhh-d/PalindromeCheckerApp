/*
 * Application Name : Palindrome Checker App
 * Use Case         : UC4 - Character Array Based Palindrome Check
 * Version          : 1.0
 */

public class UseCase4 {

    // Main Method - Entry Point
    public static void main(String[] args) {

        String word = "radar";   // Hardcoded string

        System.out.println("===================================");
        System.out.println("Palindrome Checker - UC4");
        System.out.println("===================================");
        System.out.println("Original String : " + word);

        // Convert String to Character Array
        char[] characters = word.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

        System.out.println("===================================");
        System.out.println("Program executed successfully.");
    }
}
