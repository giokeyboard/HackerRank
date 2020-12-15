import java.util.*;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        List<Student> students = new ArrayList<>();
        while (n > 0) {
            Student st = new Student(scan.nextInt(), scan.next(), scan.nextDouble());
            students.add(st);
            n--;
        }

        Collections.sort(students, Comparator.comparingDouble(Student::getCgpa).reversed()
                .thenComparing(Student::getFname).thenComparingInt(Student::getId));

        students.forEach(student -> System.out.println(student.getFname()));
    }
}

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}
