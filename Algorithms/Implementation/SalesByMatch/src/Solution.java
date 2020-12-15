import java.util.*;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        System.out.println(sockMerchant(n, ar));
        scan.close();
    }

    private static int sockMerchant(int n, int[] ar) {
        int count = 0;
        Set<Integer> pairs = new HashSet<>();
        for (int colour : ar) {
            if (!pairs.contains(colour)) {
                pairs.add(colour);
            } else {
                count++;
                pairs.remove(colour);
            }
        }
        return count;
    }
}
