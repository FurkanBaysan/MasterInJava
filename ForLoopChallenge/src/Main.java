public class Main {

    public static void main(String[] args) {
        System.out.println("\t" + "--Challenge--");
        int sum = 0;
        int count = 0;
        for (int number = 1; number <= 1000; number++) {
            if (number % 15 == 0) {
                System.out.println("Number:" + " " + number + " " + "can be divided by both 3 and 5");
                sum = sum + number;
                count++;
                if (count == 5) {
                    System.out.println("Exiting For Loop, cause found 5 numbers can be divided by both 3 and 5");
                    break;
                }
            }
        }
        //After the Loop we print the sum of numbers
        System.out.println("Sum:" + " " + sum);
    }
}
