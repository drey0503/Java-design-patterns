package decorator;
/**
 * @author Dreyson Clark
 * this class sets up the Strings for the hat on the face.
*/
public class Hat extends CharacterDecorator {
/**
 * constructor that calls on super from the Decorator class
 * @param character
 */
    public Hat(Character character) {
        super(character);
    }

    @Override
    public void customize() {
        sections.set(0, "    ____");
        sections.set(1, " __|____|____");
    }

    
    
}
