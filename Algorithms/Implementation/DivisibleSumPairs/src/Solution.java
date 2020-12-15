import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        scan.close();

        System.out.println(divisibleSumPairs(n, k, ar));
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // O(n) solution
        int[] bucket = new int[k];
        int count = 0;
        for (int num : ar) {
            int mod = num % k;
            count += bucket[(k - mod) % k];
            bucket[mod]++;
        }
        return count;

        /*
        O(n^2) solution
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) count++;
            }
        }
        return count;
        */
    }
}
