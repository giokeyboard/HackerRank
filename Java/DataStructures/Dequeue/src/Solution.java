import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    private static final ArrayDeque<Integer> deque = new ArrayDeque<>();
    private static final Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                deque.add(num);
                set.add(num);

                if (deque.size() == m) {
                    max = Math.max(max, set.size());
                    int first = deque.remove();
                    if (!deque.contains(first)) set.remove(first);
                }
            }
        }
        System.out.println(max);
    }
}
