import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        scan.close();
        staircase(n);
    }

    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - i - 1) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
