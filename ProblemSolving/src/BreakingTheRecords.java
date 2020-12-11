import java.util.Arrays;

public class BreakingTheRecords {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1})));
        System.out.println(Arrays.toString(breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42})));
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
            }
            else if (scores[i] < baseLow) {
                countLow++;
                baseLow = scores[i];
            }
        }
        return new int[]{countMax, countLow};
    }
}
