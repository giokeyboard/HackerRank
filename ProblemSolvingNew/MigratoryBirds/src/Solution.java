import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] birdsArr = new Integer[n];
        for (int i = 0; i < birdsArr.length; i++) {
            birdsArr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(migratoryBirds(Arrays.asList(birdsArr)));
        System.out.println(migratoryBirdsAlt(Arrays.asList(birdsArr)));
    }


    /**
     * Solution using Map
     */
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer n : arr) {
            if (map.containsKey(n)) {
                int val = map.get(n);
                map.put(n, ++val);
            } else map.put(n, 1);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }


    /**
     * Solution using plain array
     */
    static int migratoryBirdsAlt(List<Integer> arr) {
        final int TYPES = 5;
        int[] count = new int[TYPES];
        for (Integer bird : arr) {
            count[bird - 1]++;
        }

        int max = 1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[max]) max = i;
            else if (count[i] == count[max]) max = (max < i) ? max : i;
        }
        return ++max;
    }
}
