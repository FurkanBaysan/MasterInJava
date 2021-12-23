public class NumberToWords {
    public static void numberToWords(int number) {
        int firstDigitOfNumber;
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number);
        for (int i = 1; i <= getDigitCount(number); i++) {
            firstDigitOfNumber = reverseNumber % 10;
            switch (firstDigitOfNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber = reverseNumber / 10;
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        int firstDigit;
        while (number != 0) {
            firstDigit = number % 10;
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + firstDigit;
            number = number / 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        if (number % 10 == number) {
            return 1;
        }
        while (number >= 10) {
            number = number / 10;
            count++;
            if (number % 10 == number) {
                count = count + 1;
                break;
            }
        }
        return count;
    }
}
