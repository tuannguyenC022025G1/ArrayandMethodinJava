import java.util.Scanner;

public class MaxElementFromUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng và số cột
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        // Nhập giá trị từng phần tử
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Tìm max
        double max = matrix[0][0];
        int row = 0, col = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Max value: " + max + " at position [" + row + "][" + col + "]");
    }
}
