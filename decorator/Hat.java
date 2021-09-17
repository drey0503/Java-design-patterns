/**
 * @author Dreyson Clark
 * this class sets up the Strings for the hat on the head.
*/
public class Hat extends CharacterDecorator {
/**
 * constructor that calls on super from the Decorator class
 * @param character
 */
    public Hat(Character character) {
        super(character);
    }
/**
 * this customize method overrides the base section and replaces it with the String below.
 */
    @Override
    public void customize() {
        sections.set(0, "    ____");
        sections.set(1, " __|____|____");
    }

    
    
}
