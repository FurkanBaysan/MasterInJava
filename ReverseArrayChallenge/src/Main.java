import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] originalArray = {1, 5, 3, 7, 11, 15, 17};
        print(originalArray);
        reverse(originalArray);
        print(originalArray);
    }

    public static void reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[j] = array[i];
            j++;
        }
        for (int i = 0; i < reverseArray.length; i++) {
            array[i] = reverseArray[i];
        }
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}