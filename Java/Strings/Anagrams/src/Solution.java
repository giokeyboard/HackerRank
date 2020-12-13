import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] frequencies = new int['z' - 'a' + 1];
        for (int i = 0; i < a.length(); i++) {
            char c = Character.toLowerCase(a.charAt(i));
            frequencies[c - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            char c = Character.toLowerCase(b.charAt(i));
            if (frequencies[c - 'a'] <= 0) return false;
            else frequencies[c - 'a']--;
        }

        return true;
    }

    static boolean isAnagramMaps(String a, String b) {
        if (a.length() != b.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char c = Character.toLowerCase(a.charAt(i));
            if (map.containsKey(c)) {
                int val = map.get(c);
                map.put(c, ++val);
            } else map.put(c, 1);
        }

        for (int i = 0; i < b.length(); i++) {
            char c = Character.toLowerCase(b.charAt(i));
            if (!map.containsKey(c) || map.get(c) <= 0) return false;
            else {
                int freq = map.get(c);
                map.put(c, --freq);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        System.out.println((isAnagramMaps(a, b)) ? "Anagrams" : "Not Anagrams");
    }
}
