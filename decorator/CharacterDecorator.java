package decorator;

/**
 * @author Dreyson Clark Class defines what is considered a "character" like
 *         eyes nose or mouth this. sections(Character sections)
 *         character.sections (Character decorator sections) Taking items from
 *         character and pushing into the decarator class
 * 
 */
public abstract class CharacterDecorator extends Character {
    protected Character character;

    public CharacterDecorator(Character character){
        this.character=character;
        for(String ch :character.sections){
            this.sections.add(ch);
        }
        customize();
    }

    public abstract void customize();

}
