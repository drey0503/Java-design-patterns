package observer;

import java.util.ArrayList;

/**
 * @author Dreyson Clark This class sets up the arraylist of observers and
 *         bestsellers and can register, add books, and remove observers.
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
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * loop through the observers and update the book to all of the observers.
     */
    public void notifyObserver(Book book) {
        for (Observer observe : observers) {
            observe.update(book);
        }
    }

    /**
     * add books to bestsellers list and notify observers of new books.
     * 
     * @param book
     */
    public void addBook(Book book) {
        bestSellers.add(book);
        this.notifyObserver(book);
    }
}
