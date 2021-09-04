package observer;
/**
 * @author Dreyson Clark
 * sets up the wishlist arraylist and other things like the book title, the author first and last name 
 * displayed for the customer.
 */

import java.util.ArrayList;

public class Customer implements Observers {
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    public Customer(Subject subject, String firstName, String lastName){
        this.subject=subject;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public void update(Book book){

    }
    public void display(){
        
    }
}
