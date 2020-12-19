import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getCanonicalName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}