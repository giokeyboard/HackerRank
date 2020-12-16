import java.util.Scanner;

class Result {
    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int valleys = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'D') altitude--;
            else if (path.charAt(i) == 'U') {
                if (altitude == -1) valleys++;
                altitude++;
            }
        }
        return valleys;
    }
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int steps = scan.nextInt();
        scan.nextLine();
        String path = scan.nextLine();
        scan.close();

        System.out.println(Result.countingValleys(steps, path));
    }
}
