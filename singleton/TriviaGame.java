
/**
 * @author Dreyson Clark
 * create an ArrayList of type Question to hold the questions for the game
 * Read in all of the questions from the DataLoader to create the ArrayList of questions
 * can initialize rand, and reader, and display the welcome message
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Scanner reader;
    private Random rand;
    private ArrayList<Question> questions;
    
    private TriviaGame(){
        reader = new Scanner(System.in);
        rand = new Random();
        questions=DataLoader.getTriviaQuestions();
    }
/**
 * 
 * @return
 */
    public static TriviaGame getInstance(){
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }
    public void play(){
        playRound();
        System.out.print("(P)lay or (Q)uit: ");
       String playnow = reader.nextLine();
        while (playnow.equalsIgnoreCase("p")){
        playRound();
        System.out.print("(P)lay or (Q)uit: ");
        playnow = reader.nextLine();
}
    System.out.println("You won "+ score + " games!"+ "\n"+"Goodbye");
    }

    private boolean playRound(){
       int randq = rand.nextInt(questions.size());
       System.out.println(questions.get(randq));
       System.out.println("Enter answer: ");
       int playround=reader.nextInt();
       reader.nextLine();
       if(playround<1 || playround >4){
           System.out.println("Enter number 1-4, restart again.");
           return false;
       }
       if(questions.get(randq).isCorrect(playround)){
           System.out.println("YAY! You got it right!");
        score++;
        return true;
       }
       System.out.println("You got it wrong!" + "\n"+ "The correct answer is: "+ questions.get(randq).getCorrectAnswer());
        return false;

    }
}
