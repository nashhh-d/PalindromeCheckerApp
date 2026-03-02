
class PalindromeChecker {

    // Public method exposed to outside world
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize input (ignore case and spaces)
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int length = normalized.length();

        // Internal Data Structure: Array used as Stack
        char[] stack = new char[length];
        int top = -1;

        // Push characters into stack
        for (int i = 0; i < length; i++) {
            stack[++top] = normalized.charAt(i);
        }

        // Pop and compare
        for (int i = 0; i < length; i++) {
            if (normalized.charAt(i) != stack[top--]) {
                return false;
            }
        }

        return true;
    }
}


// Main Application Class
public class UseCase11 {

    public static void main(String[] args) {

        String input = "Madam In Eden Im Adam";

        System.out.println("===================================");
        System.out.println("Palindrome Checker - UC11 (OOPS)");
        System.out.println("===================================");
        System.out.println("Input String : " + input);

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        // Call encapsulated method
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

        System.out.println("===================================");
        System.out.println("Program executed successfully.");
    }
}