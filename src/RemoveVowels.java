import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        System.out.println("String after removing vowels: " + result.toString());

        scanner.close();
    }
}
