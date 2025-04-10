import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập kích thước mảng
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Khởi tạo mảng 2 chiều
        double[][] matrix = new double[rows][cols];

        // Bước 2: Nhập giá trị cho mảng
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter value at position [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Bước 3: Nhập cột cần tính tổng
        System.out.print("Enter column index to calculate sum (starting from 0): ");
        int colIndex = scanner.nextInt();

        // Kiểm tra chỉ số hợp lệ
        if (colIndex < 0 || colIndex >= cols) {
            System.out.println("Invalid column index.");
            return;
        }

        // Bước 4: Tính tổng cột
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][colIndex];
        }

        // Bước 5: Hiển thị kết quả
        System.out.printf("Sum of column %d is: %.2f\n", colIndex, sum);
    }
}
