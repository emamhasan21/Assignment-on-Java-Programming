import java.util.Scanner;

public class HeightsofBabies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[10];

        // Input 10 baby heights
        System.out.println("Enter the heights of 10 babies in cm:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Height " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Step 1: Find the lowest height
        double min1 = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min1) {
                min1 = heights[i];
            }
        }

        // Step 2: Find the second lowest (but higher than min1)
        double min2 = Double.MAX_VALUE;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > min1 && heights[i] < min2) {
                min2 = heights[i];
            }
        }

        // Step 3: Output results
        System.out.println("\nThe two lowest heights are:");
        System.out.println("1st Lowest: " + min1 + " cm");

        if (min2 != Double.MAX_VALUE) {
            System.out.println("2nd Lowest: " + min2 + " cm");
        } else {
            System.out.println("No distinct 2nd lowest height found (all values might be the same).");
        }

        scanner.close();
    }
}
