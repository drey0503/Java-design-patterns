package strategy;
/**
* Can add and remove people off list and checks to see if on list or not
* @author Dreyson Clark
*/

import java.util.ArrayList;

public class GuestList {
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;
/**
 * This method is a guest list constructr that instatiates the arraylist, sets title to title of guest list and sets search
 * behavior to linearsearch at first
 * @param title
 */
    public GuestList(String title) {
        this.searchBehavior = new LinearSearch();
        this.title = title;
        this.people= new ArrayList<>();
    }
/**
 * add method and remove method. if the person is in the arraylist then we are not adding them to the list and if they aren't 
 * we are adding them to the list
 * @param person
 * @return
 */
    public boolean add(String person) {

        if (searchBehavior.contains(people, person))

            return false;

        else {
            people.add(person);

            return true;
        }

    }

    public boolean remove(String person) {

        if (searchBehavior.contains(people, person)) {
            people.remove(person);
            return true;
        }

        return false;

    }
/**
 * getter for the title string.
 * @return
 */
    public String getTitle() {
        return this.title;
    }
/**
 * 
 * @param searchBehavior
 */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    public ArrayList<String> getList() {
        return this.people;
    }
}