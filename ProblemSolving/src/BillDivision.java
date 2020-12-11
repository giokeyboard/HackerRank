import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BillDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int notEat = sc.nextInt();
        Integer[] items = new Integer[n];
        for (int i = 0; i < items.length; i++) {
            items[i] = sc.nextInt();
        }
        int charge = sc.nextInt();
        sc.close();

        bonAppetit(Arrays.asList(items), notEat, charge);
    }

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) sum += bill.get(i);
        }
        System.out.println((sum / 2 == b) ? "Bon Appetit" : b - sum / 2);
    }
}
