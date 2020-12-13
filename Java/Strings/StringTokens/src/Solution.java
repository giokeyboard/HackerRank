import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();

        if (s.length() > 0 && s.length() < 400000) {
            String[] tokens = s.split("[ @_'.,?!]+");
            System.out.println(tokens.length);
            for (String string : tokens) {
                System.out.println(string);
            }
        } else System.out.println(0);

        scan.close();
    }
}
