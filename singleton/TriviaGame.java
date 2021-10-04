
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
    Scanner reader = new Scanner (System.in);
    Random rand = new Random();
    private ArrayList<Question> questions;
    
    private TriviaGame(){}
}
