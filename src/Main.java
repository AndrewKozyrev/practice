void main() {

    int[] scores = {100, 95, 90, 89, 80, 79, 70, 69, 60, 59, 0, -5, 105};
    printReport(scores);
}

public static void printReport(int[] scores) {

    int[] stats = new int[5];
    int invalidCase = 0;
    int min = scores[0];
    int max = scores[0];
    double average = 0.0;
    for (int score : scores) {
        if (score >= 0 && score <= 100) {
            if (min > score) {
                min = score;
            }
            if (max < score) {
                max = score;
            }
            average = average + score;
        } else {
            invalidCase++;
            continue;
        }

        switch (score / 10) {
            case 9, 10 -> stats[0]++;
            case 8 -> stats[1]++;
            case 7 -> stats[2]++;
            case 6 -> stats[3]++;
            case 0, 1, 2, 3, 4, 5 -> stats[4]++;
        }
    }
    average = average / scores.length;
    System.out.println("Valid scores: " + (scores.length - invalidCase));
    System.out.println("invalid scores: " + invalidCase);
    System.out.println("min score: " + min);
    System.out.println("max score: " + max);
    System.out.printf("average score: %.2f", average);
}