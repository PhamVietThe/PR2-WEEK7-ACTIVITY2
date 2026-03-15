package Activity2;

public class Book extends AbstractItem {
    private int numberOfPages;
    private String publisher;
    private int publicationYear;

    public Book(int id, String title, String author, int numberOfPages, String publisher, int publicationYear) {
        super(id, title, author, ItemType.BOOK);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }
}
