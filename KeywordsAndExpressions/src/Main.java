public class Main {

    public static void main(String[] args) {
        // A mile is equal to 1.609344 kilometers
        System.out.println("-- Miles to Kilometers Conversion --");
        double kilometerCorrespondingOneMile = 1.609344;
        double result = 100 * (kilometerCorrespondingOneMile);
        System.out.println("Kilometer Corresponding Given Miles:" + result);

        int score = 100;
        if (score > 99) {
            System.out.println("Congrats, you got the High Score!");
            score = 0;
        }

        // score=100 -> Expression
        //score>90 -> Expression
        // ("Congrats, you got the high score!) -> Expression because it's a method call.
        //score=0 -> Expression.
    }
}
