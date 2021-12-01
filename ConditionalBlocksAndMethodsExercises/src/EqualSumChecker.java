public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(10, -5, 20));
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber + secondNumber == thirdNumber) {
            return true;
        } else
            return false;
    }
}
