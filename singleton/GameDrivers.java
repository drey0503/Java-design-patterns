/**
 * A driver for the Trivia Game
 */
public class GameDrivers {

    /**
     * Runs the trivia game
     */
    public void run() {
        TriviaGame game = TriviaGame.getInstance();
        game.play();
    }

    public static void main(String[] args) {
        GameDrivers driver = new GameDrivers();
        driver.run();
    }
}
