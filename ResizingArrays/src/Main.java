import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integer data's:\r");
        getInput();
        printArray(baseData);
        resizeArray();
        baseData[10] = 110;
        baseData[11] = 120;
        printArray(baseData);
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ":" + " " + array[i]);
        }
        System.out.println();
    }

    private static void resizeArray() {
        int[] temp = baseData;
        baseData = new int[12];
        for (int i = 0; i < temp.length; i++) {
            baseData[i] = temp[i];
        }
    }
}
