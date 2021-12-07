import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t" + "--Sample Code with Conditional Blocks--");
        int number = 3;
        if (number == 1) {
            System.out.println("Value of number:1");
        } else if (number == 2) {
            System.out.println("Value of number:2");
        } else {
            System.out.println("Value of number is neither 1 or 2");
        }
        System.out.println("\t" + "--Sample Code with Switch Statement--");
        int switchNumber = 3;
        switch (switchNumber) {
            case 1:
                System.out.println("Value of switchNumber:1");
                break;
            case 2:
                System.out.println("Value of switchNumber:2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value of switchNumber can be 3,or 4,or 5");
                System.out.println("Data that hold by switchNumber:" + " " + switchNumber);
                break;
            default:
                System.out.println("Value of switchNumber is neither 1 or 2 or 3 or 4 or 5");
                break;
        }
        System.out.println("\t" + "--Challenge--");
        char character = 'E';
        switch (character) {
            case 'A':
                System.out.println("Character was found:" + " " + "A");
                break;
            case 'B':
                System.out.println("Character was found:" + " " + "B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Character was found:" + " " + character);
                break;
            default:
                System.out.println("Could not find A, B, C, D or E");
                break;
        }
        String month = "JUly";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Month is January");
                break;
            case "february":
                System.out.println("Month is February");
                break;
            case "march":
                System.out.println("Month is March");
                break;
            case "april":
            case "may":
            case "June":
            case "july":
            case "august":
            case "september":
            case "october":
            case "november":
            case "december":
                System.out.println("Month is" + " " + month.toLowerCase());
                break;
            default:
                System.out.println("Not Sure");
                break;
        }

    }
}
