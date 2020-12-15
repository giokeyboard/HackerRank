import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();

        System.out.println(kangaroo(x1, v1, x2, v2));
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if ((x1 - x2) * (v1 - v2) < 0 && ((x1 - x2) % (v2 - v1) == 0)) return "YES";
        return "NO";
    }
}
