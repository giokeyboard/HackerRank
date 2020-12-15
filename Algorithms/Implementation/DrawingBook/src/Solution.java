import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int p = scan.nextInt();
        scan.close();

        System.out.println(pageCount(n, p));
    }

    static int pageCount(int n, int p) {
        return Math.min(p / 2, n / 2 - p / 2);
    }
}
