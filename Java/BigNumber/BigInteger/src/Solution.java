import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger big1 = sc.nextBigInteger();
        BigInteger big2 = sc.nextBigInteger();
        sc.close();

        System.out.println(big1.add(big2));
        System.out.println(big1.multiply(big2));
    }
}