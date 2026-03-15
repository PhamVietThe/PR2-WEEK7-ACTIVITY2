package Activity2;

public class DVD extends AbstractItem {
    private int duration;
    private String director;
    private String actors;

    public DVD(int id, String title, String author, int duration, String director, String actors) {
        super(id, title, author, ItemType.DVD);
        this.duration = duration;
        this.director = director;
        this.actors = actors;
    }
}