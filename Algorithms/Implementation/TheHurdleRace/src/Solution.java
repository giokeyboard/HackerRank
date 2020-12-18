import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < height.length; i++) {
            height[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(hurdleRace(k, height));
    }

    static int hurdleRace(int k, int[] height) {
        return Arrays
                .stream(height)
                .filter(h -> h > k)
                .map(h -> h - k)
                .max()
                .orElse(0);
    }
}
