public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(87, 25, 35));
        System.out.println(isTeen(185));
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= 13 && firstNumber <= 19) || (secondNumber >= 13 && secondNumber <= 19) ||
                (thirdNumber >= 13 && thirdNumber <= 19)) {
            return true;
        } else
            return false;
    }

    public static boolean isTeen(int number) {
        if (number >= 13 && number <= 19) {
            return true;
        } else
            return false;
    }
}
