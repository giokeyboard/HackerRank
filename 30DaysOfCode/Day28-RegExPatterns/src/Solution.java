import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String regEx = ".+@gmail\\.[a-z]+";
        List<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String firstName = sc.next();
            String eMail = sc.next();
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(eMail);
            if (m.find()) names.add(firstName);
        }
        Collections.sort(names);
        names.forEach(System.out::println);

        sc.close();
    }
}
