import java.util.Scanner;

public class BinaryCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isBinary = true;

        // Check each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != '0' && ch != '1') {
                isBinary = false;
                break;
            }
        }

        // Output result
        System.out.println("Is binary? " + isBinary);

        scanner.close();
    }
}
