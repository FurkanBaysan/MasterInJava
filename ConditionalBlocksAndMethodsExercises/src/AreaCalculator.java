public class AreaCalculator {
    public static double area(double radius) {
        double pi = Math.PI;
        if (radius >= 0) {
            return pi * radius * radius;
        } else
            return -1;
    }

    public static double area(double x, double y) {
        if (x >= 0 && y >= 0) {
            return x * y;
        } else
            return -1;
    }
}
