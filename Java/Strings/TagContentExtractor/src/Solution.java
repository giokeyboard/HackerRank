import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int testCases = sc.nextInt();
            sc.nextLine();
            while (testCases-- > 0) {
                String line = sc.nextLine();
                boolean found = false;
                Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
                Matcher m = r.matcher(line);
                while (m.find()) {
                    System.out.println(m.group(2));
                    found = true;
                }
                if (!found) System.out.println("None");
            }
        }
    }
}
