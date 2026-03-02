
public class UseCase10{

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        System.out.println("===================================");
        System.out.println("Palindrome Checker - UC10");
        System.out.println("===================================");
        System.out.println("Original String : " + input);
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        System.out.println("Normalized String : " + normalized);

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Print Result
        if (isPalindrome) {
            System.out.println("Result : The given string is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

        System.out.println("===================================");
        System.out.println("Program executed successfully.");
    }
}