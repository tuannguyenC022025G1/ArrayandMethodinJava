import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập kích thước ma trận vuông
        System.out.print("Enter size of square matrix: ");
        int size = scanner.nextInt();

        double[][] matrix = new double[size][size];

        // Bước 2: Nhập các phần tử cho ma trận
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Enter value at [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Bước 3: Tính tổng đường chéo chính
        double diagonalSum = 0;
        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
        }

        // Bước 4: Hiển thị kết quả
        System.out.printf("Sum of main diagonal elements is: %.2f\n", diagonalSum);
    }
}
