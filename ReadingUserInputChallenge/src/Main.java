import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int i = 1;
        while (true) {
            System.out.print("Enter Number" + " " + "#" + i + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum = sum + number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();//handle end of line (enter key)
            i++;
        }
        System.out.println("Sum:" + " " + sum);
        scanner.close();
    }
}
