import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    // Constructor
    public AddressBook() {
        buddies = new ArrayList<>();
    }

    // Method to add a BuddyInfo to the address book
    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    // Method to remove a BuddyInfo from the address book by index
    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddies.size()) {
            return buddies.remove(index);
        }
        return null;
    }
}
