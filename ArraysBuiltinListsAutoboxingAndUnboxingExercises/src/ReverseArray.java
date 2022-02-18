import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] array) {
        System.out.println(Arrays.toString(array));
        int root = 0;
        int last = array.length - 1;
        while (root < last) {
            int temp = array[root];
            array[root] = array[last];
            array[last] = temp;
            root++;
            last--;
        }
        System.out.println(Arrays.toString(array));
    }
}
