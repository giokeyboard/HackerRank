import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        if (n % 2 == 0 && ((n >= 2 && n <= 5) || n > 20)) System.out.println("Not Weird");
        else System.out.println("Weird");
        scan.close();
    }
}
