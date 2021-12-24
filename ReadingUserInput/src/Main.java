import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t" + "Enter your Date of Birth:");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int userDateOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\t" + "Enter your Name:");
            String userName = scanner.nextLine();
            System.out.println("\t" + "Enter Current Year:");
            int currentYear = scanner.nextInt();
            calculateAge(userName, userDateOfBirth, currentYear);
        } else {
            System.out.println("Unable to parse/convert date of birth.");
        }
    }

    public static void calculateAge(String name, int dateOfbirth, int year) {
        int userAge = year - dateOfbirth;
        // Problem 1 Solution
        if (userAge > 0 && userAge <= 100) {
            System.out.println("User" + " " + name + "'s Age:" + " " + userAge);
        } else {
            System.out.println("Invalid date of birth, please be careful and try again!");
        }
    }
}
