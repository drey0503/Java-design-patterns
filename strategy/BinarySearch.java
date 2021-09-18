
import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Dreyson Clark
 * examines items in list to determine the location of said item
 */

public class BinarySearch implements SearchBehavior {
/**
 * if the item listed in data is empty then we return false, if the item is there we set left value as base value using zero and 
 * set highest value to the list size -1. if item = 0 thats how we know we have found the item.
 */
    public boolean contains(ArrayList<String> data, String item) {
        if (data.isEmpty()) {
            data.add(item);
            return false;
        }
        Collections.sort(data);
        int left, middle,right;
        left=0;
        right =data.size()-1;
        while(left<=right){
            middle=(left+right)/2;
            if(data.get(middle).compareToIgnoreCase(item)==0)
            return true;
            else if(data.get(middle).compareToIgnoreCase(item)<0)
            left=middle+1;
            else
right=middle-1;
        }
        return false;
    }
}
