/**
 * @author Dreyson Clark
 * this class is the interface for the different types of modes of the arithmetic game (Easy state, medium state, hard state)
 */
public interface State {
    public void levelUp();
    public void levelDown();
    public int getNum();
    public String getOperation();
}
