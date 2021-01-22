import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String address = sc.next();
                System.out.println(address.matches(new MyRegex().pattern));
            }
        }
    }
}

class MyRegex {
    static final String step = "(\\d\\d?|(0|1)\\d?\\d?|2[0-4][0-9]|25[0-5])";
    static final String pattern = "^" + step + "\\." + step + "\\." + step + "\\." + step + "$";
}
