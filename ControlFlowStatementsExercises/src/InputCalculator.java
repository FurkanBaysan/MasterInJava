import java.util.Scanner;

public class InputCalculator {
    public static void inputThenSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0, count = 0;
        double average = 0;
        while (true) {
            System.out.print("Enter Number:" + " ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum = sum + number;
                average = (sum / count);
            } else {
                System.out.println("SUM = " + sum + " " + "AVG = " + average);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
