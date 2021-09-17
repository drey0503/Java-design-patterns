import java.util.ArrayList;

/**
 * @author Dreyson Clark This class creates the base for a house plan.
 */
public class HousePlanFactory {
    /**
     * This method reads the string and if the string reads a specified type of
     * house plan, then the base houseplan is changed into the houseplan for that
     * type of house.
     * 
     * @param type
     * @return
     */
    public HousePlan createHousePlan(String type) {
        HousePlan houseplan;
        if (type.equalsIgnoreCase("logCabin")) {
            houseplan = new LogCabinPlan();
        } else if (type.equalsIgnoreCase("tinyHouse")) {
            houseplan = new TinyHousePlan();
        } else if (type.equalsIgnoreCase("contemporaryHouse")) {
            houseplan = new ContemporaryPlan();
        }
        return houseplan;
    }

}