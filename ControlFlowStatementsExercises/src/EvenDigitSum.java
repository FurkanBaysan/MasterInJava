public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number >= 0) {
            int firstDigit = number % 10;
            if (firstDigit % 2 == 0) {
                sum = sum + firstDigit;
                if (number % 10 == number && number % 2 == 0) {
                    break;
                }
            }
            number = number / 10;
        }
        return sum;
    }
}
