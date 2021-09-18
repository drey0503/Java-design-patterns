/**
 * @author Dreyson Clark 
 * the Log Cabin plan uses the base house plan and
 *         extends it adding the neccessary strings to output the layout of
 *         materials and features that were in the arrraylist.
 */
public class LogCabinPlan extends HousePlan {
    public LogCabinPlan() {
        super(2, 10, 1800);
    }

    /**
     * the toString outputs the toString from the Houseplan class implemented as a
     * super.toString and lists that it is a contemporary plan
     */
    public String toString() {
        return "Log Cabin " + super.toString();
    }

    /**
     * this adds the String of materials for the contemporary house plan into the
     * materials arraylist.
     */
    @Override
    public void setMaterials() {
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine ");

    }

    /**
     * this adds the String of features for the contemporary house plan into the
     * features arraylist.
     */
    @Override
    public void setFeatures() {
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");

    }
    
}