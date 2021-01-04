import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        System.out.println(countConsecutiveOnes(n));
        scan.close();
    }

    private static int countConsecutiveOnes(int n) {
        String nBin = Integer.toBinaryString(n);
        int max = 0;
        int count = 0;
        for (int i = 0; i < nBin.length(); i++) {
            if (nBin.charAt(i) == '1') max = Math.max(++count, max);
            else count = 0;
        }
        return max;
    }
}
