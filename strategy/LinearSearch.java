/**
 * @author Dreyson Clark
 * Goes through the list individually and checks every item in arraylist.
 */
package strategy;
import java.util.ArrayList;


public class LinearSearch implements SearchBehavior {
    /**
     * method checks to see if item is in the specified list, if so it return true. It goes through the whole list checking to see
     * if that item is in the list.
     */
    public boolean contains(ArrayList<String> data, String item){
        if (data.isEmpty()){
        data.add(item);
        return false;}

    for(int i = 0;i<data.size();i++){

        if(data.get(i).equalsIgnoreCase(item))
       return true;
    
    
}
return false;
    }
}
