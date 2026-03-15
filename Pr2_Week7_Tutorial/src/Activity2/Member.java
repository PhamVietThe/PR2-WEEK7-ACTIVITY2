package Activity2;

import java.util.List;

public class Member extends Person {
    private List<Item> borrowedItems;
    public Member(int id, String name, String email) {
        super(id, name, email);
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }
    public void borrowItem(Item item) {
        System.out.println("Someone has borrowed the book!");
    }
    public void returnItem(Item item) {
        System.out.println("Nobody borrow the book yet");
    }
    @Override
    public String toString() {
        return super.toString();
    }
}