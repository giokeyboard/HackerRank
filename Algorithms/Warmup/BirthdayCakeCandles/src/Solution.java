import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        int candlesCount = scan.nextInt();
        for (int i = 0; i < candlesCount; i++) {
            candles.add(scan.nextInt());
        }
        System.out.println(Result.birthdayCakeCandles(candles));
        scan.close();
    }
}

class Result {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
                count = 1;
            } else if (candles.get(i) == max) count++;
        }
        return count;
    }
}
