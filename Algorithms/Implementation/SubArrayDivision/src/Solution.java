import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        scan.nextLine();
        List<Integer> s = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int d = scan.nextInt();
        int m = scan.nextInt();
        scan.close();

        System.out.println(birthday(s, d, m));
    }

    static int birthday(List<Integer> s, int d, int m) {
        if (s.size() < m) return 0;
        int count = 0;

        int i = 0;
        while (i + m <= s.size()) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            if (sum == d) count++;
            i++;
        }

        return count;
    }
}
