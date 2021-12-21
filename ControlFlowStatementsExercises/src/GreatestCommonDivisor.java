public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int smallerNumber, largerNumber;
        int greatestCommonDivisor = 1;
        if (first - second > 0) {
            smallerNumber = second;
            largerNumber = first;
        } else {
            smallerNumber = first;
            largerNumber = second;
        }
        for (int i = 1; i <= smallerNumber; i++) {
            if (largerNumber % i == 0 && smallerNumber % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
}
