package Activity2;

public class AbstractItem implements Item {
    private int id;
    private String title;
    private String author;
    private ItemType type;

    public AbstractItem(int id, String title, String author, ItemType type) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public int getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public ItemType getType() {
        return this.type;
    }
    public String toString() {
        return "ID: " + getId() +", Title: " + getTitle() + ", Author: " + getAuthor() + ", Type" + getType();
    }
}