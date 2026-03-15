package Activity2;

public class Journal extends AbstractItem {
    private int issueNumber;
    private int publicationDate;

    public Journal(int id, String title, String author, int issueNumber, int publicationDate) {
        super(id, title, author, ItemType.JOURNAL);
            this.issueNumber = issueNumber;
            this.publicationDate = publicationDate;
    }
}