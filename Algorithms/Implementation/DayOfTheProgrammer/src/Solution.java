import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = sc.nextInt();
        System.out.printf("The day of the programmer for year %d is: %s", year, dayOfProgrammer(year));
        sc.close();
    }

    static String dayOfProgrammer(int year) {
        if (year == 1918) return "26.09.1918";
        if (isLeap(year)) return "12.09." + year;
        return "13.09." + year;
    }

    static boolean isLeap(int year) {
        if (year % 4 != 0) return false;
        if (year > 1918 && year % 100 == 0 && year % 400 != 0) return false;
        return true;
    }
}
