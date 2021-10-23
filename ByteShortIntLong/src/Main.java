public class Main {

    public static void main(String[] args) {

        // The way of determining the range of a primitive data type
        // Integer,Byte,Short are Wrapper Classes.
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Minimum Integer Value = " + minIntValue);
        System.out.println("Maximum Integer Value = " + maxIntValue);

        System.out.println("-- Overflow and Underflow Issue -- ");
        System.out.println("Busted MAX Value =" + (maxIntValue + 1));
        System.out.println("Busted MIN Value =" + (minIntValue - 1));

    /* If type a number that bigger or smaller than the max or min value
        java will flag as an Error, namely if we use it as a literal.
         ->  int maxIntTest = 2147483648; // kızar.

         */
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value=" + minByteValue);
        System.out.println("Maximum Byte Value=" + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Short Value=" + minShortValue);
        System.out.println("Maximum Short Value=" + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long Value=" + minLongValue);
        System.out.println("Maximum Long Value=" + maxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);


    }

}
