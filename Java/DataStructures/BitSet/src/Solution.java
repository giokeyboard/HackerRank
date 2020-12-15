import java.util.*;
import java.util.function.BiConsumer;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int i = scan.nextInt();
        BitSet[] bitSets = new BitSet[]{new BitSet(n), new BitSet(n)};
        Map<String, BiConsumer<Integer, Integer>> ops = new HashMap<>();
        ops.put("AND", (input1, input2) -> bitSets[input1 - 1].and(bitSets[input2 - 1]));
        ops.put("OR", (input1, input2) -> bitSets[input1 - 1].or(bitSets[input2 - 1]));
        ops.put("XOR", (input1, input2) -> bitSets[input1 - 1].xor(bitSets[input2 - 1]));
        ops.put("SET", (input1, input2) -> bitSets[input1 - 1].set(input2));
        ops.put("FLIP", (input1, input2) -> bitSets[input1 - 1].flip(input2));
        while (i > 0) {
            ops.get(scan.next()).accept(scan.nextInt(), scan.nextInt());
            System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
            i--;
        }
    }
}
