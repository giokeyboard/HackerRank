import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Add {

    public void add(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            if (i != args.length - 1) System.out.printf("%d+", args[i]);
            else System.out.printf("%d", args[i]);
            sum += args[i];
        }
        System.out.printf("=%d%n", sum);
    }
}

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int n4 = sc.nextInt();
            int n5 = sc.nextInt();
            int n6 = sc.nextInt();
            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);
            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
