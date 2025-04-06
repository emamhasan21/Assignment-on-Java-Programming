public class QuestionPaper {
    public static void main(String[] args) {

        for (int x = 0; x <= 15; x++) {
            int y = 15 - x;
            if ((5 * x + 10 * y) == 100) {
                System.out.println("5 marks question is " + x);
                System.out.println("10 marks question is " + y);
                break;
            }
        }
    }
}
