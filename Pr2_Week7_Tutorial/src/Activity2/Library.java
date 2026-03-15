package Activity2;

import java.util.*;

public class Library {
    private List<Item> items;
    private List<Member> members;

    public Library() {
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public Item findItemById(int id) {
        for (Item item : items) {
            if(item.getId() == id)
                return item;
        }
        return null;
    }

    public Item findItemByTitle(String title) {
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title))
                return item;
        }
        return null;
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(int memberId) {
        members.removeIf(member -> member.getId() == memberId);
        }
    }

    public Member findMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }

    public void borrowItem(int memberId, int itemId) {
        Member member = findMemberById(memberId);
        Item item = findItemById(memberId);

        if (member == null) {
            System.out.println("Error: Member with ID " + memberId + " not found.");
            return;
        }
        if (item == null) {
            System.out.println("Error: Item with ID " + itemId + " not found.");
            return;
        }
        member.borrowItem(item);
    }