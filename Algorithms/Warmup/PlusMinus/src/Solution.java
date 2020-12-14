import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        double pos = 0;
        double neg = 0;
        double z = 0;
        for (int num : arr) {
            if (num > 0) pos++;
            else if (num < 0) neg++;
            else z++;
        }
        System.out.printf("%.6f%n", pos / arr.length);
        System.out.printf("%.6f%n", neg / arr.length);
        System.out.printf("%.6f%n", z / arr.length);
    }
}
