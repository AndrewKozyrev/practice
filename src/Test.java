public class Test {
    public static void main(String[] args) {
        int[] scores = {100, 95, 90, 89, 80, 79, 70, 69, 60, 59, 0, -5, 105};
        printScores(scores);
    }

    public static void printScores(int[] scores) {
        int[] stats = new int[5];
        int min = 0;
        int max = 0;
        int invalidCase = 0;
        int validCount = 0;
        double average = 0.0;
        boolean hasValid = false;
        for (int score : scores) {
            if (score < 0 || score > 100) {
                invalidCase++;
                continue;
            }

            validCount++;
            average += score;
            if (!hasValid) {
                min = score;
                max = score;
                hasValid = true;
            } else {
                if (min > score) min = score;
                if (max < score) max = score;
            }
            switch (score / 10) {
                case 9, 10 -> stats[0]++;
                case 8 -> stats[1]++;
                case 7 -> stats[2]++;
                case 6 -> stats[3]++;
                default -> stats[4]++;
            }
        }

        if (!hasValid) {
            System.out.println("no valid scores to calculate min/max/average");
            return;
        }
        System.out.println("invalid scores: " + invalidCase);
        System.out.println("max score: " + max);
        System.out.println("min score: " + min);
        System.out.printf("average score: %.2f", average / validCount);
        System.out.println("A: " + stats[0]);
        System.out.println("B: " + stats[1]);
        System.out.println("C: " + stats[2]);
        System.out.println("D: " + stats[3]);
        System.out.println("F: " + stats[4]);
    }
}
