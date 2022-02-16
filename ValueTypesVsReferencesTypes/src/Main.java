import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t" + "-- Value Types --");
        int firstNumber = 10;
        int secondNumber = firstNumber; // Assigning the data that the firstNumber holds to the secondNumber,so both variables now holding 10
        System.out.println("firstNumber: " + firstNumber);
        System.out.println("secondNumber: " + secondNumber);
        secondNumber++;
        System.out.println("firstNumber: " + firstNumber);
        System.out.println("secondNumber: " + secondNumber);

        System.out.println("\t" + "-- Reference Types --");
        int[] evenNumbers = new int[5]; // numbers is the object referer(reference type) of this array.
        int[] oddNumbers = evenNumbers; // shallow-copy

        System.out.println("Printing the Array Elements using Loops");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumbers[evenNumber] + " ");
        }

        System.out.println();

        System.out.println("Printing the Array Elements " +
                "using toString() Method");
        System.out.println("evenNumbers: " + Arrays.toString(evenNumbers));
        System.out.println("oddNumbers: " + Arrays.toString(oddNumbers));
        oddNumbers[0] = 1;
        System.out.println("After Change evenNumbers: " + Arrays.toString(evenNumbers));
        System.out.println("After Change oddNumbers: " + Arrays.toString(oddNumbers));

        System.out.println(" ");


        System.out.println("Passing Value Type and Reference Type to a Method");
        oddNumbers = new int[]{4, 5, 6, 7, 8};
        modifyArray(evenNumbers);
        System.out.println("After Modify evenNumbers: " + Arrays.toString(evenNumbers));
        System.out.println("After Modify oddNumbers: " + Arrays.toString(oddNumbers));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5}; //De-Referencing the Reference/Referer.
    }
}
