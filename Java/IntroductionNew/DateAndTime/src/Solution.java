import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        String day = sc.next();
        String year = sc.next();
        System.out.println(findDay(Integer.parseInt(month), Integer.parseInt(day), Integer.parseInt(year)));
        sc.close();
    }

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
}
