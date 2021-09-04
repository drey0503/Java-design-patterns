package observer;
/**
 * @author Dreyson Clark
 * this class register's and removes observers from the queue. 
 * It also notify's observers about books being added to the store.
 */
public interface Subject {
    public void registerObserver(Observer observer){
        this.observer=observer;
    }
    public void removeObserver(Observer observer){
        this.remove(observer);=observer;
    }
    public void notifyObserver(Book book){
        this.book=book;
    }
}
