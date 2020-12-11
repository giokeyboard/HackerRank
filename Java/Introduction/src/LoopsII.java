import java.util.Scanner;

public class LoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.printf("%d ", a + sum);
            }
            System.out.println();
        }
        in.close();
    }
}
