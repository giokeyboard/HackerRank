import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(simpleArraySum(ar));
    }

    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }
}
