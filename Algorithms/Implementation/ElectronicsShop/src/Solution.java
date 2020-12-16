import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int b = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] keyboards = new int[n];
        for (int i = 0; i < keyboards.length; i++) {
            keyboards[i] = scan.nextInt();
        }
        int[] drives = new int[m];
        for (int i = 0; i < drives.length; i++) {
            drives[i] = scan.nextInt();
        }
        scan.close();

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive,
         * or -1 if she can't purchase both items
         */
        System.out.println(getMoneySpent(keyboards, drives, b));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int k = keyboards.length - 1;
        int d = 0;
        while (k >= 0 && d < drives.length) {
            int sum = keyboards[k] + drives[d];
            if (sum <= b) {
                max = Math.max(max, sum);
                d++;
            } else k--;
        }

        return max;
    }
}
