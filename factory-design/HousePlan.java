import java.util.ArrayList;

/**
 * @author Dreyson Clark
 *
 */
public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        this.materials = new ArrayList<>();
        this.features = new ArrayList<>();

    }

    public abstract void setMaterials();

    public abstract void setFeatures();

    public ArrayList<String> getMaterials() {
        return this.materials;
    }

    public ArrayList<String> getFeatures() {
        return this.features;
    }

    public int getNumRooms() {
        return this.numRooms;
    }

    public int getNumWindows() {
        return this.numWindows;
    }

    public int getSquareFeet() {
        return this.squareFeet;
    }

    /**
     * prints all values in the format for the output given by the instructor.
     */
    @Override
    public String toString() {
        String house = "";
        house = "Square Feet: " + this.squareFeet;
        house += "\nRooms: " + this.numRooms;
        house += "\nWindows: " + this.numWindows;

        for (String material : materials) {
            house += "\n\nMaterials: " + materials;
        }
        for (String feature : features) {
            house += "\n\nFeatures: " + features;
        }
        return house;
    }

}
