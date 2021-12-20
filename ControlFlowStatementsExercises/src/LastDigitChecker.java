public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            return false;
        }
        int firstDigitOfFirstNumber = firstNumber % 10;
        int firstDigitOfSecondNumber = secondNumber % 10;
        int firstDigitOfThirdNumber = thirdNumber % 10;
        if (firstDigitOfFirstNumber == firstDigitOfSecondNumber) {
            return true;
        } else if (firstDigitOfFirstNumber == firstDigitOfThirdNumber) {
            return true;
        } else if (firstDigitOfSecondNumber == firstDigitOfThirdNumber) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
