public class SortingScores {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i = 0; i < cgpas.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < cgpas.length; j++) {
                if (cgpas[j] > cgpas[maxIndex]) {
                    maxIndex = j;
                }
            }

            double temp = cgpas[i];
            cgpas[i] = cgpas[maxIndex];
            cgpas[maxIndex] = temp;
        }

        System.out.println("CGPAs in descending order:");
        for (double cgpa : cgpas) {
            System.out.println(cgpa);
        }
    }
}
