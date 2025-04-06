import java.util.Random;

public class RandomArrayMinMax {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        // Generate 10 random integers between 1 and 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1; // 1 to 100
        }

        // Print all numbers
        System.out.println("Generated numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find max and min
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print max and min
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
