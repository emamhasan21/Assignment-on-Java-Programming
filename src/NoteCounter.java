import java.util.Scanner;

public class NoteCounter {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        System.out.println("Breakdown of notes:");

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int count = amount / notes[i];
                amount = amount % notes[i];
                System.out.println(notes[i] + " x " + count);
            }
        }

        scanner.close();
    }
}
