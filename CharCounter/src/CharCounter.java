import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String str = "tuan dep trai hihi";


        System.out.print("Enter the character to count: ");
        char character = scanner.next().charAt(0);


        int count = 0;


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }

        System.out.printf("Character '%c' appears %d times in the string.\n", character, count);
    }
}
