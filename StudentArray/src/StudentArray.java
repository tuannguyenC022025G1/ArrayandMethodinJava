import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "David", "Eve"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a student name to search: ");
        String inputName = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(inputName)) {
                System.out.println("Student found at position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found in the list.");
        }

        scanner.close();
    }
}
