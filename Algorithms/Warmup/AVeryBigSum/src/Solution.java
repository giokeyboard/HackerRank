import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        int n = scan.nextInt();
        long[] ar = new long[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextLong();
        }
        scan.close();
        System.out.println(aVeryBigSum(ar));
    }
}
