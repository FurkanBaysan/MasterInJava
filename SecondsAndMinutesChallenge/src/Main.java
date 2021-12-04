public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";//Constant Declaration.

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hoursCorrespondingMinutes = minutes / 60;
            //int hoursCorrespondingSeconds = seconds / 3600; ->Seconds maximum value can be 59. So,not necessary to convert any other time unit.
            int overallHours = hoursCorrespondingMinutes; // + hoursCorrespondingSeconds;
            int remainingMinutes = minutes % 60;
            // int remainingSeconds = seconds % 3600; // Seconds maximum value can be 59. So,not necessary to convert any other time unit.
            return overallHours + "h" + " " + remainingMinutes + "m" + " " + seconds + "s";
        } else
            return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutesCorrespondingSeconds = seconds / 60;
            int remainingSeconds = seconds % 60;
            String result = getDurationString(minutesCorrespondingSeconds, remainingSeconds);
            return result;
        } else
            return INVALID_VALUE_MESSAGE;
    }
}
