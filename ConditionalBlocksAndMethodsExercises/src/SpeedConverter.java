public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        //long milesCorrespondingKilometers = (long) ((long) kilometersPerHour / 1.609);
        //Math.round(double) returns long, so don't need type-casting.
        long milesCorrespondingKilometers = Math.round(kilometersPerHour / 1.609);
        return milesCorrespondingKilometers;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Velocity");
        } else if (kilometersPerHour >= 0) {
            toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " " + "km/h" + " " + "=" + " " + toMilesPerHour(kilometersPerHour) + " " + "mi/h");
        }
    }

}
