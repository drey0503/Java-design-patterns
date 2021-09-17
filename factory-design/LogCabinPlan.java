/**
 * @author Dreyson Clark
 */
//super class
public class LogCabinPlan extends HousePlan{
    public LogCabinPlan(){
        super(2,10,1800);
    }
    
    public String toString(){
        return "Log Cabin " + super.toString();
    }

    @Override
    public void setMaterials() {
        material.add("Log Siding");
        material.add("Board and Batten Siding"); 
        material.add("White Pine ");
        
    }

    @Override
    public void setFeatures() {
       features.add("Timbered Roof");
       features.add("High Insulation");
       features.add("Rustic Effect");
        
    }
}
