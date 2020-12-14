import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    private static List<List<Integer>> table;

    public static void main(String[] args) {
        int n = scan.nextInt();
        table = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            table.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                table.get(i).add(scan.nextInt());
            }
        }
        scan.close();

//        printTable(table);
        System.out.println("Diagonal difference = " + Result.diagonalDifference(table));
    }

    private static void printTable(List<List<Integer>> t) {
        for (List<Integer> row : t) {
            for (Integer num : row) {
                System.out.printf("%-4d ", num);
            }
            System.out.printf("%n");
        }
    }
}

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) d1 += arr.get(i).get(j);
                if (j == arr.size() - 1 - i) d2 += arr.get(i).get(j);
            }
        }

        return Math.abs(d2 - d1);
    }
}
