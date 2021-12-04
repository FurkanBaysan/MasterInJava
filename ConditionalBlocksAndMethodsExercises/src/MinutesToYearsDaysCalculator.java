public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {
            long year = minutes / (1440 * 365);
            long remainingDays = (minutes % 525600) / 1440;
            System.out.println(minutes + " " + "min" + " " + "=" + " " + year + " " + "y" + " " + "and" + " " + remainingDays + " " + "d");
        } else
            System.out.println("Invalid Value");
    }
}
