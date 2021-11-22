/**
 * @author Dreyson Clark
 * this class sets up the operations, numbers, and state in the Medium difficulty
 */
import java.util.Random;

public class Medium implements State {
    private ArithemeticGame game;
    Random rand = new Random();
    private String operation;

    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    @Override
    public void levelUp() {
        System.out.println("You've been advanced to hard mode.");
        game.setState(game.getHardState());
    }

    @Override
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
    }

    @Override
    public int getNum() {
        int randomInt=rand.nextInt(50)+1;
        return randomInt;
    }

    @Override
    public String getOperation() {
     int randomOperation= rand.nextInt(3);
     // might have to change the next int to 4
    if(randomOperation==0){
        operation= "+";
    }
    else if(randomOperation==1){
        operation="+";
    }
    else if(randomOperation==2){
        operation="*";
    }
    // else if(randomOperation==3){
    //     operation="*";
    // }
        return operation;
    }

    
}
