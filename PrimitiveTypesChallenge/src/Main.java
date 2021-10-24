public class Main {

    public static void main(String[] args) {

        System.out.println("--Primitive Types Challenge--");
        byte firstNumber = 10;
        short secondNumber = 20;
        int thirdNumber = 50;
        long totalResult = 50000L + 10L * (firstNumber + secondNumber + thirdNumber);
        System.out.println("Result = " + totalResult);

        // This is not a part of a challenge, but we show it because it needs type-casting unlike the case in Challenge.
        short total = (short) (1000 + 10 * (firstNumber + secondNumber + thirdNumber));

    }
}
