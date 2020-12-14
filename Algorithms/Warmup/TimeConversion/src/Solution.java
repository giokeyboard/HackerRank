import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scan.nextLine();
        System.out.println(timeConversion(s));
        scan.close();
    }

    static String timeConversion(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.substring(8).equalsIgnoreCase("PM") && !s.startsWith("12")) {
            sb.append((Integer.parseInt(s.substring(0, 2))) + 12);
            sb.append(s, 2, 8);
        } else if (s.substring(8).equalsIgnoreCase("AM") && s.startsWith("12")) {
            sb.append(String.format("%02d", Integer.parseInt(s.substring(0, 2)) - 12));
            sb.append(s, 2, 8);
        } else sb.append(s, 0, 8);
        return sb.toString();
    }
}