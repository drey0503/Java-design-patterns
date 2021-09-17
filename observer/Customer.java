package observer;


/**
 * @author Dreyson Clark
 * sets up the wishlist arraylist and other things like the book title, the author first and last name 
 * displayed for the customer.
 */

import java.util.ArrayList;

public class Customer implements Observer {
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    /**
     * constructor for class. registering the observer in this class. instantiating
     * the first and last name of the author.
     * 
     * @param subject
     * @param firstName
     * @param lastName
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.wishList = new ArrayList<>();
        this.subject = subject;
        subject.registerObserver(this);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void update(Book book) {
        wishList.add(book);
    }

    public void display() {
        System.out.println("Wish List:");
        for(Book books: wishList){
             System.out.println(" - "+books);
        }

    }
}
