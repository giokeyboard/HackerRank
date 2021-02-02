import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
    private static final Scanner sc = new Scanner(System.in);
    private static final Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(sc.nextLine());
        List<String> events = new ArrayList<>();
        while (totalEvents-- > 0) {
            String event = sc.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) System.out.println("EMPTY");
        else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    @Override
    public int compareTo(Student s) {
        if (cgpa == s.getCGPA()) {
            if (name.equals(s.getName())) {
                return id - s.getID();
            } else return name.compareTo(s.getName());
        }
        return (cgpa > s.getCGPA()) ? -1 : 1;
    }
}

class Priorities {
    private final PriorityQueue<Student> pq = new PriorityQueue<>();

    /**
     * Process all the given events and return all the students yet to be served in the priority order
     */
    public List<Student> getStudents(List<String> events) {
        for (String event : events) {
            String[] arr = event.split(" ");
            if (arr[0].equalsIgnoreCase("ENTER")) {
                pq.add(new Student(Integer.parseInt(arr[3]), arr[1], Double.parseDouble(arr[2])));
            } else if (!pq.isEmpty() && arr[0].equalsIgnoreCase("SERVED")) {
                pq.remove();
            }
        }

        List<Student> output = new ArrayList<>();
        while (pq.size() > 0) output.add(pq.remove());
        return output;
    }
}
