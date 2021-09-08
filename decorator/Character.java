package decorator;

import java.util.ArrayList;

/**
 * @author Dreyson Clark Each item in sections is a string in the arraylist that
 *         shows lines on the potato head.
 */
public abstract class Character {
    protected ArrayList<String> sections;

    /**
     * Constructor initalizes arraylist
     */
    public Character() {
        sections = new ArrayList<>();
    }

    /**
     * draw will loop through the arraylist of "sections" and output them all into
     * the screen
     */
    public void draw() {
        for (int i=0; i<sections.size(); i++) {
            System.out.println(sections.get(i));
        }
    }
}