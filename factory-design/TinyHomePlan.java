/**
 * @author Dreyson Clark the contemporary plan uses the base house plan and
 *         extends it adding the neccessary strings to output the layout of
 *         materials and features that were in the arrraylist.
 */
public class TinyHomePlan extends HousePlan{
    public TinyHomePlan() {
        super(1, 5, 200);
    }

    /**
     * the toString outputs the toString from the Houseplan class implemented as a
     * super.toString and lists that it is a contemporary plan
     */
    public String toString() {
        return "Tiny Home Plan " + super.toString();
    }

    /**
     * this adds the String of materials for the contemporary house plan into the
     * materials arraylist.
     */
    @Override
    public void setMaterials() {
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing ");
        materials.add("Hardware");

    }

    /**
     * this adds the String of features for the contemporary house plan into the
     * features arraylist.
     */
    @Override
    public void setFeatures() {
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("MultiPurpose Areas");
        features.add("Multi-Use Applications");

    }
}
