import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(scan.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            b.add(scan.nextInt());
        }

        scan.close();
        compareTriplets(a, b).forEach(n -> System.out.print(n + " "));
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) aliceScore++;
            else if (a.get(i) < b.get(i)) bobScore++;
        }
        return Arrays.asList(aliceScore, bobScore);
    }
}
