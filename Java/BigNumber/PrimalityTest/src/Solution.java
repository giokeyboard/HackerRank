import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scan.nextLine();
        BigInteger bn = new BigInteger(n);
        System.out.println(bn.isProbablePrime(100) ? "prime" : "not prime");
        scan.close();
    }
}
