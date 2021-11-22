

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
    public static HousePlan createHousePlan(String type) {
        HousePlan houseplan;
        if (type.equalsIgnoreCase("log cabin")) {
            houseplan = new LogCabinPlan();
        } else if (type.equalsIgnoreCase("Tiny Home")) {
            houseplan = new TinyHomePlan();
        } else if (type.equalsIgnoreCase("contemporary home")) {
            houseplan = new ContemporaryPlan();
        } else houseplan= new LogCabinPlan();

        houseplan.getNumRooms();
        houseplan.getNumWindows();
        houseplan.setFeatures();
        houseplan.setMaterials();
        return houseplan;
    }

}