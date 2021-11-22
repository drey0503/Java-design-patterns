/**
 * @author Dreyson Clark
 * this class sets up the operations, numbers, and state in the hard difficulty
 */
import java.util.Random;

public class Hard implements State {
    private ArithemeticGame game;
    Random rand = new Random();

    public Hard(ArithemeticGame game) {
    this.game = game;
    }
/**
 * sends a print out statement.
 */
    @Override
    public void levelUp() {
    System.out.println("You are doing so well!!!");
    }
/**
 * levels down the game state.
 */
    @Override
    public void levelDown() {
    System.out.println("You are struggling, let's go to medium mode.");
    game.setState(game.getMediumState());
        
    }
/**
 * gets a random number 0-100 and returns that number.
 */
    @Override
    public int getNum() {
    int randomInt = rand.nextInt(100)+ 1;
    return randomInt;
    }
/**
 * gets a random operation choosing from +,-,*,/
 */
    @Override
    public String getOperation() {
        String operation="";
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
