import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }
        scan.close();
        Arrays.stream(breakingRecords(scores)).forEach(x -> System.out.print(x + " "));
    }

    static int[] breakingRecords(int[] scores) {
        if (scores.length < 2) return new int[]{0, 0};

        int baseMax = scores[0];
        int baseLow = scores[0];
        int countMax = 0;
        int countLow = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > baseMax) {
                countMax++;
                baseMax = scores[i];
            } else if (scores[i] < baseLow) {
                countLow++;
                baseLow = scores[i];
            }
        }
        return new int[]{countMax, countLow};
    }
}
