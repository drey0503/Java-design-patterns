package observer;

import java.util.Queue;
/**
 * @author Dreyson Clark
 * this class implements the subject interface and sets the books into a queue for the top 5 best selling books. 
 * it takes the top 5 and dequeues books when one is out of the top 5.
 */
public class Store implements Observer{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
    
    pubic Store(Subject subject){

    }
    public void update(Book book){

    }
    public void display(){

    }
}
