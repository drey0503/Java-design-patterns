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

    public ArrayList<String> getMaterials(){
        return 
    }
    public ArrayList<String> getFeatures(){
        return
    }
    public int getNumRooms(){
        return this.numRooms;
    }
    public int getNumWindows(){
        return this.numWindows;
    }
    public int getSquareFeet(){
        return this.squareFeet;
    }
    /**
     * prints all values in the format for the output given by the instructor.
     */
    @Override
    public String toString(){
        return this.
    }

}
