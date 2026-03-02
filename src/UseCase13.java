
import java.util.*;

public class UseCase13 {

    public static boolean twoPointerCheck(String input) {
        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 2️⃣ Stack Approach
    public static boolean stackCheck(String input) {
        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        Stack<Character> stack = new Stack<>();

        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // 3️⃣ Deque Approach
    public static boolean dequeCheck(String input) {
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

    public static void main(String[] args) {

        String input = "Able was I ere I saw Elba";

        System.out.println("========================================");
        System.out.println("Palindrome Checker - UC13 Performance");
        System.out.println("========================================");
        System.out.println("Input String : " + input);
        System.out.println();

        // Two Pointer Timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // Stack Timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Deque Timing
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long end3 = System.nanoTime();

        System.out.println("Two Pointer Result : " + result1);
        System.out.println("Execution Time     : " + (end1 - start1) + " ns");
        System.out.println();

        System.out.println("Stack Result       : " + result2);
        System.out.println("Execution Time     : " + (end2 - start2) + " ns");
        System.out.println();

        System.out.println("Deque Result       : " + result3);
        System.out.println("Execution Time     : " + (end3 - start3) + " ns");

        System.out.println("========================================");
        System.out.println("Performance comparison completed.");
    }
}