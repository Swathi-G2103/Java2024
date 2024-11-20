package nov8polimorphism.methodoverriding;

public class ArrayofstudentsATB {
    public static void main(String[] args) {
        ATBstudents[] students = new ATBstudents[3];

        // Initializing the array with student objects
        students[0] = new ATBstudents("Alice", 1);
        students[1] = new ATBstudents("Bob", 2);
        students[2] = new ATBstudents("Charlie", 3);

        // Displaying the student details using the overridden toString() method

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
