/**
 * @author Dreyson Clark
 * the contemporary plan uses the base house plan and extends it adding the neccessary strings to output the layout of materials
 * and features that were in the arrraylist.
 */
public class ContemporaryPlan extends HousePlan {
    public ContemporaryPlan() {
        super(5, 40, 3000);
    }
/**
 * the toString outputs the toString from the Houseplan class implemented as  a super.toString and lists that it is a contemporary plan
 */
    public String toString() {
        return "Contemporary Plan " + super.toString();
    }
/**
 * this adds the String of materials for the contemporary house plan into the materials arraylist.
 */
    @Override
    public void setMaterials() {
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");

    }
/**
 * this adds the String of features for the contemporary house plan into the features arraylist.
 */
    @Override
    public void setFeatures() {
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");

    }
}

