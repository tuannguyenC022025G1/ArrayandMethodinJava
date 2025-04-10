import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element you want to delete: ");
        int elementToDelete = scanner.nextInt();

        int indexToDelete = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == elementToDelete) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete == -1) {
            System.out.println("Element not found in the array.");
        } else {
            for (int i = indexToDelete; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            size--;

            System.out.println("Array after deleting the element:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
