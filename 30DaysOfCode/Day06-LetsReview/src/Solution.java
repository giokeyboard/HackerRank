import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(splitStr(scan.next()));
        }
        scan.close();
    }

    static String splitStr(String s) {
        StringBuilder sbEven = new StringBuilder();
        StringBuilder sbOdd = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) sbEven.append(s.charAt(i));
            else sbOdd.append(s.charAt(i));
        }
        return String.format("%s %s", sbEven.toString(), sbOdd.toString());
    }
}