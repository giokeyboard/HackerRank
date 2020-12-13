import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();

        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int items = sc.nextInt();
            lists.add(new ArrayList<>());
            for (int j = 0; j < items; j++) {
                lists.get(i).add(sc.nextInt());
            }
            sc.nextLine();
        }

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (x < 0 || x >= lists.size() || y < 0 || y >= lists.get(x).size()) System.out.println("ERROR!");
            else System.out.println(lists.get(x).get(y));
            sc.nextLine();
        }

        sc.close();
    }
}