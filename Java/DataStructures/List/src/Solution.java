import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static final Scanner sc = new Scanner(System.in);
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String op = sc.next();
            if (op.equalsIgnoreCase("insert")) {
                list.add(sc.nextInt(), sc.nextInt());
            } else if (op.equalsIgnoreCase("delete")) {
                list.remove(sc.nextInt());
            } else {
                System.out.println("Error: invalid operation!");
                System.exit(1);
            }
        }

        sc.close();

        for (Integer num : list) {
            System.out.printf("%d ", num);
        }
    }
}