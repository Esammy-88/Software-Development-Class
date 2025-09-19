public class Main {
    public static void main(String[] args) {
        // Create an AddressBook
        AddressBook addressBook = new AddressBook();

        // Create a BuddyInfo
        BuddyInfo buddy = new BuddyInfo("Sammy", "Othello Ave", "123");

        // Add the BuddyInfo to the AddressBook
        addressBook.addBuddy(buddy);
        System.out.println("Added buddy: " + buddy.getName());

        // Remove the BuddyInfo from the AddressBook
        addressBook.removeBuddy(0);
        System.out.println("Removed buddy: " + buddy.getName());

    }
}