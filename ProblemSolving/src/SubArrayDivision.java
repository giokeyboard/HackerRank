import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
        System.out.println(birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2));
        System.out.println(birthday(Arrays.asList(4), 4, 1));
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
