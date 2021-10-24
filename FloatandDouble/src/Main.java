import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println("--float and double Primitive Types--");
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum Float Value =" + minFloatValue);
        System.out.println("Maximum Float Value =" + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum Double Value =" + minDoubleValue);
        System.out.println("Maximum Double Value =" + maxDoubleValue);

        int number = 5;
        float number1 = 5.25f;
        //  float number2 = (float) 5.25; -> Type-Casting
        double number3 = 5.25d;
        System.out.println("number = " + number + " " + "number1= " + number1 + " " + "number3= " + number3);

        System.out.println("--Floating Point Precision and Challenge--");
        int newIntegerNumber = 5;
        float newFloatNumber = 5f;
        double newDoubleNumber = 5.00;
        System.out.println("new integer number = " + newIntegerNumber + " " +
                "new float number = " + newFloatNumber + " " +
                " new double number = " + newDoubleNumber);

        System.out.println("--Division Cases on Floating Point Numbers-- ");
        int divisionIntegerResult = newIntegerNumber / 3;
        float divisionFloatResult = newFloatNumber / 3f;
        double divisionDoubleResult = newDoubleNumber / 3.00;
        System.out.println(divisionIntegerResult);
        System.out.println(divisionFloatResult);
        System.out.println(divisionDoubleResult);

        System.out.println("--Pound to Kilogram Challenge--");

        double numberOfPounds = 10;
        double convertedKilograms = (0.45359237 * numberOfPounds);
        System.out.println("Kilogram corresponding that Pound = " + convertedKilograms);

    }
}
