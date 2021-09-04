

/**
 * @author Dreyson Clark 
 * The details of what each book is. It consist of the title, the author's first, and last name.
 */
public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    /**
     * takes whatever is given in the parameters and sets it to the variables that
     * were declared at the beginning of the class
     * 
     * @return
     */
    public String getTitle() {
        return this.title;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }

    @Override
    public String toString() {
        return this.title + " by: " + this.authorFirstName + " " + this.authorLastName;
    }
}
