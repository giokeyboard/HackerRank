import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int gradesCount = scan.nextInt();
        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < gradesCount; i++) {
            grades.add(scan.nextInt());
        }
        scan.close();
        System.out.println();

        Result.gradingStudents(grades).forEach(System.out::println);
    }
}

class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream()
                .map(grade -> {
                    if (grade >= 38 && 5 - grade % 5 < 3) grade += 5 - grade % 5;
                    return grade;
                })
                .collect(Collectors.toList());
    }
}
