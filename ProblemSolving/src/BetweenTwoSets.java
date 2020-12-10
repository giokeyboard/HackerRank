import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        System.out.println(getTotalX(Arrays.asList(3, 4), Arrays.asList(24, 48)));
        System.out.println(getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96)));
        System.out.println(getTotalX(Arrays.asList(2), Arrays.asList(20, 30, 12)));
        System.out.println(getTotalX(Arrays.asList(3, 9, 6), Arrays.asList(36, 72)));
    }

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
