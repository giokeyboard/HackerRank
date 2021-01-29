import java.util.Scanner;
import java.util.Stack;

public class Solution {
    private static final Stack<Character> stack = new Stack<>();
    private static final char[][] TOKENS = new char[][]{{'(', ')'}, {'[', ']'}, {'{', '}'}};

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                stack.clear();
                System.out.println(isBalanced(sc.next()));
            }
        }
    }

    private static boolean isBalanced(String s) {
        for (char c : s.toCharArray()) {
            if (isOpenTerm(c)) stack.push(c);
            else {
                if (stack.isEmpty() || !isMatching(stack.pop(), c)) return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(char openToken, char closeToken) {
        for (char[] arr : TOKENS) {
            if (openToken == arr[0]) return closeToken == arr[1];
        }
        return false;
    }

    private static boolean isOpenTerm(char c) {
        for (char[] arr : TOKENS) {
            if (c == arr[0]) return true;
        }
        return false;
    }
}
