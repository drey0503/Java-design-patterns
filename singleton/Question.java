/**
 * @author Dreyson Clark 
 * Holds the information for a trivia question
 */
public class Question {
private String question;
private String[] answers;
private int correctAnswer;

public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
this.question=question;

this.correctAnswer=correctAnswer;

}
/**
 * + toString(): String + isCorrect(int userAnswer): boolean +
 * getCorrectAnswer(): String
 */
@Override
public String toString(){
return question + "\n" + "1. "+ ans1 +"\n"+ "2. "+ ans2 + "\n"+ "3. "+ ans3 +"\n"+ "4. "+ ans4 + "\n";
}

public boolean (int userAnswer){
if(userAnswer==1){
    
}
    return 0;
}
public String getCorrectAnswer(){
 return ;
}
}

