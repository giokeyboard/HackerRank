import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[] apples = new int[m];
        for (int i = 0; i < apples.length; i++) {
            apples[i] = scan.nextInt();
        }
        int[] oranges = new int[n];
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = scan.nextInt();
        }
        scan.close();

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesCount = 0;
        int orangesCount = 0;
        for (int apple : apples) {
            if (a + apple >= s && a + apple <= t) applesCount++;
        }
        for (int orange : oranges) {
            if (b + orange >= s && b + orange <= t) orangesCount++;
        }
        System.out.printf("%d%n%d", applesCount, orangesCount);
    }
}
