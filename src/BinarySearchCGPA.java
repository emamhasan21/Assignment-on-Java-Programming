import java.util.Scanner;

public class BinarySearchCGPA {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i = 0; i < cgpas.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < cgpas.length; j++) {
                if (cgpas[j] < cgpas[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            double temp = cgpas[i];
            cgpas[i] = cgpas[minIndex];
            cgpas[minIndex] = temp;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the CGPA to search: ");
        double target = scanner.nextDouble();

        int low = 0;
        int high = cgpas.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (cgpas[mid] == target) {
                found = true;
                System.out.println("CGPA " + target + " found at index " + mid + " (Sorted Array Index)");
                break;
            } else if (cgpas[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("CGPA " + target + " not found in the list.");
        }

        scanner.close();
    }
}