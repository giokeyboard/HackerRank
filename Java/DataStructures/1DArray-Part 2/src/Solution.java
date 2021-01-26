import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int q = sc.nextInt();
            while (q-- > 0) {
                int n = sc.nextInt();
                int leap = sc.nextInt();
                int[] game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = sc.nextInt();
                }

                System.out.println((canWin(leap, game) ? "YES" : "NO"));
            }
        }
    }

    private static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        if (i >= game.length) return true;
        else if (i < 0 || game[i] != 0) return false;
        game[i] = 1;
        return isSolvable(leap, game, i + leap) || isSolvable(leap, game, i + 1) || isSolvable(leap, game, i - 1);
    }
}
