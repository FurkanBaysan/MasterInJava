import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] inputHolderArray; // Array Declaration (Object Referer of the Array)
        inputHolderArray = getIntegers(5);

        System.out.println("\t" + "-- Unsorted Array --");
        print(inputHolderArray);

        sortIntegers(inputHolderArray);
        System.out.println("\t" + "-- Sorted Array --");
        print(inputHolderArray);
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ":" + " "
                    + array[i]);
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

    public static int[] sortIntegers(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        return sortedArray;
    }
}
