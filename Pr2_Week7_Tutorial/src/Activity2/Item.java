package Activity2;

public interface Item {
    public int getId();
    public String getTitle();
    public String getAuthor();
    public Enum<ItemType> getType();
}
