public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }
        while (firstNumber > 0 && secondNumber > 0) {
            int firstDigitOfFirstNumber = firstNumber % 10;
            int firstDigitOfSecondNumber = secondNumber % 10;
            if (firstDigitOfFirstNumber == firstDigitOfSecondNumber) {
                return true;
            }
            firstNumber = firstNumber / 10;
            if (firstDigitOfSecondNumber == firstNumber) {
                return true;
            }
            secondNumber = secondNumber / 10;
            if (firstDigitOfFirstNumber == secondNumber) {
                return true;
            }
        }
        return false;
    }
}
