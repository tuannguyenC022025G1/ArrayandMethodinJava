import java.util.Scanner;

public class PassedStudentsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_STUDENTS = 30;
        float[] scores = new float[MAX_STUDENTS];

        System.out.print("Enter the number of students (max 30): ");
        int numberOfStudents = scanner.nextInt();

        // Kiem tra so sv <= 30
        if (numberOfStudents > MAX_STUDENTS || numberOfStudents <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }

        // Nhap diem cho sv
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextFloat();
        }


        int passedCount = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            if (scores[i] >= 5.0) {
                passedCount++;
            }
        }


        System.out.println("Number of students who passed: " + passedCount);
    }
}
