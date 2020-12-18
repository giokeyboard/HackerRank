import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] h = new int[26];
        for (int i = 0; i < h.length; i++) {
            h[i] = scan.nextInt();
        }
        scan.nextLine();
        String word = scan.nextLine();
        scan.close();

        System.out.println(designerPdfViewer(h, word));
    }

    static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            max = Math.max(max, h[word.charAt(i) - 'a']);
        }
        return max * word.length();
    }
}
