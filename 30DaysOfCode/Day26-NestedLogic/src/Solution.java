import java.time.LocalDate;
import java.util.Scanner;

public class Solution {
    private static final int DAY_PENALTY = 15;
    public static final int MONTH_PENALTY = 500;

    private static LocalDate parseDate(Scanner sc) {
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        return LocalDate.of(year, month, day);
    }

    private static int getFine(LocalDate returnDate, LocalDate dueDate) {
        if (returnDate.isBefore(dueDate)) return 0;
        if (returnDate.getYear() == dueDate.getYear() && returnDate.getMonth() == dueDate.getMonth())
            return DAY_PENALTY * (returnDate.getDayOfMonth() - dueDate.getDayOfMonth());
        if (returnDate.getYear() == dueDate.getYear())
            return MONTH_PENALTY * (returnDate.getMonth().getValue() - dueDate.getMonth().getValue());
        return 10000;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Parse actual return date
            LocalDate returnDate = parseDate(sc);
            // Parse actual return date
            LocalDate dueDate = parseDate(sc);

            System.out.println(getFine(returnDate, dueDate));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
