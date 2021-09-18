


/**
 * @author this class is a interface which updates the books and display's the
 *         info on them. it is implemented in the Store and Customer classes,
 */
public interface Observer {
    public void update(Book book);

    public void display();

}
