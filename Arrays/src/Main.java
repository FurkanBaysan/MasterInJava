import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // First Way- Declaring and Initializing (Constituting/Defining) Arrays
        int[] grades = new int[10];
        grades[5] = 50;
        double[] interestRates = new double[10];
        interestRates[0] = 1.25;
        System.out.println("grade at index 5: " + grades[5]);// Retrieving the data
        System.out.println("interest at index 0: " + interestRates[0]);//Retrieving the data

        // Second way- of Declaring and Initializing (Constituting/Defining) Arrays
        int[] scores = new int[]{75, 87, 92, 47};
        // Shortcut of above Declaration and Initialization
        String[] courses = {"Introduction to Programming with C++,",
                "Object-Oriented Programming with Java",
                "Data Structures and Algorithms with C/C++"};
        System.out.println("score at index 2: " + scores[2]);
        System.out.println("course at index 1: " + courses[1]);

        // Third way- to Initialize an Array - using for Loop
        int[] evenNumbers = new int[5];
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = i * 2;
        }
        System.out.println("\t" + "-- Printing the Elements --");
        print(evenNumbers);

        /*Scenario:
         We're going to take inputs(integer inputs) from the user. In other words,
         allow the user of the program to type in some numbers.
         We're going to sum up those total numbers and figure out
         what the average of those numbers that were typed in.
         */
        int[] inputHolderArray = getIntegers(5);
        print(inputHolderArray);
        System.out.println("Average: " + getAverage(inputHolderArray));
    }

    // Passing an Array to a Method
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i +
                    ":" + " " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("\t" + "Enter " + number + " integer data 's\r");

        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers; // We're returning an array, not a variable as usual
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        double average;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        average = (double) (sum / array.length);
        return average;
    }
}
