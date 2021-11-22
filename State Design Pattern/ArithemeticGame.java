/**
 * @author Dreyson Clark
 * This class creates the game essentially.
 */
import java.util.Scanner;

public class ArithemeticGame {
    private State state;
    private State easyState;
    private State hardState;
    private State mediumState;
    private int score;
    Scanner scan = new Scanner(System.in);
    /**
     * instantiating each state;
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
    }
    public void getScore(int score){
     this.score=score;
    }
    public void setState(State state) {
        this.state = state;
    }
    public State getState(){
        return this.state;
    }
    public State getMediumState(){
        return this.mediumState;
    }
    
    public State getHardState() {
        return this.hardState;
    }
    
    public State getEasyState() {
        return this.easyState;
    }

    public int getScore() {
        return score;
    }
    
    /**
     * Will get two numbers and an operation from the state. 
     * Will present the user with a question Will get the users answer (int, even for division).
     * If the user got the answer correct they get the message "Correct" and score is increased by 1. 
     * If the user got the answer incorrect they will get the message "Incorrect" and score is decreased by 1.
     * if score >= 3, then level up their state and reset score to 0.
     * if score <= -3, then level down their state and reset score to 0.
     */
    public void pressQuestionButton() {
        int answer=0;
        String operation =state.getOperation();
        int q1=state.getNum();
        int q2=state.getNum();
        System.out.println(q1+" "+state.getOperation()+" "+q2);
        int ianswer = scan.nextInt();
        while(score<3||score>-3){
        switch(operation){
            case "+":
            answer = q1+q2;
            break;
            case"-":
            answer = q1-q2;
            break;
            case"*":
            answer = q1*q2;
            break;
            case"/":
            answer = q1/q2;
            break;
            default:
            System.out.println("enter in correct answer");
        }
        if(score>=3){
            state.levelUp();
            score=0;
        }
        if (score <= -3) {
            state.levelDown();
            score=0;
        }
       if(ianswer == answer){
            score+=1;
        } 
        if(ianswer!= answer){
            score-=1;
        }
    }
    }

    
}