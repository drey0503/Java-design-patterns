/**
 * @author Dreyson Clark
 * this class sets up the operations, numbers, and state in the easy difficulty
 */
import java.util.Random;

public class Easy implements State {
    private ArithemeticGame game;
    Random rand = new Random();
    private String operation;

    public Easy(ArithemeticGame game) {
        this.game = game;
    }
/**
 * levels up the game state.
 */
    @Override
    public void levelUp() {
        System.out.println("You've been advanced to medium mode.");
        game.setState(game.getMediumState());
    }
/**
 * sends a print out statement.
 */
    @Override
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
/**
 * gets a random number 0-10 and returns it.
 */
    @Override
    public int getNum() {
        int randomInt = rand.nextInt(10) + 1;
        return randomInt;
    }
/**
 * returns a random operation ranging from +, or -.
 */
    @Override
    public String getOperation() {
        int randomOperation = rand.nextInt(2);
        if (randomOperation == 0) {
            operation = "+";
        } else if (randomOperation == 1) {
            operation = "-";
        } 
        return operation;
    }

        
}
