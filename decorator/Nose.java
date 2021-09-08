package decorator;

public class Nose extends CharacterDecorator {

    public Nose(Character character) {
        super(character);
        
    }

    @Override
    public void customize() {
        sections.set(4, " |   >    | ");
        
    }
    
}
