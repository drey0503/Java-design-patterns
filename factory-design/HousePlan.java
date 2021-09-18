import java.util.ArrayList;

/**
 * @author Dreyson Clark
 *This class sets the foundation for all other houseplans, it sets the materials, 
 * number of rooms and windows, and the squarefeet of the house.
 */
public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;
/**
 * constructor initalizes the variables and arraylists
 * @param numRooms
 * @param numWindows
 * @param squareFeet
 */
    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        this.materials = new ArrayList<>();
        this.features = new ArrayList<>();

    }
/**
 * sets the abstract method so it can be returned and implemented as a super in the other houseplans
 */
    public abstract void setMaterials();

    /**
     * sets the abstract method so it can be returned and implemented as a super in
     * the other houseplans
     */
    public abstract void setFeatures();
/**
 * returns the materials listed into the arraylist.
 * @return
 */
    public ArrayList<String> getMaterials() {
        return this.materials;
    }
/**
 * returns the features listed into the arraylist
 */
    public ArrayList<String> getFeatures() {
        return this.features;
    }
/**
 * returns the number of rooms into the int
 * @return
 */
    public int getNumRooms() {
        return this.numRooms;
    }

    /**
     * returns the number of windows into the int
     * 
     * @return
     */
    public int getNumWindows() {
        return this.numWindows;
    }

    /**
     * returns the number of square feet into the int
     * 
     * @return
     */
    public int getSquareFeet() {
        return this.squareFeet;
    }

    /**
     * prints all values in the format for the output given by the instructor.
     */
    @Override
    public String toString() {
        String house = "\n";
        house = "\nSquare Feet: " + this.squareFeet;
        house += "\nRooms: " + this.numRooms;
        house += "\nWindows: " + this.numWindows;
        house+= "\n\nMaterials: ";
        for (String material : materials) {
            house += "\n - "+material;
        }
        house += "\n\nFeatures: ";       
        for (String feature : features) {
            house += "\n - " + feature;
            house+="\n";
        }
        return house;
    }

}
