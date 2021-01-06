import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scan.next();
        scan.close();
        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
