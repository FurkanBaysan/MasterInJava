public class Main {

    public static void main(String[] args) {
        System.out.println("\t" + "--While Loop--");
        int count = 1;
        while (count != 6) {
            System.out.println("Count Value:" + " " + count);
            count++;
        }
        System.out.println("\t" + "--Slightly Different Version Of Above While Loop--");
        count = 1;//Set the Count to 1, because after executing above loop  count will be set to 6.
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count Value:" + " " + count);
            count++;
        }
        System.out.println("\t" + "-- Do-While Loop --");
        count = 1;
        do {
            System.out.println("Count Value:" + " " + count);
            count++;
        } while (count != 6);
        System.out.println("\t" + "-- Do-While Loop: Break Usage --");
        count = 6;
        do {
            System.out.println("Count Value:" + " " + count);
            count++;
            if (count > 20)
                break;
        } while (count != 6);
        System.out.println("\t" + "--Challenge: Continue Keyword Usage in While Loop--");
        int startNumber = 4;
        int finishNumber = 20;
        while (startNumber <= finishNumber) {
            startNumber++;
            if (!isEvenNumber(startNumber)) {
                continue;
            }
            System.out.println("Even Number:" + " " + startNumber);
        }
        System.out.println("\t" + "--Challenge: Continue and Break Keyword Usage in While Loop--");
        startNumber = 4;
        count = 0;
        while (startNumber <= finishNumber) {
            startNumber++;
            if (!isEvenNumber(startNumber)) {
                continue;
            }
            System.out.println("Even Number:" + " " + startNumber);
            count = count + 1;
            if (count == 5) {
                break;
            }
        }
        System.out.println("Total Even Numbers Found:" + " " + count);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
