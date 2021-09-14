import java.util.ArrayList;

/**
 * @author Dreyson Clark
 * 
 */
public abstract class HousePlan {
    protected ArrayList<String> material;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    public HousePlan(int numRooms, int numWindows, int squareFeet){
        
    }
    public abstract void setMaterials();
    public abstract void setFeatures();
    
}
