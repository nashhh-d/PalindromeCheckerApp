

public class UseCase9{

    public static boolean isPalindrome(String word, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";   // Hardcoded string

        System.out.println("===================================");
        System.out.println("Palindrome Checker - UC9");
        System.out.println("===================================");
        System.out.println("Original String : " + word);

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

        System.out.println("===================================");
        System.out.println("Program executed successfully.");
    }
}