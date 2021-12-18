public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        int firstDigit = number % 10;
        if (number % 10 == number) {
            int lastDigit = firstDigit;
            return 2 * lastDigit;
        }
        while (number >= 0) {
            number = number / 10;
            if (number % 10 == number) {
                int lastDigit = number;
                sum = sum + firstDigit + lastDigit;
                break;
            }
        }
        return sum;
    }
}
