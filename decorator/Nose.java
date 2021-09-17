/**
 * @author Dreyson Clark
 * this class sets up the Strings for the nose on the face.
*/
public class Nose extends CharacterDecorator {
/**
 *  
 * constructor that calls on super from the Decorator class.
 */
    public Nose(Character character) {
        super(character);
        
    }
 /*
     * this customize method overrides the base section and replaces it with the
     * String below.
     */
    @Override
    public void customize() {
        sections.set(4, " |   >    | ");
        
    }
    
}
