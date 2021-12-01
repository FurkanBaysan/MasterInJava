public class Main {
    public static void main(String[] args) {
        System.out.println("\t" + "-- Speed Converter --");
        System.out.println(SpeedConverter.toMilesPerHour(-5.6) + " " + "Miles");
        SpeedConverter.printConversion(-5.6);
        System.out.println("\t" + "-- MegaBytes Converter --");
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        System.out.println("\t" + "-- Barking Dog --");
        System.out.println(BarkingDog.shouldWakeUp(true, 3));
        System.out.println("\t" + "-- Leap Year Calculation --");
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println("\t" + "-- Decimal Comparator --");
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.17599, 3.175));
        System.out.println("\t" + "-- Equal Sum Checker --");
        System.out.println(EqualSumChecker.hasEqualSum(10, -5, 20));
        System.out.println("\t" + "-- Teen Number Checker --");
        System.out.println(TeenNumberChecker.hasTeen(87, 25, 35));
        System.out.println(TeenNumberChecker.isTeen(185));

    }
}
