import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Trim and split to count words
        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;

        // Remove spaces to count characters without space
        String noSpace = input.replace(" ", "");
        int charCount = noSpace.length();

        // Count vowels and consonants
        int vowels = 0, consonants = 0;
        for (int i = 0; i < noSpace.length(); i++) {
            char ch = Character.toLowerCase(noSpace.charAt(i));
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Output
        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowel: " + vowels);
        System.out.println("Consonant: " + consonants);

        scanner.close();
    }
}