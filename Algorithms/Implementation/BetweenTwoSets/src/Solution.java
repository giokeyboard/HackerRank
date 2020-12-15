import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Result {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int lcm = LCM(a);
        int gcd = GCD(b);
        int count = 0;
        int i = 1;
        while (lcm * i <= gcd) {
            if (gcd % (lcm * i) == 0) count++;
            i++;
        }
        return count;
    }

    static int LCM(List<Integer> nums) {
        if (nums.size() < 1) return 0;
        int n = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            n = LCM(n, nums.get(i));
        }
        return n;
    }

    static int LCM(int a, int b) {
        return Math.abs(a * b) / GCD(a, b);
    }

    static int GCD(List<Integer> nums) {
        if (nums.size() < 1) return 0;
        int n = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            n = GCD(n, nums.get(i));
            if (n == 1) return 1;
        }
        return n;
    }

    static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine();

        List<Integer> arr = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> brr = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        scan.close();

        System.out.println(Result.getTotalX(arr, brr));
    }
}
