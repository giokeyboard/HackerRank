import java.util.Scanner;

public class Solution {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Scan for array size
        int n = sc.nextInt();
        sc.nextLine();

        // Populate the array
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(findNegativeSubs(arr));
    }

    private static int findNegativeSubs(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if (sum < 0) count++;
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum < 0) count++;
            }
        }
        return count;
    }
}