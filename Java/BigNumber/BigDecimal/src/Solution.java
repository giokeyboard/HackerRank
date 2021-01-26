import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String[] s = new String[n + 2];
            for (int i = 0; i < n; i++) {
                s[i] = sc.next();
            }

            Arrays.sort(s, Collections.reverseOrder((o1, o2) -> {
                if (o1 == null || o2 == null) return 0;
                BigDecimal bd1 = new BigDecimal(o1);
                BigDecimal bd2 = new BigDecimal(o2);
                return bd1.compareTo(bd2);
            }));

            for (String num : s) {
                System.out.println(num);
            }
        }
    }
}
