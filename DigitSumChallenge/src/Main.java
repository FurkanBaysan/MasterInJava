public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(36998));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if ((number <= 0) || (number > 0 && number < 9)) { // can be sim
            return -1;
        } else {
            while (number != 0) {
                sum = sum + (number % 10);
                number = number / 10;
            }
        }
        return sum;
    }
}

