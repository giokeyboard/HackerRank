import java.util.Scanner;

public class Solution {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(isPrime(sc.nextInt()));
        }
        sc.close();
    }

    private static String isPrime(int num) {
        if (num < 2 || (num > 2 && num % 2 == 0)) return "Not prime";
        int sqrt = (int) Math.round(Math.sqrt(num));
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) return "Not prime";
        }
        return "Prime";
    }
}
