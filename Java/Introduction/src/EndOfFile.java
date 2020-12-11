import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line = 1;
        while (sc.hasNext()) {
            System.out.printf("%d %s%n", line++, sc.nextLine());
        }

        sc.close();
    }
}
