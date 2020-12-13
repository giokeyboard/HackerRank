import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println((isPalindromeRecursive(A) ? "Yes" : "No"));
        System.out.println((isPalindrome(A) ? "Yes" : "No"));
    }

    private static boolean isPalindromeRecursive(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) == s.charAt(s.length() - 1)) return isPalindromeRecursive(s.substring(1, s.length() - 1));
        return false;
    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i++ <= j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
