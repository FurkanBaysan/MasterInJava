public class Main {

    public static void main(String[] args) {
        System.out.println("\t" + "--Number In Word Challenge--");
        NumberInWord.printNumberInWord(5);
        System.out.println("\t" + "--Number Of Days In Month Challenge--");
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(7, 1997));
        System.out.println("\t" + "--Sum Odd Challenge--");
        System.out.println(SumOddRange.isOdd(91));
        System.out.println(SumOddRange.sumOdd(100, 1000));
    }
}