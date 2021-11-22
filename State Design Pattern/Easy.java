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

    @Override
    public void levelUp() {
        System.out.println("You've been advanced to medium mode.");
        game.setState(game.getMediumState());
    }

    @Override
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }

    @Override
    public int getNum() {
        int randomInt = rand.nextInt(10) + 1;
        return randomInt;
    }

    @Override
    public String getOperation() {
        int randomOperation = rand.nextInt(2);
        //might have to change the next int to 3
        if (randomOperation == 0) {
            operation = "+";
        } else if (randomOperation == 1) {
            operation = "-";
        } 
        // else if (randomOperation == 2) {
        //     operation = "-";
        // }
        return operation;
    }

        
}
