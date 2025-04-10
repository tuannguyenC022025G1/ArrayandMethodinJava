import java.util.Scanner;

public class InsertElementIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[100];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to insert: ");
        int value = scanner.nextInt();


        System.out.print("Enter the position to insert (0 to " + size + "): ");
        int position = scanner.nextInt();


        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
        } else {
            for (int i = size; i > position; i--) {
                array[i] = array[i - 1];
            }

            array[position] = value;
            size++;

            System.out.println("Array after insertion:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
