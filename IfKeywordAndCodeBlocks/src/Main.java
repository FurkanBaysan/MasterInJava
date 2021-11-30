public class Main {
    static int finalScore = 0;

    public static void main(String[] args) {
        System.out.println("\t" + "-- Game Scenario --");

        int highScore = calculateFinalScore(true, 800, 5, 100);
        System.out.println("Final Score:" + highScore);
        //calculateFinalScore(true, 800, 5, 100); -> if calculateFinalScore method is void, we would call it exactly like that.
        determinePlayerLevelBasedOnScore();
        System.out.println("Final Score:" + " " + calculateFinalScore(true, 10000, 8, 200));
        //calculateFinalScore(true, 10000, 8, 200);
        determinePlayerLevelBasedOnScore();

        System.out.println("\t" + "-- Competition Results --");
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Furkan Baysan", highScorePosition);
        highScorePosition = calculateHighScorePosition((1000));
        displayHighScorePosition("Ali Anil Toprak", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Velihan Gozek", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Zeynep Gurel", highScorePosition);


    }

    public static int calculateFinalScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            System.out.println("The Game is Running");
            return -1;
        }
    }

    public static void determinePlayerLevelBasedOnScore() {
        if (finalScore >= 5000) {
            System.out.println("Score is the Top Players Range");
        } else if (finalScore > 1000) {
            System.out.println("Score is in the Intermediate Players Range");
        } else {
            System.out.println("Score is in Low Players Range");
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " " + "managed to get into position" + " " +
                position + " " + "on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

}













