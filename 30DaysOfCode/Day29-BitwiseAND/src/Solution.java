import java.util.Scanner;

public class Solution {
    private static final Scanner sc = new Scanner(System.in);

    private static int findNum(int a, int b) {
        if ((b - 1 | b) <= a) return b - 1;
        return b - 2;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(findNum(n, k));
        }

        sc.close();
    }
}
