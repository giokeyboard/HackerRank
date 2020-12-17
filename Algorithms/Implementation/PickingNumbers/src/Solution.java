import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Result {
    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int max = 0;
        int i = 0;
        int j = 1;
        while (i < a.size() && j < a.size() && i < j) {
            if (Math.abs(a.get(i) - a.get(j)) <= 1) {
                max = Math.max(max, ++j - i);
            } else {
                if (++i == j) j++;
            }
        }
        return max;
    }
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }
        System.out.println(Result.pickingNumbers(a));
        scan.close();
    }
}
