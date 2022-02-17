import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static int readInteger() {
        System.out.println("Enter the Count of Elements: ");
        int count = scanner.nextInt();
        return count;
    }

    public static int[] readElements(int number) {
        System.out.println("Enter " + number + " integer data's\r");
        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            int inputData = scanner.nextInt();
            scanner.nextLine();
            numbers[i] = inputData;
        }
        return numbers;
    }

    public static int findMin(int[] array) {
        int minimumElement = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int data = array[i];
            if (data < minimumElement) {
                minimumElement = data;
            }
        }
        return minimumElement;
    }
}
