
/**
 * @author Dreyson Clark Class defines what is considered a "character" like
 *         eyes nose or mouth this. sections(Character sections)
 *         character.sections (Character decorator sections) Taking items from
 *         character and pushing into the decorator class
 * 
 */
public abstract class CharacterDecorator extends Character {
    protected Character character;
/**
 * for each section, the Constructor adds strings. This constructor calls from the Sections in character decorator section
 * and not the sections from the character class.
 * @param character
 */
    public CharacterDecorator(Character character){
        this.character=character;
        for(String ch :character.sections){
            this.sections.add(ch);
        }
        customize();
    }
/**
 * abstract method doesn't need a body in this instance.
 */
    public abstract void customize();

}
