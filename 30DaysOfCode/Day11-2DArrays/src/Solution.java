import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] rowItems = scan.nextLine().split(" ");
            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(rowItems[j]);
            }
        }
        scan.close();

        int max = Integer.MIN_VALUE;
        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; j < arr[0].length; j++) {
                max = Math.max(getHourglassSum(i, j, arr), max);
            }
        }

        System.out.println(max);
    }

    private static int getHourglassSum(int i, int j, int[][] arr) {
        return arr[i - 2][j - 2] + arr[i - 2][j - 1] + arr[i - 2][j] + arr[i - 1][j - 1] + arr[i][j - 2] +
                arr[i][j - 1] + arr[i][j];
    }
}
