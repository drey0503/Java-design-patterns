package observer;

import java.util.ArrayList;
/**
 * @author Dreyson Clark
 * This class sets up the arraylist of observers and bestsellers and can register, add books, and remove observers.
 */
public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;
/**
 * instantiating the arraylists
 */
    public BestSellers() {
        this.observers = new Arraylist<>();
        this.bestSellers = new Arraylist<>();
    }

    public void registerObserver(Observer observer) {

    }

    public void removeObserver(Observer observer) {

    }

    public void notifyObserver(Book book) {

    }

    public void addBook(Book book) {

    }
}
