public class PatternPrinter {
    public static void main(String[] args) {
        // First part: decreasing pattern
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Second part: increasing pattern (starts from 2)
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
