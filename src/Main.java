import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 12, 1, 2 -> System.out.println("зима");
            case 3, 4, 5 -> System.out.println("весна");
            case 6, 7, 8 -> System.out.println("лето");
            case 9, 10, 11 -> System.out.println("лето");
            default -> System.out.println("Недопустимое значение для номера месяца");
        }
    }

}