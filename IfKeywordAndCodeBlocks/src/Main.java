public class Main {


    public static void main(String[] args) {
        System.out.println("-- Game Scenario --");
        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = 0;
        int secondFinalScore = 0;

        if (score >= 5000) {
            System.out.println("Score: >= 5000 so " + " " + "that means you're one of the best players");
        } else if (score < 5000 && score > 1000) {
            System.out.println("Score: 1000-5000 so" + " " +
                    "that means you're an intermediate player ");
        } else {
            System.out.println("Score: < 1000" + " " +
                    "so that means you need to improve yourself");
        }
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score:" + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            secondFinalScore = score + (levelCompleted * bonus);
            System.out.println("Second Final Score:" + secondFinalScore);
        }
    }
}
