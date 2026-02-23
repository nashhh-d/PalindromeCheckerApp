public class UseCase2 {
    public static void main(String[] args) {

        // Hardcoded String (String Literal)
        String word = "madam";

        System.out.println("===================================");
        System.out.println("Palindrome Checker - UC2");
        System.out.println("===================================");
        System.out.println("Given String : " + word);

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

        System.out.println("===================================");
        System.out.println("Program executed successfully.");
    }

}
