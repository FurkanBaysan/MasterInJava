public class Main {

    public static void main(String[] args) {
        System.out.println("\t" + "-- Method Overloading -- ");
        int newScore = calculateScore("Furkan", 95);
        System.out.println(newScore);
        newScore = calculateScore(10);
        System.out.println(newScore);
        calculateScore();
        System.out.println("\t" + "-- Challenge --");
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player:" + " " + playerName + " " + "Score:" + " " + score + " points ");
        return score;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player");
        return score * 500;

    }

    public static void calculateScore() {
        System.out.println("Overloaded Method with void type" + " " + "->" + " " +
                "this means return type of overloaded method can be same or different");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {

            double centimetersCorrespondingFeet = (feet * 12) * 2.54;
            double centimetersCorrespondingInches = inches * 2.54;
            double overallCentimeters = centimetersCorrespondingFeet + centimetersCorrespondingInches;
            System.out.println(feet + " " + "feet" + " " + inches + " " + "inches" + " " + "=" + " " +
                    overallCentimeters + " " + "cm");
            return overallCentimeters;

        } else
            return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feetCorrespondingInches = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " " + "inches" + " " + "equals to" + " " + feetCorrespondingInches + " " + "feet and " + remainingInches + " " + "inches");
            double result = calcFeetAndInchesToCentimeters(feetCorrespondingInches, remainingInches);
            return result;
        } else
            return -1;
    }


}

