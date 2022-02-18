import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //First Way: Declaring and Initializing Arrays (Array Constitution)
        int[] grades = new int[10]; //Array Constitution
        //Accessing and Initializing
        grades[0] = 25;
        grades[1] = 35;
        grades[2] = 45;
        grades[3] = 55;
        grades[4] = 65;
        grades[5] = 50;
        grades[6] = 75;
        grades[7] = 85;
        grades[8] = 95;
        grades[9] = 100;
        System.out.println("grade at index 5: " + grades[5]);//Retrieving data
        System.out.println("grade at index 7: " + grades[7]);//Retrieving data

        //Second Way:
        int[] scores = new int[]{75, 45, 65, 95};
        // Shortcut of Second Way to Declare and Initialize Arrays
        String[] courses = {"Introduction to Programming with C++",
                "Object-Oriented Programming with Java",
                "Data Structures and Algorithms with C/C++"};
        System.out.println("course at index 1: " + courses[1]);//Retrieving data

        System.out.println();

        //Third Way to Initializing Arrays - using for Loop
        int[] evenNumbers = new int[5];
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = i * 2;
        }
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println("Even Number at index " + i + ":" + " "
                    + evenNumbers[i]);
        }
        //Passing an Array to a Method
        print(evenNumbers);
        /*
        Scenario: We're going to take some input from the user
        in other words allow the user of the program to type in some numbers
        We're going to sum up those total numbers and figure out what the
        average is of those numbers that were typed in.
         */
        int[] inputHolderArray = getIntegers(5);
        print(inputHolderArray);
        System.out.println("Average: " + getAverage(inputHolderArray));
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer data's\r");

        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
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
