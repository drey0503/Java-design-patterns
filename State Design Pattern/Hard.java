/**
 * @author Dreyson Clark
 * this class sets up the operations, numbers, and state in the hard difficulty
 */
import java.util.Random;

public class Hard implements State {
    private ArithemeticGame game;
    Random rand = new Random();
    private String operation;
    public Hard(ArithemeticGame game) {
    this.game = game;
    }

    @Override
    public void levelUp() {
    System.out.println("You are doing so well!!!");
    }

    @Override
    public void levelDown() {
    System.out.println("You are struggling, let's go to medium mode.");
    game.setState(game.getMediumState());
        
    }

    @Override
    public int getNum() {
    int randomInt = rand.nextInt(100)+ 1;
    return randomInt;
    }

    @Override
    public String getOperation() {
    int randomOperation= rand.nextInt(4);
    // might have to change the next int to 5
    if(randomOperation==0){
        operation= "+";
    }
    else if(randomOperation==1){
        operation="-";
    }
    else if(randomOperation==2){
        operation="*";
    }
    else if(randomOperation==3){
        operation="/";
    }
    // else if(randomOperation==4){
    //     operation="/";
    // }
    
        return operation;
    }
}
