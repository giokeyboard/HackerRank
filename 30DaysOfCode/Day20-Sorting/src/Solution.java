import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    private static int bubbleSort(int[] arr) {
        int numSwaps = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    numSwaps++;
                }
            }
            if (numSwaps == 0) break;
        }
        return numSwaps;
    }

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.printf("Array is sorted in %d swaps.%nFirst Element: %d%nLast Element: %d",
                bubbleSort(arr), arr[0], arr[arr.length - 1]);

        scan.close();
    }
}
