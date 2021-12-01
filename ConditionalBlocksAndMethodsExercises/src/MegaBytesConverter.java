public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytesCorrespondingKiloBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " " + "KB" + " " + "=" + " " + megaBytesCorrespondingKiloBytes + " " + "MB" + " and" + " " + remainingKiloBytes + " " + "KB");
        }
    }
}
