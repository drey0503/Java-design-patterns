/**
 * @author Dreyson Clark
 */
// super class
public class LogCabinPlan extends HousePlan {
    public LogCabinPlan() {
        super(2, 10, 1800);
    }

    public String toString() {
        return "Log Cabin " + super.toString();
    }

    @Override
    public void setMaterials() {
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine ");

    }

    @Override
    public void setFeatures() {
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");

    }
}