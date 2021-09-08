package decorator;
/**
 * @author Dreyson Clark
 * this class sets up the Strings for the eyes on the face.
 */
public class Eyes extends CharacterDecorator {
/**
 * constructor that calls on super from the Decorator class
 * @param character
 */
    public Eyes(Character character) {
        super(character);
        
    }

    @Override
    public void customize() {
        sections.set(3," |  o  o  | " );
    }

    
    
}
