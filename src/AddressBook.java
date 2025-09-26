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
    public BuddyInfo findBuddyByName(String name) {
        for (BuddyInfo buddy : buddies) {
            if (buddy.getName().equalsIgnoreCase(name)) {
                return buddy;
            }
        }
        return null; // not found
    }



    public static void main(String[] args) {
        // Create an AddressBook
        AddressBook addressBook = new AddressBook();
        // Create a BuddyInfo
        BuddyInfo buddy = new BuddyInfo("Sammy", "Othello Ave", "123");
        // Add the BuddyInfo to the AddressBook
        addressBook.addBuddy(buddy);
        System.out.println("Added buddy: " + buddy.getName());
    }
}

