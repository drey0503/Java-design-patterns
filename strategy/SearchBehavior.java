/**
 * @author Dreyson Clark
 * Sets up a boolean and constructor for search behavior method.
 */
package strategy;
import java.util.ArrayList;

public interface SearchBehavior {

    public boolean contains(ArrayList<String> data, String item);
}
