import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            System.out.println(catAndMouse(x, y, z));
        }
        scan.close();
    }

    static String catAndMouse(int x, int y, int z) {
        if (Math.abs(x - z) < Math.abs(y - z)) return "Cat A";
        else if (Math.abs(x - z) > Math.abs(y - z)) return "Cat B";
        return "Mouse C";
    }
}
