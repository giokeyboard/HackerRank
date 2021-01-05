import java.util.Arrays;

class Student extends Person {
    private int[] testScores;

    /**
     * Class Constructor
     *
     * @param firstName - A string denoting the Person's first name.
     * @param lastName  - A string denoting the Person's last name.
     * @param id        - An integer denoting the Person's ID number.
     * @param scores    - An array of integers denoting the Person's test scores.
     */
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        testScores = scores;
    }

    /**
     * Method Name: calculate
     *
     * @return A character denoting the grade.
     */
    public String calculate() {
        double avg = Arrays.stream(testScores).average().orElse(0.0);
        if (avg < 40.0) return "T";
        else if (avg < 55) return "D";
        else if (avg < 70) return "P";
        else if (avg < 80) return "A";
        else if (avg < 90) return "E";
        return "O";
    }
}