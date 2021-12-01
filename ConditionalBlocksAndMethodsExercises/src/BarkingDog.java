public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if ((hourOfDay < 8 || hourOfDay > 22) && barking == true) {
            return true;
        } else
            return false;
    }
}
