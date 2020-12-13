import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    private static final Scanner in = new Scanner(System.in);
    private static Map<String, Integer> phoneBook = new HashMap<>();

    public static void main(String[] argh) {
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneBook.containsKey(s)) System.out.printf("%s=%d%n", s, phoneBook.get(s));
            else System.out.println("Not found");
        }
    }
}



