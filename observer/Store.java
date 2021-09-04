package observer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dreyson Clark this class implements the subject interface and sets
 *         the books into a queue for the top 5 best selling books. it takes the
 *         top 5 and dequeues books when one is out of the top 5.
 */
public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
/**
 * Class constructor that registers this class as a observer and also instantiates the queue for books as a linked list.
 * @param subject
 * @return
 */
    pubic Store(Subject subject) {
        bestSellers = new LinkedList<>();
        this.subject = subject;
        this.title = title;
        this.subject.registerObserver(this);
    }

    /**
     * updates the linked list and keeps only 5. when the books surpass the limit
     * then the first book in the list is removed.
     */
    public void update(Book book) {
        bestSellers.add(book);
        if (bestSellers.size() > 5) {
            bestSellers.remove(book);
        }

    }

    /**
     * cycles through the linked list and displays all of the books in the linked
     * list.
     */
    public void display() {
        for (Book books : bestSellers) {
            System.out.println(books);
        }
    }
}
