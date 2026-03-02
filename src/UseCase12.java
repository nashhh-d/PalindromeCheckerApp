
import java.util.*;

interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        // Compare while popping
        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


// 3️⃣ Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : normalized.toCharArray()) {
            deque.add(ch);
        }

        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }

        return true;
    }
}


// 4️⃣ Context Class
class PalindromeChecker {

    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.checkPalindrome(input);
    }
}

public class UseCase12{

    public static void main(String[] args) {

        String input = "Able was I ere I saw Elba";

        System.out.println("=======================================");
        System.out.println("Palindrome Checker - UC12 (Strategy)");
        System.out.println("=======================================");
        System.out.println("Input String : " + input);

        PalindromeStrategy strategy;

        strategy = new StackStrategy();


        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.execute(input);

        if (result) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program executed successfully.");
    }
}