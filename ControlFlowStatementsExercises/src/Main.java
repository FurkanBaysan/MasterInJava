public class Main {

    public static void main(String[] args) {
        System.out.println("\t" + "--Number In Word Challenge--");
        NumberInWord.printNumberInWord(5);
        System.out.println("\t" + "--Number Of Days In Month Challenge--");
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(7, 1997));
        System.out.println("\t" + "--Sum Odd Challenge--");
        System.out.println(SumOddRange.isOdd(91));
        System.out.println(SumOddRange.sumOdd(100, 1000));
        System.out.println("\t" + "--Number Palindrome Challenge--");
        System.out.println(NumberPalindrome.isPalindrome(2552));
        System.out.println("\t" + "--First and Last Digit Sum Challenge--");
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(8769));
        System.out.println("\t" + "--Even Digit Sum Challenge--");
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println("\t" + "--Shared Digit Challenge--");
        System.out.println(SharedDigit.hasSharedDigit(53, 26));
        System.out.println("\t" + "--Last Digit Checker Challenge--");
        System.out.println(LastDigitChecker.hasSameLastDigit(92, 932, 822));
        System.out.println("\t" + "--Greatest Common Divisor--");
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(30, 12));
        System.out.println("\t" + "--All Factors Challenge--");
        AllFactors.printFactors(32);
        System.out.println("\n");
        System.out.println("\t" + "--Perfect Number Challenge--");
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println("\t" + "--Number To Words Challenge--");
        NumberToWords.numberToWords(100);
        System.out.println(NumberToWords.reverse(2564));
        System.out.println(NumberToWords.getDigitCount(5487));
        System.out.println("\t" + "--Flour Pack Problem--");
        System.out.println(FlourPacker.canPack(0, 5, 4));
    }
}
