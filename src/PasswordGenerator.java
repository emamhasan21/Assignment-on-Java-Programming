import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        int passwordLength = 8;

        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:,.<>?/";

        Random rand = new Random();

        StringBuilder password = new StringBuilder(passwordLength);

        password.append(capitalLetters.charAt(rand.nextInt(capitalLetters.length()))); // Capital letter
        password.append(smallLetters.charAt(rand.nextInt(smallLetters.length()))); // Small letter
        password.append(digits.charAt(rand.nextInt(digits.length()))); // Digit
        password.append(specialCharacters.charAt(rand.nextInt(specialCharacters.length()))); // Special character

        String allCharacters = capitalLetters + smallLetters + digits + specialCharacters;
        for (int i = password.length(); i < passwordLength; i++) {
            password.append(allCharacters.charAt(rand.nextInt(allCharacters.length())));
        }

        for (int i = 0; i < password.length(); i++) {
            int j = rand.nextInt(password.length());
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(j));
            password.setCharAt(j, temp);
        }

        System.out.println("Generated Password: " + password.toString());
    }
}
