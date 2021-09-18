

/**
 * @author Dreyson Clark this class register's and removes observers from the
 *         queue. It also notify's observers about books being added to the
 *         store.
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver(Book book);
}
