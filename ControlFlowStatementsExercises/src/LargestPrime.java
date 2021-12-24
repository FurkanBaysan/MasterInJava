public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 0 || number == 0 || number == 1) {
            return -1;
        }
        int checkNumber = 2;
        while (checkNumber < number - 1) {
            if (number % checkNumber == 0) {
                number = number / checkNumber;
            } else {
                checkNumber++;
            }
        }
        return number;
    }
}
