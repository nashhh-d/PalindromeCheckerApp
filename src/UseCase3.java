public class UseCase3 {
    public static void main(String[] args) {

        String word = "level";   // Hardcoded String

        System.out.println("===================================");
        System.out.println("Palindrome Checker - UC3");
        System.out.println("===================================");
        System.out.println("Original String : " + word);

        // Reverse the string using for loop
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);   // String concatenation
        }

        System.out.println("Reversed String : " + reversed);

        // Compare using equals()
        if (word.equals(reversed)) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

        System.out.println("===================================");
        System.out.println("Program executed successfully.");
    }


}
