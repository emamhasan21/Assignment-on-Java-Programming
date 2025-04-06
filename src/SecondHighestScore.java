public class SecondHighestScore {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double max = cgpas[0];

        for (int i = 1; i < cgpas.length; i++) {
            if (cgpas[i] > max) {
                max = cgpas[i];
            }
        }

        double secondMax = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < cgpas.length; i++) {
            if (cgpas[i] != max && cgpas[i] > secondMax) {
                secondMax = cgpas[i];
            }
        }

        for (int i = 0; i < cgpas.length; i++) {
            if (cgpas[i] == secondMax) {
                System.out.println("Student " + (i + 1) + " achieved the 2nd highest CGPA: " + secondMax);
            }
        }
    }
}
