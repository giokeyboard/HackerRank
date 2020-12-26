import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            phoneBook.put(scan.next(), scan.nextInt());
        }
        while (scan.hasNext()) {
            String name = scan.next();
            if (phoneBook.containsKey(name)) System.out.printf("%s=%d%n", name, phoneBook.get(name));
            else System.out.println("Not found");
        }

        scan.close();
    }
}
