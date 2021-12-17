public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temporaryNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }
        if (reverse == temporaryNumber) {
            System.out.println("Palindrome Number");
            return true;
        } else {
            System.out.println("Not a Palindrome Number");
            return false;
        }
    }
}
