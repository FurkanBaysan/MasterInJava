import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Enter Number:" + " ");
            boolean isAnNumber = scanner.hasNextInt();
            if (isAnNumber) {
                int number = scanner.nextInt();
                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }
            } else {
                break;
            }
            scanner.nextLine();//handle end of line (enter key)
        }
        System.out.println("Maximum Number:" + " " + maxNumber);
        System.out.println("Minimum Number:" + " " + minNumber);
        scanner.close();
    }
}
