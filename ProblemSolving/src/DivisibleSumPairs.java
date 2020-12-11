public class DivisibleSumPairs {
    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2}));
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // O(n^2) solution
//        int count = 0;
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = i + 1; j < ar.length; j++) {
//                if ((ar[i] + ar[j]) % k == 0) count++;
//            }
//        }
//        return count;

        int[] bucket = new int[k];
        int count = 0;
        for (int num : ar) {
            int mod = num % k;
            count += bucket[(k - mod) % k];
            bucket[mod]++;
        }
        return count;
    }
}
