import java.awt.geom.Area;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t" + "-- Speed Converter --");
        System.out.println(SpeedConverter.toMilesPerHour(10.5) + " " + "Miles");
        SpeedConverter.printConversion(10.5);
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
        System.out.println("\t" + "--Area of Circle and Rectangle--");
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println("\t" + "--Years and Days Corresponding Minutes--");
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        System.out.println("\t" + "--Equality Printer--");
        IntEqualityPrinter.printEqual(1, 2, 1);
        System.out.println("\t" + "--Playing Cat--");
        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }
}
