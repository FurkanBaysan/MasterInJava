public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 == 1) {
            return true;
        } else
            return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
        } else {
            return -1;
        }
        return sum;
    }
}
