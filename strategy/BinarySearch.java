package strategy;
import java.util.ArrayList;
import java.util.Collections;


public class BinarySearch implements SearchBehavior {

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
