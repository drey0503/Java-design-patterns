package decorator;

public class Mouth extends CharacterDecorator {

    public Mouth(Character character) {
        super(character);
        
    }

    @Override
    public void customize() {
        sections.set(5, "  \\ ---- / ");
    }
    
}
